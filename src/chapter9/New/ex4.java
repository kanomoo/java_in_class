// package chapter9.New;

// import java.awt.Color;
// import java.awt.Container;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.ButtonGroup;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JRadioButton;
// import javax.swing.JScrollPane;
// import javax.swing.JTextArea;
// import javax.swing.JTextField;
// import javax.swing.border.LineBorder;

// public class ex4 {
//     public static void main(String[] args) {
//         new WindowsFlowLayout();
//     }
// }

// class WindowsFlowLayout extends JFrame implements ActionListener{
//     Container c;
//     JLabel label1, label2, label3;
//     JTextField text1, text2;
//     JPanel panel1, panel2;
//     JRadioButton radioButton1, radioButton2;
//     JButton btn1, btn2;
//     ButtonGroup group;
//     JTextArea outputArea;
//     JScrollPane scrollPane;
//     Font font = new Font("Tahoma",Font.BOLD,16);

//     public WindowsFlowLayout() {
//         super("Test GUI #1 : FlowLayout");
//         c = getContentPane();
//         c.setLayout(new FlowLayout());
//         initGui();
//         setSize(350,400);
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocation(100,100);
//     }

//     @Override
//     public void actionPerformed(ActionEvent event) {
//         if (event.getSource() == btn1) {
//             outputArea.setText(text1.getText() + "\n" + text2.getText());
//         }
//     }

//     public void initGui() {
//         initPanel1();
//         initPanel2();
//         initButton();
//         initTextArea();
//     }

//     public void initPanel1() {
//         panel1 = new JPanel();
//         panel1.setLayout(new FlowLayout());
//         panel1.setPreferredSize(new Dimension(300,100));
//         panel1.setBorder(new LineBorder(Color.RED,2));
//         createLabel(panel1, label1, "Enter String 1 :");
//         text1 = createText(10);
//         createLabel(panel1, label1, "Enter String 2 :");
//         text2 = createText(10);
//         label2 = new JLabel("");
//         c.add(panel1);
//     }

//     public void initPanel2() {
//         panel2 = new JPanel();
//         panel2.setLayout(new FlowLayout());
//         panel2.setPreferredSize(new Dimension(300,70));
//         panel2.setBorder(new LineBorder(Color.BLUE, 2));
//         group = new ButtonGroup();
//         createLabel(panel2, label3, "Select Sex : ");
//         radioButton1 = createRadioButton("Male");
//         radioButton2 = createRadioButton("Female");
//         c.add(panel2);
//     }

//     public void initButton() {
//         btn1 = createBtn("OK");
//         btn2 = createBtn("Cancel");
//     }

//     public void initTextArea() {
//         outputArea = new JTextArea(6,20);
//         outputArea.setFont(font);
//         outputArea.setEditable(false);
//         scrollPane = new JScrollPane(outputArea);
//         c.add(scrollPane);
//     }

//     public void createLabel(JPanel panel, JLabel label,String title) {
//         label = new JLabel(title);
//         label.setFont(font);
//         panel.add(label);
//     }

//     public JTextField createText(int len) {
//         JTextField text = new JTextField(len);
//         text.setFont(font);
//         panel1.add(text);
//         return text;
//     }

//     public JRadioButton createRadioButton(String title) {
//         JRadioButton btn = new JRadioButton(title);
//         btn.setFont(font);
//         btn.addActionListener(this);
//         group.add(btn);
//         panel2.add(btn);
//         return btn;
//     }

//     public JButton createBtn(String title) {
//         JButton btn = new JButton(title);
//         btn.setFont(font);
//         btn.addActionListener(this);
//         c.add(btn);
//         return btn;
//     }
// }















package chapter9.New;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

public class ex4 {
    
    public static void main(String[] args) {
        new WindowsFlowLayout();
    }
}

class WindowsFlowLayout extends JFrame implements ActionListener {
    Container c;
    JPanel panelText, panelChoice;
    JTextArea textArea;
    JScrollPane scrollPane;
    JTextField textName, textSurname;
    JRadioButton radioButtonMale, radioButtonFemale;
    JButton btnOk,btnCancel;
    ButtonGroup group = new ButtonGroup();
    Font font = new Font("Tahoma", Font.BOLD, 16);

    public WindowsFlowLayout() {
        super("Test GUI #1 FlowLayout");
        c = getContentPane();
        c.setLayout(new FlowLayout());
        initGui();
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200,200);
    }

    public void initGui() {
        initPanelText();
        initPanelChoice();
    }

    public void initPanelText() {
        panelText = new JPanel();
        panelText.setLayout(new FlowLayout());
        panelText.setPreferredSize(new Dimension(350,100));
        panelText.setBorder(new LineBorder(Color.RED,2));
        createLabel(panelText,  "Enter Name :");
        textName = createTextField(10);
        createLabel(panelText, "Enter Surname :");
        textSurname = createTextField(10);
        c.add(panelText);
    }

    public void initPanelChoice() {
        panelChoice = new JPanel();
        panelChoice.setLayout(new FlowLayout());
        panelChoice.setPreferredSize(new Dimension(350, 70));
        panelChoice.setBorder(new LineBorder(Color.BLUE,2));
        createLabel(panelChoice, "Select Sex : ");
        radioButtonMale = createRadioButton("Male");
        radioButtonFemale = createRadioButton("Female");
        c.add(panelChoice);
        btnOk = createButton("OK");
        btnCancel = createButton("Cancel");
        textArea = new JTextArea(5,20);
        textArea.setFont(font);
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        c.add(scrollPane);
    }

    public void createLabel(JPanel panel, String title) {
        JLabel label = new JLabel(title);
        label.setFont(font);
        panel.add(label);
    }

    public JRadioButton createRadioButton(String title) {
        JRadioButton btn = new JRadioButton(title);
        btn.setFont(font);
        btn.addActionListener(this);
        group.add(btn);
        panelChoice.add(btn);
        return btn;
    }

    public JTextField createTextField(int len) {
        JTextField textField = new JTextField(len);
        textField.setFont(font);
        panelText.add(textField);
        return textField;
    }

    public JButton createButton(String title) {
        JButton btn = new JButton(title);
        btn.setFont(font);
        btn.addActionListener(this);
        c.add(btn);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent even) {

        if (even.getSource() == btnOk)
            textArea.setText("Name : " + textName.getText() + "\nSurname : " + textSurname.getText() + "\nSex : " + ((radioButtonMale.isSelected()) ? "Male" : ((radioButtonFemale.isSelected()) ? "Female" : "")));
        else if  (even.getSource() == btnCancel) {
            textName.setText("");
            textSurname.setText("");
            group.clearSelection();
            textArea.setText("");
        }
    }


}