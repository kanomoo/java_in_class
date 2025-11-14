package chapter3;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number(4 digit) : ");
        int i = 10, j = 1;
        int num = scanner.nextInt();
        while (num % i / j > 0) {
            int value = num % i / j;
            if (value % 2 == 0) System.out.println(value + " is Even");
            else System.out.println(value + " is Odd");
            i *= 10;
            j *= 10;
        }
        System.out.println("Number " + num + ((num % 2 == 0) ? " is Even." : " is Odd."));
    }
}
