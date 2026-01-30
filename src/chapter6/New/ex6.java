package chapter6.New;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex6 {
    JTextArea outputArea;
    int[] num = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};
    public void mainProgram() {
        String output = "Data items in original order\n      ";
        for (int i : num) output += i + "    ";

        bubbleSort(num);
        output += "\n\nData items in original order\n      ";
        for (int i : num) output += i + "    ";

        outputArea = new JTextArea(output);
        JOptionPane.showMessageDialog(null, outputArea);
    }

    public void bubbleSort(int array[]) {
        for (int l = 0; l < array.length; l++) {
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[i + 1])
                    swap(array, i, i + 1);
            }
        }
    }

    public void swap(int[] array, int first, int second) {
        int hold = array[first];
        array[first] = array[second];
        array[second] = hold;
    }

    public static void main(String[] args) {
        new ex6().mainProgram();
    }
}
