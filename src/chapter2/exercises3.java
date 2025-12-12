// package chapter2;
// import java.util.Scanner;

// public class exercises3 {
//     public static void main(String[] args) {
//         float interest_rate, interest, principal, deposit;
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter interest rate : ");
//         interest_rate = scan.nextFloat();
//         System.out.print("Enter principal : ");
//         principal = scan.nextFloat();
//         interest = principal * (interest_rate / 100);
//         deposit = principal + interest;
//         System.out.printf("\nDeposit year 1 = %.2f\n",deposit);
//         interest = deposit * (interest_rate / 100);
//         deposit = deposit + interest;
//         System.out.printf("Deposit year 2 = %.2f\n",deposit);
//         interest = deposit * (interest_rate / 100);
//         deposit = deposit + interest;
//         System.out.printf("Deposit year 3 = %.2f\n",deposit);
//         interest = deposit * (interest_rate / 100);
//         deposit = deposit + interest;
//         System.out.printf("Deposit year 4 = %.2f\n",deposit);
//         scan.close();
//     }
// }

// package chapter2;
// import java.util.Scanner;

// public class exercises3 {
//     float interest, deposit;
//     public exercises3(float principal, float interest_rate) {
//         interest = principal * (interest_rate / 100);
//         deposit = principal + interest;
//     }
//     public static void main(String[] args) {
//         float interest_rate, principal;
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter interest rate : ");
//         interest_rate = scan.nextFloat();
//         System.out.print("Enter principal : ");
//         principal = scan.nextFloat();
//         exercises3 year1 = new exercises3(principal, interest_rate);
//         System.out.printf("\nDeposit year 1 = %.2f\n", year1.deposit);
//         exercises3 year2 = new exercises3(year1.deposit, interest_rate);
//         System.out.printf("Deposit year 2 = %.2f\n", year2.deposit);
//         exercises3 year3 = new exercises3(year2.deposit, interest_rate);
//         System.out.printf("Deposit year 3 = %.2f\n", year3.deposit);
//         exercises3 year4 = new exercises3(year3.deposit, interest_rate);
//         System.out.printf("Deposit year 4 = %.2f\n", year4.deposit);
//         scan.close();
//     }
// }





package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercises3 {
    Scanner scan = new Scanner(System.in);
    double deposit;
    DecimalFormat twodigit = new DecimalFormat("#0.0000");
    public void result() {
        System.out.print("Program Calculate Deposit\nEnter principal : ");
        double p = scan.nextDouble();
        double principal = p;
        System.out.print("Enter interest rate : ");
        double interest_rate = scan.nextDouble();
        for (int i = 0; i < 4; i++) {
            double interest = principal * (interest_rate / 100.0);
            deposit = principal + interest;
            principal = deposit;
        }
        System.out.println("\nAfter deposit 4 year\nPriciple : " + p + "\nInterate rate : " + interest_rate
                + "\nDeposit total : " + twodigit.format(deposit));

    }

    public static void main(String[] args) {
        new exercises3().result();
    }
}