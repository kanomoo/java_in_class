package chapter5.New;

import java.text.DecimalFormat;

public class ex2 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Angle\t\tSin\t\tCos\t\ttan");
        for (int n = 1; n <= 60; n++)
            System.out.print("=");
        System.out.println();
        DecimalFormat sixDigit = new DecimalFormat("0.000000");
        double radiuss;
        for (double angle = 0.0; angle <= 360; angle += 20.0) {
            radiuss = Math.toRadians(angle);
            System.out.print(sixDigit.format(angle) + "\t");
            System.out.print(sixDigit.format(Math.sin(radiuss)) + "\t");
            System.out.print(sixDigit.format(Math.cos(radiuss)) + "\t");
            System.out.println(sixDigit.format(Math.tan(radiuss)));
        }
    }
}