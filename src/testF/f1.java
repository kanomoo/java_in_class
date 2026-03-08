package testF;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class f1 extends JFrame implements ActionListener{
    JTextField textName, textPrice, textQty, textId;
    JRadioButton btnNormal, btnMember;
    JButton btnCal, btnClear;
    JTextArea textArea;
    JPanel panelEnter, panelType, panelBtn ,panelReceipt;
    DecimalFormat twoDigit = new DecimalFormat("#,###,###,##0.00");
    ButtonGroup group;
    MemberOrder member;
    CoffeeOrder coffee;
    Container c = getContentPane();

    public static void main(String[] args) {
        new f1();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnCal) {
            if (btnNormal.isSelected()) {
                coffee = new CoffeeOrder(textName.getText(), Double.parseDouble(textPrice.getText()), Integer.parseInt(textQty.getText()));
                textArea.setText(coffee.getReceipt());
            }
            else if (btnMember.isSelected()) {
                member = new MemberOrder(textName.getText(), Double.parseDouble(textPrice.getText()), Integer.parseInt(textQty.getText()), textId.getText());
                textArea.setText(member.getReceipt());
            }
        }
        if (event.getSource() == btnNormal) {textId.setEditable(false); textId.setText("");}
        if (event.getSource() == btnMember) textId.setEditable(true);
        if (event.getSource() == btnClear) {
            textName.setText(""); textPrice.setText(""); textQty.setText("");
            group.clearSelection(); textId.setText(""); textId.setEditable(false);
            textArea.setText("");
        }
    }

    public f1() {
        super("Coffee");
        initGui();
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        initPanelEnter();
        initPanelType();
        initPanelBtn();
        initPanelReceipt();
    }

    public void initPanelEnter() {
        panelEnter = new JPanel();
        panelEnter.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelEnter.setPreferredSize(new Dimension(400,80));
        panelEnter.add(new JLabel("Customer Name :          "));
        panelEnter.add(textName = new JTextField(20));
        panelEnter.add(new JLabel("Price / Cup :                    "));
        panelEnter.add(textPrice = new JTextField(20));
        panelEnter.add(new JLabel("Quantity :                         "));
        panelEnter.add(textQty = new JTextField(20));
        c.add(panelEnter);
    }

    public void initPanelType() {
        panelType = new JPanel();
        panelType.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelType.setPreferredSize(new Dimension(400, 60));
        panelType.add(new JLabel("Customer Type: "));
        panelType.add(btnNormal = new JRadioButton("Normal"));
        panelType.add(btnMember = new JRadioButton("Member                                "));
        group = new ButtonGroup(); group.add(btnNormal); group.add(btnMember);
        btnNormal.addActionListener(this); btnMember.addActionListener(this);
        panelType.add(new JLabel("Member ID :                    "));
        panelType.add(textId = new JTextField(20));
        textId.setEditable(false);
        c.add(panelType);
    }

    public void initPanelBtn() {
        panelBtn = new JPanel();
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panelBtn.setPreferredSize(new Dimension(400,40));
        panelBtn.add(btnCal = new JButton("Calculate"));
        panelBtn.add(btnClear = new JButton("Clear"));
        c.add(panelBtn); btnCal.addActionListener(this); btnClear.addActionListener(this);
    }

    public void initPanelReceipt() {
        panelReceipt = new JPanel();
        panelReceipt.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelReceipt.setPreferredSize(new Dimension(400,100));
        panelReceipt.add(textArea = new JTextArea(6,32));
        c.add(panelReceipt);
    }
}

class CoffeeOrder {
    DecimalFormat twoDigit = new DecimalFormat("#,###,###,##0.00");
    protected String customerName;
    protected double pricePerCup;
    protected int quantity;
    
    public CoffeeOrder(String name, double price, int qty) {
        customerName = name; pricePerCup = price; quantity = qty;
    }

    public double getTotalPrice() {
        return pricePerCup * quantity;
    }

    public double getDiscount() {
        return (double) 0.0;
    }

    public double getNetPrice() {
        return getTotalPrice() - getDiscount();
    }

    public String getReceipt() {
        return "============ COFFEE RECEIPT ============\n" +
        "Customer: " + customerName + "\nTotal Price: " + twoDigit.format(getTotalPrice()) + " Baht\n" +
        "Discount: " + twoDigit.format(getDiscount()) + " Baht\n" +
        "Net Price: " + twoDigit.format(getTotalPrice());
    }
}

class MemberOrder extends CoffeeOrder{
    DecimalFormat twoDigit = new DecimalFormat("#,###,###,##0.00");
    private String memberId;

    public MemberOrder(String name, double price, int qty, String mId) {
        super(name, price, qty);
        memberId = mId;
    }

    public double getDiscount() {
        return getTotalPrice() * 0.1;
    }

    public String getReceipt() {
        return "============ COFFEE RECEIPT ============\n" +
        "Member ID: " + memberId +
        "\nCustomer: " + customerName + "\nTotal Price: " + twoDigit.format(getTotalPrice()) + " Baht\n" +
        "Discount: " + twoDigit.format(getDiscount()) + " Baht\n" +
        "Net Price: " + twoDigit.format(getTotalPrice() - getDiscount()) + " Baht";
    }
}
