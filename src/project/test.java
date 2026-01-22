package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/*
public class test {
    
}
*/

// Entry point — launch Swing UI
public class test {
	public static void main(String[] args) {
		// set system look & feel for nicer UI
		try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception ignored) {}
		SwingUtilities.invokeLater(() -> {
			POS pos = new POS();
			pos.loadAll();
			POSFrame frame = new POSFrame(pos);
			frame.setVisible(true);
		});
	}
}

// Models and manager classes (kept package-private for a single-file approach)
class Product {
	String id;
	String name;
	double price;
	int stock;

	Product(String id, String name, double price, int stock) { this.id = id; this.name = name; this.price = price; this.stock = stock; }
	@Override public String toString(){ return id + " - " + name; }
	static Product fromCsv(String line) {
		String[] p = line.split(",", -1);
		return new Product(p[0], p[1], Double.parseDouble(p[2]), Integer.parseInt(p[3]));
	}
	String toCsv() { return String.join(",", id, name, String.valueOf(price), String.valueOf(stock)); }
}

class Customer {
	String id;
	String name;
	String phone;
	Customer(String id, String name, String phone){ this.id = id; this.name = name; this.phone = phone; }
	@Override public String toString(){ return id + " - " + name; }
	static Customer fromCsv(String line) {
		String[] p = line.split(",", -1);
		return new Customer(p[0], p[1], p[2]);
	}
	String toCsv() { return String.join(",", id, name, phone); }
}

class SaleItem {
	String productId; int qty; double unitPrice;
	SaleItem(String productId,int qty,double unitPrice){ this.productId=productId; this.qty=qty; this.unitPrice=unitPrice; }
	String toCsv(){ return productId+":"+qty+":"+unitPrice; }
	static SaleItem fromCsv(String t){ String[] p=t.split(":",-1); return new SaleItem(p[0],Integer.parseInt(p[1]),Double.parseDouble(p[2])); }
}

class Sale {
	String id; String customerId; LocalDate date; List<SaleItem> items = new ArrayList<>();
	Sale(String id, String customerId, LocalDate date){ this.id=id; this.customerId=customerId; this.date=date; }
	double total(){ return items.stream().mapToDouble(i->i.qty*i.unitPrice).sum(); }
	String toCsv(){
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(",").append(customerId).append(",").append(date.toString()).append(",")
		.append(String.format(Locale.US,"%.2f", total())).append(",");
		List<String> toks = new ArrayList<>();
		for(SaleItem it:items) toks.add(it.toCsv());
		sb.append(String.join("|", toks));
		return sb.toString();
	}
	static Sale fromCsv(String line){
		String[] p = line.split(",",5);
		Sale s = new Sale(p[0], p[1], LocalDate.parse(p[2]));
		if(p.length>=5 && !p[4].isEmpty()){
			for(String tok: p[4].split("\\|")) s.items.add(SaleItem.fromCsv(tok));
		}
		return s;
	}
	Sale(String id,String customerId,LocalDate date,List<SaleItem> items){ this(id,customerId,date); this.items=items; }
}

// POS manager with persistence (adapted to UI)
class POS {
	final Map<String, Product> products = new LinkedHashMap<>();
	final Map<String, Customer> customers = new LinkedHashMap<>();
	final List<Sale> sales = new ArrayList<>();
	int prodSeq=1, custSeq=1, saleSeq=1;
	final Path dir = Paths.get(System.getProperty("user.dir"));
	final DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;

	void loadAll(){
		try { loadProducts(); loadCustomers(); loadSales();
			products.keySet().stream().map(k->k.replaceAll("\\D","")).filter(s->!s.isEmpty()).mapToInt(Integer::parseInt).max().ifPresent(n->prodSeq=n+1);
			customers.keySet().stream().map(k->k.replaceAll("\\D","")).filter(s->!s.isEmpty()).mapToInt(Integer::parseInt).max().ifPresent(n->custSeq=n+1);
			sales.stream().map(s->s.id.replaceAll("\\D","")).filter(s->!s.isEmpty()).mapToInt(Integer::parseInt).max().ifPresent(n->saleSeq=n+1);
		} catch(Exception e){ System.out.println("Load error: "+e.getMessage()); }
	}

	void saveAll(){
		try { saveProducts(); saveCustomers(); saveSales(); } catch(Exception e){ System.out.println("Save error: "+e.getMessage()); }
	}

