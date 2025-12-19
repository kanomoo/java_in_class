// package chapter3.New;

// import java.util.Scanner;

// public class ex3 {

//     public void result() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Program Calculate grade.\nEnter student score : ");
//         int score = scanner.nextInt();
//         String grade = "";
    //     if (score >= 80)
    //         grade = "A";
    //     else if (score >= 75)
    //         grade = "B+";
    //     else if (score >= 70)
    //         grade = "B";
    //     else if (score >= 65)
    //         grade = "C+";
    //     else if (score >= 60)
    //         grade = "C";
    //     else if (score >= 55)
    //         grade = "D+";
    //     else if (score >= 50)
    //         grade = "D";
    //     else
    //         grade = "F";
    //     System.out.println("Student grade is " + grade + "\nEnd Program.");
    //     scanner.close();
    // }

//     public static void main(String[] args) {
//         new ex3().result();
//     }
// }

package chapter3.New;

import javax.swing.JOptionPane;

public class ex3 {

    public void menu() {
        int score = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter student score : ", "Program Calculate grade", JOptionPane.QUESTION_MESSAGE));
        String grade = "";
        if (score >= 80) grade = "A";
        else if (score >= 75) grade = "B+";
        else if (score >= 70) grade = "B";
        else if (score >= 65) grade = "C+";
        else if (score >= 60) grade = "C";
        else if (score >= 55) grade = "D+";
        else if (score >= 50) grade = "D";
        else grade = "F";
        JOptionPane.showMessageDialog(null, "Student grade is " + grade);
    }

    public static void main(String[] args) {
        new ex3().menu();
    }
}