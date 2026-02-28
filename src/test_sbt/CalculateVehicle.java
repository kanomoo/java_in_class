package test_sbt;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateVehicle extends JFrame implements ActionListener {
    Container c = getContentPane();
    JComboBox<String> comboBox;
    JTextField textCc, textYear;
    JButton btnTax, btnClear;
    public static void main(String[] args) {
        new CalculateVehicle();
    }

    public CalculateVehicle() {
        super("Calculate Vehicle tax");
        initGui();
        setSize(250,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        c.add(new JLabel("Car engine displacement (CC)"));
        c.add(textCc = new JTextField(20));
        String strList[] = {"Private cars" + " ".repeat(44), "Pickup truck"};
        c.add(new JLabel("Types of cars"));
        c.add(comboBox = new JComboBox<>(strList));
        c.add(new JLabel("Age of the car (years)"));
        c.add(textYear = new JTextField(20));
        c.add(btnTax = new JButton("Calculate tax")); btnTax.addActionListener(this);
        c.add(btnClear = new JButton("Clear results")); btnClear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnTax) {
            try {
                int cc = Integer.parseInt(textCc.getText()), money = 0, year = Integer.parseInt(textYear.getText()), discount = 0;
                if (cc > 2000) money = (comboBox.getSelectedIndex() == 0) ? 1500 : 1200;
                else if (cc > 1500 && cc <= 2000) money = (comboBox.getSelectedIndex() == 0) ? 1000 : 800;
                else money = (comboBox.getSelectedIndex() == 0) ? 500 : 400;
                if (year > 10) discount = (int) (money * 0.2);
                else if (year > 5) discount = (int) (money * 0.1);
                money -= discount;
                textCc.setText("");
                textYear.setText("");
                JOptionPane.showMessageDialog(c, "Type of vehicle: " + ((String) comboBox.getSelectedItem()).trim()
                + "\nSize CC: " + cc + " CC\nVehicle age: " + year + " years" + ((discount == 0) ? "" : "\nTax discount: " 
                + ((year > 10) ? (int) money * 0.2 : (year > 5) ? (int) money * 0.1 : 0)) + "\nTaxes payable: " + String.format("%.2f", (double) money) + " THB");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(c, "No data");
            }
        } else if (event.getSource() == btnClear) {
            textCc.setText("");
            textYear.setText("");
        }
    }
}
