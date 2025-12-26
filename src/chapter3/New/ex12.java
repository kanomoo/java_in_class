package chapter3.New;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat fourDigit = new DecimalFormat("0.0000");
        boolean done = true;
        String strMenu = " Main Menu\n============\n";
        strMenu += "1. Area Rectangle\n2. Area Circle\n3. Exit\nEnter Choice : ";
        do {
            System.out.print(strMenu);
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter width : ");
                float width = scanner.nextFloat();
                System.out.print("Enter height : ");
                float height = scanner.nextFloat();
                float area = width * height;
                System.out.print("Area of Rectangle = ");
                System.out.println(fourDigit.format(area));
            } else if (choice == 2) {
                System.out.print("Enter radius : ");
                float radius = scanner.nextFloat();
                float area = (float) (Math.PI * radius * radius);
                System.out.print("Area of Circle = ");
                System.out.println(fourDigit.format(area));
            } else if (choice == 3) {
                done = false;
            } else {
                System.out.println("This choices is incorrect, ");
                System.out.println("try again.");
            }
            System.out.println();
        } while (done);
        System.out.println("Exit Program, Bye.");
        scanner.close();
    }
}