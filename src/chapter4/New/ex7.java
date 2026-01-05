package chapter4.New;

import java.util.Scanner;

public class ex7 {
    
    public long factorial (long n) {
        if (n > 1) return (n * factorial(n - 1));
        else return 1;
    }

    public static long factorialStatic (long n) {
        long fac = 1;
        if (n > 0) {
            for (int x = 1; x <= n ; x++)
                fac *= x;
            return fac;
        }
        else return fac;
    }

    public void test() {
        long n;
        Scanner scanner = new Scanner(System.in);
        ex7 obj = new ex7();
        System.out.print("Enter number : ");
        n = scanner.nextInt();
        System.out.println("Factorial of "+ n + " is " + obj.factorial(n));
        System.out.print("FactorialStatic of " + n + " is ");
        System.out.println(ex7.factorialStatic(n));
        scanner.close();
    }

    public static void main(String[] args) {
        new ex7().test();
    }
}
