// package chapter4;

// import java.util.Scanner;

// public class ex4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String name;
//         System.out.print("Enter name : ");
//         name = scanner.nextLine();
//         if (!name.isEmpty()) {
//             for (int index = 0; index < name.length(); index++) {
//                 System.out.print("Character : " + name.charAt(index));
//                 System.out.print("is ascii value : ");
//                 System.out.println((byte) name.charAt(index));
//             }
//         }
//         else 
//             System.out.println("No data input.");
//         scanner.close();
//     }
// }


package chapter4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) { // ไม่ว่างเปล่า
            for (int i = 0; i < name.length(); i++)
                System.out.println("Character : " + name.charAt(i) + " is ascii value : " + (byte) name.charAt(i)); // print string ตาม index แล้วแปลงเป็น byte asscii
        } else System.out.println("No data input.");
        scanner.close();
    }
}