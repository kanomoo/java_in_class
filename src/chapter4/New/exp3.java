package chapter4.New;

import java.util.Scanner;

public class exp3 {
    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        int line = 0;
        System.out.print("Input number line : ");
        line = scanner.nextInt();
        System.out.print("Input character : ");
        String ch = scanner.next();
        System.out.print("Input type : ");
        int type = scanner.nextInt();
        System.out.println();
        if(type == 1)
            for(int n = 1; n <= 5; n++)
                System.out.println(ch.repeat(n));
        else if (type == 2)
            for(int n = line; n >= 1; n--)
                System.out.println(ch.repeat(n));
        scanner.close();
    }

    public static void main(String[] args) {
        new exp3().startMenu();
    }
}