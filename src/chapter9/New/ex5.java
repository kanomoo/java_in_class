package chapter9.New;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Container;

public class ex5 {
    public static void main(String[] args) {
        new WindowsBorderLayout();
    }
}

class WindowsBorderLayout {
    JFrame window = new JFrame("GUI #2 with Border Layout");
    Container c = window.getContentPane();
    JTextArea textArea1, textArea2, textArea3;
    JButton btn;
    JScrollPane scrollPane;

    public WindowsBorderLayout() {
        c.setLayout(new BorderLayout(10, 10));
        c.add(new JLabel("Example use BorderLayout"), BorderLayout.NORTH);
        textArea1 = new JTextArea(6,14);
        textArea1.setText("This West");
        c.add(textArea1, BorderLayout.WEST);
        textArea2 = new JTextArea(6, 14);
        textArea2.setText("This Center");
        scrollPane = new JScrollPane(textArea2);
        c.add(scrollPane, BorderLayout.CENTER);
        textArea3 = new JTextArea(6, 14);
        textArea3.setEditable(false);
        textArea3.setText("This East");
        c.add(textArea3, BorderLayout.EAST);
        btn = new JButton(" South ");
        c.add(btn, BorderLayout.SOUTH);
        window.setSize(400, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
