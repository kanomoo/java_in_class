package test_sbt.test_old_ass.ass2;

import java.util.Scanner;

public class ass2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> Program Palindrome Number <<");
        System.out.print("Enter integer number : ");
        String num = scanner.next();
        boolean Palindrome = true;
        for (int i = 0 ; i <= (num.length() / 2) ; i++) {
            if (num.charAt(i) == num.charAt(num.length() - i - 1))
                System.out.println("Digit " + num.charAt(i) + " eual to Digit " + num.charAt(num.length() - i - 1));
            else {
                System.out.println("Digit " + num.charAt(i) + " not eual to Digit " + num.charAt(num.length() - i - 1));
                System.out.println("Your enter number : " + num + " is not Palindrome Number.");
                Palindrome = false;
                break;
            }
        }
        if (Palindrome == true) System.out.println("Your enter number : " + num + " is Palindrome Number.");
        System.out.println("Exit Program");
        scanner.close();
    }
}