// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex3 {
//     public static void start() {
//         final int ARRAY_LENGTH = 10; // constant
//         int array[], total = 0;
//         JTextArea outputArea = new JTextArea();
//         array = new int[ARRAY_LENGTH]; // create array


//         // calculate value for each array element
//         for ( int counter = 0; counter < array.length; counter++)
//             array[counter] = 2 + 2 * counter;
        
//         String output = "Index\tValue\n";
//         for ( int counter = 0; counter < array.length; counter++)
//             output += counter + "\t" + array[counter] + "\n";
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Initializing to Even Numbers from 2 to 20", JOptionPane.INFORMATION_MESSAGE);

//         // add each element's value to total
//         for ( int counter = 0; counter < array.length; counter++)
//             total += array[counter];
        
//         JOptionPane.showMessageDialog(null, "Total of array elements: " + total, "Sum the Elements of an Array", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     }

//     public static void main(String[] args) {
//         start();
//     }
// }


package chapter6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex3 {
    public static void start() {
        int array[], total = 0;
        array = new int[10];
        String output = "Index\tValue\n";
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + 2 * i;
            output += i + "\t" + array[i] + "\n";
            total += array[i];
        }
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Initializing to Even Numbers from 2 to 20", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Total of array elements: " + total , "Sum the Elements of an Array", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        start();
    }
}