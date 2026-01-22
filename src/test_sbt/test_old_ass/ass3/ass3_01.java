package test_sbt.test_old_ass.ass3;

import java.util.Random;
import java.util.Scanner;

public class ass3_01 {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
    public void start() {
        while (true) {
            System.out.print("Main Menu\n=============\n 1. Play Game\n 2. Exit\nEnter Choice : ");
            String choice = scanner.next();
            switch (choice) {
                case "1" -> playGame();
                case "2" -> {System.out.println("Exit Program..."); System.exit(0);}
                default -> {System.out.println("No choice, enter again.");}
            }
            System.out.println();
        }
    }

    public void playGame() {
        int num = rnd.nextInt(100);
        boolean Win = false;
        System.out.println("\nNow play game");
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter guess number(#" + i + ") : ");
            int guess = scanner.nextInt();
            if (guess > num) System.out.println("Your value is more than");
            else if(guess < num) System.out.println("You value is less than");
            else {
                System.out.println("\nYou win, use guess " + i + " times.\nNumber guess is " + num);
                Win = true;
                break;
            }
        }
        if (Win == false) System.out.println("\nYou lose, random number is " + num + ".");
    }

    public static void main(String[] args) {
        new ass3_01().start();
    }
}
