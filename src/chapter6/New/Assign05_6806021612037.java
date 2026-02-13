// Id    : 6806021612037
// Name  : Mr. Phapavin Thitichunhakun
// Room  : 1 RC
// File Name  : Assign05_6806021612037.java
package chapter6.New;

import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Assign05_6806021612037 {
    static Random rnd = new Random();
    static DecimalFormat twoDigit = new DecimalFormat("0.00");
    static JTextArea outputArea = new JTextArea();
    static double array[] = new double[12];
    static double total = 0;

    public static void mainProgram() {
        while (true) {
            String choice = JOptionPane.showInputDialog("Menu Sale Report\n_____________________\n 1. Generate Sale\n 2. Report Sale\n 3. Exit\n Enter cohice : ");
            if (choice == null) { JOptionPane.showMessageDialog(null, "Exit Program."); System.exit(0);}
            else {
                switch (choice) {
                    case "1" -> genSale(array);
                    case "2" -> reportSale(array);
                    case "3" -> { JOptionPane.showMessageDialog(null, "Exit Program."); System.exit(0);}
                    default -> JOptionPane.showMessageDialog(null, "No input");

                }
            }
        }
    }

    public static void genSale(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 100000 + rnd.nextInt(800001);
            total += (double) array[i];
        }
        JOptionPane.showMessageDialog(null, "Generate Sale finish.");
    }

    public static void reportSale(double[] array) {
        outputArea.setText("No.\tSales\tPercent\n");
        outputArea.append("================================\n");
        for (int i = 0; i < array.length; i++) {
            outputArea.append(i + 1 + "\t" + twoDigit.format(array[i]) + "\t" + twoDigit.format((array[i] / (total / 100.0) )) + "\n");
        }
        outputArea.append("================================\n");
        outputArea.append("Total\t" + twoDigit.format(total) + "\t" + twoDigit.format(total / (total / 100.0)) );
        JOptionPane.showMessageDialog(null, outputArea, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Assign05_6806021612037.mainProgram();
    }
}
