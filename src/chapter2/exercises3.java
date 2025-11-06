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

package chapter2;
import java.util.Scanner;

public class exercises3 {
    float interest, deposit;
    public exercises3(float principal, float interest_rate) {
        interest = principal * (interest_rate / 100);
        deposit = principal + interest;
    }
    public static void main(String[] args) {
        float interest_rate, principal;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter interest rate : ");
        interest_rate = scan.nextFloat();
        System.out.print("Enter principal : ");
        principal = scan.nextFloat();
        exercises3 year1 = new exercises3(principal, interest_rate);
        System.out.printf("\nDeposit year 1 = %.2f\n", year1.deposit);
        exercises3 year2 = new exercises3(year1.deposit, interest_rate);
        System.out.printf("Deposit year 2 = %.2f\n", year2.deposit);
        exercises3 year3 = new exercises3(year2.deposit, interest_rate);
        System.out.printf("Deposit year 3 = %.2f\n", year3.deposit);
        exercises3 year4 = new exercises3(year3.deposit, interest_rate);
        System.out.printf("Deposit year 4 = %.2f\n", year4.deposit);
        scan.close();
    }
}