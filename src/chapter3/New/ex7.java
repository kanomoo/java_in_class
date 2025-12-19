package chapter3.New;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat twoDigit = new DecimalFormat("#0.00");
        int first, second, total = 0, count = 0;
        String output = "";
        System.out.print("Enter first number : ");
        first = scanner.nextInt();
        System.out.print("Enter second number : ");
        second = scanner.nextInt();
        for (int n = first; n <= second; n++) {
            output += "\t" + n;
            total += n;
            if (++count % 5 == 0)
                output += "\n";
        }
        System.out.println(output);
        System.out.println("\nSummation of " + first + " to " + second + " = " + total);
        System.out.println("Average : " + twoDigit.format((float) total / count));
        scanner.close();
    }
}