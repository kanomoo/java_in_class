// package chapter5;

// import javax.swing.JOptionPane;

// public class ex4 {
//     public void start() {
//         int num1, num2;
//         String output = "";
//         num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter value 1 :"));
//         num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter value 2 :"));
//         output = "Before call method num1 = " + num1 + ", num2 = " + num2;
//         JOptionPane.showMessageDialog(null, output, "Result", JOptionPane.PLAIN_MESSAGE);
//         changeValue(num1, num2); // ไม่ได้เปลี่ยค่าตัวแปรเพราะส่งค่าตัวแปรเพราะการ pass by value ก็อบปี้ value ไปยัง  พารามิเตอร์ของ method ไม่ได้ส่งไป reference(ที่อยู่) หรือตามที่อยู่งจริงของตัวแปรหลัก
//         //ถ้าต้องการเปลี่ยนค่าตัวแปรหลักส่งค่าโดย pass by reference เช่นตัวแปร struct, array, object จะเปลี่ยนค่าจริง (pass by reference คือการส่งข้อมลไปยังที่อยู๋ของค่าเช่น int[] num; num[0] = num[1] + num[2]; คือการเปลี่ยนค่าที่อยู๋ num[0])  
//         output = "After call method num1 = " + num1 + " , num2 = " + num2;
//         JOptionPane.showMessageDialog(null, output, "Result", JOptionPane.PLAIN_MESSAGE);
//         System.exit(0);
//     }
//     public void changeValue(int num1 ,int num2) {
//         num1 = num1 + num2;
//         num2 = num2 - 5;
//     }
//     public static void main(String[] args) {
//         new ex4().start(); // เรียกใช้แบบ instance โดยไม่ต้องกำหนดชื่อตัวแปรได้โดยใช้ new เลย
//     }
// }





package chapter5;

import javax.swing.JOptionPane;

public class ex4 {
    public void start() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter value 1 :"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter value 2 : "));
        JOptionPane.showMessageDialog(null, "befor call method num 1 = " + num1 + ", num2 = " + num2, "Result", JOptionPane.PLAIN_MESSAGE);
        changeValue(num1, num2);
        JOptionPane.showMessageDialog(null, "After call method num 1 = " + num1 + ", num2 = " + num2, "Result", JOptionPane.PLAIN_MESSAGE);
    }
    public void changeValue(int n1, int n2) {
        n1 = n1 + n2;
        n2 = n2 - 5;
    }
    public static void main(String[] args) {
        new ex4().start();
    }
}