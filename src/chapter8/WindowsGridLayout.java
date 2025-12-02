// package chapter8;

// import java.awt.Container;
// import java.awt.GridLayout;

// import javax.swing.JButton;
// import javax.swing.JCheckBox;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

// public class WindowsGridLayout {
//     JFrame window = new JFrame("GUI # 3 with GridLayout");
//     Container c;

//     public WindowsGridLayout() {
//         c = window.getContentPane();
//         c.setLayout(new GridLayout(4, 2, 5, 5));
//         createGui();
//         window.setLocation(250, 250); // ใช้กำหนดตำแหน่ง (Location) ในหน้าต่าง window ว่าเปิดอยู่ตรงไหน
//         window.setSize(400, 300);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public void createGui() {
//         JLabel label1, label2;
//         JTextField textField1, textField2;
//         JButton btn1, btn2;
//         JCheckBox checkBox1, checkBox2;
//         label1 = new JLabel("Enter integer number 1 : ");
//         label2 = new JLabel("Enter integer number 2 :");
//         textField1 = new JTextField(10);
//         textField1.setToolTipText("1-100");
//         textField2 = new JTextField(10);
//         textField2 = new JTextField(10);
//         textField2.setToolTipText("1-100");
//         checkBox1 = new JCheckBox("Book");
//         checkBox2 = new JCheckBox("Sport");
//         btn1 = new JButton("OK");
//         btn2 = new JButton("Cancle");
//         c.add(label1);
//         c.add(textField1);
//         c.add(label2);
//         c.add(textField2);
//         c.add(checkBox1);
//         c.add(checkBox2);
//         c.add(btn1);
//         c.add(btn2);
//     }

// }


// package chapter8;

// import java.awt.Container;
// import java.awt.GridLayout;

// import javax.swing.JButton;
// import javax.swing.JCheckBox;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

// public class WindowsGridLayout {
//     JFrame window = new JFrame("GUI # 3 with GridLayout");
//     Container c;
//     public WindowsGridLayout() {
//         c = window.getContentPane();
//         c.setLayout(new GridLayout(4, 2, 5, 5));
//         createGui();
//         window.setLocation(200,200);
//         window.setSize(400,300);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public void createGui() {
//         c.add(new JLabel("Enter integer number 1:"));
//         c.add(new JTextField(10));
//         c.add(new JLabel("Enter integer number 2:"));
//         c.add(new JTextField(10));
//         c.add(new JCheckBox("Book"));
//         c.add(new JCheckBox("Sport"));
//         c.add(new JButton("OK"));
//         c.add(new JButton("Cancle"));
//     }
// }




package chapter8;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WindowsGridLayout {
    JFrame window = new JFrame();
    Container c; // กำหนด container เป็น c
    public WindowsGridLayout() {
        c = window.getContentPane();
        c.setLayout(new GridLayout(4, 2, 5, 5)); // กำหนด 4 แถว 2 ตาราง
        createGui(); // สร้าง gui
        window.setLocation(200, 200); 
        window.setSize(400,300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createGui() {
        c.add(new JLabel("Enter integer number1:"));
        c.add(new JTextField(10));
        c.add(new JLabel("Enter integer number2:"));
        c.add(new JTextField(10));
        c.add(new JCheckBox("Book"));
        c.add(new JCheckBox("Sport"));
        c.add(new JButton("OK"));
        c.add(new JButton("Cancle"));
    }
}