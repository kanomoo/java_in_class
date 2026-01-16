package chapter5.text_ex2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Car_Installment {
    DecimalFormat twoDigit = new DecimalFormat("###,###,##0.00");
    Scanner scanner = new Scanner(System.in);
    private double price, downPayment, interestRate, month;
    private double  Down_Payment, Financed_Amount, Monthly_Rate, Interest_Amount, Net_Amount, Monthly_Installment;

    public void  getPrice() {
        System.out.print("Enter car Price : "); price = scanner.nextDouble();
    }

    public void getDownPayment() {
        System.out.print("Enter down payment(%) : "); downPayment = scanner.nextDouble();
    }

    public void getInterestRate() {
        System.out.print("Enter interest rate(%) per year : "); interestRate = scanner.nextDouble();
    }

    public void getMonth() {
        System.out.print("Enter month : "); month = scanner.nextDouble();
    }

    public void showInstallment() {
        String output = "Price car : " + twoDigit.format(price);
        output += "\nAmount down payment(" + twoDigit.format(downPayment) + "%) : " + twoDigit.format(Down_Payment = price * (downPayment / 100.0));
        output += "\nAmount finance : " + twoDigit.format(Financed_Amount = price - Down_Payment);
        output += "\nAmount interest(" + twoDigit.format(interestRate) + "%) : " + twoDigit.format(Interest_Amount = Financed_Amount * ((Monthly_Rate = interestRate / 12.0) / 100.0) * month) ;
        output += "\nAmount net finance : " + twoDigit.format(Net_Amount = Financed_Amount + Interest_Amount);
        output += "\nAmount installment(per month) : " + twoDigit.format(Monthly_Installment = Net_Amount / month) ;
        System.out.println("\n" + output);
    }

    public void clearData() {
        price = downPayment = interestRate = month = Down_Payment = Financed_Amount = Monthly_Rate = Interest_Amount = Net_Amount = Monthly_Installment = 0;
    }

    public void start() {
        while (true) {
            String output = ">>>   Main Menu   <<<";
            output += "\n=====================";
            output += "\n 0. Exit Program";
            output += "\n 1. Input Car Price (" + twoDigit.format(price) + ")";
            output += "\n 2. Input Down Payment (" + twoDigit.format(downPayment) + "%)";
            output += "\n 3. Input Interest Rate [Per Year] (" + twoDigit.format(interestRate) + "%)";
            output += "\n 4. Input Month Number (" + (int) (month) +")";
            output += "\n 5. Display Installment";
            output += "\n 6. Clear All Data\nSelect choice : ";
            System.out.print(output);
            String choice = scanner.next().trim();
            switch (choice) {
                case "0" -> {System.out.println("Exit Program..."); System.exit(0);}
                case "1" -> getPrice();
                case "2" -> getDownPayment();
                case "3" -> getInterestRate();
                case "4" -> getMonth();
                case "5" -> showInstallment();
                case "6" -> clearData();
                default -> { System.out.println("No choice."); }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Car_Installment car = new Car_Installment();
        car.start();
    }
}