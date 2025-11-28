// package chapter3;

// import java.text.DecimalFormat;
// import java.util.Scanner;

// public class ex13 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         DecimalFormat twoDigit = new DecimalFormat("0.00");
//         int count = 1;
//         double value = 0.0, total = 0.0;

//         System.out.println(">> Exit input enter - 1 <<");
//         while (value > -1.0) {
//             System.out.print("Enter floating-point number #");
//             System.out.print(count + " : ");
//             value = scanner.nextInt();
//             if (value != -1.00) {
//                 total += value;
//                 count++;
//             }
//         }
//         double average = total / count;
//         System.out.print("Total value : ");
//         System.out.println(twoDigit.format(total));
//         System.out.print("Average value : ");
//         System.out.println(twoDigit.format(average));
//         scanner.close();
//     }
// }


package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat twodigit = new DecimalFormat("0.00");
        double num = 0, total = 0;
        int count = 1;
        System.out.println(">> Exit input enter -1 <<");
        while (num > -1) {
            System.out.print("Enter floating-point number #" + count + " : ");
            num = scanner.nextDouble();
            if (num != -1) {
                count++;
                total += num;
            }
        }
        System.out.println("Total value : " + twodigit.format(total));
        System.out.println("Average avlue : " + twodigit.format(total / count));
        scanner.close();
    }
}