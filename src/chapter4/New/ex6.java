package chapter4.New;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex6 {

    public void start() { 
        Scanner input = new Scanner(System.in);
        String output = "";
        double principle, rate;
        int year;
        System.out.print("Enter principle : ");
        principle = Double.parseDouble(input.nextLine());
        System.out.print("Enter year : ");
        year = Integer.parseInt(input.nextLine());
        System.out.print("Enter interest rate(%) : ");
        rate = Double.parseDouble(input.nextLine());
        output = calAmount(principle, rate, year);
        System.out.println(output);
        input.close();
    }

    public String calAmount(double principle, double rate, int year) {
        String result = "";
        double amount, interest;
        DecimalFormat two = new DecimalFormat("#,###,##0.00");
        result = "Principle : " + two.format(principle);
        result += ", Inteest Rate : " + two.format(rate) + "%";
        result += ", Year : " + year + "\n";
        amount = principle;
        rate = rate / 100.0;
        result += "=============================================\n";
        result += "Year\tPrinciple\tInterest\tTotal\n";
        result += "=============================================\n";
        for (int n = 1; n <= year ; n ++) {
            interest = amount * rate;
            result += n + "\t" + two.format(amount) + "\t" + two.format(interest) + "\t";
            amount = amount + interest;
            result += two.format(amount) + "\n";
        }
        result += "=============================================\n";
        return result;
    }

    public static void main(String[] args) {
        new ex6().start();
    }
}