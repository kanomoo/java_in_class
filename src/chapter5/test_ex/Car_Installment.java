// package chapter5.test_ex;

// import java.text.DecimalFormat;
// import java.util.Scanner;

// public class Car_Installment {
//     DecimalFormat twoDigit = new DecimalFormat("###,###,##0.00");
//     Scanner scanner = new Scanner(System.in);
//     private double price, downPayment, interestRate;
//     private double amDownPayment, amFinance, amInterest, amNetFinance, amInstallment;
//     private int month;

//     public Car_Installment() {
//     }

//     public double getAmDownPayment() {
//         return amDownPayment;
//     }

//     public void setAmDownPayment(double amDownPayment) {
//         this.amDownPayment = amDownPayment;
//     }

//     public double getAmFinance() {
//         return amFinance;
//     }

//     public void setAmFinance(double amFinance) {
//         this.amFinance = amFinance;
//     }

//     public double getAmInterest() {
//         return amInterest;
//     }

//     public void setAmInterest(double amInterest) {
//         this.amInterest = amInterest;
//     }

//     public double getAmNetFinance() {
//         return amNetFinance;
//     }

//     public void setAmNetFinance(double amNetFinance) {
//         this.amNetFinance = amNetFinance;
//     }

//     public double getAmInstallment() {
//         return amInstallment;
//     }

//     public void setAmInstallment(double amInstallment) {
//         this.amInstallment = amInstallment;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//     public double getDownPayment() {
//         return downPayment;
//     }

//     public void setDownPayment(double downPayment) {
//         this.downPayment = downPayment;
//     }

//     public double getInterestRate() {
//         return interestRate;
//     }

//     public void setInterestRate(double interestRate) {
//         this.interestRate = interestRate;
//     }

//     public int getMonth() {
//         return month;
//     }

//     public void setMonth(int month) {
//         this.month = month;
//     }

//     public void start() {
//         while (true) {
//             String output = ">>>   Main Menu   <<<";
//             output += "=====================\n 0. Exit Program\n 1. Input Car Price (" + twoDigit.format(getPrice()) + ")";
//             output += "\n 2. Input Down Payment (" + twoDigit.format(getDownPayment()) + "%)";
//             output += "\n 3. Input Interest Rate [Per Year] (" + twoDigit.format(getInterestRate()) + "%)";
//             output += "\n 4. Input Month Number(" + getMonth() + ")";
//             output += "\n 5. Display Installment";
//             output += "\n 6. Clear All data";
//             output += "\nSelect choice : ";
//             System.out.print(output);
//             String choice = scanner.next().trim();
//             switch (choice) {
//                 case "0":
//                     System.out.println("Exit Program...");
//                     System.exit(0);
//                     break;

//                 case "1":
//                     System.out.print("Enter car price : ");
//                     setPrice(scanner.nextDouble());
//                     break;

//                 case "2":
//                     System.out.print("Enter down payment(%) : ");
//                     setDownPayment(scanner.nextDouble());
//                     break;

//                 case "3":
//                     System.out.print("Ener interest rate(%) per year : ");
//                     setInterestRate(scanner.nextDouble());
//                     break;

//                 case "4":
//                     System.out.print("Enter month : ");
//                     setMonth(scanner.nextInt());
//                     break;

//                 case "5":
//                     showInstallment();
//                     break;

//                 case "6":
//                     clearData();
//                     break;

//                 default:
//                     System.out.println("No choice");
//                     break;
//             }
//             System.out.println();
//         }
//     }

//     public void showInstallment() {
//         String output = "\nPrice car : " + twoDigit.format(price);
//         output += "\nAmount down payment(" + twoDigit.format(downPayment) + "%) : " + twoDigit.format(amDownPayment = price * (downPayment / 100.0));
//         output += "\nAmount finance : " + twoDigit.format(amFinance = price - amDownPayment);
//         output += "\nAmount interest(" + twoDigit.format(interestRate) + ") : " + twoDigit.format(amInterest = amFinance * ((interestRate / 12.0) / 100.0) * (double) month);
//         output += "\nAmount net finance : " + twoDigit.format(amNetFinance = amFinance + amInterest);
//         output += "\nAmount installment(per month) : " + twoDigit.format(amInstallment = amNetFinance / (double) month);
//         System.out.println(output);
//     }

//     public void clearData() {
//         price = downPayment = interestRate  =amDownPayment = amFinance = amInterest = amNetFinance = amInstallment  = month = 0;
//     }

//     public static void main(String[] args) {
//         Car_Installment car = new Car_Installment();
//         car.start();
//     }
// }



package chapter5.test_ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Car_Installment {
    DecimalFormat twoDigit = new DecimalFormat("###,###,##0.00");
    Scanner scanner = new Scanner(System.in);
    public double price, downPayment, interestRate;
    public double amDownPayment, amFinance, amInterest, amNetFinance, amInstallment;
    public int month;

    public void start() {
        while (true) {
            String output = ">>>   Main Menu   <<<";
            output += "=====================\n 0. Exit Program\n 1. Input Car Price (" + twoDigit.format(price) + ")";
            output += "\n 2. Input Down Payment (" + twoDigit.format(downPayment) + "%)";
            output += "\n 3. Input Interest Rate [Per Year] (" + twoDigit.format(interestRate) + "%)";
            output += "\n 4. Input Month Number(" + month + ")";
            output += "\n 5. Display Installment";
            output += "\n 6. Clear All data";
            output += "\nSelect choice : ";
            System.out.print(output);
            String choice = scanner.next().trim();
            switch (choice) {
                case "0":
                    System.out.println("Exit Program..."); System.exit(0); break;

                case "1":
                    System.out.print("Enter car price : "); price = (scanner.nextDouble()); break;

                case "2":
                    System.out.print("Enter down payment(%) : "); downPayment = (scanner.nextDouble()); break;

                case "3":
                    System.out.print("Ener interest rate(%) per year : "); interestRate = (scanner.nextDouble()); break;

                case "4":
                    System.out.print("Enter month : "); month = (scanner.nextInt()); break;

                case "5":
                    showInstallment(); break;

                case "6":
                    clearData(); break;

                default:
                    System.out.println("No choice"); break;
            }
            System.out.println();
        }
    }

    public void showInstallment() {
        String output = "\nPrice car : " + twoDigit.format(price);
        output += "\nAmount down payment(" + twoDigit.format(downPayment) + "%) : " + twoDigit.format(amDownPayment = price * (downPayment / 100.0));
        output += "\nAmount finance : " + twoDigit.format(amFinance = price - amDownPayment);
        output += "\nAmount interest(" + twoDigit.format(interestRate) + ") : " + twoDigit.format(amInterest = amFinance * ((interestRate / 12.0) / 100.0) * (double) month);
        output += "\nAmount net finance : " + twoDigit.format(amNetFinance = amFinance + amInterest);
        output += "\nAmount installment(per month) : " + twoDigit.format(amInstallment = amNetFinance / (double) month);
        System.out.println(output);
    }

    public void clearData() {
        price = downPayment = interestRate  =amDownPayment = amFinance = amInterest = amNetFinance = amInstallment  = month = 0;
    }

    public static void main(String[] args) {
        Car_Installment car = new Car_Installment();
        car.start();
    }
}