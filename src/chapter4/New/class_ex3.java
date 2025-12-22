package chapter4.New;

import java.util.Scanner;

public class class_ex3 {
    public static void startMain() {
        Scanner input = new Scanner(System.in);
        boolean done = true;
        String choice = "";
        String menu = "\n>>> Main Menu  <<<\n 1. Call Grade\n";
        menu += " 2. Change Number\n 3. Exit\nSelect choice : ";
        do {
            System.out.print(menu);
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    calGrade(input);        
                    break;
                case "2":
                    changeNumber(input); 
                    break;
                case "3":
                    done = false;
                    break;
                default:
                    System.out.println("No choice");
                    break;
            } 
        } while (done);
        System.out.println("Exit Program.");
        input.close();
    }

    public static void calGrade(Scanner input) {
        int score;
        System.out.print("Enter your score : ");
        score = Integer.parseInt(input.nextLine());
        String output;
        output = "Score : " + score + ", got grade : " + getGrade(score);
        System.out.println(output);
    } 

    public static String getGrade(int score) {
        String grade = "";
        if (score >= 80) grade = "A";
        else if (score >= 75) grade = "B+";
        else if (score >= 70) grade = "B";
        else if (score >= 65) grade = "C+";
        else if (score >= 60) grade = "C";
        else if (score >= 55) grade = "D+";
        else if (score >= 50) grade = "D";
        else grade = "F";
        return grade;
    }
    
    public static void changeNumber(Scanner input) {
        int num;
        String binStr = "", numStr;
        System.out.print("Enter integer number : ");
        num = Integer.parseInt(input.nextLine());
        numStr = "" + num;
        while (num > 0) {
            int digit = num % 2;
            binStr = digit + binStr;
            num = num / 2;
        }
        String output = "Integer Number : " + numStr + "\nBinary number : " + binStr;
        System.out.println(output);
    }

}
