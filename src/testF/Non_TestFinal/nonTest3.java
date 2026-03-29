package testF.Non_TestFinal;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class nonTest3 extends JFrame implements ActionListener {
    JPanel panelFrom, panelResult, panelGpa;
    JTextField textScore, textCredit, textGpa;
    JTextArea textArea;
    JButton btnAdd, btnClear;
    double total = 0, totalCredit = 0;
    int count = 0;
    Font font = new Font("Courier New", Font.BOLD, 20);
    Container c = getContentPane();
    public static void main(String[] args) {
        new nonTest3();
    }

    nonTest3() {
        super("Assignment 04 - 03 : Calculate GPA");
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        initGui();
        setSize(450, 550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnAdd) {
            if (count >= 0 && count < 8)  {
                btnClear.setEnabled(true);
                if (!textScore.getText().isEmpty() && !textCredit.getText().isEmpty()) {
                    double score = Double.parseDouble(textScore.getText()), credit = Double.parseDouble(textCredit.getText()), point;
                    String grade;
                    if (score >= 80) { grade = "A"; point = 4.0 * credit;}
                    else if (score >= 75) {grade = "B+"; point = 3.5 * credit;}
                    else if (score >= 70) {grade = "B"; point = 3.0 * credit;;}
                    else if (score >= 65) {grade = "C+"; point = 2.5 * credit;}
                    else if (score >= 60) {grade = "C"; point = 2.0 * credit;}
                    else if (score >= 55) {grade = "D+"; point = 1.5 * credit;}
                    else if (score >= 50) {grade = "D"; point = 1.0 * credit;}
                    else {grade = "F"; point = 0.0;}
                    total += credit; totalCredit += point;
                    textScore.setText(""); textCredit.setText("");
                    textGpa.setText(String.format("%4.2f", totalCredit / total));
                    textArea.append(String.format(" %1d.   %4.1f   %-2s    %3.1f  %4.2f\n", ++count, score, grade, credit, point));
                }
                else {JOptionPane.showMessageDialog(c, "Input not Complete");}
            }
            else {
                JTextArea output = new JTextArea("จำนวนวิชาใส่ครบ 8 วิชาแล้ว, ไม่สามารถเพิ่มได้"); output.setFont(new Font("tahoma", Font.PLAIN, 16)); output.setOpaque(false);
                JOptionPane.showMessageDialog(c, output);
                textScore.setText(""); textCredit.setText(""); btnClear.setEnabled(false);
            }
        }
        else if (event.getSource() == btnClear) {
            count = 0; total = 0; totalCredit = 0; textGpa.setText(String.format("%4.2f", 0.0));
            textScore.setText(""); textCredit.setText(""); btnClear.setEnabled(true); textArea.setText("No.  Score Grade Credit Point\n=============================\n");
        }
    }

    public void initGui() {
        initPanelFrom();
        initPanelResult();
        initPanelGpa();
    }

    public void initPanelFrom() {
        panelFrom = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelFrom.setBorder(new LineBorder(Color.BLUE));
        panelFrom.setPreferredSize(new Dimension(400, 140));
        panelFrom.add(createJLabel(" Enter Score : ")); panelFrom.add(textScore = createTextField(10));
        panelFrom.add(createJLabel("Enter Credit : ")); panelFrom.add(textCredit = createTextField(10));
        panelFrom.add(btnAdd = new JButton("Add Score")); btnAdd.setFont(font); btnAdd.addActionListener(this);
        panelFrom.add(btnClear = new JButton("Clear")); btnClear.setFont(font); btnClear.addActionListener(this); btnClear.setEnabled(false);
        c.add(panelFrom);
    }

    public void initPanelResult() {
        panelResult = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelResult.setBorder(new LineBorder(Color.BLUE));
        panelResult.setPreferredSize(new Dimension(400, 230));
        panelResult.add(textArea = new JTextArea(11,10)); textArea.setFont(new Font("Courier New", Font.BOLD, 16));
        textArea.setText("No.  Score Grade Credit Point\n=============================\n");
        c.add(panelResult);
    }

    public void initPanelGpa() {
        panelResult = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelResult.setBorder(new LineBorder(Color.BLUE));
        panelResult.setPreferredSize(new Dimension(400, 50));
        panelResult.add(createJLabel("Grade Point Average(GPA) : ")); panelResult.add(textGpa = new JTextField(5));
        textGpa.setText(String.format("%4.2f", 0.0)); textGpa.setForeground(Color.BLUE); textGpa.setEditable(false); textGpa.setFont(new Font("Courier New", Font.BOLD, 16));
        c.add(panelResult);
    }

    public JLabel createJLabel(String title) {
        JLabel label = new JLabel(title); label.setFont(font); return label;
    }

    public JTextField createTextField(int len) {
        JTextField textField = new JTextField(len); textField.setFont(font); return textField;
    }
}
