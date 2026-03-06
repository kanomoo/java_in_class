package chapter9.oldAss;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class as3 extends JFrame implements ActionListener{
    JPanel panelEnter, panelResult, panelGpa;
    JTextField textScore, textCredit, textGpa;
    JButton btnAdd, btnClear;
    JTextArea textArea;
    Container c = getContentPane();
    DecimalFormat oneDigit = new DecimalFormat("#0.0"), twoDigit = new DecimalFormat("#0.00");
    Font font = new Font("Courier New", Font.BOLD, 20);
    String output = "";
    double total = 0, totalCredit = 0;
    int count = 0;
    public static void main(String[] args) {
        new as3();
    }

    public as3() {
        super("Assignment 04 - ");
        initGui();
        setSize(500,530);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnAdd || event.getSource() == textCredit) {
            try {
                double score = Double.parseDouble(textScore.getText()), credit = Double.parseDouble(textCredit.getText());
                if (count < 8) {
                    output += " " + (count + 1) + ".  " + oneDigit.format(score) + "   " + String.format("%-6s", getGrade(score)) + oneDigit.format(credit) + "  " + twoDigit.format(getScorePoint(score) * credit) + "\n";
                    total += getScorePoint(score) * credit; totalCredit += credit;
                    textArea.setText(output); textScore.setText(""); textCredit.setText(""); textGpa.setText(String.valueOf(total / totalCredit));
                    count++;
                } else {
                    JTextArea output = new JTextArea("จำนวนวิชาได้ครบ 8 วิชาแล้ว ไม่สามารถเพิ่มได้"); output.setFont(new Font("Tahoma", Font.BOLD, 20));
                    output.setOpaque(false);
                    JOptionPane.showMessageDialog(c, output);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(c, "Input not complete");
            }
        }
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        initPanelEnter();
        initPanelResult();
        initPanelGpa();
    }

    public void initPanelEnter() {
        panelEnter = createPanel(450, 120);
        panelEnter.add(createLabel("Enter Score  : ")); panelEnter.add(textScore = createTextField(10));
        panelEnter.add(createLabel("Enter Credit : ")); panelEnter.add(textCredit = createTextField(10)); textCredit.addActionListener(this);
        panelEnter.add(btnAdd = createButton("Add Score")); panelEnter.add(btnClear = createButton("Clear"));
    }

    public void initPanelResult() {
        panelEnter = createPanel(450, 270);
        panelEnter.add(textArea = new JTextArea(11,15)); textArea.setFont(font);
        output = "No. Score Grade Credit Point\n============================\n";
        textArea.setText(output);
    }

    public void initPanelGpa() {
        panelGpa = createPanel(450, 50);
        panelGpa.add(createLabel("Grade Point Average (GPA) : ")); panelGpa.add(textGpa = createTextField(5));
        textGpa.setForeground(Color.BLUE); textGpa.setEditable(false);
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(width, height));
        panel.setBorder(new LineBorder(Color.BLUE));
        c.add(panel); return panel;
    }

    public JLabel createLabel(String title) {
        JLabel label = new JLabel(title);
        label.setFont(font); return label;
    }

    public JTextField createTextField(int len) {
        JTextField textField = new JTextField(len);
        textField.setFont(font);
        return textField;
    }

    public JButton createButton(String title) {
        JButton btn = new JButton(title);
        btn.setFont(font); btn.addActionListener(this);
        return btn;
    }

    public String getGrade(double score) {
        if (score >= 80) return "A";
        else if (score >= 75) return "B+";
        else if (score >= 70) return "B+";
        else if (score >= 65) return "C+";
        else if (score >= 60) return "C";
        else if (score >= 55) return "D+";
        else if (score >= 50) return "D";
        else return "F";
    }

    public double getScorePoint(double score) {
        if (score >= 80) return 4;
        else if (score >= 75) return 3.5;
        else if (score >= 70) return 3;
        else if (score >= 65) return 2.5;
        else if (score >= 60) return 2;
        else if (score >= 55) return 1.5;
        else if (score >= 50) return 1;
        else return 0;
    }
}
