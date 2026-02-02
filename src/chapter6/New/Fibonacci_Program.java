package chapter6.New;

import java.util.Scanner;

public class Fibonacci_Program {
    Scanner scanner = new Scanner(System.in);
    int number = 0;

    public void startMain() {
        System.out.println(">>>  Program Fibonacci  <<<\n");
        while (true) {
            System.out.print("Enter sequence number : ");
            number = scanner.nextInt();
            if (number == -1) {
                System.out.println("Exit Program."); 
                System.exit(0);
            }
            System.out.println("Fibonacci sequence " + number + " = " + fibonacci(number) + "\n");
        }
    }

    public int fibonacci(int num) {
        if (num == 0) return 0;
        else if (num == 1) return 1;
        else return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        new Fibonacci_Program().startMain();
    }
}
