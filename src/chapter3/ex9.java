// package chapter3;

// import java.text.DecimalFormat;
// import java.util.Scanner;

// public class ex9 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         final int PER_LINE = 5;
//         int first, second;
//         System.out.print("Enter fist number : ");
//         first = scanner.nextInt();
//         System.out.print("Enter second number : ");
//         second = scanner.nextInt();
//         int sum, count;
//         sum = count = 0;
//         for (int num = first; num <= second; num += 1) {
//             sum += num;
//             count++;
//             if (count % PER_LINE == 0)
//                 System.out.println("\t" + num);
//             else
//                 System.out.print("\t" + num);
//         }
//         System.out.println();
//         DecimalFormat twoDigit = new DecimalFormat("0.00");
//         System.out.println("Summation of " + first + " to" + second + " = " + sum);
//         float average = (float) sum / count;
//         System.out.println("Average : " + twoDigit.format(average));
//         scanner.close();
//     }
// }



// package chapter3;

// import java.text.DecimalFormat;
// import java.util.Scanner;

// public class ex9 {
//     public static void main(String[] args) {
//     int first, second;
//     Scanner scan = new Scanner(System.in);
//     System.out.print("Enter first number : ");
//     first = scan.nextInt();
//     System.out.print("Enter second number : ");
//     second = scan.nextInt();
//     int sum = 0;
//     DecimalFormat twoDigit = new DecimalFormat("0.00");
//     for (int num = first; num <= second; num++) {
//         sum += num;
//         if (num % 5 == 0)
//             System.out.println("\t" + num);
//         else
//             System.out.print("\t" + num);
//         }
//     System.out.println("\nSummation of " + first + " to " + second + " = " + sum);
//     System.out.println("Average : " + twoDigit.format((float) sum / second));
//     }
// }


package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        int first, second;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        first = scan.nextInt();
        System.out.print("Enter second number : ");
        second = scan.nextInt();
        int sum = 0;
        DecimalFormat twoDigit = new DecimalFormat("0.00"); 
        for (int num = first; num <= second; num++) {
            sum += num;
            if (num % 5 == 0)
                System.out.println("\t" + num);
            else
                System.out.print("\t" + num);
        }
        System.out.println("\nSummation of " + first + " to " + second + " = " + sum);
        System.out.println("Average : " + twoDigit.format((float) sum / second));
    }
}