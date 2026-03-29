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

public class nonTest1 extends JFrame implements ActionListener {
    JPanel panelFrom, panelBtn, panelResult;
    JTextField textHw, textMid, textFin;
    JButton btnCal, btnCancle;
    JTextArea textArea;
    String output;
    Font font = new Font("Courier New", Font.BOLD, 20);
    Container c = getContentPane();

    public static void main(String[] args) {
        new nonTest1();
    }

    public nonTest1() {
        super("Assignment 04 - 01 : Calculate Grade");
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        initGui();
        setSize(450,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnCal) {
            if (!textHw.getText().isEmpty() && !textMid.getText().isEmpty() && !textFin.getText().isEmpty()) {
                double hw = Double.parseDouble(textHw.getText()) , mid = Double.parseDouble(textMid.getText()), fin = Double.parseDouble(textFin.getText()), total = 0, scoreHw = hw * 0.3, scorerMid = mid * 0.3, scoreFin = fin * 0.4;
                String grade = "";
                total = scoreHw + scorerMid + scoreFin;
                if (total >= 80) grade = "A";
                else if (total >= 75) grade = "B+";
                else if (total >= 70) grade = "B";
                else if (total >= 65) grade = "C+";
                else if (total >= 60) grade = "C";
                else if (total >= 55) grade = "D+";
                else if (total >= 50) grade = "B+";
                else grade = "F";
                output = "Homework Score : " + hw + " -> " + scoreHw + "\nMidterm Score : " + mid + " -> " + scorerMid + "\nFinal Score : " + fin + " -> " + scoreFin + "\nTotal Score : " + total + "\nGrade : " + grade;
                textArea.setText(output);
            }
            else {
                JOptionPane.showMessageDialog(c, "No input Data", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (event.getSource() == btnCancle) {
            textHw.setText(""); textMid.setText(""); textFin.setText(""); textArea.setText("");
        }

    }

    public void initGui() {
        initPanelFrom();
        initPanelBtn();
        initPanelResult();
    }

    public void initPanelFrom() {
        panelFrom = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelFrom.setPreferredSize(new Dimension(400, 130));
        panelFrom.setBorder(new LineBorder(Color.RED));
        panelFrom.add(createLabel("Enter Homework Score : ")); panelFrom.add(textHw = new JTextField(5)); textHw.setFont(font);
        panelFrom.add(createLabel("Enter Midterm Score  : ")); panelFrom.add(textMid = new JTextField(5)); textMid.setFont(font);
        panelFrom.add(createLabel("Enter Final Score    : ")); panelFrom.add(textFin = new JTextField(5)); textFin.setFont(font);
        c.add(panelFrom);
    }

    public void initPanelBtn() {
        panelBtn = new JPanel(new FlowLayout());
        panelBtn.setPreferredSize(new Dimension(400,50));
        panelBtn.setBorder(new LineBorder(Color.red));
        panelBtn.add(btnCal = new JButton("Calculate")); btnCal.setFont(font); btnCal.addActionListener(this);
        panelBtn.add(btnCancle = new JButton("Cancle")); btnCancle.setFont(font); btnCancle.addActionListener(this);
        c.add(panelBtn);
    }

    public void initPanelResult() {
        panelResult = new JPanel(new FlowLayout());
        panelResult.setPreferredSize(new Dimension(400,130));
        panelResult.setBorder(new LineBorder(Color.red));
        panelResult.add(textArea = new JTextArea(5,30)); textArea.setFont(font); textArea.setForeground(Color.BLUE);
        c.add(panelResult);
    }

    public JLabel createLabel(String title) {
        JLabel label = new JLabel(title); label.setFont(font);
        return label;
    }



}
