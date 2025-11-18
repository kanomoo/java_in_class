// package chapter5;

// import java.util.Scanner;

// public class ex2 {
//     public void mainProgram() {  // method แต่ละตัวเป็น instance แล้วเรียกใช้งานใน instance mainProgram เรียกใช้ได้เลย ไม่ต้องสร้าง instance หรือ object ใหม่ เหมือนการใช้ใน static 
//         Scanner scanner = new Scanner(System.in);
//         boolean done = true;
//         int radius;
//         myPrintln("Program Calculate Area...");
//         do {
//             myPrint("Enter radius(-1 : exit) : ");
//             radius = scanner.nextInt();
//             if (radius != -1) {
//                 double area = calArea(radius);
//                 double circum = calCircumference(radius);
//                 myPrintln("Radius : " + radius);
//                 myPrintln("Area Circle = " + area);
//                 myPrintln("Circumference : " + circum);
//                 myPrintln("");
//             }
//             else if (radius == -1) {
//                 myPrintln("now exit program.");
//                 done = false;
//             }
//         } while (done);
//         scanner.close();
//     }
//     public double calArea(double radius) {
//         double area = Math.PI * Math.pow(radius, 2);
//         return area;
//     }
//     public double calCircumference(double radius) {
//         double circum = 2 * Math.PI * radius;
//         return circum;
//     }
//     public void myPrint(String str) {
//         System.out.print(str);
//     }
//     public void myPrintln(String str) {
//         System.out.println(str);
//     }

//     public static void main(String[] args) { // เรียนกใช้ method instance ต้องเรียกจาก instance หรือ object เสมอ
//         ex2 obj = new ex2();
//         obj.mainProgram();
//     }
// }

package chapter5;

import java.util.Scanner;

public class ex2 {
    public void println(String str) {
        System.out.println(str);
    }

    public void print(String str) {
        System.out.print(str);
    }

    public double calArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double calCircum(double radius) {
        double circum = 2 * Math.PI * radius;
        return circum;
    }

    public void mainProgram() {
        Scanner scanner = new Scanner(System.in);
        boolean done = true;
        println("Program Calculate Area...");
        do {
            print("Enter radius(-1 : exit) : ");
            int radius = scanner.nextInt();
            if (radius != -1) {
                println("Radius : " + radius);
                println("Area Circle = " + calArea(radius));
                println("Circumfference : " + calCircum(radius) + "\n");
            } else {
                println("now exit program.");
                done = false;
            } 
        } while (done);

        scanner.close();
    }

    public static void main(String[] args) {
        ex2 obj = new ex2();
        obj.mainProgram();
    }
}