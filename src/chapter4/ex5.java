// package chapter4;

// import java.util.Scanner;

// public class ex5 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String str;
//         System.out.print("Enter your string : ");
//         str = scanner.nextLine().trim(); // trim ลบ blank หน้าหลัง
//         int c1, c2, c3, c4;
//         c1 = c2 = c3 = c4 = 0;
//         if (!str.isEmpty()) {
//             char ch;
//             for (int index = 0; index < str.length(); index++) {
//                 ch = str.charAt(index);
//                 if (ch >= 'A' && ch <= 'Z')
//                     c1++;
//                 else if (ch >= 'a' && ch <= 'z')
//                     c2++;
//                 else if (ch >= '0' && ch <= '9')
//                     c3++;
//                 else
//                     c4++;
//             }
//             System.out.println("This stirng \"" + str + "\" have ");
//             System.out.println("Upper Letter is " + c1);
//             System.out.println("Lower Letter is " + c2);
//             System.out.println("Digit is " + c3);
//             System.out.println("Symbol is " + c4);
//         } else System.out.println("No data input.");
//         scanner.close();
//     }
// }


// package chapter4;

// import java.util.Scanner;

// public class ex5 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your string : ");
//         String name = scanner.nextLine();
//         System.out.println("This string \"" + name + "\" have");
//         int ch1, ch2, ch3, ch4;
//         ch1 = ch2 = ch3 = ch4 = 0;
//         if (!name.isEmpty()) { // ไม่ว่างเปล่า
//             for (int i = 0; i < name.length(); i++) { // stop ตาม len name
//                 char ch = name.charAt(i); // char ตาม index char
//                 if (ch >= 'A' && ch <= 'Z') ch1++;
//                 else if (ch >= 'a' && ch <= 'z') ch2++;
//                 else if (ch >= '0' && ch <= '9') ch3++;
//                 else ch4++;
//             }
//         } else System.out.println("No data input.");
//         System.out.println("Upper Letter is " + ch1 + "\nLower Letter is " + ch2 + "\nDigit is " + ch3 + "\nSymbol is " + ch4);
//         scanner.close();
//     }
// }


package chapter4;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String name = scanner.nextLine().trim();
        System.out.println("This sring \"" + name + "\" have");
        int ch1, ch2, ch3 ,ch4;
        ch1 = ch2 = ch3 = ch4 = 0;
        if (!name.isEmpty()) {
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (Character.isUpperCase(ch)) ch1++; // ใช้ method static ของ class Character ตรวจสอบ chr
                else if (Character.isLowerCase(ch)) ch2++;
                else if (Character.isDigit(ch)) ch3++;
                else ch4++;
            }
        } else System.out.println("No data input.");
        System.out.println("Upper Letter is " + ch1 + "\nLowever letter is " + ch2 + "\nDigit is " + ch3 + "\nSymol is " + ch4);
        scanner.close();
    }
}