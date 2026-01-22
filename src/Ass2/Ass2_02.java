package Ass2;

import javax.swing.JOptionPane;

public class Ass2_02 {
    public void start() {
        while (true) {
            long num = Long.parseLong(JOptionPane.showInputDialog("Enter integer number : "));
            int even = 0, odd = 0, zero = 0;
            while (num > 0) {
                int digit = (int) (num % 10);
                if (digit == 0) zero++;
                else if (digit % 2 == 0) even++;
                else odd++;
                num /= 10;
            }
            String output = "Even number : " + even + "\nOdd number : " + odd + "\nZero number : " + zero;
            JOptionPane.showMessageDialog(null, output);
        }
    }

    public static void main(String[] args) {
        new Ass2_02().start();
    }
}
