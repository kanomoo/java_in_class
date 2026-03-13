package chapter11.New;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppProduct extends JFrame implements ActionListener {
    JPanel panelForm;
    JTextField textCode, textName, textPrice;
    JLabel label1, label2, label3;
    JButton saveBtn, readBtn;
    JTextArea outputArea;
    JScrollPane scrollPane;
    Container c;
    Font myFont = new Font("Tahoma", Font.BOLD, 16);
    String FILENAME = "src\\chapter11\\New\\products.txt";
    Product prod[] = new Product[10];
    Product product = new Product();
    private int index = 0;
    public static void main(String[] args) {
        new AppProduct();
    }

    public AppProduct() {
        super(" Example Read and Write Product");
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        guiForm1();
        guiForm2();
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void guiForm1() {
        panelForm = new JPanel(new GridLayout(3, 2));
        panelForm.setPreferredSize(new Dimension(400, 100));
        panelForm.add(label1 = new JLabel("Enter Product Code : ")); label1.setFont(myFont);
        panelForm.add(textCode = new JTextField(10)); textCode.setFont(myFont); textCode.addActionListener(this);
        panelForm.add(label2 = new JLabel("Enter Product Name : ")); label2.setFont(myFont);
        panelForm.add(textName = new JTextField(10)); textName.setFont(myFont);
        panelForm.add(label3 = new JLabel("Enter Product Price : ")); label3.setFont(myFont);
        panelForm.add(textPrice = new JTextField(10)); textPrice.setFont(myFont);
        c.add(panelForm);
    }

    public void guiForm2() {
        c.add(saveBtn = new JButton(" Save Product ")); saveBtn.setFont(myFont); saveBtn.addActionListener(this);
        c.add(readBtn = new JButton(" Read Product ")); readBtn.setFont(myFont); readBtn.addActionListener(this);
        c.add(scrollPane = new JScrollPane(outputArea = new JTextArea(10, 30))); outputArea.setEditable(false); outputArea.setFont(myFont);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveBtn) {
            String codeStr = textCode.getText(), nameStr = textName.getText(), priceStr = textPrice.getText();
            if (!codeStr.isEmpty() && !nameStr.isEmpty() && !priceStr.isEmpty()) {
                product = new Product(codeStr, nameStr, Double.parseDouble(priceStr));
                saveProduct(product);
            }
            else {
                JOptionPane.showMessageDialog(this, "Data not complete", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource() == readBtn) {
            outputArea.setText("");
            readProduct();
            for (int n = 0; n < index; n++) {
                outputArea.append(prod[n].toProduct());
            }
        }
    }

    public void saveProduct(Product product) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true));
            writer.write(product.toProduct());
            writer.close();
            JOptionPane.showMessageDialog(this, product.toString() + "\nSave already");
            textCode.setText(""); textName.setText(""); textPrice.setText("");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "can not write data", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void readProduct() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
            String s1;
            index = 0;
            while ((s1 = reader.readLine()) != null) {
                String[] s = s1.split(",");
                prod[index] = new Product(s[0], s[1], Double.parseDouble(s[2]));
                index++;
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "can not read file", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
}

class Product {
    private String code = "", name = "";
    private double price = 0.0;

    public Product() {}

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String toProduct() {
        return getCode() + "," + getName() + "," + getPrice() + "\n";
    }

    public String toString() {
        return "Code : " + getCode() + " ; Name : " + getName() + " ; Price : " + getPrice();
    }
}
