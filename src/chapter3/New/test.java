package chapter3.New;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class test {
    public void menu() {
        JTextArea outputArea = new JTextArea();
        String[] grade = new String[5];
        int[] score = new int[5];

        do {
            String scoreStr = JOptionPane.showInputDialog(null, " 1. Input Score\n 2. Show grade", "Program cal grade", JOptionPane.QUESTION_MESSAGE);
            if (scoreStr != null && !scoreStr.isBlank()) {
                switch (scoreStr) {
                    case "1":
                        for (int n = 0; n < 5; n++) {
                            score[n] = Integer.parseInt(JOptionPane.showInputDialog("Enter score#" + (n + 1)));
                            if (score[n] >= 80) grade[n] = "A";
                            else if (score[n] >= 75) grade[n] = "B+";
                            else if (score[n] >= 70) grade[n] = "B";
                            else if (score[n] >= 65) grade[n] = "C+";
                            else if (score[n] >= 60) grade[n] = "C";
                            else if (score[n] >= 55) grade[n] = "D+";
                            else if (score[n] >= 50) grade[n] = "D";
                            else grade[n] = "F";
                        }
                        break;
                    case "2":
                        String output = "Score\tGrade\t\n";
                        for (int n = 0; n < 5; n++) {
                            output += score[n] + "\t" +  grade[n] + "\t" + "\n";
                        }
                        outputArea.setText(output);
                        JOptionPane.showMessageDialog(null, outputArea);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Warning Message", "No choice",
                                JOptionPane.WARNING_MESSAGE);
                        break;
                }
            } else
                System.exit(0);
        } while (true);
    }

    public static void main(String[] args) {
        new test().menu();
    }
}