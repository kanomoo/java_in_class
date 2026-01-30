package Midterm;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Cafe_6806021612037 {
    static DecimalFormat twoDigit = new DecimalFormat("###,###,##0.00");
    static int mocha = 0 , coffee = 0, cappuccino = 0, aspers = 0;
    public static void mainCafe() {
        while (true) {
            String output = "# 6806021612037 Phavin Thitichunhakun";
            output += "\n=====================================";
            output += "\n1. Enter Mocha cup 60 Bath ( " + mocha + " )";
            output += "\n2. Enter Coffee cup 55 Bath ( " + coffee + " )";
            output += "\n3. Enter Cappuccino cup 55 Bath ( " + cappuccino + " )";
            output += "\n4. Enter Aspers cup 50 Bath ( " + aspers + " ) ";
            output += "\n5. Report Cafe";
            output += "\n6. Clear";
            output += "\n7. Exit\nSelect choice : ";
            String choice = JOptionPane.showInputDialog(output);
            if (choice == null) {JOptionPane.showMessageDialog(null, "Cancel Program", "Warning Message", JOptionPane.WARNING_MESSAGE); System.exit(0);}
            else if (choice.isEmpty()) JOptionPane.showMessageDialog(null, "No, input", "Error Message", JOptionPane.ERROR_MESSAGE);
            switch (choice) {
                case "1" -> { mocha = Integer.parseInt(JOptionPane.showInputDialog("Enter Mocha cup ? 0 - Cancel"));}
                case "2" -> { coffee = Integer.parseInt(JOptionPane.showInputDialog("Enter Coffee cup ? 0 - Cancel"));}
                case "3" -> { cappuccino = Integer.parseInt(JOptionPane.showInputDialog("Enter Cappuccino ? 0 - Cancel"));}
                case "4" -> { aspers = Integer.parseInt(JOptionPane.showInputDialog("Enter Aspers cup ? 0 - Cancel"));}
                case "5" -> reportCafe();
                case "6" -> clearCafe();
                case "7" -> {JOptionPane.showMessageDialog(null, "Exit Program"); System.exit(0);}
                default -> {}
            }
        }
    }

    public static void reportCafe() {
        int p_Mocha = 60 * mocha, p_Coffee = 55 * coffee, p_Cappuccino = 55 * cappuccino, p_Aspers = 50 * aspers;
        int total = p_Mocha + p_Coffee + p_Cappuccino + p_Aspers;
        String output = "Report Cafe\n======================";
        output += "\nPrice Mocha 60.0 Bath ( " + mocha + " ) -> " + twoDigit.format(p_Mocha);
        output += "\nPrice Coffee 55.0 Bath ( " + coffee + " ) -> " + twoDigit.format(p_Coffee);
        output += "\nPrice Cappuccino 55.0 Bath ( " + cappuccino + " ) -> " + twoDigit.format(p_Cappuccino);
        output += "\nPrice Aspers 50.0 Bath ( " + aspers + " ) -> " + twoDigit.format(p_Aspers);
        output += "\n======================\nTotal price = " + twoDigit.format(total) + "\n======================";
        JOptionPane.showMessageDialog(null, output);
    }

    public static void clearCafe() {
        mocha = coffee = cappuccino = aspers = 0;
    }

    public static void main(String[] args) {
        Cafe_6806021612037.mainCafe();
    }
}
