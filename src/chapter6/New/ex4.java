package chapter6.New;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex4 {
    public static void main(String[] args) {
        new ex4().mainProgram();
        System.exit(0);
    }

    public void mainProgram() {
        int array[] = { 1, 2, 3, 4, 5};
        String output = "Effects of passing entrie array by reference:\n" + "The values of the original array are:\n";
        for (int i = 0; i < array.length; i++)
            output += String.format("%5d", array[i]);
        modifyArray(array);
        output += "\n\nThe values of the modified array are:\n";
        for (int i = 0; i < array.length; i++)
            output += String.format("%5d", array[i]);
        output += "\n\nEffects of passing array element bby value:\n" + "array[3] before modifyElement: " + array[3];
        modifyElement(array[3]);
        output += "\narray[3] after modifyElement: " + array[3];

        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Passing Array", JOptionPane.INFORMATION_MESSAGE);
    }

    public void modifyArray(int array2[]) {
        for (int i = 0; i < array2.length; i++)
            array2[i] *= 2;
    }

    public void modifyElement(int element) {
        element *= 2;
    }
}
