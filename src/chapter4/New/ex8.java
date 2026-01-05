package chapter4.New;

import java.util.Scanner;

public class ex8 {
    public void input() {
        int numInt1,numInt2;
        double numDouble1, numDouble2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number 1 : ");
        numInt1 = scanner.nextInt();
        System.out.print("ENter integer number 2 : ");
        numInt2 = scanner.nextInt();
        System.out.println("Result integer number = " + Add(numInt1, numInt2));
        System.out.print("Enter floating number 1 :");
        numDouble1 = scanner.nextDouble();
        System.out.print("Enter floating number 2 :");
        numDouble2 = scanner.nextDouble();
        System.out.print("Result floating number = " + Add(numDouble1, numDouble2));
        scanner.close();
    }

    public static int Add(int num1, int num2) {
        return (num1 + num2);
    }

    public static double Add(double num1, double num2) {
        return (num1 + num2);
    }

    public static void main(String[] args) {
        ex8 obj = new ex8();
        obj.input();
    }
}
