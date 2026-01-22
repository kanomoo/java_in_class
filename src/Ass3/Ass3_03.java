package Ass3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.plaf.FontUIResource;

public class Ass3_03 {
    JTextArea outputArea = new JTextArea();
    public void start() {
        String name = JOptionPane.showInputDialog("Enter text:").trim();
        int upper = 0, letter = 0, digit = 0, symbols = 0;
        if (name == null);
        else if (name.isEmpty()) JOptionPane.showMessageDialog(null, "No Input text !", "Error Message", JOptionPane.ERROR_MESSAGE);
        else {
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (ch >= 'A' && ch <= 'Z') upper++;
                else if (ch >= 'a' && ch <= 'z') letter++;
                else if (ch >= '0' && ch <= '9') digit++;
                else symbols++;
            }
            String output = "TEXT : " + name + "\nText length : " + name.length() + "\nตัวอักษรใหญ่ : " + upper + "\nตัวอักษรเล็ก : " + letter + "\nตัวอักษรตัวเลข : " + digit + "\nสัญลักษณ์อื่น : " + symbols;
            outputArea = new JTextArea(output);
            outputArea.setFont(new FontUIResource("Tahoma", FontUIResource.PLAIN, 12));
            outputArea.setEditable(false);
            outputArea.setOpaque(false);
            JOptionPane.showMessageDialog(null, outputArea);
        }
    }

    public static void main(String[] args) {
        new Ass3_03().start();
    }
}
