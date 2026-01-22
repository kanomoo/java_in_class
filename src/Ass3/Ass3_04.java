package Ass3;

import javax.swing.JOptionPane;

public class Ass3_04 {
    long number = 0l;
    public void mainMenu() {
        while (true) {
            String output = "::  Main Menu  ::\n================\n A. Get Integer Number\n B. Summation of Digit\n C. Print Reverse Number\n D. Count Digit\n E. Exit\nEnter Choice : ";
            String choice = JOptionPane.showInputDialog(output);
            switch (choice) {
                case "A", "a" -> number = Long.parseLong(JOptionPane.showInputDialog("Enter number : "));
                case "B", "b" -> sumDigit(number);
                case "C", "c" -> printReverse(number);
                case "D", "d" -> countDigit(number);
                case "E", "e" -> {JOptionPane.showMessageDialog(null, "Now, Exit Program..."); System.exit(0);}
                default -> JOptionPane.showMessageDialog(null, "No this choice, please input again.");
            }
        }
    }

    public long getNumber() {
        return number;
    }

    public void sumDigit(long number) {
        long num = number;
        int sum = 0;
        while (num > 0){
            int digit = (int) num % 10;
            sum += digit;
            num /= 10;
        }
        JOptionPane.showMessageDialog(null, "Your enter number : " + getNumber() + "\nSummation of digit : " + sum);
    }

    public void printReverse(long number) {
        long num = number;
        String reverse = "";
        while (num > 0){
            int digit = (int) num % 10;
            reverse += digit;
            num /= 10;
        }
        JOptionPane.showMessageDialog(null, "Your enter number : " + getNumber() + "\nReverse number : " + reverse);
    }

    public void countDigit(long number) {
        long num = number;
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        JOptionPane.showMessageDialog(null, "Your enter number : " + getNumber() + "\nThis number has : " + count + " digits");
    }

    public static void main(String[] args) {
        Ass3_04 obj = new Ass3_04();
        obj.mainMenu();
    }
}
