package chapter9.New;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ex9 {
    public static void main(String[] args) {
        new ApplicationCalculate();
    }
}

class ApplicationCalculate extends JFrame implements ActionListener {
    Container c = getContentPane();
    JTextField number1, number2, result;
    JButton btnPlus, btnSubtract, btnMultiply, btnDivide;

    public ApplicationCalculate() {
        super("Calculate Number");
        initGui();
        setSize(270,200);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        c.add(new JLabel("Enter number 1 : "));
        number1 = createTextField(10);
        c.add(new JLabel("Enter number 2 : "));
        number2 = createTextField(10);
        btnPlus = createButton("+");
        btnSubtract = createButton("-");
        btnMultiply = createButton("*");
        btnDivide = createButton("/");
        c.add(new JLabel("Result value is "));
        result = createTextField(10);
        result.setEditable(false);
    }

    public JTextField createTextField(int len) {
        JTextField textField = new JTextField(10);
        c.add(textField);
        return textField;
    }

    public JButton createButton(String title) {
        JButton btn = new JButton(title);
        btn.addActionListener(this);
        c.add(btn);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        if (event.getSource() == btnPlus) result.setText(Integer.toString(num1 + num2));
        if (event.getSource() == btnSubtract) result.setText(Integer.toString(num1 - num2));
        if (event.getSource() == btnMultiply) result.setText(Integer.toString(num1 * num2));
        if (event.getSource() == btnDivide) result.setText(Float.toString((float) num1 / num2));
    }
}