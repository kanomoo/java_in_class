package chapter3;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sale amount : ");
        int num = scanner.nextInt();
        double rate = 0;
        if (num > 100000) rate = 0.10;
        else if (num > 80000) rate = 0.09;
        else if (num > 60000) rate = 0.07;
        else if (num > 40000) rate = 0.05;
        else if (num > 20000) rate = 0.0275;
        else if (num > 10000) rate = 0.015;
        else rate = 0;
        System.out.println("You got rate = " + (rate * 100) + "%");
        System.out.println("Your sale " + num + ", commission = " + (int) (num * rate));
    }
}
