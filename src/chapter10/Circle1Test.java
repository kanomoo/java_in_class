// package chapter10;

// import java.text.DecimalFormat;
// import javax.swing.JOptionPane;

// public class Circle1Test {
//     public static void main(String[] args) {
//         Circle1 circle = new Circle1(37, 43, 2.5);
//         String output = "X coordinate is " + circle.getX() +
//             "\nY coordinate is " + circle.getY() + "\nRadius is " + circle.getRadius();
//         circle.setX(35); // set new x-coordinate
//         circle.setY(20); // set new y-coordinate
//         circle.setRadius(4.25); // set new radius
//         output += "\n\nThe new location and radius of circle are\n" + circle.toString();
//         DecimalFormat df = new DecimalFormat("0.00");
//         output += "\nDiameter is " + df.format(circle.getDiameter());
//         output += "\nCircumference is " + df.format(circle.getCircumference());
//         output += "\nArea is " + df.format(circle.getArea());
//         JOptionPane.showMessageDialog(null, output); // display output
//         System.exit(0);
//     }
// }


package chapter10;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Circle1Test {

    public static void main(String[] args) {
        Circle1 circle = new Circle1(37, 43, 2.5);
        DecimalFormat twoDigit = new DecimalFormat("0.00");
        String output = "X coordinate is " + circle.getX() + "\nY coordinate is " + circle.getY();
        output += "\nRadius is " + circle.getRadius();
        circle.setX(35); circle.setY(20); circle.setRadius(4.25);
        output += "\n\nThe new locatoin and radius of circle are\n" + circle;
        output += "\nDiameter is " + twoDigit.format(circle.getDiameter());
        output += "\nCircumference is " + twoDigit.format(circle.getCircumference());
        output += "\nArea is " + twoDigit.format(circle.getArea());
        JOptionPane.showMessageDialog(null, output);
    }
}