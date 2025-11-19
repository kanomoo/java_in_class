// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex1 {

//     public ex1() {
//         int array[]; // declare reference to an array
//         array = new int[ 10 ]; // create array // การสร้าง array 10 index (0 - 9) ค่า value default หรือ 0
//         String output = "Index\tValue\n";
//         // append each array element's value to String output
//         for (int counter = 0; counter < array.length; counter++)
//             output += counter + "\t" + array[ counter ] + "\n";
//         JTextArea outpuTextArea = new JTextArea();
//         outpuTextArea.setText(output);
//         JOptionPane.showMessageDialog(null, outpuTextArea, "Initializing an Array of int Values", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     }

//     public static void main(String[] args) {
//         new ex1();
//     }
// }


package chapter6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex1 {

    public ex1() {
        int array[] = new int[10]; 
        String output = "Index\tValue\n";
        for (int i = 0; i < array.length; i++)
            output += i + "\t" + array[i] + "\n";
        JTextArea outpuTextArea = new JTextArea();
        outpuTextArea.setText(output);
        JOptionPane.showMessageDialog(null, outpuTextArea, "Initializing an Array of int Values", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        new ex1();
    }
}