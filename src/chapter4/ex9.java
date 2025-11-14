// package chapter4;

// import javax.swing.JOptionPane;

// public class ex9 {
//     public static void main(String[] args) {
//         String inpuStr;
//         inpuStr = JOptionPane.showInputDialog("Enter string : ");
//         if (inpuStr != null) {
//             if (!inpuStr.isEmpty()) {
//                 JOptionPane.showMessageDialog(null, "User enter " + inpuStr, "Message", JOptionPane.INFORMATION_MESSAGE);
//             } else {
//                 JOptionPane.showMessageDialog(null, "Object is emptry string", "Message", JOptionPane.WARNING_MESSAGE);
//             }
//         } else { // is null
//             JOptionPane.showMessageDialog(null, "No creste object string", "Message", JOptionPane.ERROR_MESSAGE);
//         }
//         System.exit(0);
//     }
// }


package chapter4;

import javax.swing.JOptionPane;

public class ex9 {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Enter string:");
        if (str != null) { // กรอกค่า
            if (!str.isEmpty()) {  // กรอกค่าไม่ว่างเปล่า
                JOptionPane.showMessageDialog(null, "User enter " + str, "Message", JOptionPane.INFORMATION_MESSAGE);
            } else { // กด okay ไม่กรอกค่า value = ""
                JOptionPane.showMessageDialog(null, "Object is emptry string", "Message", JOptionPane.WARNING_MESSAGE);
            }
        } else { // ไม่ได้กด ok value = null
            JOptionPane.showMessageDialog(null, "No creste object string", "Message", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}