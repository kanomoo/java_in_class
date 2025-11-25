package chapter7.exercise1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class exercise1 {
    
    public static void main(String[] args) {
        boolean done = true;
        Circle cir = new Circle();
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        do {
            String choice = JOptionPane.showInputDialog("Program caluculate the area and perimeter of a circle\n 1. Enter Radius (" + cir.getCirRadius() +
            ")\n 2. Calculate area of circle\n 3. Calculate perimeter of circle\n Enter choice:");
            if (choice != null) { //  && choice.length() > 0
                switch (choice) {
                    case "1":
                        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius"));
                        cir.setCirRadius(radius);
                        break;
                    case "2":
                        JOptionPane.showMessageDialog(null, "Area Circle = " + twoDigits.format(cir.CalArea()));
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, "Perimeter Circle = " + twoDigits.format(cir.CalParimeter()));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No choice");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Exit Program");
                System.exit(0);
            }
        } while(done);
    }
}
