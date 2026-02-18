package chapter9.New;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex6 {
    public static void main(String[] args) {
        new WindowsGridLayout();
    }
}

class WindowsGridLayout extends JFrame implements ActionListener {
    Container c;
    JTextField textField1, textField2;
    JCheckBox checkBox1, checkBox2;
    JButton btnOk, btnCancel;
    JScrollPane scrollPane;
    JTextArea textArea;
    JPanel panel1, panel2, maiPanel;
    ButtonGroup group = new ButtonGroup();
    public WindowsGridLayout() {
        super("GUI # 3 with GridLayout.");
        initGui();
        setSize(400,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void initGui() {
        c = getContentPane();
        initPanel1();
        initPanel2();
        initMainPanel();
    }

    public void initMainPanel() {
        maiPanel = new JPanel();
        maiPanel.setLayout(new GridLayout(2,1));
        maiPanel.add(panel1);
        maiPanel.add(panel2);
        c.add(maiPanel);
    }

    public void initPanel1() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4, 2, 5,5));
        panel1.add(new JLabel(" Enter integer number 1 : "));
        textField1 = createTextField();
        textField2 = createTextField();
        panel1.add(new JLabel(" Enter integer number 2 : "));
        panel1.add(textField1);
        checkBox1 = createCheckBox("Book");
        checkBox2 = createCheckBox("Sport");
        btnOk = createButton("OK");
        btnCancel = createButton("Cancel");
        c.add(panel1);
    }

    public void initPanel2() {
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.add(scrollPane = new JScrollPane(textArea = new JTextArea(15, 32)));
    }

    public JTextField createTextField() {
        JTextField textField = new JTextField(10);
        textField.addActionListener(this);
        panel1.add(textField);
        return textField;
    }

    public JCheckBox createCheckBox(String title) {
        JCheckBox checkBox = new JCheckBox(title);
        group.add(checkBox);
        panel1.add(checkBox);
        return checkBox;
    }

    public JButton createButton(String title) {
        JButton btn = new JButton(title);
        btn.addActionListener(this);
        panel1.add(btn);
        return btn;
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnOk) {
            textArea.setText("Number 1 : " + textField2.getText() + "\nNumber 2 : " + textField1.getText() + "\n" + ((checkBox1.isSelected())? checkBox1.getText() : (checkBox2.isSelected()) ? checkBox2.getText() : " "));
        }
        else {
            textArea.setText("");
            textField1.setText("");
            textField2.setText("");
            group.clearSelection();
        }
    }



}