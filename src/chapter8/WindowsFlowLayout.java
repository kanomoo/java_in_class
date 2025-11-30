// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;

// import javax.swing.ButtonGroup;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JRadioButton;
// import javax.swing.JTextField;

// public class WindowsFlowLayout {
//     JFrame window = new JFrame("Test GUI #1");
//     public WindowsFlowLayout() {
//         JTextField textField1, textField2;
//         JLabel label1, label2, label3, label4;
//         JButton btn1, btn2;
//         JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
//         ButtonGroup radioGroup;
//         Container c = window.getContentPane(); // ดึง “content pane” ของหน้าต่างมาเก็บในตัวแปร c หรือ container ของ window jframe
//         c.setLayout(new FlowLayout()); // จัด layout ถ้าไม่ใส่ จัดอัตโนมัติ
//         label1 = new JLabel("Enter String 1 create by JLabell"); // ข้อความ
//         label2 = new JLabel("Enter String 2 create by JLaabel");
//         label3 = new JLabel("RadiiioButton not use ButtonGroup");
//         label4 = new JLabel("RadioButton use ButtonGroup");
//         textField1 = new JTextField(10); // กรอกข้อความ
//         textField2 = new JTextField(10);
//         radioButton1 = new JRadioButton("Male", true); // ปุ่มเลือก  (true ด้านหลังคือกำหนดให้ติ๊กถูกเลือก)
//         radioButton2 = new JRadioButton("Female");
//         radioButton3 = new JRadioButton("Sport",true);
//         radioButton4 = new JRadioButton("Movies");
//         radioGroup = new ButtonGroup(); // กลุ่มปุ่ม
//         c.add(label1); // เพิ่ม component ชื่อ label1 ลงในพื้นที่ของหน้าต่างที่ตัวแปร c หรือ container
//         c.add(textField1);
//         c.add(label2);
//         c.add(textField2);
//         c.add(label3);
//         c.add(radioButton1);
//         c.add(radioButton2);
//         c.add(label4);
//         c.add(radioButton3);
//         c.add(radioButton4);
//         radioGroup.add(radioButton3); // จัดกลุ่ม b3 b4 ให้อยู๋กลุ่มเดียวกันทำให้เลือกซ้ำไม่ได้
//         radioGroup.add(radioButton4);
//         btn1 = new JButton("OK"); // ปุ่ม
//         btn2 = new JButton("Cancle");
//         btn1.setSize(400, 25); // จัดขนาด
//         c.add(btn1);
//         c.add(btn2);
//         window.setSize(350, 300);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }









// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;

// import javax.swing.ButtonGroup;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JRadioButton;
// import javax.swing.JTextField;

// public class WindowsFlowLayout {

//     JFrame window = new JFrame();
//     public WindowsFlowLayout() {
//         Container c = window.getContentPane();
//         c.setLayout(new FlowLayout());
//         JLabel label1, label2, label3, label4;
//         JTextField textField1, textField2;
//         JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
//         ButtonGroup radioGroup;
//         JButton btn1, btn2;
//         label1 = new JLabel("Enter Sring 1 create by Jlabel");
//         label2 = new JLabel("Enter String 2 create by Jlable");
//         label3 = new JLabel("RadioButton not use ButtonGroup");
//         label4 = new JLabel("RadioButon use ButtonGroup");
//         textField1 = new JTextField(10);
//         textField2 = new JTextField(10);
//         radioButton1 = new JRadioButton("Male", true);
//         radioButton2 = new JRadioButton("Female");
//         radioButton3 = new JRadioButton("Sport", true);
//         radioButton4 = new JRadioButton("Movies");
//         radioGroup = new ButtonGroup();
//         btn1 = new JButton("OK");
//         btn2 = new JButton("Cancle");
//         btn1.setSize(400,25);
//         c.add(label1);
//         c.add(textField1);
//         c.add(label2);
//         c.add(textField2);
//         c.add(label3);
//         c.add(radioButton1);
//         c.add(radioButton2);
//         c.add(label4);
//         c.add(radioButton3);
//         c.add(radioButton4);
//         radioGroup.add(radioButton3);
//         radioGroup.add(radioButton4);
//         c.add(btn1);
//         c.add(btn2);
//         window.setSize(350, 300);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }









// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;

// import javax.swing.ButtonGroup;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JRadioButton;
// import javax.swing.JTextField;

