package chapter7.exercise2;

import javax.swing.JOptionPane;

public class exercise2 {
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        boolean done = true;
        do {
            String choice = JOptionPane.showInputDialog("Program calculate the area and perimeter of rectangle\n 1. Enter wight(" +
            rect.getWight() + ")\n 2. Enter hight(" + rect.getHight() +
            ")\n 3. Calculate area of rectangle\n 4. Calculate perimeter of rectangle\nEnter choice:");
            if (choice != null) {
                switch (choice) {
                    case "1":
                        rect.setWight(Double.parseDouble(JOptionPane.showInputDialog("Enter Wight")));
                        break;
                    case "2":
                        rect.setHight(Double.parseDouble(JOptionPane.showInputDialog("Enter Hight")));
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, "Area Rectangle = " + rect.getArea());
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null, "Area Rectangle = " + rect.getParimeter());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No Choice");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Exit Program.");
                System.exit(0);
            }
        } while (done);
    }
}
