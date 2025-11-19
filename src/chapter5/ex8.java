// Overloading Method คือการสร้างเมธอดหลาย ๆ เมธอดในคลาสเดียวกัน โดยมีชื่อเหมือนกัน แต่แตกต่างกันที่
// จำนวนหรือชนิดของพารามิเตอร์ (Parameters)
// type รูปแบบของอาร์กิวเมนต์ (Arguments) ที่ส่งเข้าเมธอด
// จุดประสงค์เพื่อเพิ่มความยืดหยุ่นในการใช้เมธอดเดียวกันกับข้อมูลหรือสถานการณ์ที่แตกต่างกัน โดยที่ยังคงใช้ชื่อเมธอดเดียวกันเพื่อความสะดวกในการเขียนและอ่านโค้ด


// package chapter5;

// import java.util.Scanner;

// public class ex8 {
    
//     public void input() {
//         int numInt1, numInt2;
//         double numDoble1, numDoble2;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter integer number 1 : ");
//         numInt1 = scanner.nextInt();
//         System.out.print("Enter integer number 2 : ");
//         numInt2 = scanner.nextInt();
//         System.out.println("Result integer number = " + Add(numInt1, numInt2));
//         System.out.print("Enter floathing number 1 : ");
//         numDoble1 = scanner.nextDouble();
//         System.out.print("Enter floathing number 2 : ");
//         numDoble2 = scanner.nextDouble();
//         System.out.println("Result floating number = " + Add(numDoble1, numDoble2));
//         scanner.close();
//     }

//     public static int Add(int num1, int num2) {
//         return(num1 + num2);
//     }

//     public static double Add(double num1, double num2) {
//         return(num1 + num2);
//     }

//     public static void main(String[] args) {
//         new ex8().input();
//     }
// }

package chapter5;

import javax.swing.JOptionPane;

public class ex8 {
    
    public void start() {
        int numInt1 = Integer.parseInt(JOptionPane.showInputDialog("Enter integer number 1 :"));
        int numInt2 = Integer.parseInt(JOptionPane.showInputDialog("Enter integer number 2 :"));
        JOptionPane.showMessageDialog(null, "Result integer number = " + Add(numInt1, numInt2));
        double numDoble1 = Double.parseDouble(JOptionPane.showInputDialog("Enter floating number 1 :"));
        double numDoble2 = Double.parseDouble(JOptionPane.showInputDialog("Enter floating number 2 :"));
        JOptionPane.showMessageDialog(null, "Result floating number = " + Add(numDoble1, numDoble2));
    }

    public int Add(int n1, int n2) {
        return n1 + n2;
    }

    public double Add(double n1, double n2){
        return n1 + n2;
    }

    public static void main(String[] args) {
        new ex8().start();
    }
}