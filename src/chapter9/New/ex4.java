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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ex4 {
    public static void main(String[] args) {
        new WindowsFlowLayout();
    }
}

class WindowsFlowLayout extends JFrame implements ActionListener{
    Container c;
    JLabel label1, label2, label3;
    JTextField text1, text2;
    JPanel panel1, panel2;
    JRadioButton radioButton1, radioButton2;
    JButton btn1, btn2;
    JTextArea outputArea;
    JScrollPane scrollPane;
    Font font = new Font("Tahoma",Font.BOLD,16);

    public WindowsFlowLayout() {
        super("Test GUI #1 : FlowLayout");
        c = getContentPane();
        c.setLayout(new FlowLayout());
        initGui();
        setSize(350,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(100,100);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn1) {
            outputArea.setText(text1.getText() + "\n" + text2.getText());
        }
    }

    public void initGui() {
        initPanel1();
        initPanel2();
        initButton();
        initTextArea();
    }

    public void initPanel1() {
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setPreferredSize(new Dimension(300,100));
        panel1.setBorder(new LineBorder(Color.RED,2));
        createLabel(panel1, label1, "Enter String 1 :");
        text1 = createText(10);
        createLabel(panel1, label1, "Enter String 2 :");
        text2 = createText(10);
        label2 = new JLabel("");
        c.add(panel1);
    }

    public void initPanel2() {
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setPreferredSize(new Dimension(300,70));
        panel2.setBorder(new LineBorder(Color.BLUE, 2));
        createLabel(panel2, label3, "Select Sex : ");
        createRadioButton(radioButton1,"Male");
        createRadioButton(radioButton2, "Female");
        c.add(panel2);
    }

    public void initButton() {
        btn1 = createBtn("OK");
        btn2 = createBtn("Cancle");
    }

    public void initTextArea() {
        outputArea = new JTextArea(6,20);
        outputArea.setFont(font);
        outputArea.setEditable(false);
        scrollPane = new JScrollPane(outputArea);
        c.add(scrollPane);
    }

    public void createLabel(JPanel panel, JLabel label,String title) {
        label = new JLabel(title);
        label.setFont(font);
        panel.add(label);
    }

    public JTextField createText(int len) {
        JTextField text = new JTextField(len);
        text.setFont(font);
        panel1.add(text);
        return text;
    }

    public void createRadioButton(JRadioButton btn, String title) {
        btn = new JRadioButton(title);
        btn.setFont(font);
        panel2.add(btn);
    }

    public JButton createBtn(String title) {
        JButton btn = new JButton(title);
        btn.setFont(font);
        btn.addActionListener(this);
        c.add(btn);
        return btn;
    }
}