// package chapter3;

// import java.util.Scanner;

// public class ex7 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int num1, num2;
//         double result = 0;
//         boolean done = true;
//         String message;
//         System.out.print("Enter equation : ");
//         num1 = scanner.nextInt();
//         message = scanner.next();
//         num2 = scanner.nextInt();
//         char operator = message.charAt(0); // charAt(0) เป็นเมธอดของคลาส String ที่ใช้ดึงตัวอักษร (character) ตัวแรกของข้อความ (index เริ่มที่ 0)
//         switch (operator) {
//             case '+':
//                 result = num1 + num2;
//                 message = "result = num1 + num2 = ";
//                 break;

//             case '-':
//                 result = num1 - num2;
//                 message = "result = num1 - num2 = ";
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 message = "result = num1 * num2 = ";
//                 break;
//             case '/':
//                 result = (double) num1 / num2;
//                 message = "result = num1 / num2 = ";
//                 break;
//             default:
//                 done = false;
//         }
//         if (done)
//             System.out.println(message + result);
//         else
//             System.out.println("Invalid Operator.");
//         scanner.close();
//     }
// }



// package chapter3;
// import java.util.Scanner;

// public class ex7 {
//     public static void main(String[] args) {
//         int num1, num2;
//         double result;
//         String message;
//         boolean done = true;
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter equation : ");
//         num1 = scan.nextInt();
//         message = scan.next();
//         num2 = scan.nextInt();
//         char operator = message.charAt(0);
//         switch (operator) {
//             case '+':
//                 result = num1 + num2;
//                 message = "result = num1 + num2 = " + result;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 message = "result = num1 - num2 = " + result;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 message = "result = num1 * num2 = " + result;
//                 break;
//             case '/':
//                 result = (double) num1 / num2;
//                 message = "result = num1 / num2 = " + result;
//                 break;
//             default:
//                 done = false;
//         }
//         if (done)
//             System.out.println(message);
//         else
//             System.out.println("Invalid Operator.");
//     }
// }

package chapter3;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int num1, num2;
        double result;
        String message;
        boolean done = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter equation : ");
        num1 = scan.nextInt();
        message = scan.next();
        num2 = scan.nextInt();
        char operator = message.charAt(0);
        switch (operator) {
            case '+':
                result = num1 + num2;
                message = "result = num1 + num2 = " + result;
                break;
            case '-':
                result = num1 - num2;
                message = "result = num1 - num2 = " + result;
                break;
            case '*':
                result = num1 * num2;
                message = "result = num1 * num2 = " + result;
                break;
            case '/':
                result = (double) num1 / num2;
                message = "result = num1 / num2 = " + result;
                break;
            default:
                done = false;
        }
        if (done)
            System.out.println(message);
        else
            System.out.println("Invalid Operator.");
        scan.close();
    }
}