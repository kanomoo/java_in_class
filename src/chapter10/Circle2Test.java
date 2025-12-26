package chapter10;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Circle2Test {
    public static void main(String[] args) {
            Circle2 circle = new Circle2(37, 43, 2.5);
            String output = "X coordinate is " + circle.getX() +
                "\nY coordinate is " + circle.getY() + "\nRadius is " + circle.getRadius();
            circle.setX(35);
            circle.setY(20);
            circle.setRadius(4.25);
            output += "\n\nThe new locatoin and radius of circle are\n" +
            circle.toString();
            DecimalFormat df = new DecimalFormat("0.00");
            output += "\nDiameter is " + df.format(circle.getDiameter());
            output += "\nCircumference is " + df.format(circle.getCircumference());
            output += "\nArea is " + df.format(circle.getArea());
            JOptionPane.showMessageDialog(null, output);
            System.exit(0);
    }
}
