// package chapter10;

// import javax.swing.JOptionPane;

// public class PointText {
//     public static void main(String[] args) {
//         Point point = new Point(72, 115); // creat Point object

//         // get point coordinates
//         String output = "X coordinate is " + point.getX() +
//             "\nY coordinate is " + point.getY();
        
//         point.setX(10); // set x-coordinate
//         point.setY(20); // set y-coordinate
//         // get String representation of new point value
//         output += "\n\nThe new location of point is " + point; // Java เรียก toString() อัตโนมัติทุกครั้งที่พิมพ์ object
//         JOptionPane.showMessageDialog(null, output); // display output
//         System.exit(0);
//     }
// }


package chapter10;

import javax.swing.JOptionPane;

public class PointText {

    public static void main(String[] args) {
        Point point = new Point(72, 115);
        String output;
        output = "X coordinate is " + point.getX() + "\nY coordinate is " + point.getY() + "\n\n";
        point.setX(10);
        point.setY(20);
        output += "The new locatoin of point is " + point;
        JOptionPane.showMessageDialog(null, output);

    }
}