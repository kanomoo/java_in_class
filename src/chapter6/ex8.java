// package chapter6;

// import java.util.Random;

// import javax.swing.JOptionPane;

// public class ex8 {
//     public ex8() {
//         // create array and populate with even integers 0 to 198
//         int array[] = new int[100]; // สร้าง 100 index หรือ subscript
//         Random rnd = new Random();
//         boolean done = true;
//         String result;
//         for (int counter = 0; counter < array.length; counter++)
//             array[counter] = rnd.nextInt(200); // สุ่มเลขตั้งแต่ 0 - 199
//         do {
//             String searchKey = JOptionPane.showInputDialog("Enter number to search(-1 : exit):");
//             if (searchKey.equals("-1"))
//                 done = false;
//             else {
//                 int element = linearSearch(array, Integer.parseInt(searchKey));
//                 // display search result
//                 result = (element != -1) ? "Found value in element " + element : "Vale not found"; // if ternary ถ้าเป็นจริง found ไม่ vale not found
//                 JOptionPane.showMessageDialog(null, result);
//             }
//         } while (done);
//         System.exit(0);
//     }

//     public int linearSearch(int array[], int key) {
//         // loop through array elements
//         for (int counter = 0; counter < array.length; counter ++)
//             if (array[counter] == key)
//                 return counter; // ถ้า key อยู่ใน element return เลข index หรือ element
//         return -1; // key not found
//     } // end method linearSearch

//     public static void main(String[] args) {
//         new ex8();
//     }
// }





package chapter6;

import java.util.Random;
import javax.swing.JOptionPane;

public class ex8 {

    public ex8() {
        int array[] = new int[100];
        Random rnd = new Random();
        boolean done = true;
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = rnd.nextInt(200);
        do {
            int searchKey = Integer.parseInt(JOptionPane.showInputDialog("Enter number to search(-1: exit)"));
            if (searchKey == -1)
                done = false;
            else {
                int key = linearSearch(array, searchKey);
                JOptionPane.showMessageDialog(null, (key != -1) ? "Found value in element " + key : "Value not found" );
            }
        } while (done);
        
        System.exit(0);
    }

    public int linearSearch(int array[], int value) {
        for (int element = 0; element < array.length; element++) {
            if (array[element] == value)
                return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        new ex8();
    }
}