// package chapter7.exercise3;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class exercise3 {
    
//     public static void main(String[] args) {
//         Students std = new Students();
//         String output = "";
//         do {
//             String choice = JOptionPane.showInputDialog("Program store student data\n 1. Add data student\n 2. Show data");
//             if (choice != null) {
//                 switch (choice) {
//                     case "1":
//                         long id = Long.parseLong(JOptionPane.showInputDialog("Enter Id:").trim()); // 
//                         String name = JOptionPane.showInputDialog("Enter name".trim());
//                         int score = Integer.parseInt(JOptionPane.showInputDialog("Enter score").trim());
//                         std.addData(id, name, score);
//                         break;
//                     case "2":
//                         JTextArea outputArea = new JTextArea();
//                         output += "ID\t\tName\tScore\tGrade\n" + std.showData();
//                         outputArea.setText(output);
//                         JOptionPane.showMessageDialog(null, outputArea);
//                         output = "";
//                         break;
//                     default:
//                         JOptionPane.showMessageDialog(null, "No choice", "Warning Message", JOptionPane.WARNING_MESSAGE);
//                         break;
//                 }
//             } else {
//                     JOptionPane.showMessageDialog(null, "Exit Program.");
//                     break;
//             }
//         } while (true);
//     }
// }



package chapter7.exercise3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class exercise3 {

    public static void Menu() {
        ArrayList<Students> list = new ArrayList<>();
        JTextArea outputArea = new JTextArea();
        boolean done = true;
        do {
            String choice = JOptionPane.showInputDialog("Program store student\n 1. Add data student\n 2. Report data students\nEnter choice:");
            if (choice != null) {
                switch(choice) {
                    case "1":
                        long id = Long.parseLong(JOptionPane.showInputDialog("Enter id student"));
                        String name = JOptionPane.showInputDialog("Enter student name");
                        int score = Integer.parseInt(JOptionPane.showInputDialog("Enter student score"));
                        int confirm = JOptionPane.showConfirmDialog(null, id + "  " + name + "  " + score);
                        if (confirm == JOptionPane.YES_OPTION) {
                            list.add(new Students(id, name, score));
                            JOptionPane.showMessageDialog(null, "Save student data");
                        } else {
                            JOptionPane.showMessageDialog(null, "Not save student data");
                        }
                        break;
                    case "2":
                        String output = "ID\t\tname\t\tScore\n";
                        for (Students std: list)
                            output += std.toString();
                        outputArea.setText(output);
                        JOptionPane.showMessageDialog(null, outputArea);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No choice", "Warning Message", JOptionPane.WARNING_MESSAGE);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Exit Program.");
                done = false;
            }
        } while (done);
    }

    public static void main(String[] args) {
        Menu();
    }
}