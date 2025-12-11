// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

// public class ApplicationCalculate implements ActionListener {
//     JFrame window;
//     JLabel number1Label, number2Label, resultLabel;
//     JTextField number1Field, number2Field, resultField;
//     JButton btn1, btn2, btn3, btn4;
//     public ApplicationCalculate() {
//         window = new JFrame("Calculate Number Application");
//         Container c = window.getContentPane();
//         c.setLayout(new FlowLayout());

//         //create numberLabel and attach it to content pane
//         number1Label = new JLabel("Enter number 1 : ");
//         c.add(number1Label);
//         number1Field = new JTextField(10);
//         c.add(number1Field);
//         number2Label = new JLabel("Enter number 2 : ");
//         c.add(number2Label);
//         number2Field = new JTextField(10);
//         c.add(number2Field);
//         btn1 = new JButton("  +  ");
//         btn1.addActionListener(this);
//         c.add(btn1);
//         btn2 = new JButton("  -  ");
//         btn2.addActionListener(this);
//         c.add(btn2);
//         btn3 = new JButton("  *  ");
//         btn3.addActionListener(this);
//         c.add(btn3);
//         btn4 = new JButton("  /  ");
//         btn4.addActionListener(this);
//         c.add(btn4);
//         resultLabel = new JLabel("Result value is");
//         c.add(resultLabel);
//         resultField = new JTextField(10);
//         resultField.setEditable(false);
//         c.add(resultField);
//         window.setSize(260, 150);
//         window.setVisible(true);
//         window.setLocation(100, 100);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }


//     // เวลาเขียน implements ActionListener ถ้าคลาสมีเมธอด actionPerformed(ActionEvent e) ตรงเป๊ะอยู่แล้ว JVM ก็ถือว่าเป็นการ override โดยปริยาย ถึงไม่ใส่ @Override ก็ยังถูกเรียกเวลามี event เกิดขึ้น
//     // ดังนั้น @Override เป็น annotation ช่วยเช็ก ไม่ใช่สิ่งบังคับ:
//     // ถ้าใส่ @Override แล้วสะกดเมธอดผิด เช่น actionPerfomed หรือเปลี่ยนพารามิเตอร์ คอมไพเลอร์จะฟ้อง error ทันที ว่าเมธอดนี้ไม่ได้ override อะไรจริง
//     // ถ้าไม่ใส่ @Override แล้วสะกดผิด คอมไพเลอร์จะไม่รู้ว่าคุณตั้งใจ override ทำให้เมธอดไม่ถูกเรียกเวลาคลิกปุ่ม แต่จะไม่เตือน ทำให้บั๊กหาได้ยาก

//     // สรุป:
//     // โค้ดนี้ไม่มี @Override ก็ยังทำงาน เพราะเมธอด actionPerformed(ActionEvent event) ตรงตามเมธอดใน ActionListener อยู่แล้ว เพียงแต่ การใส่ @Override เป็นแนวทางที่ดีกว่า เพราะช่วยป้องกันการพิมพ์ผิดและทำให้คนอ่านโค้ดเข้าใจทันทีว่าเมธอดนี้คือการ override จาก interface.
//     public void actionPerformed(ActionEvent event) {
//         int num1 = Integer.parseInt(number1Field.getText());
//         int num2 = Integer.parseInt(number2Field.getText());
//         if (event.getSource() == btn1) // getScource บอกว่า เหตุการณ์นี้เกิดจาก component ตัวไหน ถ้ากดปุ่ม btn1 จะได้ event.getSource() เป็น object เดียวกับ btn1     การเขียน if (event.getSource() == btn1) คือการเช็กว่า “เหตุการณ์นี้มาจากปุ่ม btn1 ใช่ไหม
//             resultField.setText(Integer.toString(num1 + num2));
//         else if (event.getSource() == btn2)
//             resultField.setText(Integer.toString(num1 - num2));
//         else if (event.getSource() == btn3)
//             resultField.setText(Integer.toString(num1 * num2));
//         else if (event.getSource() == btn4)
//             resultField.setText(Float.toString((float)num1 / num2));
//     }// end method actionPerformed
    
// }





package chapter8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ApplicationCalculate implements ActionListener{
    JFrame window = new JFrame("Calculate Number Application");
    JTextField n1Field, n2Field, resultField;
    JButton btn1, btn2, btn3, btn4;
    Container c = window.getContentPane();
    public ApplicationCalculate() {
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Enter number 1 : "));
        n1Field = new JTextField(10);
        c.add(n1Field);
        c.add(new JLabel("Enter number 2 : "));
        n2Field = new JTextField(10);
        c.add(n2Field);
        btn1 = new JButton("  +  ");
        btn1.addActionListener(this);
        c.add(btn1);
        btn2 = new JButton("  -  ");
        btn2.addActionListener(this);
        c.add(btn2);
        btn3 = new JButton("  *  ");
        btn3.addActionListener(this);
        c.add(btn3);
        btn4 = new JButton("  /  ");
        btn4.addActionListener(this);
        c.add(btn4);
        c.add(new JLabel("Result value is"));
        resultField = new JTextField(13);
        resultField.setEditable(false);
        c.add(resultField);
        window.setSize(260, 150);
        window.setVisible(true);
        window.setLocation(100, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public void actionPerformed(ActionEvent event) {
        int num1 = Integer.parseInt(n1Field.getText() );
        int num2 = Integer.parseInt(n2Field.getText() );
        if (event.getSource() == btn1)
            resultField.setText(Integer.toString(num1 + num2));
        else if (event.getSource() == btn2)
            resultField.setText(Integer.toString(num1 - num2));
        else if (event.getSource() == btn3)
            resultField.setText(Integer.toString(num1 * num2));
        else if (event.getSource() == btn4)
            resultField.setText(Float.toString((float) num1 / num2));
    }
}