	private void loadProducts() throws IOException {
		Path f = dir.resolve("products.csv"); if(!Files.exists(f)) return;
		for(String line: Files.readAllLines(f)){ if(line.trim().isEmpty()) continue; Product p = Product.fromCsv(line); products.put(p.id,p); }
	}
	private void saveProducts() throws IOException {
		Path f = dir.resolve("products.csv");
		try (BufferedWriter w = Files.newBufferedWriter(f)){ for(Product p: products.values()) w.write(p.toCsv()+"\n"); }
	}

	private void loadCustomers() throws IOException {
		Path f = dir.resolve("customers.csv"); if(!Files.exists(f)) return;
		for(String line: Files.readAllLines(f)){ if(line.trim().isEmpty()) continue; Customer c = Customer.fromCsv(line); customers.put(c.id,c); }
	}
	private void saveCustomers() throws IOException {
		Path f = dir.resolve("customers.csv");
		try (BufferedWriter w = Files.newBufferedWriter(f)){ for(Customer c: customers.values()) w.write(c.toCsv()+"\n"); }
	}

	private void loadSales() throws IOException {
		Path f = dir.resolve("sales.csv"); if(!Files.exists(f)) return;
		for(String line: Files.readAllLines(f)){ if(line.trim().isEmpty()) continue; Sale s=Sale.fromCsv(line); sales.add(s); }
	}
	private void saveSales() throws IOException {
		Path f = dir.resolve("sales.csv");
		try (BufferedWriter w = Files.newBufferedWriter(f)){ for(Sale s: sales) w.write(s.toCsv()+"\n"); }
	}

	// helpers for creating IDs and simple ops
	String nextProductId(){ return "P"+(prodSeq++); }
	String nextCustomerId(){ return "C"+(custSeq++); }
	String nextSaleId(){ return "S"+(saleSeq++); }
}

// Swing UI frame
class POSFrame extends JFrame {
	private final POS pos;
	private final ProductTableModel productModel;
	private final CustomerTableModel customerModel;
	private final JTable productTable;
	private final JTable customerTable;
	private final JTextArea reportArea;

