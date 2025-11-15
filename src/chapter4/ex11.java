// package chapter4;

// import javax.swing.JOptionPane;

// public class ex11 {
//     public static void main(String[] args) {
//         String choieStr, strMenu;
//         boolean done = true;
//         strMenu = ">> Main Menu <<\n 1. Random Integer Number(1 - 1000)\n";
//         strMenu += " 2. Check Prime Number\n 3. Convert Number Decimal to Binary\n";
//         strMenu += " 4. Exit\nEnter choice : ";
//         do {
//             choieStr = JOptionPane.showInputDialog(strMenu);
//             if (choieStr != null && choieStr.length() > 0) {
//                 if (choieStr.equals("1")) {
//                     JOptionPane.showMessageDialog(null, "Select choice 1", "Message", JOptionPane.INFORMATION_MESSAGE);
//                 } else if (choieStr.equals("2")) {
//                     JOptionPane.showMessageDialog(null, "Select choice 2", "Message", JOptionPane.INFORMATION_MESSAGE);
//                 } else if (choieStr.equals("3")) {
//                     JOptionPane.showMessageDialog(null, "Select choice 3", "Message", JOptionPane.INFORMATION_MESSAGE);
//                 } else if (choieStr.equals("4")) {
//                     done = false;
//                 } else {
//                     JOptionPane.showMessageDialog(null, "No this choice", "Message", JOptionPane.ERROR_MESSAGE);
//                 }
//             } else done = false;
//         } while (done);
//         JOptionPane.showMessageDialog(null, "Exit Program!", "Message", JOptionPane.INFORMATION_MESSAGE);
//     }
// }





// package chapter4;

// import java.util.Random;
// import javax.swing.JOptionPane;

// public class ex11 {
//     public static void main(String[] args) {
//         Random rnd = new Random();
//         String strMenu = ">> Main Menu <<\n 1. Random Integer Number(1 - 1000)\n 2. Check Prime Number\n 3. Convert Number Decimal to Binary\n 4. Exit\nEnter choice:";
//         String inputStr;
//         boolean done = true;
//         do{
//             inputStr = JOptionPane.showInputDialog(strMenu);
//             if (inputStr != null) {
//                 if (inputStr.equals("1")) JOptionPane.showMessageDialog(null, "Random Integer Number : " + String.valueOf(rnd.nextInt(1001)), "Message", JOptionPane.INFORMATION_MESSAGE);
//                 else if (inputStr.equals("2")) {
//                     String numStr = JOptionPane.showInputDialog("Enter Number : ");
//                     int num = Integer.parseInt(numStr);
//                     String prime = "Prime Number";
//                     for (int i = 2; i <= num / 2; i++) {
//                         if (num % i == 0) {
//                             prime = "Not Prime Number";
//                             break;
//                         }
//                     }
//                     JOptionPane.showMessageDialog(null, "Number is " + prime, "Message", JOptionPane.INFORMATION_MESSAGE);
//                 } else if (inputStr.equals("3")) {
//                     String numStr = JOptionPane.showInputDialog("Enter Number : ");
//                     int num = Integer.parseInt(numStr);
//                     String bin = "";
//                     String bin_re = "";
//                     while (num > 0) {
//                         bin += num % 2;
//                         num = num / 2;
//                     }
//                     for (int i = bin.length() - 1; i >= 0; i--) bin_re += bin.charAt(i);
//                     if (bin_re.isEmpty()) bin_re = "0";
//                     JOptionPane.showMessageDialog(null, "Binary is " + bin_re, "Message", JOptionPane.INFORMATION_MESSAGE);
//                 } else if (inputStr.equals("4")) done = false;
//             } else done = false;
//         } while (done);
//         JOptionPane.showMessageDialog(null, "Exit Program.", "Message", JOptionPane.INFORMATION_MESSAGE);
//     }
// }



package chapter4;

import java.util.Random;
import javax.swing.JOptionPane;

public class ex11 {
    public static void main(String[] args) {
        Random rnd = new Random();
        String choieStr, strMenu;
        boolean done = true;
        strMenu = ">> Main Menu <<\n 1. Random Integer Number(1 - 1000)\n";
        strMenu += " 2. Check Prime Number\n 3. Convert Number Decimal to Binary\n";
        strMenu += " 4. Exit\nEnter choice : ";
        do {
            choieStr = JOptionPane.showInputDialog(strMenu);
            if (choieStr != null && choieStr.length() > 0) {
                if (choieStr.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Select choice 1", "Message", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Random Integer Number : " + String.valueOf(rnd.nextInt(1001)), "Message", JOptionPane.INFORMATION_MESSAGE);
                } else if (choieStr.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Select choice 2", "Message", JOptionPane.INFORMATION_MESSAGE);
                    String numStr = JOptionPane.showInputDialog("Enter number :");
                    if (numStr != null && numStr.length() > 0) {
                        int num = Integer.parseInt(numStr);
                        String prime = "is Prime Number";
                        for (int i = 2; i < num / 2; i++) {
                            if (num % i == 0) prime = "is Not Prime Number";
                            break;
                        }
                        JOptionPane.showMessageDialog(null, numStr + " " + prime, "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else JOptionPane.showMessageDialog(null, "Input is emptry", "Message", JOptionPane.WARNING_MESSAGE);
                } else if (choieStr.equals("3")) {
                    JOptionPane.showMessageDialog(null, "Select choice 3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    String numStr = JOptionPane.showInputDialog("Enter number :");
                    if (numStr != null && numStr.length() > 0) {
                    String bin = "", bin_re = "";
                        int num = Integer.parseInt(numStr);
                        while (num > 0) {
                            bin += num % 2;
                            num /= 2;
                        }
                        for (int i = bin.length() - 1; i >= 0; i--) {
                            bin_re += bin.charAt(i);
                        }
                        JOptionPane.showMessageDialog(null, "Decimal Number " + numStr + " is Binary Number : " + bin_re, "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else JOptionPane.showMessageDialog(null, "Input is emptry", "Message", JOptionPane.WARNING_MESSAGE);
                } else if (choieStr.equals("4")) {
                    done = false;
                } else {
                    JOptionPane.showMessageDialog(null, "No this choice", "Message", JOptionPane.ERROR_MESSAGE);
                }
            } else done = false;
        } while (done);
        JOptionPane.showMessageDialog(null, "Exit Program!", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}