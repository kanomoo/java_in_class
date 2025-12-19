package chapter2.New;

import java.util.Scanner;

public class ex4 {

    public void result() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter floating number : ");
        float num = scanner.nextFloat();
        System.out.println("Decimal number #1 : " + (int) (num * 10));
        System.out.println("Decimal number #2 : " + (int) (num * 100) % 10);
        System.out.println("Decimal number #3 : " + (int) (num * 1000) % 10);
        scanner.close();
    }

    public static void main(String[] args) {
        new ex4().result();

    }
}
