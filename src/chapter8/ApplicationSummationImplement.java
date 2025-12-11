// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

// public class ApplicationSummationImplement implements ActionListener{ // implements(การดำเนินการผ่าน) “คลาสนี้จะใช้สัญญาของ interface ActionListener ActionListener เป็น interface ที่กำหนดไว้ว่า ใครจะเป็นตัวฟังเหตุการณ์ (event) แบบ Action เมื่อเขียน implements ActionListener หมายถึง คลาสนี้ต้องมีเมธอด @Override public void actionPerformed(ActionEvent e) อยู่ข้างใน (ไม่งั้นคอมไพล์ไม่ผ่าน)
// // ประโยคนี้คือการประกาศคลาสที่ “สืบสัญญา” จาก interface ActionListener ทำให้คลาสนั้นกลายเป็นตัวรับเหตุการณ์ (เช่น คลิกปุ่ม, กด Enter) ได้ โดยต้องเขียนเมธอด actionPerformed(ActionEvent e) เพื่อบอกว่าจะให้โปรแกรมทำอะไรเมื่อมี event เกิดขึ้น.
//     JFrame window = new JFrame("Summation Number Application use implements");
//     JLabel numberLabel, resultLabel;
//     JTextField numberField, resultField;
//     Container c = window.getContentPane();

//     public ApplicationSummationImplement() {
//         c.setLayout(new FlowLayout());
//         numberLabel = new JLabel("Enter an integer and press Enter");
//         c.add(numberLabel);
//         numberField = new JTextField(10);
//         c.add(numberField);
//         // create event
//         numberField.addActionListener(this);
//         // create resultLabel and attach it to content pane
//         resultLabel = new JLabel("Summation value is");
//         c.add(resultLabel);
//         resultField = new JTextField(15);
//         resultField.setEditable(false);
//         c.add(resultField);
//         window.setSize(350, 150);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     @Override
//     public void actionPerformed(ActionEvent event) {
//         long number, sumValue;
//         number = Long.parseLong(numberField.getText());
//         sumValue = summation(number);
//         resultField.setText(Long.toString(sumValue));
//         numberField.setText("");
//     }

//     public long summation(long number) {
//         long total = 0 ;
//         for(long n = 0; n <= number; n++)
//             total += n;
//         return total;
//     }

// }







package chapter8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ApplicationSummationImplement implements ActionListener{
    JFrame window = new JFrame("Summation Number Application use implements");
    JTextField numField, resultField;
    Container c = window.getContentPane();
    public ApplicationSummationImplement() {
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Enter an integer and press Enter"));
        numField = new JTextField(10);
        numField.addActionListener(this);
        c.add(numField);
        c.add(new JLabel("Summation Value is"));
        resultField = new JTextField(15);
        resultField.setEditable(false);
        c.add(resultField);
        window.setSize(350, 150);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        long num = Long.parseLong(numField.getText());
        long numValue = summation(num);
        resultField.setText(Long.toString(numValue));
        numField.setText("");
    }

    public long summation(long num) {
        long total = 0;
        for(long n = 0; n <= num; n++)
            total += n;
        return total;
    }
}