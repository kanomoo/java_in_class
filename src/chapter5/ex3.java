// package chapter5;

// import javax.swing.JOptionPane;

// public class ex3 {
//     public static void start() {
//         boolean done = true;
//         String choice = "";
//         String menu = ">>> Main Menu  <<<\n 1. Cal Grade\n";
//         menu += " 2. Change Number\n 3. Exit\nSelect choice : ";
//         do {
//             choice = JOptionPane.showInputDialog(menu);
//             switch (choice) {
//                 case "1": calGrade(); break;
//                 case "2": changeNumber(); break;
//                 case "3": done = false; break;
//                 default: JOptionPane.showMessageDialog(null, "No choice", "Error Message", JOptionPane.ERROR_MESSAGE);
//             }
//         }
//         while (done);
//         JOptionPane.showMessageDialog(null, "Exit Program.");
//     }
//     public static void calGrade() {
//         String scoreStr, grade;
//         int score;
//         scoreStr = JOptionPane.showInputDialog("Enter your score :");
//         score = Integer.parseInt(scoreStr);
//         if (score >= 80) grade = "A";
//         else if (score >= 75) grade = "B+";
//         else if (score >= 70) grade = "B";
//         else if (score >= 65) grade = "C+";
//         else if (score >= 60) grade = "C";
//         else if (score >= 55) grade = "D+";
//         else if (score >= 50) grade = "D";
//         else grade = "F";
//         String output;
//         output = "Score : " + score + ", got grade : " + grade;
//         JOptionPane.showMessageDialog(null, output);
//     }
//     public static void changeNumber() {
//         int num;
//         String numStr, binStr = "", output ="";
//         numStr = JOptionPane.showInputDialog("Enter integer number :");
//         num = Integer.parseInt(numStr);
//         while (num > 0) {
//             int digit = num % 2;
//             binStr = digit + binStr;
//             num = num / 2;
//         }
//         output = "Integer Number : " + numStr + "\nBinary number : " + binStr;
//         JOptionPane.showMessageDialog(null, output);
//     }
//     public static void main(String[] args) {
//         ex3.start();
//     }
// }


// package chapter5;

// import javax.swing.JOptionPane;

// public class ex3 {
//     public void mainProgram() {
//         boolean done = true;
//         do {
//             String choice = JOptionPane.showInputDialog(">>> Main Menu <<<\n1.Cal Grade\n2.Change Number\n3.Exit\nSelect choice:");
//             if (choice != null && choice.length() > 0) {
//                 if (choice.equals("1")) {

//                 } else if (choice.equals("2")) {

//                 } else if (choice.equals("3")) {

//                 } else JOptionPane.showMessageDialog(null, "No choice", "Error Message", JOptionPane.ERROR_MESSAGE);
//             } else {
//                 JOptionPane.showMessageDialog(null, "Exit Program.", "Message", JOptionPane.INFORMATION_MESSAGE);
//                 done = false;
//             }
//         } while (done);
//     }
//     public static void main(String[] args) {
//         ex3 obj = new ex3();
//         obj.mainProgram();
//     }
// }




// package chapter5;

// import javax.swing.JOptionPane;

// public class ex3 {
//     public static void start() {
//         boolean done = true;
//         do {
//             String choice = JOptionPane.showInputDialog(">>> Main Menu  <<<\n 1. Cal Grade\n 2. Change Number\n 3. Exit\nSelect choice :");
//             switch (choice) {
//                 case "1": calGrade(); break;
//                 case "2": calNumber(); break;
//                 case "3": done = false; break;
//                 default: JOptionPane.showMessageDialog(null, "No choice", "Error Message", JOptionPane.ERROR_MESSAGE);
//             }
//         } while (done);
//         JOptionPane.showMessageDialog(null, "Exit Program.");
//     }
//     public static void calGrade(){
//         String numStr = JOptionPane.showInputDialog("Enter your score:");
//         int num = Integer.parseInt(numStr);
//         String grade;
//         if (num >= 80) grade = "A";
//         else if (num >= 75) grade = "B+";
//         else if (num >= 70) grade = "B";
//         else if (num >= 65) grade = "C+";
//         else if (num >= 60) grade = "C";
//         else if (num >= 55) grade = "D+";
//         else if (num >= 50) grade = "D";
//         else grade= "F";
//         JOptionPane.showMessageDialog(null, "Score : " + num + " ,got grade : " + grade);
//     }
//     public static void calNumber() {
//         String numStr = JOptionPane.showInputDialog("Enter integer number :");
//         int num = Integer.parseInt(numStr);
//         String bin = "";
//         while (num > 0) {
//             int digit = num % 2;
//             bin = digit + bin;
//             num /= 2;
//         }
//         JOptionPane.showMessageDialog(null, "Integer Number : " + numStr + "\nBinnary number : " + bin);
//     }
//     public static void main(String[] args) {
//         ex3.start();
//     }
// }





package chapter5;

import javax.swing.JOptionPane;

public class ex3 {
    
    public static void start() {
        boolean done = true;
        do {
            String choice = JOptionPane.showInputDialog(">>> Main Menu  <<<\n 1. Cal Grade\n 2. Change Number\n 3. Exit\nSelect choice:");
            switch (choice) {
                case "1": calGrade(); break;
                case "2": calNumber(); break;
                case "3": done = false; break;
                case null: done = false; break; // ใช้ null กัน error ตอนกดปุ่มปิด
                default: JOptionPane.showMessageDialog(null, "No choice", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        } while (done);
        JOptionPane.showMessageDialog(null, "Exit Program.");
    }
    public static void calGrade() {
        String numStr = JOptionPane.showInputDialog("Enter your score:");
        String grade;
        if (numStr != null && numStr.length() > 0) {
            int score = Integer.parseInt(numStr);
            if (score >= 80) grade = "A";
            else if (score >= 75) grade = "B+";
            else if (score >= 70) grade = "B";
            else if (score >= 65) grade = "C+";
            else if (score >= 60) grade = "C";
            else if (score >= 55) grade = "D+";
            else if (score >= 50) grade = "D";
            else grade = "F";
            JOptionPane.showMessageDialog(null, "Score : " + score + " , got grade : " + grade);
        } else JOptionPane.showMessageDialog(null, "No Input", "Error Message", JOptionPane.ERROR_MESSAGE);
    }
    public static void calNumber() {
        String numStr = JOptionPane.showInputDialog("Enter integer number :");
        if (numStr != null && numStr.length() > 0) {
            int num = Integer.parseInt(numStr);
            String bin = "";
            while (num > 0) {
                int digit = num % 2;
                bin = digit + bin; // เอาค่ามาบวกไว้ด้านหน้าค่าเก่า
                num /= 2;
            }
            JOptionPane.showMessageDialog(null, "IInteger Number : " + numStr + "\nBinnary number : " + bin);
        } else JOptionPane.showMessageDialog(null, "No Input", "Error Message", JOptionPane.ERROR_MESSAGE);
    }
    public static void main(String[] args) {
        ex3.start(); // method ทั้งหมดเป็น static ใช้ start() ได้เลย แต่เรียก class ไว้กัน error
    }
}