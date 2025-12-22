package chapter4.New;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class exp1 {
    public void mainProgram() {
        DecimalFormat twodigit = new DecimalFormat(".00");
        NumberFormat per = NumberFormat.getPercentInstance();
        per.setMinimumFractionDigits(1);
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> Program Calculate commission <<\n\nEnter sale amount : ");
        double num = scanner.nextDouble(), rate;
        if (num > 0) {
            if (num > 100000) rate = 0.10;
            else if (num > 60000) rate = 0.09;
            else if (num > 40000) rate = 0.07;
            else if (num > 20000) rate = 0.05;
            else if (num > 10000) rate = 0.0275;
            else rate = 0;
            System.out.println("\nYour total sale : " + twodigit.format(num));
            System.out.println("You got commission rate = " + per.format(rate));
            System.out.println("You got commission : " + twodigit.format(num * rate));
        }
        else System.out.println("\nError sale amount, no calculate commission.");
        scanner.close();
    }

    public static void main(String[] args) {
        new exp1().mainProgram();
    }
}
