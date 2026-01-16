// package chapter5;

// import javax.swing.JOptionPane;

// public class ex10 {
    
//     public ex10() {
//         int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer number #1:"));
//         int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer number #2:"));
//         int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer number #3:"));
//         int num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer number #4:"));
//         int num5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Integer number #5:"));
//         String output = "Number input : " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + "\nMinimum value = " + minimum(num1, num2, num3, num4, num5) + "\nMaximum value = " + maximum(num1, num2, num3, num4, num5);
//         JOptionPane.showMessageDialog(null, output);
//     }

//     public int minimum(int n1, int n2, int n3, int n4, int n5) {
//         int min = Math.min(n1, n2);
//         min = Math.min(min, n3);
//         min = Math.min(min, n4);
//         min = Math.min(min, n5);
//         return min;
//     }

//     public int maximum(int n1, int n2, int n3, int n4, int n5) {
//         int max = Math.max(n1, n2);
//         max = Math.max(max, n3);
//         max = Math.max(max, n4);
//         max = Math.max(max, n5);
//         return max;
//     }

//     public static void main(String[] args) {
//         new ex10();
//     }
// }







// package chapter5;

// import javax.swing.JOptionPane;

// public class ex10 {
    
//     public ex10() {
//         String input1 = JOptionPane.showInputDialog(null, "Enter Integer number #1:");
//         if (input1 == null) {
//             return;
//         }
//         int num1;
//         try {
//             num1 = Integer.parseInt(input1);
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(null, "Invalid integer for number #1.");
//             return;
//         }

//         String input2 = JOptionPane.showInputDialog(null, "Enter Integer number #2:");
//         if (input2 == null) {
//             return;
//         }
//         int num2;
//         try {
//             num2 = Integer.parseInt(input2);
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(null, "Invalid integer for number #2.");
//             return;
//         }

//         String input3 = JOptionPane.showInputDialog(null, "Enter Integer number #3:");
//         if (input3 == null) {
//             return;
//         }
//         int num3;
//         try {
//             num3 = Integer.parseInt(input3);
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(null, "Invalid integer for number #3.");
//             return;
//         }

//         String input4 = JOptionPane.showInputDialog(null, "Enter Integer number #4:");
//         if (input4 == null) {
//             return;
//         }
//         int num4;
//         try {
//             num4 = Integer.parseInt(input4);
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(null, "Invalid integer for number #4.");
//             return;
//         }

//         String input5 = JOptionPane.showInputDialog(null, "Enter Integer number #5:");
//         if (input5 == null) {
//             return;
//         }
//         int num5;
//         try {
//             num5 = Integer.parseInt(input5);
//         } catch (NumberFormatException e) {
//             JOptionPane.showMessageDialog(null, "Invalid integer for number #5.");
//             return;
//         }
//         String output = "Number input : " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + "\nMinimum value = " + minimum(num1, num2, num3, num4, num5) + "\nMaximum value = " + maximum(num1, num2, num3, num4, num5);
//         JOptionPane.showMessageDialog(null, output);
//     }

//     private int readInt(String message) {
//         while (true) {
//             String input = JOptionPane.showInputDialog(null, message);
//             if (input == null) {
//                 JOptionPane.showMessageDialog(null, "Input cancelled. Exiting.");
//                 System.exit(0);
//             }
//             input = input.trim();
//             if (input.isEmpty()) {
//                 JOptionPane.showMessageDialog(null, "Please enter a valid integer value.");
//                 continue;
//             }
//             try {
//                 return Integer.parseInt(input);
//             } catch (NumberFormatException e) {
//                 JOptionPane.showMessageDialog(null, "Invalid number format. Please enter a valid integer value.");
//             }
//         }
//     }
//     public int minimum(int n1, int n2, int n3, int n4, int n5) {
//         int min = Math.min(n1, n2);
//         min = Math.min(min, n3);
//         min = Math.min(min, n4);
//         min = Math.min(min, n5);
//         return min;
//     }

//     public int maximum(int n1, int n2, int n3, int n4, int n5) {
//         int max = Math.max(n1, n2);
//         max = Math.max(max, n3);
//         max = Math.max(max, n4);
//         max = Math.max(max, n5);
//         return max;
//     }

//     public static void main(String[] args) {
//         new ex10();
//     }
// }







package chapter5;

import javax.swing.JOptionPane;

public class ex10 {

    public static void main(String[] args) {
        String output = "Number input : ";
        int min = 0 , max = 0;
        for (int i = 1; i <= 5; i++) {
            String numStr = JOptionPane.showInputDialog("Enter integer number #" + i + " :");
            if (i == 1) min = max = Integer.parseInt(numStr);
            if (numStr == null) JOptionPane.showMessageDialog(null, "No creste object number", "Message", JOptionPane.ERROR_MESSAGE);
            else if (numStr.isEmpty()) JOptionPane.showMessageDialog(null, "Number is emptry", "Message", JOptionPane.WARNING_MESSAGE);
            else if (numStr.equals("-1")) break;
            else {
                int num = Integer.parseInt(numStr);
                output += num + " ";
                max = Math.max(num, max); min = Math.min(num, min);
            }
        }
        output += "\nMinimum value = " + min + "\nMaximum value = " + max;
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }
}