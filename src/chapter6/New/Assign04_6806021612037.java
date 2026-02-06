// Id    : 6806021612037
// Name  : Mr. Phapavin Thitichunhakun
// Room  : 1 RC
// File Name  : Assign04_6806021612037.java

package chapter6.New;

import java.util.Scanner;

public class Assign04_6806021612037 {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println(">>> Program Fibonacci  <<<\n");
        while (true) {
            System.out.print("Enter sequence number : ");
            int num = scanner.nextInt();
            if (num == -1) {
                System.out.println("Exit Program.");
                System.exit(0);
            } else System.out.println("Fibonacci sequence " + num + " = " + fibonacci(num) + "\n");
        }
    }

    public int fibonacci(int num) {
        if (num == 0) return 0;
        else if (num == 1) return 1;
        else return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        Assign04_6806021612037 obj = new Assign04_6806021612037();
        obj.start();
    }
}
