package chapter3.New;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat twoDigit = new DecimalFormat("###,###.00");
        NumberFormat fmt = NumberFormat.getPercentInstance();
        fmt.setMinimumFractionDigits(2); // set digit
        final double RATE = 0.045;
        System.out.print(": Program Calculate Deposit :\nEnter principal : ");
        double principal = scanner.nextDouble();
        double amount = principal, deposit;
        System.out.println("Principal = " + twoDigit.format(principal));
        System.out.println("Interest rate = " + fmt.format(RATE));
        System.out.println("Year = 5");
        for (int n = 0; n < 5; n++) {
            deposit = amount * RATE;
            amount = amount + deposit;
        }
        System.out.println("Amount of deposit = " + twoDigit.format(amount));
        scanner.close();
    }
}