// package chapter5.New;

// import javax.swing.JOptionPane;

// public class ex9 {
    
//     public static void main(String[] args) {
//         String inputStr;
//         inputStr = JOptionPane.showInputDialog("Enter stirng :");
//         if (inputStr != null) {
//             if (!inputStr.isEmpty()) {
//                 JOptionPane.showMessageDialog(null, "User enter " + inputStr , "Message", JOptionPane.INFORMATION_MESSAGE);
//             } else {
//                 JOptionPane.showMessageDialog(null, "Object is emptry string", "message", JOptionPane.WARNING_MESSAGE);
//             }
//         } else {
//             JOptionPane.showMessageDialog(null, "No creste object string", "Message", JOptionPane.ERROR_MESSAGE);
//         }
//         System.exit(0);
//     }
// }



package chapter5.New;

import javax.swing.JOptionPane;

public class ex9 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter string :");
        if (name == null) JOptionPane.showMessageDialog(null, "No creste object string", "Message", JOptionPane.ERROR_MESSAGE);
        else if (name.isEmpty()) JOptionPane.showMessageDialog(null, "Object is emptry string", "Message", JOptionPane.WARNING_MESSAGE);
        else JOptionPane.showMessageDialog(null, "User enter java");
    }
}