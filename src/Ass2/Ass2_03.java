package Ass2;

import javax.swing.JOptionPane;

public class Ass2_03 {
    public void start() {
        while (true) {
            boolean prime = true;
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter positive number(0-exit) : "));
            if (num == 0) JOptionPane.showMessageDialog(null, "Exit Program.");
            else {
                for (int i = 2; i < num / 2; i++) {
                    if (num % i == 0) {
                        JOptionPane.showMessageDialog(null, "Number " + num + " is not prime number.");
                        prime = false;
                        break;
                    }
                }
            }
            if (prime == true) JOptionPane.showMessageDialog(null, "Number " + num + " is prime number.");
        }
    }

    public static void main(String[] args) {
        new Ass2_03().start();
    }
}
