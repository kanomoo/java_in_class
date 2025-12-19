package chapter3.New;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        DecimalFormat twoDigit = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of data : ");
        int MaxNum = scanner.nextInt();
        double value, total = 0;
        for (int count = 1; count <= MaxNum; count++) {
            System.out.print("Enter floating-point number #" + count + " : ");
            value = scanner.nextDouble();
            total += value;
        }
        double average = total / MaxNum;
        System.out.println("Total value : " + twoDigit.format(total));
        System.out.println("Average value : " + twoDigit.format(average));
        scanner.close();
    }
}
