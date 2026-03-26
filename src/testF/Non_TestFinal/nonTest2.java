package testF.Non_TestFinal;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class nonTest2 extends JFrame implements ActionListener {
    JPanel panelFrom, panelResult;
    JTextField textESalary, textSalary, textNet, textTax;
    Font font = new Font("Courier New", Font.BOLD, 20);
    DecimalFormat twoDigit = new DecimalFormat("###,###,###.00");
    Container c = getContentPane();
    public static void main(String[] args) {
        new nonTest2();
    }

    nonTest2() {
        super("Assignment 04 - 02 : Calculate Tax");
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        initGui();
        setSize(450,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == textESalary) {
            Double salary = Double.valueOf(textESalary.getText()), netIncome, tax;
            netIncome = salary * 12;
            if (netIncome > 1000000) tax =  0.10 ;
            else if (netIncome > 800000) tax = 0.075;
            else if (netIncome > 500000) tax = 0.055;
            else if (netIncome > 300000) tax = 0.04;
            else if (netIncome > 150000) tax = 0.025;
            else tax = 0.0;
            textESalary.setText("");
            textSalary.setText(twoDigit.format(salary));
            textNet.setText(twoDigit.format(netIncome));
            textTax.setText(twoDigit.format(netIncome * tax));
        }
    }

    public void initGui() {
        initPanelFrom();
        initPanelResult();
    }

    public void initPanelFrom() {
        panelFrom = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelFrom.setPreferredSize(new Dimension(400,60)); panelFrom.setBorder(new LineBorder(Color.BLUE));
        panelFrom.add(createJLabel("Enter Salary : ")); panelFrom.add(textESalary = new JTextField(15)); textESalary.setFont(font); textESalary.addActionListener(this);
        c.add(panelFrom);
    }

    public void initPanelResult() {
        panelResult = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelResult.setPreferredSize(new Dimension(400,150)); panelResult.setBorder(new LineBorder(Color.BLACK));
        panelResult.add(createJLabel("    Salary : ")); panelResult.add(textSalary = new JTextField(15)); textSalary.setEditable(false); textSalary.setFont(font);
        panelResult.add(createJLabel("Net Income : ")); panelResult.add(textNet = new JTextField(15)); textNet.setEditable(false); textNet.setFont(font);
        panelResult.add(createJLabel("       Tax : ")); panelResult.add(textTax = new JTextField(15)); textTax.setEditable(false); textTax.setFont(font);
        c.add(panelResult);
    }

    public JLabel createJLabel(String title) {
        JLabel label = new JLabel(title); label.setFont(font); return label;
    }
}
