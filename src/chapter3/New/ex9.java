package chapter3.New;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, total = 0, count = 0;
        do {
            System.out.print("Enter a positive integers:");
            ++count;
            total += num = scanner.nextInt();
        } while (count < 5);
        System.out.println("Sum value is " + total);
        scanner.close();
    }
}