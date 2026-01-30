package chapter6.New;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex3 {

    public static void main(String[] args) {
        new ex3().start();
    }

    public void start() {
        String menu = " 1. Show Hisstogram\n 2. Count Frequency\n 3. Exnt\nEnter Choice :";
        do {
            String choice = JOptionPane.showInputDialog(menu);
            if (choice.equals("1")) showHistogram();
            else if (choice.equals("2")) countFrequency();
            else if (choice.equals("3")) break;
            else JOptionPane.showMessageDialog(null, "No choice.!", "Error Message", JOptionPane.ERROR_MESSAGE);
        } while (true);
        System.exit(0);
    }

    public void showHistogram() {
        int array[] = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};
        String output = "Element\tValue\tHistogram";
        for (int i = 0; i < array.length; i++) {
            output += "\n" + i + "\t" + array[i] + "\t";
            for (int star = 0; star < array[i]; star++)
                output += "*";
        }
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea,"Histogram Printing Program", JOptionPane.INFORMATION_MESSAGE);
    }

    public void countFrequency() {
        int frequency[] = new int[6];
        int datas[] = new int[1000];
        Random rnd = new Random();
        for (int roll = 0; roll < datas.length; roll++) {
            datas[roll] = 1 + rnd.nextInt(6);
            if (datas[roll] == 1) frequency[0]++;
            else if (datas[roll] == 2) frequency[1]++;
            else if (datas[roll] == 3) frequency[2]++;
            else if (datas[roll] == 4) frequency[3]++;
            else if (datas[roll] == 5) frequency[4]++;
            else if (datas[roll] == 6) frequency[5]++;
        }
        String output = "Face\tFrequency";
        for (int face = 0; face < frequency.length; face++)
            output += "\n" + (face + 1) + "\t" + frequency[face];
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Rolling a Die 1000 Times", JOptionPane.INFORMATION_MESSAGE);
    }
}






// package chapter6.New;

// import java.util.Random;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex3 {
//     JTextArea outputArea;
//     Random rnd = new Random();

//     public void startMenu() {
//         while (true) {
//             String output = " 1. Show Histogram\n 2. Count Frequency\n 3. Exit\nEnter Choice :";
//             String choice = JOptionPane.showInputDialog(output);
//             if (choice == null) {
//                 JOptionPane.showMessageDialog(null, "Exit Program..");
//                 System.exit(0);
//             } else if (choice.isEmpty()) {
//                 JOptionPane.showMessageDialog(null, "Cancel");
//                 System.exit(0);
//             }
//             switch (choice) {
//                 case "1" -> showHistogram();
//                 case "2" -> countFrequency();
//                 case "3" -> System.exit(0);
//                 default -> {
//                 }
//             }
//         }
//     }

//     public void showHistogram() {
//         int[] value = new int[10];
//         String histogram[] = new String[10], output = "Element\tValue\tHistogram";
//         for (int i = 0; i < 10; i++)
//             histogram[i] = "";
//         for (int i = 0; i < 100; i++) {
//             int num = rnd.nextInt(10);
//             value[num]++;
//             histogram[num] += "*";
//         }
//         for (int i = 0; i < value.length; i++)
//             output += "\n" + i + "\t" + value[i] + "\t" + histogram[i];
//         outputArea = new JTextArea(output);
//         outputArea.setEditable(false);
//         JOptionPane.showMessageDialog(null, outputArea, "Histogram Printing Program", JOptionPane.INFORMATION_MESSAGE);
//     }

//     public void countFrequency() {
//         int[] value = new int[6];
//         String output = "Face\tFrequency";
//         for (int i = 0; i < 1000; i++) {
//             int num = rnd.nextInt(6);
//             value[num]++;
//         }
//         for (int i = 0; i < value.length; i++) {
//             output += "\n" + (i + 1) + "\t" + value[i];
//         }
//         outputArea = new JTextArea(output);
//         outputArea.setEditable(false);
//         JOptionPane.showMessageDialog(null, outputArea, "Rolling a Die 1000 Times", JOptionPane.INFORMATION_MESSAGE);
//     }

//     public static void main(String[] args) {
//         new ex3().startMenu();
//     }
// }
