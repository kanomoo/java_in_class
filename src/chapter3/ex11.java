// package chapter3;

// import java.util.Scanner;

// public class ex11 {
//     public static void main(String[] args) {
//         int number, sum = 0;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a positive integers:");
//         number = scanner.nextInt();
//         do {
//             sum = sum + number;
//             number =  number - 1;
//         } while (number > 0);
//         System.out.println("Sum value is " + sum);
//         scanner.close();
//     }
// }


// package chapter3;

// import java.util.Scanner;

// public class ex11 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a positive integers:");
//         int num = scanner.nextInt();
//         int sum = 0;
//         do {
//             sum = sum + num;
//             num--;
//         } while (num > 0);
//         System.out.println("Sum value is " + sum);
//     }
// }

package chapter3;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a possitive integers:");
        int num = scanner.nextInt();
        int sum = 0;
        do {
            sum += num;
            num--;
        } while (num > 0);
        System.out.println("Sum value is " + sum);
    }
    
}