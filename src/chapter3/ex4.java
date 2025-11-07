package chapter3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        double score;
        Scanner scanner = new Scanner(System.in);
        String grade;

        System.out.println("Porgram Calculate grade.");
        System.out.print("Enter student score : ");
        score = scanner.nextDouble();
        if (score >= 80) grade = "A";
        else if (score >= 75) grade = "B+";
        else if (score >= 70) grade = "B";
        else if (score >= 65) grade = "C+";
        else if (score >= 60) grade = "C";
        else if (score >= 55) grade = "D+";
        else if (score >= 50) grade = "D";
        else grade = "F";
        System.out.println("Student grade is " + grade);
        System.out.println("End Program.");
        scanner.close();
    }
}