	POSFrame(POS pos){
		this.pos = pos;
		setTitle("POS System");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(900,600);
		setLocationRelativeTo(null);

		// Save on close
		addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ pos.saveAll(); } });

		JTabbedPane tabs = new JTabbedPane();

		// Products tab
		productModel = new ProductTableModel(new ArrayList<>(pos.products.values()));
		productTable = new JTable(productModel);
		JPanel prodPanel = new JPanel(new BorderLayout(8,8));
		prodPanel.add(new JScrollPane(productTable), BorderLayout.CENTER);
		prodPanel.add(buildProdButtons(), BorderLayout.SOUTH);
		tabs.addTab("Products", prodPanel);

		// Customers tab
		customerModel = new CustomerTableModel(new ArrayList<>(pos.customers.values()));
		customerTable = new JTable(customerModel);
		JPanel custPanel = new JPanel(new BorderLayout(8,8));
		custPanel.add(new JScrollPane(customerTable), BorderLayout.CENTER);
		custPanel.add(buildCustButtons(), BorderLayout.SOUTH);
		tabs.addTab("Customers", custPanel);

		// Sales tab
		JPanel salesPanel = new JPanel(new BorderLayout(8,8));
		JButton recordSaleBtn = new JButton("Record Sale");
		recordSaleBtn.addActionListener(e -> openRecordSaleDialog());
		salesPanel.add(recordSaleBtn, BorderLayout.NORTH);
		tabs.addTab("Sales", salesPanel);

		// Report tab
		JPanel reportPanel = new JPanel(new BorderLayout(8,8));
		reportArea = new JTextArea(); reportArea.setEditable(false);
		reportPanel.add(new JScrollPane(reportArea), BorderLayout.CENTER);
		JButton refresh = new JButton("Refresh Today's Report");
		refresh.addActionListener(e -> refreshReport());
		reportPanel.add(refresh, BorderLayout.SOUTH);
		tabs.addTab("Report", reportPanel);

		getContentPane().add(tabs);
		refreshAllTables();
	}

	private JPanel buildProdButtons(){
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton add = new JButton("Add");
		add.addActionListener(e -> {
			String name = JOptionPane.showInputDialog(this, "Product name:");
			if(name==null || name.trim().isEmpty()) return;
			String priceS = JOptionPane.showInputDialog(this, "Price:");
			String stockS = JOptionPane.showInputDialog(this, "Stock:");
			double price = parseDouble(priceS, 0.0);
			int stock = parseInt(stockS, 0);
			String id = pos.nextProductId();
			Product prod = new Product(id, name.trim(), price, stock);
			pos.products.put(id, prod);
			refreshAllTables();
		});
		JButton edit = new JButton("Edit");
		edit.addActionListener(e -> {
			int row = productTable.getSelectedRow(); if(row<0) return;
			Product pSel = productModel.getRow(row);
			String name = JOptionPane.showInputDialog(this, "Name:", pSel.name);
			if(name!=null && !name.trim().isEmpty()) pSel.name = name.trim();
			String priceS = JOptionPane.showInputDialog(this, "Price:", String.valueOf(pSel.price));
			pSel.price = parseDouble(priceS, pSel.price);
			String stockS = JOptionPane.showInputDialog(this, "Stock:", String.valueOf(pSel.stock));
			pSel.stock = parseInt(stockS, pSel.stock);
			refreshAllTables();
		});
		JButton del = new JButton("Delete");
		del.addActionListener(e -> {
			int row = productTable.getSelectedRow(); if(row<0) return;
			Product pSel = productModel.getRow(row);
			if(JOptionPane.showConfirmDialog(this, "Delete "+pSel.name+"?")==JOptionPane.YES_OPTION){
				pos.products.remove(pSel.id); refreshAllTables();
			}
		});
		p.add(add); p.add(edit); p.add(del);
		return p;
	}

	private JPanel buildCustButtons(){
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton add = new JButton("Add");
		add.addActionListener(e -> {
			String name = JOptionPane.showInputDialog(this, "Customer name:");
			if(name==null || name.trim().isEmpty()) return;
			String phone = JOptionPane.showInputDialog(this, "Phone:");
			String id = pos.nextCustomerId();
			Customer c = new Customer(id, name.trim(), phone==null?"":phone.trim());
			pos.customers.put(id, c);
			refreshAllTables();
		});
		JButton edit = new JButton("Edit");
		edit.addActionListener(e -> {
			int row = customerTable.getSelectedRow(); if(row<0) return;
			Customer cSel = customerModel.getRow(row);
			String name = JOptionPane.showInputDialog(this, "Name:", cSel.name);
			if(name!=null && !name.trim().isEmpty()) cSel.name = name.trim();
			String phone = JOptionPane.showInputDialog(this, "Phone:", cSel.phone);
			if(phone!=null) cSel.phone = phone.trim();
			refreshAllTables();
		});
		JButton del = new JButton("Delete");
		del.addActionListener(e -> {
			int row = customerTable.getSelectedRow(); if(row<0) return;
			Customer cSel = customerModel.getRow(row);
			if(JOptionPane.showConfirmDialog(this, "Delete "+cSel.name+"?")==JOptionPane.YES_OPTION){
				pos.customers.remove(cSel.id); refreshAllTables();
			}
		});
		p.add(add); p.add(edit); p.add(del);
		return p;
	}

	private void openRecordSaleDialog(){
		JDialog d = new JDialog(this, "Record Sale", true);
		d.setSize(600,400); d.setLocationRelativeTo(this);
		JPanel main = new JPanel(new BorderLayout(8,8));
		// top: customer selector
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		Vector<String> custVec = new Vector<>();
		custVec.add("Walk-in (C0)"); for(Customer c: pos.customers.values()) custVec.add(c.id+" - "+c.name);
		JComboBox<String> custBox = new JComboBox<>(custVec);
		top.add(new JLabel("Customer:")); top.add(custBox);
		main.add(top, BorderLayout.NORTH);

		// center: product selection and items list
		JPanel center = new JPanel(new BorderLayout(8,8));
		// product selector row
		JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT));
		Vector<String> prodVec = new Vector<>();
		for(Product p: pos.products.values()) prodVec.add(p.id+" - "+p.name+" ("+p.stock+")");
		JComboBox<String> prodBox = new JComboBox<>(prodVec);
		JSpinner qtySpin = new JSpinner(new SpinnerNumberModel(1,1,999,1));
		JButton addBtn = new JButton("Add Item");
		row.add(new JLabel("Product:")); row.add(prodBox); row.add(new JLabel("Qty:")); row.add(qtySpin); row.add(addBtn);
		center.add(row, BorderLayout.NORTH);
		JTextArea itemsArea = new JTextArea(); itemsArea.setEditable(false);
		center.add(new JScrollPane(itemsArea), BorderLayout.CENTER);
		main.add(center, BorderLayout.CENTER);

		// bottom: finalize
		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton finish = new JButton("Finalize Sale");
		JButton cancel = new JButton("Cancel");
		bottom.add(cancel); bottom.add(finish);
		main.add(bottom, BorderLayout.SOUTH);

		// sale items temporary
		List<SaleItem> tmpItems = new ArrayList<>();
		addBtn.addActionListener(e -> {
			int pi = prodBox.getSelectedIndex(); if(pi<0) return;
			Product p = (Product) pos.products.values().toArray()[pi];
			int q = (int) qtySpin.getValue();
			if(p.stock < q){ JOptionPane.showMessageDialog(d, "Insufficient stock for " + p.name); return; }
			tmpItems.add(new SaleItem(p.id, q, p.price));
			itemsArea.append(String.format("%s x%d  (%.2f each)\n", p.name, q, p.price));
		});

		cancel.addActionListener(e -> d.dispose());

		finish.addActionListener(e -> {
			if(tmpItems.isEmpty()){ JOptionPane.showMessageDialog(d, "No items added."); return; }
			int ci = custBox.getSelectedIndex();
			String custId = (ci<=0) ? "C0" : (new ArrayList<>(pos.customers.keySet())).get(ci-1);
			String sid = pos.nextSaleId();
			Sale sale = new Sale(sid, custId, LocalDate.now(), new ArrayList<>(tmpItems));
			// deduct stock
			for(SaleItem it: tmpItems){
				Product p = pos.products.get(it.productId);
				if(p!=null) p.stock -= it.qty;
			}
			pos.sales.add(sale);
			refreshAllTables();
			JOptionPane.showMessageDialog(d, "Sale recorded: " + sid + " Total: " + String.format(Locale.US, "%.2f", sale.total()));
			d.dispose();
		});

		d.getContentPane().add(main);
		d.setVisible(true);
	}

	private void refreshAllTables(){
		productModel.setData(new ArrayList<>(pos.products.values()));
		customerModel.setData(new ArrayList<>(pos.customers.values()));
		refreshReport();
	}

	private void refreshReport(){
		LocalDate today = LocalDate.now();
		StringBuilder sb = new StringBuilder();
		double sum = 0;
		for(Sale s: pos.sales){
			if(s.date.equals(today)){
				sb.append(s.id).append(" | cust:").append(s.customerId).append(" | total: ")
				.append(String.format(Locale.US,"%.2f", s.total())).append("\n");
				sum += s.total();
			}
		}
		sb.append("\nTotal for ").append(today.format(DateTimeFormatter.ISO_LOCAL_DATE)).append(": ").append(String.format(Locale.US,"%.2f", sum));
		reportArea.setText(sb.toString());
	}

	private int parseInt(String s, int def){ try{ return Integer.parseInt(s); }catch(Exception e){ return def; } }
	private double parseDouble(String s, double def){ try{ return Double.parseDouble(s); }catch(Exception e){ return def; } }

	// Table models
	static class ProductTableModel extends AbstractTableModel {
		private final String[] cols = {"ID","Name","Price","Stock"};
		private java.util.List<Product> data;
		ProductTableModel(java.util.List<Product> data){ this.data=data; }
		void setData(java.util.List<Product> data){ this.data=data; fireTableDataChanged(); }
		public int getRowCount(){ return data.size(); }
		public int getColumnCount(){ return cols.length; }
		public String getColumnName(int c){ return cols[c]; }
		public Object getValueAt(int r,int c){
			Product p = data.get(r);
			switch(c){ case 0: return p.id; case 1: return p.name; case 2: return p.price; case 3: return p.stock; default: return ""; }
		}
		Product getRow(int r){ return data.get(r); }
	}

	static class CustomerTableModel extends AbstractTableModel {
		private final String[] cols = {"ID","Name","Phone"};
		private java.util.List<Customer> data;
		CustomerTableModel(java.util.List<Customer> data){ this.data=data; }
		void setData(java.util.List<Customer> data){ this.data=data; fireTableDataChanged(); }
		public int getRowCount(){ return data.size(); }
		public int getColumnCount(){ return cols.length; }
		public String getColumnName(int c){ return cols[c]; }
		public Object getValueAt(int r,int c){
			Customer cst = data.get(r);
			switch(c){ case 0: return cst.id; case 1: return cst.name; case 2: return cst.phone; default: return ""; }
		}
		Customer getRow(int r){ return data.get(r); }
	}
}
