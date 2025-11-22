// package chapter6;

// import java.util.Random;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex4 {
//     public void showHistogram() {
//         int array[] = { 19, 3, 15, 7, 9, 13, 5, 17, 1};
//         String output = "Element\tValue\tHistogram";
//         // for each array element, output a bar in histogram
//         for (int counter = 0; counter < array.length; counter++) {
//             output += "\n" + counter + "\t" + array[counter] + "\t";
//             // prin bar of asterisks
//             for (int start = 0; start < array[counter]; start++)
//                 output += "*";
//         } // end outer for
//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Histogram Printing Program", JOptionPane.INFORMATION_MESSAGE);
//         // System.exit(0);
//     } // end showHistogram

//     public void countFrequency() {
//         int frequency[] = new int[7];
//         int data[] = new int[6000];
//         Random rnd = new Random();
//         // roll die 6000 times; use dile value as frequency index
//         for (int roll = 0; roll < 6000; roll++) {
//             data[roll] = 1 + rnd.nextInt(6);
//             frequency[data[roll]]++; // count frequency
//         }
//         String output = "Face\tFrequency";
//         // append frequencies to String output
//         for (int face = 1; face < frequency.length; face++)
//             output += "\n" + face + "\t" + frequency[face];
//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Rolling a die 6000 Times", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     }

//     public static void main(String[] args) {
//         ex4 obj = new ex4();
//         obj.showHistogram();
//         obj.countFrequency();
//     }
// }




// package chapter6;

// import java.util.Random;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex4 {
//     public void showHistogram() {
//         int array[] = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};
//         String output = "Element\tValue\tHistogram\n";
//         for (int i = 0; i < array.length; i++)
//             output += i + "\t" + array[i] + "\t" + "*".repeat(array[i]) + "\n"; // ใช้ repeat ทำซ้ำข้อความได้
//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Histogram Printing Program", JOptionPane.INFORMATION_MESSAGE);
//     }

//     public void countFrequency() {
//         int data[] = new int[7]; // กำหนด index (0 - 6)
//         int frequency[] = new int[6000]; // เก็บการสุ่ม 1 - 6 ไว้ในนี้
//         Random rnd = new Random();
//         for (int i = 0; i < frequency.length; i++) {
//             frequency[i] = 1 + rnd.nextInt(6); // สุ่มค่า 1 - 6 ค่าที่สุ่มได้ตามจริงคือ 1.001 - 6.999 แต่เป็น int เสีย digit    ถ้าไม่บวก 1 จะสุ่มได้ 0.001 - 5.999   ค่าที่ใส่ใน () จะลบ 1 เสมอเพราะเป็นการกำหนดค่าสิ้นสุดไม่สามารถสุ่มถึงได้
//             data[frequency[i]]++; // default แต่ละ index เป็น 0 ใช้ ++ ได้
//         }
//         String output = "Face\tFrequency\n";
//         for (int i = 1; i < data.length; i++)
//             output += i + "\t" + data[i] + "\n"; // ใช้ index เป็น vale ที่ roll ได้จึงไม่ได้ใช้ index ที่ 0
//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Rolling a Die 6000 Times", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     }
//     public static void main(String[] args) {
//         ex4 obj = new ex4();
//         obj.showHistogram();
//         obj.countFrequency();
//     }
// }




package chapter6;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex4 {

    public void Histogram() {
        int array[] = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};
        String output = "Element\tValue\tHistogram\n";
        for (int i = 0; i < array.length; i++)
            output += i + "\t" + array[i] + "\t" + "*".repeat(array[i]) + "\n";
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Histogram Printing Program", JOptionPane.INFORMATION_MESSAGE);
    }

    public void countRoll() {
        int data[] = new int[7];
        Random rnd = new Random();
        String output = "Face\tFrequency\n";
        for (int i = 0; i < 6000; i++)
            data[(int) 1 + rnd.nextInt(6)]++;
        for (int i = 1; i < data.length; i++)
            output += i + "\t" + data[i] + "\n";
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Rolling a Die 6000 Times", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        ex4 obj = new ex4();
        obj.Histogram();
        obj.countRoll();
    }
}