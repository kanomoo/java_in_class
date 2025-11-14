// package chapter4;

// import java.util.Random;

// public class ex7 {
//     public static void main(String[] args) {
//         Math.random();
//         Random rnd = new Random(); // Random เป็น class ของ Random เลย ไม่ใช่เป็น object หรือ อินสแตนซ์ ของ Math.random() ค่าจะอยู่ระหว่าง 0.0 ถึง 9.999...
//         System.out.println("Use nextInt()");
//         for (int n = 1; n <= 5; n++)
//             System.out.print(rnd.nextInt() + ((n < 5) ? ", " : ""));
//         System.out.println("\nUse nextInt(6)");
//         for (int n = 1; n <= 5; n++)
//             System.out.print(rnd.nextInt(6) + ((n < 5) ? ", " : ""));
//         System.out.println("\nUse nextLong()");
//         for (int n = 1; n <= 5; n++)
//             System.out.print(rnd.nextLong() + ((n < 5) ? ", " : ""));
//         System.out.println("\nUse nextDouble()");
//         for (int n = 1; n <= 5; n++)
//             System.out.print(rnd.nextDouble() + ((n < 5) ? ", " : ""));
//         System.out.println("\nUse nextInt()  (30 - 50)"); // 30 - 50
//         for (int n = 1; n <= 5; n++)
//             System.out.print((30 + rnd.nextInt(21) + ((n < 5) ? ", " : ""))); // บวกเพิ่มหา min ที่ต้องการเพราะ random เริ่มที่สูง การใส่ค่าใน () เหมือนการ * ค่าของ Math.random() แต่ใส่ value ใน()แทน 
//             //ถ้าต้องการหาค่าสูงสุงต้องใส่ value ใน()คือ max - min
//         System.out.println();
//     }
// }



package chapter4;

import java.util.Random;

public class ex7 {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println("Use nextInt()");
        for (int i = 1; i <= 5; i++) System.out.print(rnd.nextInt() + ((i < 5) ? ", " : ""));
        System.out.println("\nUse nextInt(6)"); // สุ่มสูงสุดได้แค่ 5.99999 จะไม่มี 6
        for (int i = 1; i <= 5; i++) System.out.print(rnd.nextInt(6) + ((i < 5) ? ", " : ""));
        System.out.println("\nUse nextLong()");
        for (int i = 1; i <= 5; i++) System.out.print(rnd.nextLong() + ((i < 5) ? ", " : ""));
        System.out.println("\nUse nextDouble()");
        for (int i = 1; i <= 5; i++) System.out.print(rnd.nextDouble() + ((i < 5) ? ", " : ""));
        System.out.println("\nUse nextInt() (30 - 50)");
        for (int i = 1; i <= 5; i++) System.out.print(30 + rnd.nextInt(21) + ((i < 5) ? ", " : ""));
    }
}