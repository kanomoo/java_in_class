// package chapter3;

// import java.text.DecimalFormat;
// import java.util.Scanner;

// public class ex12 {
//     public static void main(String[] args) {
//         DecimalFormat twoDigit = new DecimalFormat("0.00");
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter number of data : ");
//         int MaxNum = scanner.nextInt();
//         int count;
//         double value, total = 0;
//         for (count = 1; count <= MaxNum; count++) {
//             System.out.print("Enter floating-point number #");
//             System.out.print(count + " : ");
//             value = scanner.nextDouble();
//             total += value;
//         }
//         double average = total / MaxNum;
//         System.out.println("Total value : " + twoDigit.format(total));
//         System.out.println("Average value : " + twoDigit.format(average));
//         scanner.close();
//     }
// }

package chapter3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat twoDigit = new DecimalFormat("0.00");
        System.out.print("Enter number of data : ");
        int num = scanner.nextInt();
        double sum = 0;
        for (int count = 1; count <= num; count++) {
            System.out.print("Enter floating-point number #" + count + " : ");
            double value = scanner.nextDouble();
            sum += value;
        }
        System.out.println("Total value : " + twoDigit.format(sum));
        System.out.println("Average value : " + twoDigit.format(sum / num));
    }
}