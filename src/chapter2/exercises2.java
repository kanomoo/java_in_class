package chapter2;
import java.util.Scanner;

public class exercises2 {
    public static void main(String[] args) {
        float fahrenheit, celsius;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Temperature Fahrenheit : ");
        fahrenheit = scan.nextFloat();
        celsius = (fahrenheit - 32)  / (9/5f) ;
        System.out.println("Temperature Celsius : " + celsius);
        scan.close();
    }
}
