// package chapter3;

// import java.text.DecimalFormat;
// import java.util.Scanner;

// public class ex14 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         DecimalFormat fouFormat = new DecimalFormat("0.0000");
//         String strMenu = "";
//         int choice;
//         boolean done = true;

//         strMenu += " Main Menu\n" + "============\n";
//         strMenu += "1. Area Rectnagle\n2. Area Circle\n";
//         strMenu += "3. Exit\nEnter Choice : ";
//         do {
//             System.out.print(strMenu);
//             choice = scanner.nextInt();
//             if (choice == 1) {
//                 float width, height, area;
//                 System.out.print("Enter width : ");
//                 width = scanner.nextFloat();
//                 System.out.print("Enter height : ");
//                 height = scanner.nextFloat();
//                 area = width * height;
//                 System.out.print("Area of Rectangle = ");
//                 System.out.println(fouFormat.format(area));
//             } else if (choice == 2) {
//                 float radius, area;
//                 System.out.print("Enter radius : ");
//                 radius = scanner.nextFloat();
//                 area = (float) (Math.PI * radius * radius);
//                 System.out.print("Area of Circle = ");
//                 System.out.println(fouFormat.format(area));
//             } else if (choice == 3) {
//                 done = false;
//             } else {
//                 System.out.println("This choices is incorrect, ");
//                 System.out.println("try again.");
//             }
//             System.out.println();
//         } while (done);
//         System.out.println("Exit Program, Bye.");
//         scanner.close();
//     }
// }


package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        int choice;
        float width, height, radius;
        boolean done = true;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat fourDigit = new DecimalFormat("0.0000");
        do {
            System.out.print("  Main Menu\n==============\n1. Area Rectangle\n2. Area Circle\n3. Exit\nEnter Choice : ");
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter width : ");
                width = scanner.nextFloat();
                System.out.print("Enter height : ");
                height = scanner.nextFloat();
                System.out.println("Area of Rectangle = " + fourDigit.format(width  * height));
            } else if (choice == 2) {
                System.out.print("Enter radius : ");
                radius = scanner.nextFloat();
                System.out.println("Area of Circle = " + fourDigit.format((float) (Math.PI * radius * radius)));
            } else if (choice == 3) {
                done = false;
            } else {
                System.out.println("This choices is incorrect,\ntry again.");
            }
        } while (done);
        System.out.println("\nExit Program , Bye.");
        scanner.close();
        }
    }
