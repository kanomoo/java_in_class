package chapter8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ApplicationSummation {
    JFrame window = new JFrame("Summation Number Application");
    JLabel numberLabel, resultLabel;
    JTextField numberField, resultField;
    Container c = window.getContentPane();

    public ApplicationSummation() {
        c.setLayout(new FlowLayout());
        numberLabel = new JLabel("Enter an integer and press Enter");
        c.add(numberLabel);
        numberField = new JTextField(10);
        c.add(numberField);
        // create event
        numberField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                long number, sumValue;
                number = Long.parseLong(numberField.getText());
                sumValue = summation(number);
                resultField.setText(Long.toString(sumValue));
                numberField.setText("");
            }// end method actionPerformed
        });
        // Create resultLabel and attach it to content pane
        resultLabel = new JLabel("Summation value is");
        c.add(resultLabel);
        resultField = new JTextField(15);
        resultField.setEditable(false);
        c.add(resultField);
        window.setSize(350, 150);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public long summation(long n) {
        long total = 0;
        for(long x = 0; x <= n; x++)
            total += x;
        return(total);
    }
}
