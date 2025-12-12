// package chapter2;
// import java.util.Scanner;

// public class exercises1 {
//     public static void main(String[] args) {
//         float celsius, fahrenheit;

//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter Decimal Temperature Celsius : ");
//         celsius = scan.nextFloat();
//         fahrenheit = ((9/5f) * celsius) + 32;
//         System.out.println("Temperature Fahrenheit = " + fahrenheit);
//         scan.close();
//     }
// }

package chapter2;

import java.util.Scanner;

public class exercises1 {
    Scanner scanner = new Scanner(System.in);
    double cel, fah;

    public void result() {
        System.out.print("Program change Temperature\nEnter celsius : ");
        cel = scanner.nextDouble();
        fah = 9.0 / 5.0 * cel + 32;
        System.out.printf("Temperature fahrenheit : %.2f", fah);
    }

    public static void main(String[] args) {
        new exercises1().result();
    }
}