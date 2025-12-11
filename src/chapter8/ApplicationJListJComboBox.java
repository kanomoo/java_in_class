// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JButton;
// import javax.swing.JComboBox;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JList;
// import javax.swing.JOptionPane;

// public class ApplicationJListJComboBox implements ActionListener{
//     JFrame window = new JFrame("Summation with Jlist and JComboBox");
//     JList<String> list;
//     JComboBox<String> combo;
//     JButton btn1, btn2;
//     public ApplicationJListJComboBox() {
//         Container c = window.getContentPane();
//         String strList[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
//         c.setLayout(new FlowLayout());
//         c.add(new JLabel("Select number : "));
//         list = new JList<String>(strList);
//         list.setSelectedIndex(0);
//         c.add(list);
//         btn1 = new JButton("Sum");
//         btn1.addActionListener(this);
//         c.add(btn1);
//         c.add(new  JLabel("Select number : "));
//         combo = new JComboBox<String>(strList);
//         combo.setSelectedIndex(0);
//         c.add(combo);
//         btn2 = new JButton("Sum");
//         btn2.addActionListener(this);
//         c.add(btn2);
//         window.setSize(290, 300);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
    
//     @Override
//     public void actionPerformed(ActionEvent event) {
//         int number;
//         if (event.getSource() == btn1) {
//             number = Integer.parseInt(list.getSelectedValue());
//             JOptionPane.showMessageDialog(window, "Summation : " + summation(number)); แทน null เพราะต้องการให้ dialog ผูกอยู่กับหน้าต่าง window   พารามิเตอร์ตัวแรก คือ parent ของ dialog  ถ้าใส่ window dialog จะถูกจัดตำแหน่ง “กึ่งกลาง” บนหน้าต่าง window dialog จะ modal กับหน้าต่างนั้น (คือบังคับให้ตอบ dialog ก่อนค่อยกลับไปใช้หน้าต่าง window) ถ้าเลื่อน/ย้าย window dialog ก็จะขยับตามอย่างถูกต้อง
//         }
//         else if (event.getSource() == btn2) {
//             number = Integer.parseInt(combo.getSelectedItem().toString());
//             JOptionPane.showMessageDialog(window, "Summation : " + summation(number));
//         }
//     }

//     public long summation(long n) {
//         long total = 0;
//         for(long x = 0; x <= n; x++)
//             total += x;
//         return total;
//     }
// }


package chapter8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ApplicationJListJComboBox implements ActionListener{
    JFrame window = new JFrame("Summation with JList and JComboBox");
    JList<String> list;
    JComboBox<String> comboBox;
    JButton btn1, btn2;
    Container c = window.getContentPane();
    public ApplicationJListJComboBox() {
        String strList[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Select number : "));
        list = new JList<>(strList);
        c.add(list);
        btn1 = new JButton("Sum");
        btn1.addActionListener(this);
        c.add(btn1);
        c.add(new JLabel("Select number :"));
        comboBox = new JComboBox<>(strList);
        c.add(comboBox);
        btn2 = new JButton("Sum");
        btn2.addActionListener(this);
        c.add(btn2);
        window.setSize(290, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn1) {
            int num = Integer.parseInt(list.getSelectedValue());
            JOptionPane.showMessageDialog(window, "Summation : " + summation(num));
        }
        else if (event.getSource() == btn2) {
            int num = Integer.parseInt(comboBox.getSelectedItem().toString());
            JOptionPane.showMessageDialog(window, "Summation : " + summation(num));
        }
    }

    public int summation(int num) {
        int total = 0;
        for(int i = 0; i <= num; i++)
            total += i;
        return total;
    }
}