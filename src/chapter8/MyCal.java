// package chapter8;

// import java.awt.Color;
// import java.awt.Container;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.GridLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JTextField;
// import javax.swing.border.LineBorder;

// public class MyCal implements ActionListener{
//     JFrame window;
//     JLabel numberlLabel;
//     JTextField numberField;
//     JButton[] btn;
//     JPanel panel1, panel2;
//     Font myFont = new Font("Tahoma", Font.BOLD, 18);

//     public MyCal() {
//         window = new JFrame("My Calculator");
//         Container c = window.getContentPane();
//         c.setLayout(new FlowLayout());

//         panel1 = new JPanel();
//         panel1.setPreferredSize(new Dimension(270, 40));
//         panel1.setLayout(new FlowLayout());
//         panel1.setBorder(new LineBorder(Color.DARK_GRAY, 1));
//         numberField = new JTextField(15);
//         numberField.setFont(myFont);
//         numberField.setHorizontalAlignment(JTextField.RIGHT); //มีหน้าที่กำหนดตำแหน่งจัดเรียงข้อความในช่อง JTextField และกำหนดให้ JTextField.RiGHT คือชิดขวา (ปกติจะชิดซ้าย)
//         panel1.add(numberField);

//         panel2 = new JPanel();
//         panel2.setPreferredSize(new Dimension(250, 40));
//         panel2.setLayout(new GridLayout(1, 3));
//         panel2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
//         String[] textBtn = {"  1  ", "  2  ", "  3  "};
//         btn = new JButton[textBtn.length];
//         for(int n = 0; n < btn.length; n++) {
//             btn[n] = new JButton(textBtn[n]);
//             btn[n].setFont(myFont);
//             btn[n].addActionListener(this);
//             panel2.add(btn[n]);
//         }
//         c.add(panel1);
//         c.add(panel2);
//         window.setSize(300, 300);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         window.setVisible(true);
//     }

//     public void actionPerformed(ActionEvent event) {
//         String str = numberField.getText();
//         if (event.getSource() == btn[0]){
//             str += "1";
//             numberField.setText(str);
//         }
//         else if (event.getSource() == btn[1]) {
//             str += "2";
//             numberField.setText(str);
//         }
//         else if (event.getSource() == btn[2]) {
//             str += "3";
//             numberField.setText(str);
//         }
//     }
// }

// package chapter8;

// import java.awt.Color;
// import java.awt.Container;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.GridLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.JTextField;
// import javax.swing.border.LineBorder;

// public class MyCal implements ActionListener {
//     JFrame window = new JFrame("My cal");
//     JTextField numberField;
//     JPanel panel1, panel2;
//     Font myFont = new Font("Tahoma", Font.BOLD, 18);
//     Container c = window.getContentPane();
//     JButton[] btn;
//     String str = "";

//     public MyCal() {
//         c.setLayout(new FlowLayout());
//         create_panel1();
//         c.add(panel1);
//         create_panel2();
//         c.add(panel2);
//         window.setSize(300, 300);
//         window.setVisible(true);
//         window.setLocation(300, 300);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     @Override
//     public void actionPerformed(ActionEvent event) {
//         if(event.getSource() == btn[0]) {
//             str += btn[0].getText().trim();
//             numberField.setText(str);
//         }
//         else if(event.getSource() == btn[1]) {
//             str += btn[1].getText().trim();
//             numberField.setText(str);
//         }
//         else if(event.getSource() == btn[2]) {
//             str += btn[2].getText().trim();
//             numberField.setText(str);
//         }
//     }

//     public void create_panel1() {
//         panel1 = new JPanel();
//         panel1.setLayout(new FlowLayout());
//         panel1.setPreferredSize(new Dimension(270, 40));
//         panel1.setBorder(new LineBorder(Color.DARK_GRAY, 1));
//         numberField = new JTextField(15);
//         numberField.setEditable(false);
//         numberField.setHorizontalAlignment(JTextField.RIGHT);
//         numberField.setFont(myFont);
//         panel1.add(numberField);
//     }

//     public void create_panel2() {
//         panel2 = new JPanel();
//         panel2.setLayout(new GridLayout(1, 3));
//         panel2.setPreferredSize(new Dimension(230, 50));
//         panel2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
//         String[] textBtn = { "  1  ", "  2  ", "  3  " };
//         btn = new JButton[textBtn.length];
//         for (int n = 0; n < textBtn.length; n++) {
//             btn[n] = new JButton(textBtn[n]);
//             btn[n].setFont(myFont);
//             btn[n].addActionListener(this);
//             panel2.add(btn[n]);
//         }
//     }
// }

package chapter8;

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

public class MyCal implements ActionListener {
    JFrame window = new JFrame("My Calculator");
    JPanel panel1, panel2;
    JButton[] btn;
    JTextField numberField;
    Container c = window.getContentPane();
    Font font = new Font("Tahoma", Font.BOLD, 18);
    String str = "";

    public MyCal() {
        c.setLayout(new FlowLayout());
        create_panel1();
        c.add(panel1);
        create_panel2();
        c.add(panel2);
        window.setSize(300, 300);
        window.setVisible(true);
        window.setLocation(300, 300);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() != btn[11]) {
            for (int n = 0; n <= 10; n++) {
                if (event.getSource() == btn[n]) {
                    str += btn[n].getText().trim();
                    numberField.setText(str);
                }
            }
        } else {
            str = "";
            numberField.setText(str);
        }
    }

    public void create_panel1() {
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setPreferredSize(new Dimension(270, 40));
        panel1.setBorder(new LineBorder(Color.DARK_GRAY, 1));
        numberField = new JTextField(15);
        numberField.setHorizontalAlignment(JTextField.RIGHT);
        numberField.setFont(font);
        numberField.setEditable(false);
        panel1.add(numberField);
    }

    public void create_panel2() {
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4, 3));
        panel2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panel2.setPreferredSize(new Dimension(250, 160));
        String[] strBtn = { "  1  ", "  2  ", "  3  ", "  4  ", "  5  ", "  6  ", "  7  ", "  8  ", "  9  ", "  0  ",
                "  .  ", "  C  " };
        btn = new JButton[strBtn.length];
        for (int n = 0; n < strBtn.length; n++) {
            btn[n] = new JButton(strBtn[n]);
            btn[n].setFont(font);
            btn[n].addActionListener(this);
            panel2.add(btn[n]);
        }
    }
}
