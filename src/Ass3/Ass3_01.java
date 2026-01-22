package Ass3;

import javax.swing.JOptionPane;

public class Ass3_01 {
    long num = 0l;
    public void start() {
        while (true) {
            String output = "::     Main Menu     ::\n" + "=".repeat("::     Main Menu     ::".length()) + "\n A.Get Integer Number\n B. Summation of digit\n C. Count Digit\n D. Exit\nEnter Choice : ";
            String choice = JOptionPane.showInputDialog(null, output);
            switch (choice) {
                case "A","a" -> getNumber();
                case "B","b" -> sumDigit();
                case "C","c" -> countDigit();
                case "D","d" -> {JOptionPane.showMessageDialog(null, "Exit Program..."); System.exit(0);}
                default -> {}
            }
        }
    }

    public void getNumber() {
        num = Long.parseLong(JOptionPane.showInputDialog("Enter long number :"));
    }

    public void sumDigit() {
        int sum = 0;
        long NUM = num;
        while (NUM > 0) {
            int digit = (int) NUM % 10;
            NUM /= 10;
            sum += digit;
        }
        String output = "Your enter number : " + num + "\nSummation of digit : " + sum;
        JOptionPane.showMessageDialog(null, output);
    }

    public void countDigit() {
        int count = 0;
        long NUM = num;
        while (NUM > 0) {
            NUM /= 10;
            count++;
        }
        String output = "Your enter number : " + num + "\nThis number has " + count + " digits.";
        JOptionPane.showMessageDialog(null, output);
    }

    public static void main(String[] args) {
        new Ass3_01().start();
    }
}
