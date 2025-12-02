// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;
// import java.awt.Font;

// import javax.swing.JComboBox;
// import javax.swing.JFrame;
// import javax.swing.JList;

// public class WindowsGui4 {
//     JFrame window = new JFrame("GUI 4 : JList , JComboBox");
//     JList<String> list;
//     JComboBox<String> comboBox;
//     Container c;

//     public WindowsGui4() {
//         c = window.getContentPane();
//         c.setLayout(new FlowLayout());
//         createGui();
//         window.setSize(350, 150);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public void createGui() {
//         String strList[] = {"List 1", "List 2", "List 3", "List 4"};
//         list = new JList<String>(strList);
//         list.setFont(new Font("Tahoma", Font.BOLD, 16));
//         list.setSelectedIndex(1);
//         comboBox = new JComboBox<String>();
//         comboBox.addItem("ComboBox 1");
//         comboBox.addItem("ComboBox 2");
//         comboBox.addItem("ComboBox 3");
//         comboBox.addItem("ComboBox 4");
//         comboBox.setSelectedIndex(2);
//         c.add(list);
//         c.add(comboBox);
//     }
// }


// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;
// import java.awt.Font;

// import javax.swing.JComboBox;
// import javax.swing.JFrame;
// import javax.swing.JList;

// public class WindowsGui4 {
//     JFrame window = new JFrame("GUI 4 : JList , JComboBox");
//     JList<String> list; // สร้าง jlist กำหนด list <> เป็น String
//     JComboBox<String> comboBox;
//     public WindowsGui4() {
//         Container c = window.getContentPane();
//         createGui(c);
//         window.setSize(350, 150);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public void createGui(Container c) {
//         String listStr[] = {"List 1", "List 2", "List 3", "List 4"}; // สร้าง array String
//         c.setLayout(new FlowLayout());
//         list = new JList<String>(listStr); // เอา array มาเก็บใน object list ของ class JList ชนิด list คือ String
//         list.setFont(new Font("Tahoma", Font.BOLD, 18)); // กำหนด font ด้วย set font ต้อง new font ด้านใน 
//         list.setSelectedIndex(0); // ตังค่าตัวเลือกเริ่มต้น
//         c.add(list);
//         String comboString[] = {"ComboBox 1", "ComboBox 2", "ComboBox 3", "ComboBox 4"};
//         comboBox = new JComboBox<String>(comboString);
//         comboBox.addItem("ComboBox 5"); // หรือ addItem ใน list ได้
//         comboBox.setSelectedIndex(1);
//         c.add(comboBox);
//     }
// }








package chapter8;

import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class WindowsGui4 {
    JFrame window = new JFrame();
    Container c = window.getContentPane();
    JList<String> list;
    JComboBox<String> comboBox;

    public WindowsGui4() {
        
    }

    public void createGui() {

    }
}