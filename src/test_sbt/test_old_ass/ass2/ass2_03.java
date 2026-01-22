package test_sbt.test_old_ass.ass2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ass2_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat per = NumberFormat.getPercentInstance();
        DecimalFormat twoDigit = new DecimalFormat("###,###,##0.00");
        while (true) {
            double rate = 0;
            System.out.print("Enter your income( -1 to exit) : ");
            double income = scanner.nextDouble();
            if (income != -1) {
                if (income > 1000000) rate = 0.10;
                else if (income > 800000) rate = 0.075;
                else if (income > 500000) rate = 0.055;
                else if (income > 300000) rate = 0.04;
                else if (income > 150000) rate = 0.025;
                else if (income > 0) rate = 0;
                per.setMinimumFractionDigits(2);
                System.out.println("Net Income : " + twoDigit.format(income));
                System.out.println("Tax Rate(%) : " + per.format(rate));
                System.out.println("Amount Tax : " + twoDigit.format(income * rate));
                System.out.println();
            }
            else {
                System.out.println("Exit Program...");
                scanner.close();
                System.exit(0);
            }
        }
    }
}
