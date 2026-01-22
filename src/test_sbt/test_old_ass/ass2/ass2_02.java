package test_sbt.test_old_ass.ass2;

import java.util.Scanner;

public class ass2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> Program Change Number to Text <<");
        System.out.print("Enter integer number : ");
        String num = scanner.next();
        System.out.println("Number : " + num);
        String output = "";
        for (int i = 0 ; i < num.length() ; i++) {
            char digit = num.charAt(i);
            switch (digit) {
                case '0' -> output += "Zero ";
                case '1' -> output += "One ";
                case '2' -> output += "Two ";
                case '3' -> output += "Three ";
                case '4' -> output += "Four ";
                case '5' -> output += "Five ";
                case '6' -> output += "Six ";
                case '7' -> output += "Seven ";
                case '8' -> output += "Eight ";
                case '9' -> output += "Nine ";
                default -> {}
            }
        }
        System.out.println("Text : " + output);
        scanner.close();
    }
}
