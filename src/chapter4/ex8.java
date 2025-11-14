// package chapter4;

// import javax.swing.JOptionPane;

// public class ex8 {
//     public static void main(String[] args) {
//         String firstStr, secondStr;
//         int num1, num2 ,sum;
//         firstStr = JOptionPane.showInputDialog("Enter first integer : ");
//         secondStr = JOptionPane.showInputDialog("Enter second integer : ");
//         num1 = Integer.parseInt(firstStr);  //การแปลงข้อความ (string) ที่อยู่ในตัวแปร firstStr ให้กลายเป็นค่าตัวเลขจำนวนเต็มชนิด int ที่เป็นค่า premitive หรือค่าดั้งเดิมเป็นค่าจริงๆในหน่วยความจำ ไม่เหมือน valueof ที่แปลงเป็น object แล้วแปลงเป็น int ที่อาจเสียข้อมูลได้หรือเหมาะสมกับการไปใช้ต่อกับ object
//         num2 = Integer.parseInt(secondStr);
//         sum = num1 + num2;
//         String output = "This sum of " + num1 + " + " + num2 + " is " + sum;
//         JOptionPane.showMessageDialog(null, output, "Results", JOptionPane.PLAIN_MESSAGE);
//     }
// }


package chapter4;

import javax.swing.JOptionPane;

public class ex8 {
    public static void main(String[] args) {
        String first, second;
        first = JOptionPane.showInputDialog("Enter first integer : ");
        second = JOptionPane.showInputDialog("Enter second integer : ");
        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);
        String output = "The sum of " + num1 + " + " + num2 + " is " + (num1 + num2);
        JOptionPane.showMessageDialog(null, output, "Results", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}