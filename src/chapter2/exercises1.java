package chapter2;
import java.util.Scanner;

public class exercises1 {
    public static void main(String[] args) {
        float celsius, fahrenheit;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Decimal Temperature Celsius : ");
        celsius = scan.nextFloat();
        fahrenheit = ((9/5f) * celsius) + 32;
        System.out.println("Temperature Fahrenheit = " + fahrenheit);
        scan.close();
    }
}
