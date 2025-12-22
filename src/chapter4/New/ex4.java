package chapter4.New;

import java.util.Scanner;

public class ex4 {
    public void MainMethod() {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        String output = "";
        System.out.print("Enter value 1 : ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Enter value 2 : ");
        num2 = Integer.parseInt(input.nextLine());
        output = "before call method num1 = " + num1 + ", num2 = " + num2;
        System.out.println(output);
        changeValue(num1, num2);
        output = "After call method num1 = " + num1 + ", num2 = " + num2;
        System.out.println(output);
        input.close();
    }

    public void changeValue(int n1, int n2) {
        n1 = n1 + n2;
        n2 = n2 - 5;
    }

    public static void main(String[] args) {
        new ex4().MainMethod();
    }
}
