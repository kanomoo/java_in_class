// package chapter3;

// import java.text.DecimalFormat;
// import java.util.Scanner;

// public class ex10 {
//     public static void main(String[] args) {
//         final double RATE = 0.045;
//         Scanner scanner = new Scanner(System.in);
//         DecimalFormat twoDigit = new DecimalFormat("###,##0.00");
//
//            // รูปแบบ "###,##0.00" ใน DecimalFormat คือรูปแบบการจัดแสดงตัวเลขที่กำหนดวิธีการแสดงผลดังนี้
//            // "#"หมายถึง ตัวเลขที่แสดงถ้ามีค่า (digits) แต่จะไม่แสดงถ้าเป็น 0 ในตำแหน่งนั้น (optional digit)
//            // "0" หมายถึง ตัวเลขที่ต้องแสดงทุกกรณี แม้ว่าจะเป็น 0 ก็ตาม (mandatory digit)
//            // "," (comma) คือเครื่องหมายคั่นหลักพัน (grouping separator) ที่จะแทรกระหว่างกลุ่มหลักพันในตัวเลข
//            // "." (dot) คือจุดทศนิยม (decimal separator)
//           // "###,##0.00" หมายความว่า
//            // แสดงจำนวนเต็มอย่างน้อย 1 หลัก (ตำแหน่ง 0) และจะแสดง 0 ถ้าตัวเลขในตำแหน่งนั้นไม่มีค่า
//            // แสดงตัวเลขจำนวนเต็มอื่น ๆ โดยไม่แสดง 0 ที่เป็นค่าเริ่มต้น (ตำแหน่ง #)
//            // ใส่เครื่องหมายคั่นหลักพันในตำแหน่งที่เหมาะสม (ตามเครื่องหมาย comma)
//            // แสดงทศนิยม 2 ตำแหน่งเสมอ (00)
//            // ตัวอย่างการแสดงผลตามรูปแบบนี้
//            // 1234567.89 จะแสดงเป็น 1,234,567.89
//            // 23 จะแสดงเป็น 23.00
//            // 0.456 จะแสดงเป็น 0.46 (ปัดทศนิยม)

//         double amount, interest, principal;

//         System.out.println(": Program Calculate Deposit :");
//         // get principal from use
//         System.out.print("Enter principal : ");
//         principal = scanner.nextDouble();
//         // calculate amount on deposit
//         amount = principal;
//         for (int year = 1; year <= 5; year++) {
//             //calculate new amount for specified year
//             interest = amount * RATE;
//             amount = amount + interest;
//         }
//         System.out.print("Principal = ");
//         System.out.println(twoDigit.format(principal));
//         System.out.println("Interest rate = " + twoDigit.format(RATE * 100) + "%");
//         System.out.println("Year = 5");
//         System.out.print("Amount of deposit = ");
//         System.out.println(twoDigit.format(amount));
//     }
// }


package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 0.045, amount, principal;
        System.out.println(": Program Calculate Deposit :");
        System.out.print("Enter principal : ");
        principal = scanner.nextDouble();
        DecimalFormat twoDigit = new DecimalFormat("###,##0.00");
        System.out.println("Principl = " + twoDigit.format(principal));
        System.out.println("Interest rate = " + twoDigit.format(rate * 100) + "%");
        amount = principal;
        for (int year = 1; year <= 5; year++) {
            amount = amount + (amount * rate);
        }
        System.out.println("Year = 5");
        System.out.println("Amount of deposit = " + twoDigit.format(amount));
        scanner.close();
    }
}