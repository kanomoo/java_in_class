package test_sbt;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pyramid extends JFrame implements ActionListener{
    Container c = getContentPane();
    JTextField textValue;
    JTextArea textArea;
    
    public static void main(String[] args) {
        new Pyramid();
    }

    Pyramid() {
        super("Create a start-shaped pyramid.");
        c.setLayout(new FlowLayout());
        initGui();
        setSize(400,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

    }

    public void initGui() {
        c.add(new JLabel("Enter the number of rows (n)"));
        c.add(textValue = new JTextField(10)); textValue.addActionListener(this);
        c.add(textArea = new JTextArea(10,27));
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == textValue) {
            textArea.setText("");
            int len = Integer.parseInt(textValue.getText());
            for (int i = 0; i < len; i++ ) {
                textArea.append(" ".repeat((len - i) * 2) + "*".repeat(i * 2) + "*" + "\n");
            }
        }
    }
}