// public class WindowsFlowLayout {
//     JFrame window = new JFrame();
//     public WindowsFlowLayout() {
//         Container c = window.getContentPane();
//         JLabel label1, label2, label3, label4;
//         JTextField textField1, textField2;
//         JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
//         ButtonGroup radioButtonGroup;
//         JButton btn1, btn2;
//         c.setLayout(new FlowLayout());
//         label1 = new JLabel("Enter String 1 create by JLabel");
//         label2 = new JLabel("Enter String 2 create by JLabel");
//         label3 = new JLabel("Radiobutton not use ButtonGroup");
//         label4 = new JLabel("RadioButton use ButtonGroup");
//         textField1 = new JTextField(10);
//         textField2 = new JTextField(10);
//         radioButton1 = new JRadioButton("Male",true);
//         radioButton2 = new JRadioButton("Female");
//         radioButton3 = new JRadioButton("Sport",true);
//         radioButton4 = new JRadioButton("Movies");
//         btn1 = new JButton("OK");
//         btn2 = new JButton("Cancle");
//         radioButtonGroup = new ButtonGroup();
//         c.add(label1);
//         c.add(textField1);
//         c.add(label2);
//         c.add(textField2);
//         c.add(label3);
//         c.add(radioButton1);
//         c.add(radioButton2);
//         c.add(label4);
//         c.add(radioButton3);
//         c.add(radioButton4);
//         btn1.setSize(500, 25);
//         c.add(btn1);
//         c.add(btn2);
//         radioButtonGroup.add(radioButton3);
//         radioButtonGroup.add(radioButton4);
//         window.setSize(350,300);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//     }
// }



// package chapter8;

// import java.awt.Container;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.GridLayout;

// import javax.swing.ButtonGroup;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JRadioButton;
// import javax.swing.JTextField;

// public class WindowsFlowLayout {

//     JFrame window = new JFrame("Test GUI #1");

//     public WindowsFlowLayout() {
//         Container c = window.getContentPane();
//         c.setLayout(new GridLayout(4, 1)); // จัดเรียง Panel หลักเป็น 4 แถว 1 คอลัมน์

//         // --- Panel 1: สำหรับ String 1 ---
//         JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//         JLabel label1 = new JLabel("Enter String 1:");
//         JTextField textField1 = new JTextField(10);
//         panel1.add(label1);
//         panel1.add(textField1);

//         // --- Panel 2: สำหรับ String 2 ---
//         JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//         JLabel label2 = new JLabel("Enter String 2:");
//         JTextField textField2 = new JTextField(10);
//         panel2.add(label2);
//         panel2.add(textField2);

//         // --- Panel 3: สำหรับ Radio Buttons ---
//         JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
//         JRadioButton radiobtn1 = new JRadioButton("Male", true);
//         JRadioButton radiobtn2 = new JRadioButton("Female");
//         JRadioButton radiobtn3 = new JRadioButton("Sport", true);
//         JRadioButton radiobtn4 = new JRadioButton("Movies");
//         ButtonGroup raButtonGroup = new ButtonGroup();
//         raButtonGroup.add(radiobtn3);
//         raButtonGroup.add(radiobtn4);
//         panel3.add(new JLabel("Gender:"));
//         panel3.add(radiobtn1);
//         panel3.add(radiobtn2);
//         panel3.add(new JLabel("Hobby:"));
//         panel3.add(radiobtn3);
//         panel3.add(radiobtn4);

//         // --- Panel 4: สำหรับ Buttons ---
//         JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
//         JButton btn1 = new JButton("OK");
//         JButton btn2 = new JButton("Cancle");
//         panel4.add(btn1);
//         panel4.add(btn2);

//         c.add(panel1);
//         c.add(panel2);
//         c.add(panel3);
//         c.add(panel4);

//         window.setSize(400, 250);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }




package chapter8;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class WindowsFlowLayout {

    JFrame window = new JFrame("Test GUI #1");
    public WindowsFlowLayout() {
        window.setLayout(new FlowLayout());
        Container c = window.getContentPane();
        JLabel label1 =  new JLabel("Enter String 1 create by JLabel");
        JLabel label2 = new JLabel("Enter String 2 create by JLabel");
        JLabel label3 = new JLabel("RadioButton not use ButtonGroup");
        JLabel label4 = new JLabel("RadioButton use ButtonGroup");
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JRadioButton radiobtn1 = new JRadioButton("Male", true);
        JRadioButton radiobtn2 = new JRadioButton("Female");
        JRadioButton radiobtn3 = new JRadioButton("Sport", true);
        JRadioButton radiobtn4 = new JRadioButton("Movies");
        JButton btn1 = new JButton("OK");
        JButton btn2 = new JButton("Cancle");
        ButtonGroup raButtonGroup = new ButtonGroup(); // มีหน้าที่ทำให้ JRadioButton หลาย ๆ ตัว “เลือกได้ทีละอัน” ผู้ใช้จะเลือกได้แค่หนึ่งในสองปุ่มนี้เท่านั้น ไม่ต้องเรียก method อะไรเพิ่มเติมจาก ButtonGroup แค่สร้างกลุ่มแล้ว add() ปุ่มเข้าไป กลไกเลือกทีละอันจะทำงานให้อัตโนมัติอยู่เบื้องหลัง
        raButtonGroup.add(radiobtn3);
        raButtonGroup.add(radiobtn4);
        c.add(label1); c.add(textField1);
        c.add(label2); c.add(textField2);
        c.add(label3); c.add(radiobtn1);
        c.add(radiobtn2); c.add(label4);
        c.add(radiobtn3); c.add(radiobtn4);
        c.add(btn1); c.add(btn2);
        window.setSize(355, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}