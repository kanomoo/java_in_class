package chapter2;
import java.util.Scanner;

public class exercises5 {
    public static void main(String[] args) {
        float num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter floating number : ");
        num = scan.nextFloat();
        System.out.println("Decimal number #1 : " + (int) (num * 10));
        System.out.println("Decimal number #2 : " + (int) ((num * 100) % 10));
        System.out.println("Decimal number #2 : " + (int) ((num * 1000) % 10));
    }
}
