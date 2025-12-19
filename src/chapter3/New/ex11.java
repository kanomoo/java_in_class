package chapter3.New;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat twodigits = new DecimalFormat("0.00");
        int count = 0;
        double value = 0.0, total = 0.0;
        System.out.println(">> Exit input enter - 1 <<");
        while (value != -1.0) {
            System.out.print("Enter floating-point number #" + (count + 1) + " : ");
            value = scanner.nextDouble();
            if (value >= 0.00) {
                total += value;
                count++;
            }
        }
        double average = total / count;
        System.out.println("Total value : " + twodigits.format(total));
        System.out.println("Average value : " + twodigits.format(average));
        scanner.close();
    }
}
