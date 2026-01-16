// package chapter5.New;

// import javax.swing.JOptionPane;

// public class ex8 {
    
//     public static void main(String[] args) {
//         String firstStr, secondStr;
//         int num1, num2, sum;
//         firstStr = JOptionPane.showInputDialog("Enter first integer : ");
//         secondStr = JOptionPane.showInputDialog("Enter seond integer : ");
//         num1 = Integer.parseInt(firstStr);
//         num2 = Integer.parseInt(secondStr);
//         sum = num1 + num2;
//         String output = "The sum of " + num1 + " + " + num2 + " is " + sum;
//         JOptionPane.showMessageDialog(null, output, "Results", JOptionPane.PLAIN_MESSAGE);
//         System.exit(0);
//     }
// }


package chapter5.New;

import javax.swing.JOptionPane;

public class ex8 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer :"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer :"));
        JOptionPane.showMessageDialog(null, "The sum of " + num1 + " + " + num2 + " is " + (num1 + num2), "Message", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}