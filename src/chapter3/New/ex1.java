// package chapter3.New;

// import java.util.Scanner;

// public class ex1 {
//     public static void main(String[] args) {
//         final double PAYRATE = 12.25;
//         double hour, salary;
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter type employee(salary/hourly) : ");
//         String type = input.nextLine();
//         if (type.equals("salary") || type.equals("hourly")) {
//             if (type.equals("hourly")) {
//                 System.out.print("Enter hour worked : ");
//                 hour = input.nextDouble();
//                 salary = hour * PAYRATE;
//             }
//             else {
//                 salary = 23000.00;
//             }
//             System.out.println("Wage pay : " + salary);
//         }
//         System.out.println("End Program.");
//         input.close();
//     }
// }



package chapter3.New;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter type employee(salary/hourly) : ");
        String type = scanner.nextLine();
        double pay = 23000;
        final double payrate = 12.25;
        if (type.equals("salary") || type.equals("hourly")) {
            if (type.equals("salary"))
                System.out.println("Wage pay : " + pay);
            else {
                System.out.print("Enter hour worked : ");
                int hour = scanner.nextInt();
                double salary = hour * payrate;
                System.out.println("Wage pay : " + salary);
            }
        }
        System.out.println("End Program.");
        scanner.close();
    }
}