package test_sbt.test_old_ass.ass3;

import java.util.Scanner;

public class ass3_02 {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        String output = "======================================================================\n:Sub No.: Subject Name                 : Mark : Grade :Credits:Points:\n======================================================================";
        System.out.println(">>  Program Calculate Grade <<\n\nInput Data:");
        double point = 0, totalPoints = 0, score;
        String name;
        for (int i = 1; i <= 6; i++) {
            String grade = "";
            System.out.print("Enter subject name(" + i + ") : ");
            name = scanner.nextLine();
            System.out.print("Enter subject score(" + i + ") : ");
            score = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character left in the buffer
            System.out.println();
            if (score >= 80) {grade = "A"; point = 4 * 3;}
            else if (score >= 70) {grade = "B"; point = 3 * 3;}
            else if (score >= 60) {grade = "C"; point = 2 * 3;}
            else if (score >= 50) {grade = "D"; point = 1 * 3;}
            else {grade = "F"; point = 0;}
            totalPoints += point;
            output += String.format("\n:   %d   : %-29s: %4.1f :   %s   :   3   : %4.1f :", i, name, score, grade, point);
        }
        output += "\n======================================================================";
        output += "\n:                            total  Mark              :   18  : " + totalPoints + " :";
        output += "\n======================================================================";
        output += String.format("\n: Grade Point Average (GPA)  : %4.2f                                  :", (totalPoints / 18));
        output += "\n======================================================================";
        System.out.println(output);
    }

    public static void main(String[] args) {
        new ass3_02().start();
    }
}
