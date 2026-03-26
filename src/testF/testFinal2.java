package testF;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class testFinal2 extends JFrame implements ActionListener {
    JPanel panelEnter, panelBtn, panelResult;
    JTextField textId, textName, textPrice;
    JButton btnAdd, btnDelete, btnSave, btnLoad;
    JTextArea textArea;
    JScrollPane scrollPane;
    ArrayList<Product> productList = new ArrayList<>();
    Product product;
    String file = "output.txt";
    Boolean firstOpen = true;
    Container c = getContentPane();

    public static void main(String[] args) {
        new testFinal2();
    }

    public testFinal2() {
        super("Product");
        initGui();
        setSize(460,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnAdd) {
            try {
                product = new Product(textId.getText(), textName.getText(), Double.parseDouble(textPrice.getText()));
                productList.add(product);
                textArea.append(product.toDisplayFormat());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(c, "No data");
            }
        }
        else if (event.getSource() == btnDelete) {
            try {
                for (int i = 0; i < productList.size(); i++) if (productList.get(i).getId().equals(textId.getText())) productList.remove(i);
                textArea.setText("");
                for (Product p : productList) textArea.append(p.toDisplayFormat());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(c, e);
            }
        }
        else if (event.getSource() == btnSave) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Product p : productList) writer.write(p.toCSV());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(c, e);
            }
        }
        else if (event.getSource() == btnLoad) {
            String str;
            textArea.setText("");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while ((str = reader.readLine()) != null) {
                    String[] strList = str.split(",");
                    product = new Product(strList[0], strList[1], Double.parseDouble(strList[2]));
                    productList.add(product);
                    textArea.append(product.toDisplayFormat());
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(c, e);
            }
        }
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        initPanelEnter();
        initPanelBtn();
        initPanelResult();
    }

    public void initPanelEnter() {
        panelEnter = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelEnter.setPreferredSize(new Dimension(350,90));
        panelEnter.add(new JLabel("Product ID :          "));
        panelEnter.add(textId = new JTextField(20));
        panelEnter.add(new JLabel("Product Name :   "));
        panelEnter.add(textName = new JTextField(20));
        panelEnter.add(new JLabel("Price :                    "));
        panelEnter.add(textPrice = new JTextField(20));
        c.add(panelEnter);
    }

    public void initPanelBtn() {
        panelBtn = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelBtn.setPreferredSize(new Dimension(450,50));
        panelBtn.add(btnAdd = new JButton("Add Product")); btnAdd.addActionListener(this);
        panelBtn.add(btnDelete = new JButton("Delete by ID")); btnDelete.addActionListener(this);
        panelBtn.add(btnSave = new JButton("Save to .txt")); btnSave.addActionListener(this);
        panelBtn.add(btnLoad = new JButton("Load from .txt")); btnLoad.addActionListener(this);
        c.add(panelBtn);
    }

    public void initPanelResult() {
        panelResult = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelResult.add(scrollPane = new JScrollPane(textArea = new JTextArea(10,38)));
        c.add(panelResult);
    }
}

class Product {
    private String prodId;
    private String prodName;
    private double price;

    public Product(String id, String name, double price) {
        prodId = id; prodName = name; this.price = price;
    }

    public String getId() {
        return prodId;
    }

    public String toCSV() {
        return prodId + "," + prodName + "," + price + "\n";
    }

    public String toDisplayFormat() {
        return "ID: " + prodId + " | Name: " + prodName + " | Price: " + price + "\n";
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}