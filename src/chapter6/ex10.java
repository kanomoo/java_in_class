// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex10 {
//     JTextArea outputArea; // เปิดไว้ด้านนอกเพราะ method อื่นต้องเพิ่มค่าแสดงผล ไว้ใน method เดียวไม่ได้
//     public ex10() {
//         outputArea = new JTextArea();
//         int array1[][] = {{1, 2, 3, 4}, {4, 5, 6, 7}}; // 2 dimensional array 2 row 4 columns  array 2 by 2
//         int array2[][] = {{1, 2,}, {3, 4, 5}, {4, 5, 6, 7}, {5}};

//         outputArea.setText("Values in array1 by row are\n");
//         buildOutput(array1);
//         outputArea.append("\nValues in array2 by row are\n"); // ถ้า setText ไปแล้ว ต้อง ใช้ append
//         buildOutput(array2);
//         JOptionPane.showMessageDialog(null, outputArea, "Array 2-D", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     }

//     // append rows and columns of an array to outputArea
//     public void buildOutput( int array[][]) {
//         // loop through array's rows
//         for (int row = 0; row < array.length; row++) {
//             // loop through cloumns of current row
//             for (int columns = 0; columns < array[row].length; columns++)
//                 outputArea.append(array[row][columns] + "  ");
//             outputArea.append("\n");
//         }
//     } // end method buildOutput

//     public static void main(String[] args) {
//         new ex10();
//     }
// }






// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex10 {

//     JTextArea outputArea;
//     public ex10() {
//         outputArea = new JTextArea();
//         int array1[][] = {{1, 2, 3, 4}, {4, 5, 6, 7}};
//         int array2[][] = {{1, 2}, {3, 4, 5}, {4, 5, 6, 7}, {5}};

//         outputArea.setText("Values in array1 by row are\n");
//         buildOutput(array1);
//         outputArea.append("\nValues in array2 by row are\n");
//         buildOutput(array2);
//         JOptionPane.showMessageDialog(null, outputArea, "Array 2-D", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     }

//     public void buildOutput(int array[][]) {
//         for (int row = 0; row < array.length; row++) {
//             for (int column = 0; column < array[row].length; column++)
//                 outputArea.append(array[row][column] + "  ");
//             outputArea.append("\n");
//         }
//     }

//     public static void main(String[] args) {
//         new ex10();
//     }
// }










package chapter6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex10 {
    JTextArea outputArea;
    public ex10() {
        outputArea = new JTextArea();
        int array1[][] = {{1, 2, 3, 4}, {4, 5, 6, 7}};
        int array2[][] = {{1, 2}, {3, 4, 5}, {4, 5, 6, 7}, {5}};
        outputArea.setText("Values in array1 by row are\n");
        buildOutput(array1);
        outputArea.append("\nValues in array2 by are\n");
        buildOutput(array2);
        JOptionPane.showMessageDialog(null, outputArea, "Array 2-D" , JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public void buildOutput(int array[][]) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++)
                outputArea.append(array[row][column] + "  ");
            outputArea.append("\n");
        }
    }

    public static void main(String[] args) {
        new ex10();
    }
}