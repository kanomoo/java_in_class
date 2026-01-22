package test_sbt.test_old_ass.ass2;

import java.util.Scanner;

public class ass2_04 {
    Scanner scanner = new Scanner(System.in);
    long num;

    public void start() {
        while (true) {
            String output = "=======================\n::     Main Menu     ::\n=======================\n A. Get Integer Number\n B. Summation of Digit\n C. Count Digit\n D. Exit\nEnter Choice : ";
            System.out.print(output);
            String choice = scanner.next();
            switch (choice) {
                case "A", "a" -> getNum();
                case "B", "b" -> sumDigit();
                case "C", "c" -> countDigit();
                case "D", "d" -> {System.out.println("\nExit Program..."); System.exit(0);}
                default -> {}
            }
            System.out.println();
        }
    }

    public void getNum() {
        System.out.print("\nEnter long number : ");
        num = scanner.nextLong();
    }

    public void sumDigit() {
        int sum = 0, odd = 0, even = 0;
        System.out.println("\nYour enter number : " + num);
        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            sum += digit;
            if (digit % 2 == 0) even += digit;
            else odd += digit;
        }
        System.out.println("Summation of digit : " + sum + "\nSummation odd of digit : " + odd + "\nSummation even of digit : " + even);
    }

    public void countDigit() {
        System.out.println("Your enter number : " + num);
        String numStr = String.valueOf(num);
        System.out.println("\nThis number has " + numStr.length() + " digits.");
    }

    public static void main(String[] args) {
        new ass2_04().start();
    }
}
