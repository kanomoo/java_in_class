// package chapter5;

// import java.text.DecimalFormat;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex6 {
//     public void start() {
//         String output = "";
//         double principle, rate;
//         int year;
//         principle = Double.parseDouble(JOptionPane.showInputDialog("Enter principle : "));
//         year = Integer.parseInt(JOptionPane.showInputDialog("Enter year :"));
//         rate = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate(%) : "));
//         output = calAmount(principle, rate, year);
//         JTextArea outpuTextArea = new JTextArea(); // คือคลาสหนึ่งใน Java Swing ที่ใช้สำหรับแสดงและรับข้อความขนาดใหญ่ในรูปแบบ GUI (กราฟิก user interface) หรือหน้าต่างโปรแกรม
//         outpuTextArea.setText(output); // JTextArea เป็นคลาสที่เป็นอ็อบเจ็กต์ (object) ใน Java Swing ซึ่งต้องสร้าง instance ด้วยคำสั่ง new เพื่อมีตัวตนในหน่วยความจำ
//.        // setText() เป็นเมธอดของ JTextArea ที่ใช้กำหนดข้อความที่จะให้แสดงในพื้นที่แสดงผลตัวนี้
//         // จึงต้องสร้าง JTextArea ก่อนจึงจะใช้ method นี้ได้ เพราะ setText() ทำงานกับ instance นั้น ๆ
//         JOptionPane.showMessageDialog(null, outpuTextArea);
//         System.exit(0);
//     }
//     public String calAmount(double principle, double rate, int year) {
//         String result = "";
//         double amount, interest;
//         DecimalFormat two = new DecimalFormat("#,###,##0.00");

//         result = "Principle : " + two.format(principle);
//         result += ", Inteest Rate : " + two.format(rate) + "%";
//         result += ", Year : " + year + "\n";
//         amount = principle;
//         rate = rate / 100;
//         result += "===============================================\n";
//         result += "Year\tPrinciple\tIIInterest\tTotal\n";
//         result += "===============================================\n";
//         for (int n = 1; n <= year; n++) {
//             interest = amount * rate;
//             result += n + "\t" + two.format(amount) + "\t" + two.format(interest) + "\t";
//             amount = amount + interest;
//             result += two.format(amount) + "\n";
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         new ex6().start();
//     }
// }







// package chapter5;

// import java.text.DecimalFormat;
// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex6 {
//     public void start() {
//         String output = "";
//         double principle = Double.parseDouble(JOptionPane.showInputDialog("Enter principle :"));
//         int year = Integer.parseInt(JOptionPane.showInputDialog("Enter year :"));
//         double interest = Double.parseDouble(JOptionPane.showInputDialog("Enter intereest rate(%)"));
//         output = calAmount(principle, year, interest);
//         JTextArea outpuTextArea = new JTextArea();
//         outpuTextArea.setText(output);
//         JOptionPane.showMessageDialog(null, outpuTextArea);

//     }
//     public String calAmount(double principle, int year, double interest) {
//         DecimalFormat two = new DecimalFormat("##,##0.00");
//         double amount = principle;
//         double rate = interest / 100;
//         String output = "Principle : " + two.format(principle) + " , inteest Rate : " + two.format(interest) + " , Year : " + year + "\n";
//         output += "===========================================\n";
//         output += "Year\tPrinciple\tInterest\tTotal\n";
//         output += "===========================================\n";
//         for (int i = 1; i <= 6; i++){
//             output += i + "\t" + two.format(amount) + "\t" + two.format(amount * rate)  + "\t" + two.format(amount + amount * rate) + "\n";
//             amount = amount + amount * rate;
//         }
//         return output;
//     }
//     public static void main(String[] args) {
//         new ex6().start();
//     }
// }



package chapter5;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex6 {
    public void start() {
        double principle = Double.parseDouble(JOptionPane.showInputDialog("Enter principle :"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter year :"));
        double interest = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate(%) :"));
        String output = calAmount(principle, year, interest);
        JTextArea outpuTextArea = new JTextArea();
        outpuTextArea.setText(output);
        JOptionPane.showMessageDialog(null, outpuTextArea);
        System.exit(0);
    }
    public String calAmount(double principle, int year, double interest) {
        double amount = principle;
        double rate = interest / 100;
        DecimalFormat two = new DecimalFormat("#,###,##0.00");
        String output = "Principle : " + two.format(principle) + " , inteest Rate : " + two.format(year) + ", year : " + year + "\n";
        output += "=========================================\n";
        output += "Year\tPrinciple\tinterest\tTotal\n";
        output += "=========================================\n";
        for (int i = 1; i <= year; i++) {
            output += i + "\t" + two.format(amount) + "\t" + two.format(amount * rate) + "\t" + two.format(amount + amount * rate) + "\n";
            amount = amount + amount * rate;
        }
        return output;
    }
    public static void main(String[] args) {
        new ex6().start();
    }
}