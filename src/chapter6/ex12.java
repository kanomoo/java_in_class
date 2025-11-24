// package chapter6;

// import java.util.Random;
// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex12 {
    
//     public ex12() {
//         int [] datas = new int[20];
//         Random rnd = new Random();
//         String output = "";

//         for(int n = 0; n < datas.length; n++)
//             datas[n] = rnd.nextInt(100);
//         output += "Datas use indexed:\n";
//         for(int n = 0; n < datas.length; n++)
//             output += datas[n] + ", ";
//         output += "\n\nDatas use for-each:\n";
//         for (int data : datas) { // กำหนดชื่อตามด้วย array name : name array
//             output += data + ", ";
//         }

//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null , outputArea);
//         System.exit(0);
//     }

//     public static void main(String[] args) {
//         new ex12();
//     }
// }


package chapter6;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex12 {

    public ex12() {
        String output = "Datas use indexed: \n";
        int array[] = new int[20];
        Random rnd = new Random();
        JTextArea outputArea = new JTextArea();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
            output += array[i] + ((i < array.length - 1) ? ", " : "  ");
        }
        output += "\n\nDatas use for-each: \n";
        for (int data : array)
            output += data + ", ";
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea);
        System.exit(0);
    }

    public static void main(String[] args) {
        new ex12();
    }
}