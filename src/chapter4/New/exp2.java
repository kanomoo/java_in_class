package chapter4.New;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exp2 {
    public void startMain() {
        DecimalFormat twoDigit = new DecimalFormat("##,##0.00");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Program Calcualte Money\n+++++++++++++++++++++++\nEnter principle : ");
        double principle = scanner.nextDouble() ;
        double total = principle;
        System.out.print("Enter interest rate : ");
        double rate = scanner.nextDouble() / 100.0;
        System.out.print("Enter year : ");
        int year = scanner.nextInt();
        System.out.println("Year\tPinciple\tInterest\tTotal\n" + "=============================================");
        for(int n = 1; n <= year; n++) {
            double interest = total * rate; 
            System.out.println("  " + n + "\t" + twoDigit.format(total) + String.format("%15s", twoDigit.format(interest)) + String.format("%13s", twoDigit.format(total += interest)));
        }
        System.out.println("=============================================\nTotal deposit : " + total);
        scanner.close();
    }

    public static void main(String[] args) {
        new exp2().startMain();
    }
}
