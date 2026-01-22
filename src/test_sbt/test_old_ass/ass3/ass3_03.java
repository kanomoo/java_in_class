package test_sbt.test_old_ass.ass3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ass3_03 {
    DecimalFormat twoDigit = new DecimalFormat("###,###,##0.00");
    NumberFormat fmt = NumberFormat.getPercentInstance();
    Scanner scanner = new Scanner(System.in);
    String taxStr;
    double salary = 0, income = 0, discount = 0, netIncome = 0;
    double tax = 0, per = 0, start = 0, stop = 0, price = 0;
    public void start() {
        while (true) {
            String output = "=".repeat(17) + "\n| Tax Main Menu |" + "\n" + "=".repeat(17) + "\n 0. Exit\n 1. Input Salary(" + twoDigit.format(salary) + ")" + "\n 2. Display Tax" + "\nEnter choice : ";
                System.out.print(output);
                String choice = scanner.next();
                switch(choice) {
                    case "0" -> {System.out.println("\nExit Program..."); System.exit(0);}
                    case "1" -> setSalary();
                    case "2" -> {displayTax();}
                    default -> {}
            }
            System.out.println();
        }
    }

    public void setSalary() {
        System.out.print("Enter salary : ");
        salary = scanner.nextDouble();
    }

    public void displayTax() {
        Double total_tax = 0.0;
        System.out.println("\nSalary : " + twoDigit.format(salary) + "\nIncome : " + twoDigit.format(income = salary * 12) + "\nDiscount : " + twoDigit.format(discount = 100000) + "\nNet Income : " + twoDigit.format(netIncome = income - discount));
        String output = "\nReport Tax:\n" + "=".repeat(80) + "\n|         Net     Income      |Tax Rate|                  Tax                  |" + "\n" + "=".repeat(80);
        
        for (int i = 1; i <= 8; i++) {
            if (i == 1) {start = 1; stop = 150001; per = 0; price = stop - start;}
            else if (i == 2) {start = 150001; stop = 300001; per = 0.05; price = stop - start;}
            else if (i == 3){start = 300001; stop = 500001; per = 0.10; price = stop - start;}
            else if (i == 4) {start = 500001; stop = 750001; per = 0.15; price = stop - start;}
            else if (i == 5) {start = 750001; stop = 1000001; per = 0.20; price = stop - start;}
            else if (i == 6) {start = 1000001; stop = 2000001; per = 0.25; price = stop - start;}
            else if (i == 7) {start = 2000001; stop = 5000001; per = 0.30; price = stop - start;}
            else if (i == 8) {start = 5000001; stop = 5000001; per = 0.35; price = stop - netIncome;}

            if (netIncome <= price) {
                tax = netIncome * per;
                taxStr = "" + twoDigit.format(netIncome) + " * " + twoDigit.format(per);
                output += (i >= 8) ? String.format("\n|%13s > %,12.2f | %4s   | %-21s| %,14.2f |", " ", stop - 1, fmt.format(per), taxStr, tax) : String.format("\n|%,13.2f - %,12.2f | %4s   | %-21s| %,14.2f |", start, stop - 1, fmt.format(per), taxStr, tax);
                netIncome -= netIncome;
                total_tax += tax;
                break;
            }
            else {
                tax = price * per;
                netIncome -= price;
                taxStr = "" + twoDigit.format(price) + " * " + twoDigit.format(per);
                total_tax += tax;
                output += String.format("\n|%,13.2f - %,12.2f | %4s   | %-21s| %,14.2f |", start, stop - 1, fmt.format(per), taxStr, tax);
            }
        }
        output += "\n" + "=".repeat(80) + "\n|" + " ".repeat(25) + "Total Tax" + " ".repeat(27) + String.format("| %,14.2f |", total_tax) + "\n" + "=".repeat(80);
        System.out.println(output);
    }

    public static void main(String[] args) {
        new ass3_03().start();
    }
}
