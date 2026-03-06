package chapter9.oldAss;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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

public class as1 extends JFrame implements ActionListener{
    Container c = getContentPane();
    JPanel panelEnter, panelBtn, panelArea;
    JTextField textHw, textMid, textFinal;
    JButton btnCal, btnCan;
    JTextArea textArea;
    DecimalFormat twoDigit = new DecimalFormat("#0.0");
    Font font = new Font("Courier New", Font.BOLD, 20);

    public static void main(String[] args) {
        new as1();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnCal) {
            try {
                double hw = Double.parseDouble(textHw.getText()), mid = Double.parseDouble(textMid.getText()), finalS = Double.parseDouble(textFinal.getText()), total = 0;
                String output = "Homework Score : " + hw + "  ->  " + twoDigit.format((hw) * (0.3)) + "\n";
                output += "Midterm Score  : " + mid + "  ->  " + twoDigit.format(mid * 0.3) + "\n";
                output += "Final Score    : " + finalS + "  ->  " + twoDigit.format(finalS * 0.4) + "\n";
                output += "Total Score : " + twoDigit.format(total = ((hw) * (0.3)) + (mid * 0.3) + (finalS * 0.4)) + "\nGrade : " + getGrade(total);

                textArea.setText(output);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(c, "No input Data", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (event.getSource() == btnCan) {
            textHw.setText(""); textMid.setText(""); textFinal.setText("");
            textArea.setText("");
        }
    }

    public as1() {
        super("Assignment 04 - 01 : Calculate Grade");
        c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        initGui();
        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300,10);
    }

    public void initGui() {
        initPanelEnter();
        initPanelBtn();
        initPanelArea();
    }

    public void initPanelEnter() {
        panelEnter = createJPanel(400, 100);
        panelEnter.add(createJLabel("Enter Homework Score : "));
        panelEnter.add(textHw = createJTextField());
        panelEnter.add(createJLabel("Enter Midterm Score  : "));
        panelEnter.add(textMid = createJTextField());
        panelEnter.add(createJLabel("Enter Final Score    : "));
        panelEnter.add(textFinal = createJTextField());
    }

    public void initPanelBtn() {
        panelBtn = createJPanel(400, 50);
        panelBtn.add(btnCal = new JButton("Calculate"));
        btnCal.addActionListener(this); btnCal.setFont(font);
        panelBtn.add(btnCan = new JButton("Cancle")); btnCan.addActionListener(this);
        btnCan.addActionListener(this); btnCan.setFont(font);
    }

    public void initPanelArea() {
        panelArea = createJPanel(400, 150);
        panelArea.add(textArea = new JTextArea(6,32)); textArea.setFont(font);
        textArea.setForeground(Color.BLUE);
    }

    public JPanel createJPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(width, height));
        panel.setBorder(new LineBorder(Color.RED));
        panel.setFont(font); c.add(panel);
        return panel;
    }

    public JLabel createJLabel(String title) {
        JLabel label = new JLabel(title);
        label.setFont(font);
        return label;
    }

    public JTextField createJTextField() {
        JTextField textField = new JTextField(5);
        textField.setFont(font);
        return textField;
    }

    public String getGrade(double total) {
        if (total >= 80) return "A";
        else if (total >= 75) return "B+";
        else if (total >= 70) return "B";
        else if (total >= 65) return "C+";
        else if (total >= 60) return "C";
        else if (total >= 55) return "D+";
        else if (total >= 50) return "D";
        else return "F";
    }
}
