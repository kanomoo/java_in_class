// package chapter5;

// import javax.swing.JOptionPane;

// public class ex5 {

//     public static void start() {
//         DataClass data = new DataClass();
//         String output = "";

//         data.num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1 :"));
//         data.num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2 :"));
//         output = "Before call method\n";
//         output += "from data.num1 = " + data.num1 + " , data.num2 = " + data.num2 + "\n";
//         JOptionPane.showMessageDialog(null, output);
//         changeValue(data);
//         output = "After call method\n";
//         output += "from data. = " + data.num1 + " , data.num2 = " + data.num2 + "\n";
//         JOptionPane.showMessageDialog(null, output);
//         System.exit(0);
//     }
//     public static void changeValue(DataClass ob) {
//         int temp = ob.num1;
//         ob.num1 = ob.num2;
//         ob.num2 = temp;
//     }
//     public static void main(String[] args) {
//         ex5.start();
//     }
// }

// class DataClass { // class ที่ไม่ได้ประปาศจะเป็น package-private หรือ default ไม่ใช่ private เข้าถึงได้เฉพาะภายใน package เดี่ยวกันเท่านั้น
//     int num1, num2;
// }



package chapter5;

import javax.swing.JOptionPane;

public class ex5 {
    public static void start() {
        DataClass data = new DataClass();
        data.num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1 :"));
        data.num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2 :"));
        JOptionPane.showMessageDialog(null, "Before call method\nfrom data.num1 = " + data.num1 + " ,data.num2 = " + data.num2);
        changeValue(data);
        JOptionPane.showMessageDialog(null, "After call method\nfrom data.num1 = " + data.num1 + " ,data.num2 = " + data.num2);
    }
    public static void changeValue(DataClass obj) {
        int temp = obj.num1;
        obj.num1 = obj.num2;
        obj.num2 = temp;
    }
    public static void main(String[] args) {
        ex5.start();
    }
}

class DataClass {
    int num1, num2;
}