package Ass2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Ass2_04 {
    DecimalFormat twoDigit = new DecimalFormat("###,###,##0.00");
    NumberFormat fmt = NumberFormat.getPercentInstance();
    public void start() {
        while (true) {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Enter your income( -1 to exit) : "));
            fmt.setMaximumFractionDigits(1);
            if (num == -1) {JOptionPane.showMessageDialog(null, "Exit Program."); System.exit(0);}
            else {
                double rate = 0.0;
                if (num > 1000000) rate = 0.10;
                else if (num > 800000) rate = 0.075;
                else if (num > 500000) rate = 0.055;
                else if (num > 300000) rate = 0.04;
                else if (num > 150000) rate = 0.025;
                else if (num > 0) rate = 0;
                String output = "Net Income : " + twoDigit.format(num) + "\nTax Rate(%) : " + fmt.format(rate) + "\nAmount Tax : " + twoDigit.format(num * rate);
                JOptionPane.showMessageDialog(null, output);
            }
        }
    }

    public static void main(String[] args) {
        new Ass2_04().start();
    }
}
