// package chapter3;

// import java.util.Scanner;

// public class ex5 {
//     public static void main(String[] args) {
//         int num, numOld;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter 4 digit number : ");
//         num = scanner.nextInt();
//         numOld = num;
//         // logic for check cout digit
//         int cout = 0;
//         if (num > 0){
//             cout++;
//             num = num / 10;
//             if (num > 0) {
//                 cout++;
//                 num = num / 10;
//                 if (num > 0) {
//                     cout++;
//                     num = num / 10;
//                     if (num > 0) {
//                         cout++;
//                         num = num / 10;
//                     }
//                 }
//             }
//         }
//         if (num == 0 && cout == 4)
//             System.out.println("Number " + numOld + " is 4 digits.");
//         else
//             System.out.println("Number " + numOld + " is not equal 4 digits.");
//     }
// }

package chapter3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int count = 0, num, num_old;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 4 digit number : ");
        num = scan.nextInt();
        num_old = num;
        if (num > 0) {
            count++;
            num = num / 10;
            if (num > 0) {
                count++;
                num = num / 10;
                if (num > 0) {
                    count++;
                    num = num / 10;
                    if (num > 0) {
                        count++;
                        num = num / 10;
                    }
                }
            }
        }
        if (num == 0 && count == 4) System.out.println("Number " + num_old + " is 4 digits.");
        else System.out.println("Number " + num_old + " is not equal 4 digits.");
    }
}