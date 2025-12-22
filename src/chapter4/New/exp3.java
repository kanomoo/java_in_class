package chapter4.New;

import java.util.Scanner;

public class exp3 {
    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number line : ");
        int line = scanner.nextInt();
        System.out.print("Input character : ");
        String ch = scanner.next();
        System.out.print("Input type : ");
        int type = scanner.nextInt();
    }
}
