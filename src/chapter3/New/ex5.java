package chapter3.New;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        String grade;
        double level;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade : ");
        grade = scanner.nextLine().toUpperCase().trim();
        level = switch (grade) {
            case "A" -> 4.0;
            case "B" -> 3.0;
            case "C" -> 2.0;
            case "D" -> 1.0;
            case "F" -> 1.0;
            default -> (-1.0);
        };
        if (level == -1)
            System.out.println("Grade error.");
        else
            System.out.println("Grade : " + grade + "Level = " + level);
        scanner.close();
    }
}
