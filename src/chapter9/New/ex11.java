package chapter9.New;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ex11 {
    public static void main(String[] args) {
        new MyCalculator();
    }
}

class MyCalculator extends JFrame implements ActionListener {
    Container c = getContentPane();
    JPanel panel1, panel2;
    JButton[] btn;
    JTextField textResult;
    Font font = new Font("Tahoma", Font.BOLD, 18);
    String output = "";

    public MyCalculator() {
        super("My Calculator");
        initGui();
        setSize(250, 270);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        initPanel1();
        initPanel2();
    }

    public void initPanel1() {
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel1.setPreferredSize(new Dimension(210, 40));
        panel1.setBorder(new LineBorder(Color.BLACK));
        textResult = new JTextField(11);
        textResult.setFont(font);
        textResult.setEditable(false);
        textResult.setHorizontalAlignment(JTextField.RIGHT);
        panel1.add(textResult);
        c.add(panel1);
    }

    public void initPanel2() {
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4, 3));
        String[] textBtn = { "  1  ", "  2  ", "  3  ", "  4  ", "  5  ", "  6  ", "  7  ", "  8  ", "  9  ", "  0  ",
                "  .  ", "  C  " };
        btn = new JButton[textBtn.length];
        for (int i = 0; i < textBtn.length; i++) {
            btn[i] = new JButton(textBtn[i]);
            btn[i].setFont(font);
            btn[i].addActionListener(this);
            panel2.add(btn[i]);
        }
        c.add(panel2);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        boolean point = false;
        if (event.getSource() == btn[0]) output += btn[0].getText().trim();
        if (event.getSource() == btn[1])  output += btn[1].getText().trim();
        if (event.getSource() == btn[2]) output += btn[2].getText().trim();
        if (event.getSource() == btn[3]) output += btn[3].getText().trim();
        if (event.getSource() == btn[4]) output += btn[4].getText().trim();
        if (event.getSource() == btn[5]) output += btn[5].getText().trim();
        if (event.getSource() == btn[6]) output += btn[6].getText().trim();
        if (event.getSource() == btn[7]) output += btn[7].getText().trim();
        if (event.getSource() == btn[8]) output += btn[8].getText().trim();
        if (event.getSource() == btn[9]) output += btn[9].getText().trim();
        if (event.getSource() == btn[10]) {
            for (int i = 0; i < output.length(); i++) if (output.charAt(i) == '.') point = true;
            if (point == false) output += btn[10].getText().trim();
        }
        if (event.getSource() == btn[11]) output = "";
        if (event != null) textResult.setText(output);
    }
}
