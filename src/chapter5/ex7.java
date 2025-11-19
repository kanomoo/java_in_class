// package chapter5;

// import java.util.Scanner;

// public class ex7 {
//     public long factorial(long n ) {
//         if (n > 1) return (n * factorial(n - 1)); // ที่ต้องกำหนดมากกว่า 0 เพราะ 0! จะคืนค่าเป็น 1  ถ้า n! > 0 จะ return n * (n - 1)! ถ้า 3! = 3 * 2! เพราะ 3! = 3 x 2 x 1 ตามสมการ 3! = (3) * (2 x 1) คือการเพิ่ม fac ใน recursion
//         else return 1;
//     }

//     public static long factorialStatic (long n) {
//         long fac = 1; // ต้องกำหนด fac เป็น 1 เสมอเพราะ fac 0 จะเท่ากับ 1
//         if (n > 0) {
//             for (int x = 1; x <= n ; x++)
//                 fac *= x;
//             return fac;
//         }
//         else return fac;
//     }

//     public void test() {
//         long n;
//         Scanner scanner = new Scanner(System.in);
//         ex7 obj = new ex7();
//         System.out.print("Enter number : ");
//         n = scanner.nextInt();
//         System.out.println("Factorial of " + n + " is " + obj.factorial(n));
//         System.out.println("FactorialStatic of " + n + " is " + ex7.factorialStatic(n));
//         scanner.close();
//     }

//     public static void main(String[] args) {
//         new ex7().test();
//     }
// }



package chapter5;

import javax.swing.JOptionPane;

public class ex7 {
    public long factorial (int n) {
        if (n > 0) {
            long fac = 1;
            for (int i = 1; i <= n; i++)
                fac *= i;
            return fac;
        }
        else return 1;
    }

    public static long factorialStatic(long n) {
        if (n > 1) return n * factorialStatic(n - 1);
        else return 1;
    }

    public void start() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number : "));
        JOptionPane.showMessageDialog(null, "Factorial of " + n + " is " + new ex7().factorial(n) + "\nFactorialStatic of " + n + " is " + ex7.factorialStatic(n));
    }

    public static void main(String[] args) {
        new ex7().start();
    }
}