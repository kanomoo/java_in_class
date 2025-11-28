// package chapter3;

// import java.util.Scanner;

// public class exercise6 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input number line : ");
//         int number = scanner.nextInt();
//         System.out.print("Input character : ");
//         String chr = scanner.next();
//         System.out.print("Input type : ");
//         int type = scanner.nextInt();
//         switch (type) {
//             case 1:
//                 for (int i = 0; i < number; i++)  {
//                         System.out.println();
//                         for (int j = 0; j <= i; j++) {
//                             System.out.print(chr);
//                         }
//                     }

//                 // for (int i = 0; i < number; i++)
//                 //     for (int j = 0; j <= i; j++)
//                 //         System.out.print((j == 0 ? "\n" : "") + chr);
//                 break;

//             case 2:
//                 for (int i = number; i > 0; i--) {
//                     System.out.println();
//                     for (int j = 0; j < i; j++) {
//                         System.out.print(chr);
//                     }
//                 }
//                 // for (int i = number; i > 0; i--)
//                 //     for (int j = 0; j < i; j++)
//                 //         System.out.print((j == 0 ? "\n" : "") + chr);
//                 break;
                
//             default:
//                 break;
//         }
//     }
// }


package chapter3;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number line : ");
        int line = scanner.nextInt();
        System.out.print("Input character : ");
        String chr = scanner.next();
        System.out.print("Input type : ");
        int type = scanner.nextInt();
        System.out.println();
        switch (type) {
            case 1:
                for (int i = 1; i <= line; i++) {
                    System.out.println(chr.repeat(i)); // .repeat ทำซ้ำ String
                }
                break;
            
            case 2:
                for (int i = line; i >= 0; i--) {
                    System.out.println(chr.repeat(i));
                }
                break;

            default:
                System.out.println("none");
                break;
        }
        scanner.close();
    }
}