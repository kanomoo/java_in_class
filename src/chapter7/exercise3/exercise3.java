package chapter7.exercise3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class exercise3 {
    
    public static void main(String[] args) {
        Students std = new Students();
        String output = "";
        do {
            String choice = JOptionPane.showInputDialog("Program store student data\n 1. Add data student\n 2. Show data");
            if (choice != null) {
                switch (choice) {
                    case "1":
                        long id = Long.parseLong(JOptionPane.showInputDialog("Enter Id:").trim()); // 
                        String name = JOptionPane.showInputDialog("Enter name".trim());
                        int score = Integer.parseInt(JOptionPane.showInputDialog("Enter score").trim());
                        std.addData(id, name, score);
                        break;
                    case "2":
                        JTextArea outputArea = new JTextArea();
                        output += "ID\t\tName\tScore\tGrade\n" + std.showData();
                        outputArea.setText(output);
                        JOptionPane.showMessageDialog(null, outputArea);
                        output = "";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No choice", "Warning Message", JOptionPane.WARNING_MESSAGE);
                        break;
                }
            } else {
                    JOptionPane.showMessageDialog(null, "Exit Program.");
                    break;
            }
        } while (true);
    }
}
