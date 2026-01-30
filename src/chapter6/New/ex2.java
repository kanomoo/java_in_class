package chapter6.New;

import java.util.Random;

import javax.swing.JOptionPane;

public class ex2 {

    public static void main(String[] args) {
        ex2.start();
        System.exit(0);
    }

    public static void start() {
        final int ARRAY_LEN = 10;
        int array[] = new int[ARRAY_LEN];
        int total = 0;
        Random rnd = new Random();
        for (int index = 0; index < array.length; index++)
            array[index] = 10 + rnd.nextInt(21);
        String output = "Index\tValue\n";
        for (int i = 0; i < array.length; i++)
            output += String.format("%5d%7d", i, array[i]) + "\n";
        for (int index = 0; index < array.length; index++)
            total += array[index];
        output += "Total value of array : " + total + "\n";
        output += "Average value : " + String.format("%7.2f", (double) total / array.length);
        JOptionPane.showMessageDialog(null, output, "Value in Array", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}





// package chapter6.New;

// import java.util.Random;

// import javax.swing.JOptionPane;

// public class ex2 {

//     public ex2() {
//         int value[] = new int[10];
//         Random rnd = new Random();
//         String output = "IndexValue\n";
//         int total = 0;
//         for (int i = 0; i < value.length; i++) {
//             value[i] = 10 + rnd.nextInt(21);
//             output += String.format("%5d%7d", i, value[i]) + "\n";
//             total += value[i];
//         }
//         output += "Total value of array : " + total + String.format("\nAverage value : %7.2f" , (double)total / value.length);
//         JOptionPane.showMessageDialog(null, output);
//     }

//     public static void main(String[] args) {
//         new ex2();
//     }
// }
