// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex2 {
    
//     public static void start() {
//         // initializer list specifies number of elements and value for elements
//         int array [] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 }; // กำหนดค่าแต่ละ index ไม่ได้แค่สร้าง index เป็น 0

//         String output = "Index\tValue\n";
//         // append each array elment's value to String output
//         for ( int counter = 0; counter < array.length; counter++)
//             output += counter + "\t" + array[counter] + "\n";
        
//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Initializing an Array with a Declaration", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     }

//     public static void main(String[] args) {
//         ex2.start();
//     }
// }

package chapter6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex2 {

    public static void start() {
        int array[] = {32, 27, 64, 18, 96, 14, 90, 70, 60, 37};
        String output = "Index\tValue\n";
        for (int i = 0; i < array.length; i++)
            output += i + "\t" + array[i] + "\n";
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Initializing an Array with a Declaration", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        ex2.start();
    }
}