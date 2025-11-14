package chapter3;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive number : ");
        int number = scanner.nextInt();
        String result = "";
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                result = " is not prime number.";
                break;
            } else {
                result = " is prime number.";
            }
        }
        System.out.println("Number " + number + result);
    }
}
