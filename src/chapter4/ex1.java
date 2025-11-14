package chapter4;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        double value;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter floating number : ");
        value = scanner.nextDouble();
        System.out.println("\nCeiling of " + value + " is " + Math.ceil(value));
        System.out.println("Floor of " + value + " is " + Math.floor(value));
        System.out.println("Square root of " + value + " is " + Math.sqrt(value));
        System.out.println("Exponential of " + value + " is " + Math.exp(value));
        System.out.println("Absolute of " + value + " is " + Math.abs(value));
        System.out.println("Natural logarithm of " + value + " is " + Math.log(value));
        System.out.println("Logarithm 10 of " + value + " is " + Math.log10(value));
        System.out.println("Power three of " + value + " is " + Math.pow(value, 3));
        System.out.println("Random avlue is " + Math.random());
        System.out.println("Pi value is " + Math.PI);
        System.out.println("Exponential value is " + Math.E);
    }
}
