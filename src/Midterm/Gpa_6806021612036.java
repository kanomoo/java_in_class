package Midterm;

import java.util.Scanner;

public class Gpa_6806021612036 {
    Scanner scanner = new Scanner(System.in);
    String showOutput, grade, input;
    double point = 0, a_point = 0, totalCredit = 0, totalPoint = 0;
    boolean data = false, checkData = false;

    public void gpaMain() {
        while (true) {
            String output = "# Program Calculate Grade #";
            output +=       "\n============================";
            output +=       "\n| 1. Input Grade           |";
            output +=       "\n| 2. Show Report           |";
            output +=       "\n| 3. Exit Program          |";
            output +=       "\n----------------------------\nSelect Choice : ";
            System.out.print(output);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> inputGrade();
                case "2" -> showReport();
                case "3" -> {System.out.println("Exit Program"); System.exit(0);}
                default -> System.out.println("No choice");
            }
            System.out.println();
        }
    }

    public void inputGrade() {
        data = true;
        point = a_point = totalCredit = totalPoint = 0;
        showOutput = "\nStudent Grade  Point Average\n============================";
        System.out.print("\nEnter grade : ");
        input = scanner.nextLine().trim();
    }

    public void showReport() {
        int i = 0;
        boolean stop = false;
        while (input.length() > 0) {
            if (input.indexOf(" ") > 0) {
                String sub = input.substring(0, input.indexOf(" "));
                grade = sub.toUpperCase();
                input = input.substring(input.indexOf(" ") + 1, input.length());
            } else {
                grade = input.toUpperCase();
                stop = true;
            }
            if (grade.equals("A")) {point = 4.0; a_point = point * 3; checkData = true;}
            else if (grade.equals("B+")) {point = 3.5; a_point = point * 3; checkData = true;}
            else if (grade.equals("B")) {point = 3.0; a_point = point * 3; checkData = true;}
            else if (grade.equals("C+")) {point = 2.5; a_point = point * 3; checkData = true;}
            else if (grade.equals("C")) {point = 2.0; a_point = point * 3; checkData = true;}
            else if (grade.equals("D+")) {point = 1.5; a_point = point * 3; checkData = true;}
            else if (grade.equals("D")) {point = 1.0; a_point = point * 3; checkData = true;}
            else if (grade.equals("F+")) {point = 0.5; a_point = point * 3; checkData = true;}
            else if (grade.equals("F")) {point = 0.0; a_point = point * 3; checkData = true;}
            else {point = 0.0; a_point = point * 3; checkData = false;}
            if (checkData == true) {
                totalCredit += 3; totalPoint += a_point;
                showOutput += "\n " + ++i + ".\t" + grade + "\t" + point + "\t" + a_point;
                if (stop == true) break;
            }
            else {
                totalCredit = 0; totalPoint = 0; point = 0;
                showOutput = "\nStudent Grade  Point Average\n============================\n Data not true";
                break;
            }
        }
        if (data) showOutput += "\n============================\nCredit : " + totalCredit + "  Point : " + totalPoint + "\nGrade Point Average (GPA) : " + (totalPoint / totalCredit) ;
        System.out.println(showOutput);
        data = false;
    }

    public static void main(String[] args) {
        new Gpa_6806021612036().gpaMain();
    }
}



// package Midterm;

// import java.util.Scanner;

// public class Gpa_6806021612036 {
//     Scanner scanner = new Scanner(System.in);
//     String output;
//     double point = 0, a_point = 0, totalCredit = 0, totalPoint = 0;
//     boolean data = false;
//     public void gpaMain() {
//         while (true) {
//             String output = "# Program Calculate Grade #";
//             output +=       "\n===========================";
//             output +=       "\n| 1. Input Grade           |";
//             output +=       "\n| 2. Show Report           |";
//             output +=       "\n| 3. Exit Program          |";
//             output +=       "\n----------------------------\nSelect Choice : ";
//             System.out.print(output);
//             String choice = scanner.next();
//             switch (choice) {
//                 case "1" -> inputGrade();
//                 case "2" -> showReport();
//                 case "3" -> {System.out.println("Exit Program"); System.exit(0);}
//                 default -> {}
//             }
//             System.out.println();
//         }
//     }

//     public void inputGrade() {
//         data = true;
//         point = a_point = totalCredit = totalPoint = 0;
//         output = "\nStudent Grade  Point Average\n============================";
//         System.out.print("\nEnter grade : ");
//         for (int i = 1; i <= 5; i++) {
//             String grade = scanner.next().trim();
//             if (grade.equals("A")) {point = 4.0; a_point = point * 3;}
//             else if (grade.equals("B+")) {point = 3.5; a_point = point * 3;}
//             else if (grade.equals("B")) {point = 3.0; a_point = point * 3;}
//             else if (grade.equals("C+")) {point = 2.5; a_point = point * 3;}
//             else if (grade.equals("C")) {point = 2.0; a_point = point * 3;}
//             else if (grade.equals("D+")) {point = 1.5; a_point = point * 3;}
//             else if (grade.equals("D")) {point = 1.0; a_point = point * 3;}
//             else if (grade.equals("F")) {point = 0.0; a_point = point * 3;}
//             totalCredit += 3; totalPoint += a_point;
//             output += "\n " + i + ".\t" + grade + "\t" + point + "\t" + a_point;
//         }
//     }

//     public void showReport() {
//         if (data) output += "\n============================\nCredit : " + totalCredit + "  Point : " + totalPoint + "\nGrade Point Average (GPA) : " + (totalPoint / totalCredit) ;
//         System.out.println(output);
//         data = false;
//     }

//     public static void main(String[] args) {
//         new Gpa_6806021612036().gpaMain();
//     }
// }