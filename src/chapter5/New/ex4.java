package chapter5.New;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter name : ");
        name = scanner.nextLine();
        if (!name.isEmpty()) {
            for (int index = 0; index < name.length(); index++) {
                System.out.println("Character : " + name.charAt(index) + " is ascill value : " + (byte) name.charAt(index));
            }
        } else 
            System.out.println("No data input.");
        scanner.close();
    }
}