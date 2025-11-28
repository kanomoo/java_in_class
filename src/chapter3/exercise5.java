// package chapter3;

// import java.util.Scanner;

// public class exercise5 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter positive number : ");
//         long num = scanner.nextLong();
//         // long num = 74629084169126l;
//         int odd = 0, even = 0, zero = 0;
//         while (num > 0) {
//             long value = num % 10;
//             num /= 10;
//             if (value == 0) zero += 1;
//             else if (value % 2 == 0) even += 1;
//             else odd += 1;
//         }
//         System.out.println("\nOdd digit = " + odd + "\nEven digit = " + even + "\nZero digit = " + zero);
//     }
// }



package chapter3;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive number : ");
        long number = scanner.nextLong();
        String num = Long.toString(number); // Long.toString แปลง long เป็น string
        for (int i = 0; i < num.length(); i++) { // หาความกว้าง num
            System.out.println(num.charAt(i)); // chartAt คืนค่าตาม index char
        }
        scanner.close();
    }
}