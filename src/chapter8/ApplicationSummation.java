// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

// public class ApplicationSummation {
//     JFrame window = new JFrame("Summation Number Application");
//     JLabel numberLabel, resultLabel;
//     JTextField numberField, resultField;
//     Container c = window.getContentPane();

//     public ApplicationSummation() {
//         c.setLayout(new FlowLayout());
//         numberLabel = new JLabel("Enter an integer and press Enter");
//         c.add(numberLabel);
//         numberField = new JTextField(10);
//         c.add(numberField);
//         // create event
//         numberField.addActionListener(new ActionListener() {
//             @Override // @override คือการเขียนทับไปยัง superclass หรือ class หลัก คอมไพเลอร์จะตรวจให้ว่าเมธอดนี้ ตรงกับเมธอดใน interface จริงไหม เพราะ actionPerformed คือ supclass  หรือ method ที่เป็ฯน interface คือ method ที่กำหนดชื่อมาแล้วหรือที่อยู่ข้างในของ actionlistener ช่วยเขียนทับ จับ bug และทำให้รู้ว่าไม่ method ใหม่ ช่วยกันบั๊กพิมพ์ชื่อผิดหรือเขียนซิกเนเจอร์ผิดโดยไม่ได้ตั้งใจ
//             public void actionPerformed(ActionEvent event) {
//                 long number, sumValue;
//                 number = Long.parseLong(numberField.getText());
//                 sumValue = summation(number);
//                 resultField.setText(Long.toString(sumValue)); // กำหนด text
//                 numberField.setText("");
//             }// end method actionPerformed
//         });
//         // Create resultLabel and attach it to content pane
//         resultLabel = new JLabel("Summation value is");
//         c.add(resultLabel);
//         resultField = new JTextField(15);
//         resultField.setEditable(false); // กำหนดการแก้ไข
//         c.add(resultField);
//         window.setSize(350, 150);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public long summation(long n) {
//         long total = 0;
//         for(long x = 0; x <= n; x++)
//             total += x;
//         return(total);
//     }
// }




// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

// public class ApplicationSummation {
//     JFrame window = new JFrame("Summation Number Application");
//     JLabel numberLabel, resultLabel;
//     JTextField numberField, resultField;
//     Container c = window.getContentPane();
    
//     public ApplicationSummation() {
//         c.setLayout(new FlowLayout());
//         numberLabel = new JLabel("Enter an integer and press Enter");
//         c.add(numberLabel);
//         numberField = new JTextField(10);
//         c.add(numberField);
//         numberField.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent event) {
//                 long number = Long.parseLong(numberField.getText());
//                 long sumValue = sumation(number);
//                 resultField.setText(Long.toString(sumValue));
//                 numberField.setText("");
//             }
//         });
//         resultLabel = new JLabel("Summation value is");
//         c.add(resultLabel);
//         resultField = new JTextField(15);
//         resultField.setEditable(false);
//         c.add(resultField);
//         window.setSize(350, 150);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public long sumation(long number) {
//         long total = 0;
//         for(long n = 0; n <= number; n++)
//             total += n;
//         return total;
//     }
// }






// package chapter8;

// import java.awt.Container;
// import java.awt.FlowLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

// public class ApplicationSummation {
//     JFrame window = new JFrame("Summation Number Application");
//     JTextField numField, resultField;
//     Container c = window.getContentPane();
//     public ApplicationSummation() {
//         c.setLayout(new FlowLayout());
//         c.add(new JLabel("Enter an integer and press Enter"));
//         numField = new JTextField(10);
//         c.add(numField);
//         numField.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent event) {
//                 long number = Long.parseLong(numField.getText());
//                 long numValue = summation(number);
//                 resultField.setText(Long.toString(numValue));
//                 numField.setText("");
//             }
//         });
//         c.add(new JLabel("Summatin value is"));
//         resultField = new JTextField(15);
//         resultField.setEditable(false);
//         c.add(resultField);
//         window.setSize(350, 150);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//     }


//     public long summation(long number) {
//         long total= 0;
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

public class ApplicationSummation {
    JFrame window = new JFrame("summation Number Application");
    Container c = window.getContentPane();
    JTextField numberField, resultField;
    public ApplicationSummation() {
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Enter an integer and press Enter"));
        numberField = new JTextField(10);
        c.add(numberField);
        numberField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                long number = Long.parseLong(numberField.getText());
                long numValue = summation(number);
                resultField.setText(Long.toString(numValue));
                numberField.setText("");
            }
        });
        c.add(new JLabel("Summation value is"));
        resultField = new JTextField(15);
        resultField.setEditable(false);
        c.add(resultField);
        window.setSize(350, 150);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public long summation(long number) {
        long total = 0;
        for(long n = 0; n <= number; n++)
            total += n;
        return total;
    }
}