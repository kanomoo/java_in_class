package chapter9.New;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class ex8 {
    public static void main(String[] args) {
        new AppSummation();
    }
}


class AppSummation extends JFrame implements ActionListener {
    Container c;
    JTextField textField, textFieldValue;
    public AppSummation() {
        super("Summation Number Application");
        c = getContentPane();
        c.setLayout(new FlowLayout());
        initGui();
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void initGui() {
        c.add(new JLabel("Enter an integer and press Enter "));
        c.add(textField = new JTextField(10));
        textField.addActionListener(this);
        c.add(new JLabel("Summation value is "));
        c.add(textFieldValue = new JTextField(10));
        textFieldValue.addActionListener(this);
        textFieldValue.setEditable(false);

    }

    public int Sum(int num) {
        if (num == 0) return 0;
        else return num + Sum(num - 1);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == textField) textFieldValue.setText(String.valueOf(Sum(Integer.parseInt(textField.getText()))));
    }

}