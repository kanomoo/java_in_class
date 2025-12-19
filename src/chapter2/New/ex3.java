package chapter2.New;

import java.util.Scanner;

public class ex3 {

    public void result() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter integer number : ");
        num = scanner.nextInt();
        System.out.println("Summation of digit : " + num / 100 + "+" + num / 10 % 10  +  "+" + num % 10);
        scanner.close();
    }

    public static void main(String[] args) {
        new ex3().result();
    }
}
