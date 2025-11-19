// package chapter5;

// public class test {
//     public static long factorial (int n) {
//         long fac = 1;
//         for (int x = 1; x <= n; x++)
//             fac *= x;
//         return(fac);
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(10));
//     }
// }


// package chapter5;

// public class testFac {
//     public static long factorial(int n) {
//         long fac = 1;
//         for (int i = 1; i <= n; i++)
//             fac *= i;
//         return fac;
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(10));
//     }
// }



package chapter5;

import javax.swing.JOptionPane;

public class testFac {
    public static long factorial(int n) {
        long fac = 1;
        for (int i = 1; i <= n; i++)
            fac *= i;
        return fac;
    }
    public static long factorial_re(long n) {
        if (n > 1) return n * factorial_re(n - 1);
        else return 1;
    }
    public static void main(String[] args) {
        String output = String.format("factorial 1 = %,.2f\nfactorial 2 = %,.2f", (double) factorial(10), (double) factorial_re(10));
        JOptionPane.showMessageDialog(null, output);
    }
}