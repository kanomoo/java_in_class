package chapter9.New;

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

public class ex10 {
    public static void main(String[] args) {
        new MinMaxNumber();
    }
}

class MinMaxNumber extends JFrame implements ActionListener {
    Container c = getContentPane();
    JPanel panel1, panel2;
    JTextField textNum1, textNum2, textNum3, textFieldMinResult, textFieldMaxResult;
    JLabel labelNum1, labelNum2, labelNum3, labelMinResult, labelMaxResult;
    JButton btn = new JButton();
    Font font = new Font("Tahoma", Font.BOLD, 16);

    public MinMaxNumber() {
        super("Min Max Program");
        initGui();
        setSize(400, 360);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        initPanel1();
        initBtn();
        initPanel2();
    }

    public void initPanel1() {
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel1.setPreferredSize(new Dimension(350, 140));
        panel1.setBorder(new LineBorder(Color.RED, 2));
        labelNum1 = createLabel(panel1, "Enter number 1 : ");
        textNum1 = createTextField(panel1, 10);
        labelNum2 = createLabel(panel1, "Enter number 2 : ");
        textNum2 = createTextField(panel1, 10);
        labelNum3 = createLabel(panel1, "Enter number 3 : ");
        textNum3 = createTextField(panel1, 10);
        c.add(panel1);
    }

    public void initBtn() {
        btn = new JButton("Find Min Max");
        btn.setFont(font);
        btn.addActionListener(this);
        c.add(btn);
    }

    public void initPanel2() {
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel2.setPreferredSize(new Dimension(350, 80));
        panel2.setBorder(new LineBorder(Color.BLUE, 2));
        labelMinResult = createLabel(panel2, "Minimum Result : ");
        textFieldMinResult = createTextField(panel2, 10);
        textFieldMinResult.setEditable(false);
        labelMaxResult = createLabel(panel2, "Maximum Result : ");
        textFieldMaxResult = createTextField(panel2, 10);
        textFieldMaxResult.setEditable(false);
        c.add(panel2);
    }

    public JTextField createTextField(JPanel panel, int len) {
        JTextField textField = new JTextField(len);
        textField.setFont(font);
        panel.add(textField);
        return textField;
    }

    public JLabel createLabel(JPanel panel, String title) {
        JLabel label = new JLabel(title);
        label.setFont(font);
        panel.add(label);
        return label;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn) {
            textFieldMinResult.setText(String.valueOf(
                    Math.min(Math.min(Integer.parseInt(textNum1.getText()), Integer.parseInt(textNum2.getText())),
                            Integer.parseInt(textNum3.getText()))));
            textFieldMaxResult.setText(String.valueOf(
                    Math.max(Math.max(Integer.parseInt(textNum1.getText()), Integer.parseInt(textNum2.getText())),
                            Integer.parseInt(textNum3.getText()))));
        }
    }
}
