package test_sbt.test_old_ass.ass3;

import java.util.Scanner;

public class ass3_02 {
    String grade;
    Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("=".repeat(30) + "\n>>  Program Calculate Grade <<\n" + "=".repeat(30) + "\nInput Data: ");
        String output = String.format("%37s", "Grade Report\n");
        double point = 0;
        double total = 0, totalPoint = 0;
        output += "=".repeat(66) + "\n:Sub no.: Subject Name             : Mark : Grade :Credits:Points:\n" + "=".repeat(66);
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter subject name(" + i + ") : ");
            String name = scanner.nextLine();
            System.out.print("Enter subject score(" + i + ") : ");
            double score = scanner.nextDouble();
            scanner.nextLine();
            System.out.println();
            if (score >= 80) {grade = "A"; point = 4 * 3;}
            else if (score >= 70) {grade = "B"; point = 3 * 3;}
            else if (score >= 60) {grade = "C"; point = 2 * 3;}
            else if (score >= 50) {grade = "D"; point = 1 * 3;}
            else {grade = "F"; point = 0;}
            total += 3; totalPoint += point;
            output += String.format("\n:   %d   : %-24s : %4.1f :   %s   :   3   : %4.1f :", i, name, score, grade, point);
        }
        output += "\n" + "=".repeat(66) + String.format("\n:%29sTotal%14s :  %2.0f   : %4.1f :\n",  " ", " ", total,  totalPoint) + "=".repeat(66);
        output += String.format("\n: Grade Point Average(GPA) : %4.2f%31s :",  (totalPoint / total), " ") + "\n" + "=".repeat(66);
        System.out.println(output);
    }

    public static void main(String[] args) {
        new ass3_02().start();
    }
}