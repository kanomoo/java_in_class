package chapter8;

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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class MinMaxProgram implements ActionListener{
    JFrame window = new JFrame("Min Max Program");
    JPanel panel1, panel2;
    JLabel label1, label2, label3, label4, label5;
    JTextField number1, number2, number3, minResult, maxResult;
    JButton btn;
    Font font = new Font("Tahoma", Font.BOLD, 16);
    Container c = window.getContentPane();
    public MinMaxProgram() {
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        create_panel1();
        c.add(panel1);
        btn = new JButton("Find Min Max");
        btn.addActionListener(this);
        btn.setFont(font);
        c.add(btn);
        create_panel2();
        c.add(panel2);
        window.setSize(400,330);
        window.setVisible(true);
        window.setLocation(100, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        int num3 = Integer.parseInt(number3.getText());
        int minNumber = findMin(num1, num2, num3);
        int maxNumber = findMax(num1, num2, num3);
        minResult.setText(Integer.toString(minNumber));
        maxResult.setText(Integer.toString(maxNumber));
        number1.setText("");
        number2.setText("");
        number3.setText("");
    }

    public void create_panel1() {
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel1.setPreferredSize(new Dimension(350, 120));
        panel1.setBorder(new LineBorder(Color.RED, 1));
        label1 = new JLabel("Enter number 1 : ");
        label1.setFont(font);
        panel1.add(label1);
        number1 = new JTextField(10);
        number1.setFont(font);
        panel1.add(number1);
        label2 = new JLabel("Enter number 2 : ");
        label2.setFont(font);
        panel1.add(label2);
        number2 = new JTextField(10);
        number2.setFont(font);
        panel1.add(number2);
        label3 = new JLabel("Enter number 3 : ");
        label3.setFont(font);
        panel1.add(label3);
        number3 = new JTextField(10);
        number3.setFont(font);
        panel1.add(number3);
    }

    public void create_panel2() {
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel2.setPreferredSize(new Dimension(350, 80));
        panel2.setBorder(new LineBorder(Color.BLUE, 1));
        label4 = new JLabel("Minimum Result : ");
        label4.setFont(font);
        panel2.add(label4);
        minResult= new JTextField(10);
        minResult.setFont(font);
        minResult.setEditable(false);
        panel2.add(minResult);
        label5 = new JLabel("Minimum Result : ");
        label5.setFont(font);
        panel2.add(label5);
        maxResult = new JTextField(10);
        maxResult.setFont(font);
        maxResult.setEditable(true);
        maxResult.setEditable(false);
        panel2.add(maxResult);
    }

    public int findMin(int n1, int n2, int n3) {
        int Min = Math.min(n1, n2);
        Min = Math.min(n3, Min);
        return Min;
    }

    public int findMax(int n1, int n2, int n3) {
        int Max = Math.max(n1, n2);
        Max = Math.max(n3, Max);
        return Max;
    }
}