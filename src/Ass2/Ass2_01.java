package Ass2;

import javax.swing.JOptionPane;

public class Ass2_01 {

    public void start() {
        while (true) {
            String numberStr = JOptionPane.showInputDialog("Enter integer number(4 digit, 0-exit) : ");
            if (numberStr.equals("0")) {JOptionPane.showMessageDialog(null, "Exit Program"); System.exit(0);}
            else if (numberStr.length() != 4) JOptionPane.showMessageDialog(null, "Input error not in rage, please input again?", "Error Message", JOptionPane.ERROR_MESSAGE);
            else {
                String output = "";
                int num = Integer.parseInt(numberStr), total = 0;
                final int NUM = num;
                while (num > 0) {
                    int digit = num % 10;
                    if (digit % 2 == 0) output += digit + " is Even\n";
                    else output += digit + " is Odd\n";
                    total += digit;
                    num /= 10;
                }
                output += "Total number : " + total + "\nNumber " + NUM + ((NUM % 2 == 0) ? " is Even" : " is Odd");
                JOptionPane.showMessageDialog(null, output);
            }
        }
    }

    public static void main(String[] args) {
        new Ass2_01().start();
    }
}
