// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex7 {

//     public ex7() {
//         JTextArea outputArea = new JTextArea();
//         int array[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};
//         String output = "Data items in original order\n";

//         // append original array values to String output
//         for ( int counter = 0; counter < array.length; counter++)
//             output += "   " + array[counter];
//         bubbleSort(array); // sort array
//         output += "\n\nData items in ascending order\n";
//         // append sorted\ array values to Sring output
//         for (int counter = 0; counter < array.length; counter++)
//             output += "   " + array[counter];
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Buble Sort", JOptionPane.INFORMATION_MESSAGE);
//     }

//     public void bubbleSort(int array[]) {
//         // loop to control number of passes
//         for (int pass = 1; pass < array.length; pass++) { // เป็นการกำหนดรอบให้ใช้หลักการ bubble ต่อไป   เพราะ bubble รอบเดียวเปรีบเทียบค่าน้อยกว่าหรือมากกว่าไม่ครบคู่ใน arry ควรใช้หลักการ bubble หลายรอบ(ปกติ 2 - 4 รอบ) แต่ใช้ lenth เพื่อความแน่นอนของข้อมูล
//             // loop to control number of comparisons
//             for (int element = 0; element < array.length - 1; element++) { // ใน bubleSort เราเปรียนเทียบเป็นคู่คือ index , index + 1 ถ้าไม่ lenght - 1 ตอนเปรีบเทียบ index จะเกินเพราะเปรีบเทียบเป็นคู่รอบก่อนสุดท้ายเปรียเทียบ index สุดท้ายไปแล้ว
//                 if (array[element] > array[element + 1]) // compare
//                     swap(array, element, element + 1);
//             }
//         }
//     } // end method bubleSort
    
//     //swap two elemtns of an array
//     public void swap(int array[], int first, int second) {
//         int hold = array[first];
//         array[first] = array[second];
//         array[second] = hold;
//     }

//     public static void main(String[] args) {
//         new ex7();
//     }
// }





// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex7 {

//     public ex7() {
//         int array[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};
//         String output = "Data Items in original order\n";
//         for (int i = 0; i < array.length; i++)
//             output += "   " + array[i];
//         output += "\n\nData items in ascending order\n";
//         bubbleSort(array);
//         for (int i = 0; i < array.length; i++)
//             output += "   " + array[i];
//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Bubble Sort", JOptionPane.INFORMATION_MESSAGE);
//     }

//     public void bubbleSort(int array[]) {
//         for (int i = 1; i < array.length; i++) { // เป็นการกำหนดรอบให้ใช้หลักการ bubble ต่อไป   เพราะ bubble รอบเดียวเปรีบเทียบค่าน้อยกว่าหรือมากกว่าไม่ครบคู่ใน arry ควรใช้หลักการ bubble หลายรอบ(ปกติ 2 - 4 รอบ) แต่ใช้ lenth เพื่อความแน่นอนของข้อมูล
//             for (int j = 0; j < array.length - 1; j++) { // ใน bubleSort เราเปรียนเทียบเป็นคู่คือ index , index + 1 ถ้าไม่ lenght - 1 ตอนเปรีบเทียบ index จะเกินเพราะเปรีบเทียบเป็นคู่รอบก่อนสุดท้ายเปรียเทียบ index สุดท้ายไปแล้ว
//                 if (array[j] > array[j + 1])
//                     swap(array, j, j + 1);
//             }
//         }
//     }

//     public void swap(int array[], int first, int second) {
//         int number = array[first];
//         array[first] = array[second];
//         array[second] = number;
//     }

//     public static void main(String[] args) {
//         new ex7();
//     }
// }






// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex7 {

//     public ex7() {
//         int array[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};
//         String output = "Data items in original order\n";
//         for (int i = 0; i < array.length; i++)
//             output += "   " + array[i];
//         output += "\n\nData items in ascending order\n";
//         bubble(array);
//         for (int i = 0; i < array.length; i++)
//             output += "   " + array[i];
//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Bubble Sort", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     }

//     public void bubble(int array[]) {
//         for (int pass = 1; pass < array.length; pass++) {
//             for (int element = 0; element < array.length - 1; element++) {
//                 if (array[element] > array[element + 1])
//                     swap(array, element, element + 1);
//             }
//         }
//     }

//     public void swap(int array[], int first, int second) {
//         int hold = array[first];
//         array[first] = array[second];
//         array[second] = hold;
//     }

//     public static void main(String[] args) {
//         new ex7();
//     }
// }







package chapter6;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex7 {

    public ex7() {
        int array[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};
        String output = "Data items in original order\n";
        for (int i = 0; i < array.length; i++)
            output += "   " + array[i];
        output += "\n\nData items in ascending order\n";
        Arrays.sort(array); // arrays ต้องมี s เป็นการ sort ชุด array
        for (int i = 0; i < array.length; i++)
            output += "   " + array[i];
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "bubble Sort" ,JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        new ex7();
    }
}