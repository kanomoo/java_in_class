// package chapter3;

// import java.util.Scanner;

// public class exercise4 {
//     public static void main(String[] args) {
//         double principal, year;
//         double rate;
//         Scanner scanner = new Scanner(System.in);
//         String h = "Program Calculate Money";
//         String l = "+".repeat(h.length()); // .repeat() ทำซ้ำตามค่าใน() .length หาความยาว String 
//         System.out.print(h + "\n" + l + "\nEnter principle : ");
//         principal = scanner.nextInt();
//         System.out.print("Enter interest rate : ");
//         rate = scanner.nextDouble();
//         System.out.print("Enter year : ");
//         year = scanner.nextInt();
//         System.out.println("Year      Principal      Interest     Total");
//         System.out.println("===============================================");
//         int count = 0;
//         while (count < year) {
//             count++;
//             double interest = principal * (rate / 100), total = principal + (principal * (rate / 100));
//             System.out.printf("%3d %,15.2f %,13.2f %,13.2f\n", count, principal, interest, total);
//             principal = total;

//         }
//         System.out.println("===============================================");
//     }
// }


package chapter3;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String h = "Program Calculate Money";
        String l = "+".repeat(h.length());
        System.out.print(h + "\n" + l + "\n" + "Enter principle : ");
        double principle = scanner.nextInt();
        System.out.print("Enter interest rate : ");
        double rate = scanner.nextDouble();
        System.out.print("Enter year : ");
        int year = scanner.nextInt();
        System.out.println("Year  Principle   Interest    Total     ");
        System.out.println("=======================================");
        int count = 0;
        while (count < year) {
            count++;
            double interest =  principle * (rate / 100);
            double total = principle + interest;
            System.out.printf("%3d%,12.2f%,11.2f%,13.2f\n", count, principle, interest, total);
            principle = total;
        }
    }
}