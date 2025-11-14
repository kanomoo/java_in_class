package chapter3;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        double num;
        int count = 1, i = 10, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter floating-point number : ");
        num = scanner.nextDouble();
        if (num > 0.1111 && num < 0.999) {
            while ((num * i) % 10 > 0) {
                int value = (int) (num * i) % 10;
                System.out.println("Integer number " + count + " = " + value);
                if (value % 2 == 0) {
                    System.out.println("Sum = " + sum + " + " + value + " = " + (sum + value));
                    sum += value;
                } else {
                    System.out.println("Sum = " + sum + " - " + value + " = " + (sum - value));
                    sum -= value;
                }
                count++;
                i *= 10;
            }
        } else System.out.println("Number not changed");
    }
}
