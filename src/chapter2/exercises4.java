// package chapter2;
// import java.util.Scanner;

// public class exercises4 {
//     public static void main(String[] args) {
//         int num;
//         System.out.print("Enter number : ");
//         Scanner scan = new Scanner(System.in);
//         num = scan.nextInt();
//         int n1 = num / 100, n2 = num % 100 / 10, n3 = num % 10;
//         System.out.println("Summation of digit : " + n1  + "+" + n2 + "+" + n3 + " = " + (n1 + n2 + n3));
//     }
// }

package chapter2;
import java.util.Scanner;


public class exercises4 {

// public: สามารถเข้าถึงได้จากทุกที่เหมือนกัน
// static: เมธอดเป็นของคลาส ไม่ต้องสร้างอ็อบเจกต์ก่อนเรียกใช้
// int: เมธอดนี้จะคืนค่ากลับเป็นชนิด int
// sum: ชื่อเมธอดที่ตั้งให้แสดงถึงการรวมค่าหรือผลรวม
// (int n1, int n2, int n3): พารามิเตอร์ 3 ตัวที่เป็นตัวเลขจำนวนเต็ม (int)

public static int sum(int n1, int n2, int n3) {
    return n1 + n2 + n3;
}

// public: ระบุว่าสามารถเข้าถึงเมธอดนี้ได้จากที่ใดก็ได้ในโปรแกรม (access modifier)
// static: เมธอดนี้เป็นของคลาส ไม่ต้องสร้างอ็อบเจกต์ก่อนเรียกใช้
// void: เมธอดนี้ไม่คืนค่ากลับ (ไม่มี return value)
// main: ชื่อเมธอดพิเศษที่เป็นจุดเริ่มต้นของโปรแกรม Java ทุกโปรแกรมต้องมีเมธอดนี้
// String[] args: พารามิเตอร์ที่รับข้อมูลจาก command line ในรูปแบบอาร์เรย์ของ String

    public static void main(String[] args) {
        int num;
        System.out.print("Enter number : ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        int n1 = num / 100, n2 = num % 100 / 10, n3 = num % 10;
        System.out.println("Summation of digit : " + n1  + "+" + n2 + "+" + n3 + " = " + sum(n1, n2, n3));
        scan.close();
    }
}