package chapter9.oldAss;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class as2 extends JFrame implements ActionListener {
    Container c = getContentPane();
    JPanel panelEnter, panelResult;
    JTextField textEnter, textSalary, textIncome, textTax;
    DecimalFormat twoDigit = new DecimalFormat("#,###,##0.00");
    Font font = new Font("Courier New", Font.BOLD, 20);
    public static void main(String[] args) {
        new as2();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == textEnter) {
            try {
                double salary = Double.parseDouble(textEnter.getText()), income = salary * 12, tax = 0;
                if (income > 1000000) tax = 0.10;
                else if (income > 800000) tax = 0.075;
                else if (income > 500000) tax = 0.055;
                else if (income > 300000) tax = 0.04;
                else if (income > 150000) tax = 0.025;
                else tax = 0;
                textSalary.setText(twoDigit.format(salary)); textIncome.setText(twoDigit.format(income));
                textTax.setText(twoDigit.format(income * tax));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(c, "No input salary");
                }
            }
        }

    public as2() {
        super("Assignment 04 - 02 : Calculate Tax");
        initGui();
        setSize(500, 280);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        initPanelEnter();
        initPanelResult();
    }

    public void initPanelEnter() {
        panelEnter = createPanel(450, 50, Color.BLUE);
        panelEnter.add(createLabel(panelEnter, "Enter Salary : "));
        panelEnter.add(textEnter = createTextField(panelEnter,true));
    }

    public void initPanelResult() {
        panelResult = createPanel(450, 130, Color.BLACK);
        panelResult.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelResult.add(createLabel(panelResult, "Salary : "));
        panelResult.add(textSalary = createTextField(panelResult,false));
        panelResult.add(createLabel(panelResult, "Net Income : "));
        panelResult.add(textIncome = createTextField(panelResult,false));
        panelResult.add(createLabel(panelResult, "Tax : "));
        panelResult.add(textTax = createTextField(panelResult,false));

    }

    public JPanel createPanel(int width, int height, Color color) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(width, height));
        panel.setBorder(new LineBorder(color));
        c.add(panel);
        return panel;
    }

    public JLabel createLabel(JPanel panel, String title) {
        JLabel label = new JLabel(title);
        label.setFont(font);
        panel.add(label);
        return label;
    }

    public JTextField createTextField(JPanel panel, Boolean Edit) {
        JTextField textField = new JTextField(20);
        textField.setFont(font); panel.add(textField);
        textField.addActionListener(this);
        textField.setEditable(Edit);
        return textField;
    }


}
