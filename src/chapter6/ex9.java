// package chapter6;

// import java.text.DecimalFormat;
// import java.util.Random;
// import javax.swing.JOptionPane;

// public class ex9 {
//     String display = "";
//     public ex9() {
//         int array[] = new int[30];
//         Random rnd = new Random();
//         boolean done = true;
//         String result, searchKey;
        
//         for (int counter = 0; counter < array.length; counter++)
//             array[counter] = rnd.nextInt(100);
//         bubbleSort(array);
//         do {
//             searchKey = JOptionPane.showInputDialog("Enter number to earch(-1 : exit): ");
//             if (searchKey.equals("-1"))
//                 done = false;
//             else {
//                 // initialize display string for new search
//                 display = "Protions of array searched\n";
//                 // perform binary search
//                 int element = binarySearch(array, Integer.parseInt(searchKey));
//                 // display search result
//                 result = (element != -1) ? "Found value in element " + element : "Value not found";
//                 display += result;
//                 JOptionPane.showMessageDialog(null, display);
//             }
//         } while (done);
//         System.exit(0);
//     }
//     // method to perform binary search of an array
//     public int binarySearch(int array[], int key) {
//         int low = 0;                 // low element index
//         int high = array.length - 1; // high element index
//         int middle;                  // middle element index
//         // loop until how inddex is greater than high index
//         while (low <= high) {
//             middle = (low + high) / 2; // determine middle index
//             buildOutput(array, low, middle, high);
//             // if key matches middle element, return middle location
//             if ( key == array[middle])
//                 return middle;
//             // if key less than middle element, set new high element
//             else if (key < array[middle])
//                 high = middle - 1;
//             // key greater than middle element , set new low element
//             else
//                 low = middle + 1;
//         } // end while
//         return -1; // key not found
//     } // end method binarySearch
//     // build row of output showing subset of array elements
//     // currently being processed
//     void buildOutput(int array[], int low, int middle, int high) {
//         DecimalFormat twodigits = new DecimalFormat("00");
//         // loop through array elements
//         for (int counter = 0; counter < array.length; counter++) {
//             // if counter outside current array subset, append
//             // padding spaces to String display
//             if ( counter < low || counter > high)
//                 display += "    ";
//             // if middle element, append element to String display
//             // followed by asterisk (*) to indicate middle element
//             else if (counter == middle)
//                 display += twodigits.format(array[counter]) + "* ";
//             else // append element to String display
//                 display += twodigits.format(array[counter]) + "  ";
//         } // end for
//         display += "\n";;
//     } // end method buildOutput

//     // sort elements of array with buble sort
//     public void bubbleSort(int array[]) {
//         // loop to control number of passes
//         for ( int pass = 1; pass < array.length; pass++) {
//             // loop to control number of comparisons
//             for (int element = 0; element < array.length - 1; element++) {
//                 if ( array[element] > array[element + 1]) // compare
//                     swap(array, element, element + 1);
//             }
//         }
//     } // end method bubbleSort

//     public void swap(int array[], int first, int second) {
//         int hold = array[first];
//         array[first] = array[second];
//         array[second] = hold;
//     }

//     public static void main(String[] args) {
//         new ex9();
//     }
// }









// package chapter6;

// import java.text.DecimalFormat;
// import java.util.Random;
// import javax.swing.JOptionPane;

// public class ex9 {

//     String display = ""; // สร้าง display ไว้ข้างนอก method อื่นจะได้เพิ่มค่าได้
//     public ex9() {
//         int array[] = new int[30]; // กำหนดความกว้าง array มี 30 element
//         Random rnd =  new Random();
//         boolean done = true;
//         String result, searchKey;

//         for (int counter = 0; counter < array.length; counter++)
//             array[counter] = rnd.nextInt(100); // เพิ่มค่าสุ่มในแต่ละ element
//         bubbleSort(array); // เรียงค่า array
//         do {
//             searchKey = JOptionPane.showInputDialog("Enter number to seaarch(-1 : exit): ");
//             if (searchKey.endsWith("1"))
//                 done = false;
//             else {
//                 display = "Portions of array searched\n";
//                 int element = binarySearch(array, Integer.parseInt(searchKey)); // ค้นหาค่าแบบ binarySearch ถ้าไม่เจอ คืนค่าเป็น -1
//                 result = (element != -1) ? "Found value in element " + element : "Value not found"; // ใช้ if ternary เพื่อกำหนดข้อความ
//                 display += result;
//                 JOptionPane.showMessageDialog(null, display);
//             }
//         } while (done);
//         System.exit(0);
//     }

//     public int binarySearch(int array[], int key) {
//         int low = 0; // สร้างุจุดเริ่มต้น
//         int hight = array.length -1 ; // จุดสิ้นสุด -1 เพราะตาม index ของ element
//         int middle;
//         while (low <= hight) { //  วนลูปค้นหาต่อจนกว่า ระยะช่วงค้นหา (จาก low ถึง hight) จะเหลือศูนย์หรือหมดไป     ถ้า low > hight แสดงว่าช่วงค้นหาหมด ไม่มีค่าที่เราต้องการในอาเรย์
//             middle = (low + hight) / 2; // หาจุดกึ่งกลางของ array
//             buildOutput(array, low, middle, hight); // แสดงข้อมูลจุดเริ่มต้น จุดกึ่งกลาง จุดสิ้นสุด
//             if (key == array[middle]) // ถ้า key เท่ากับ array ใน index จุดกึ่งกลาง คืนค่า index หรือ element array
//                 return middle;
//             else if (key < array[middle]) // ถ้า key น้อยกว่า key index middle กำหนดจุดสูงสุดใหม่ให้น้อยกว่าจุดกึ่งกลางรอบที่แล้วคือ middle - 1
//                 hight = middle - 1;
//             else // ถ้า key มากกว่า middle กำหนดจุดเริ่มต้นใหม่ให้มากกว่า middile รอบที่แล้วคือ middle + 1
//                 low = middle + 1;
//         }
//         return -1;
//     }

//     void buildOutput(int array[], int low, int middle, int high) {
//         DecimalFormat twoDigits = new DecimalFormat("00"); // format ทศนิยม
//         for (int counter = 0; counter < array.length; counter++) {
//             if (counter < low || counter > high) // ถ้า index น้อยกว่า low คือไม่อยู่ในจุดเริ่มต้นหรือสิ้นสุดหมายถึงค้นหาไปแล้วให้แสดงค่า blank
//                 display += "    ";
//             else if (counter == middle) // ถ้า index คือ จุดกึ่งกลาง ให้แสดงค่า key และเน้น * ว่าเป็นจุดกึ่กลาง
//                 display += twoDigits.format(array[counter]) + "* ";
//             else // ถ้า index ไม่ใช่จุดกึ่งกลางแสดง key แต่ไม่เน้น
//                 display += twoDigits.format(array[counter]) + "  ";
//         }
//         display += "\n"; // เว้นบรรทัด
//     }

//     public void bubbleSort(int array[]) { // การเรียงแบบ bubbleSort หรือ การเรียงแบบลอยตัว พยายามทำให้ค่าน้อยสุดไปอยู่ด้านบน
//         for (int pass = 1; pass < array.length; pass++) { // การ Sortแบบ bubble ไปหลายๆรอบเพื่อความแม่นยำ
//             for (int element = 0; element < array.length - 1; element++) { // sort ทีละคู่
//                 if (array[element] > array[element + 1]) // ถ้า index แรกมากกว่าสลับ ให้ไปอยู่ index + 1 หรือ index หลัง
//                     swap(array, element, element + 1);
//             }
//         }
//     }

//     public void swap(int array[], int first, int second) {
//         int hold = array[first]; // index แรก
//         array[first] = array[second]; // สลับเป็น index หลัง
//         array[second] = hold; // สลับเป็น index แรก
//     }

//     public static void main(String[] args) {
//         new ex9();
//     }
// }







// package chapter6;

// import java.text.DecimalFormat;
// import java.util.Random;

// import javax.swing.JOptionPane;

// public class ex9 {
//     String display = "";
//     public ex9() {
//         int array[] = new int[30];
//         Random rnd = new Random();
//         boolean done = true;
//         for (int counter = 0; counter < array.length; counter++)
//             array[counter] = rnd.nextInt(100);
//         bubbleSort(array);
//         do {
//             int searchKey = Integer.parseInt(JOptionPane.showInputDialog("Enter number to search(-1 : exit):"));
//             display = "Portions of array searched\n";
//             int element = binarySearch(array, searchKey);
//             display += (element != -1) ? "Found value in element " + element : "Value not found";
//             JOptionPane.showMessageDialog(null, display);
//         } while (done);
//         System.exit(0);
//     }

//     public void bubbleSort(int array[]) {
//         for (int pass = 0; pass < array.length; pass++) {
//             for (int element = 0; element < array.length - 1; element++)
//                 if (array[element] > array[element + 1])
//                     swap(array, element, element + 1);
//         }
//     }

//     public void swap(int array[], int first, int second) {
//         int hold = array[first];
//         array[first] = array[second];
//         array[second] = hold;
//     }

//     public int binarySearch(int array[], int key) {
//         int low = 0;
//         int hight = array.length - 1;
//         int middle = 0;
//         while (low <= hight) {
//             middle = (low + hight) / 2;
//             buildOutput(array, low , middle , hight);
//             if (key == array[middle])
//                 return middle;
//             else if (key < array[middle])
//                 hight = middle - 1;
//             else
//                 low = middle + 1;
//         }
//         return -1;
//     }

//     public void buildOutput(int array[], int low, int middle, int high) {
//         DecimalFormat twoDigits = new DecimalFormat("00");
//         for (int counter = 0; counter < array.length; counter++) {
//             if (counter < low || counter > high)
//                 display += "    ";
//             else if (counter == middle)
//                 display += twoDigits.format(array[counter]) + "* ";
//             else
//                 display += twoDigits.format(array[counter]) + "  ";
//         }
//         display += "\n";
//     }

//     public static void main(String[] args) {
//         new ex9();
//     }
// }










// package chapter6;

// import java.text.DecimalFormat;
// import java.util.Random;
// import javax.swing.JOptionPane;

// public class ex9 {
//     String display = "";
//     public ex9() {
//         int array[] = new int[30];
//         Random rnd = new Random();
//         boolean done = true;
//         for (int counter = 0; counter < array.length; counter++)
//             array[counter] = rnd.nextInt(100);
//         bubbleSort(array);
//         do {
//             int searchKey = Integer.parseInt(JOptionPane.showInputDialog("Enter number to search(-1 : exit): "));
//             if (searchKey != -1) {
//                 display = "Portions of array searched\n";
//                 int element = binarySearch(array, searchKey);
//                 display += (element != -1) ? "Found value in element " + element : "Value not found";
//                 JOptionPane.showMessageDialog(null, display);
//             }
//             else done = false;
//         } while (done);
//         System.exit(0);
//     }

//     public void bubbleSort(int array[]) {
//         for (int pass = 0; pass < array.length; pass++) {
//             for (int element = 0; element < array.length - 1; element++)
//                 if (array[element] > array[element + 1])
//                     swap(array, element, element + 1);
//         }
//     }

//     public void swap(int array[], int first, int second) {
//         int hold = array[first];
//         array[first] = array[second];
//         array[second] = hold;
//     }

//     public int binarySearch(int array[], int key) {
//         int low = 0;
//         int hight = array.length - 1;
//         int middle;
//         while (low <= hight) {
//             middle = (low + hight) / 2;
//             buildOutput(array, low, middle, hight);
//             if (key == array[middle])
//                 return middle;
//             else if (key < array[middle])
//                 hight = middle - 1;
//             else
//                 low = middle + 1;
//         }
//         return -1;
//     }

//     public void buildOutput(int array[], int low, int middle, int high) {
//         DecimalFormat towDigits = new DecimalFormat("00");
//         for (int count = 0; count < array.length; count++) {
//             if (count < low || count > high)
//                 display += "    ";
//             else if (count == middle)
//                 display += towDigits.format(array[count]) + "* ";
//             else
//                 display += towDigits.format(array[count]) + "  ";
//         }
//         display += "\n";
//     }

//     public static void main(String[] args) {
//         new ex9();
//     }
// }












// package chapter6;

// import java.text.DecimalFormat;
// import java.util.Random;
// import javax.swing.JOptionPane;

// public class ex9 {
//     String display = "";
//     public ex9() {
//         int array[] = new int[30];
//         Random rnd = new Random();
//         boolean done = true;
//         for (int counter = 0; counter < array.length; counter++)
//             array[counter] = rnd.nextInt(100);
//         bubbleSort(array);
//         do {
//             int searchKey = Integer.parseInt(JOptionPane.showInputDialog("Enter number to search(-1 : exit): "));
//             if (searchKey != -1) {
//                 display = "Portions of array searched\n";
//                 int element = binarySearch(array, searchKey);
//                 display += (element != -1) ? "Found value in element " + element : "Value not found";
//                 JOptionPane.showMessageDialog(null, display);
//             }
//             else done = false;
//         } while (done);
//         System.exit(0);
//     }

//     public void bubbleSort(int array[]) {
//         for (int pass = 0; pass < array.length; pass++) {
//             for (int element = 0; element < array.length - 1; element++)
//                 if (array[element] > array[element + 1])
//                     swap(array, element, element + 1);
//         }
//     }

//     public void swap(int array[], int first, int second) {
//         int hold = array[first];
//         array[first] = array[second];
//         array[second] = hold;
//     }

//     public int binarySearch(int array[], int key) {
//         int low = 0;
//         int hight = array.length - 1;
//         int middle;
//         while (low <= hight) {
//             middle = (low + hight) / 2;
//             buildOutput(array, low, middle, hight);
//             if (key == array[middle])
//                 return middle;
//             else if (key < array[middle])
//                 hight = middle - 1;
//             else
//                 low = middle + 1;
//         }
//         return -1;
//     }

//     public void buildOutput(int array[], int low, int middle, int hight) {
//         DecimalFormat twoDigits = new DecimalFormat("00");
//         for (int counter = 0; counter < array.length; counter++) {
//             if (counter < low || counter > hight)
//                 display += "    ";
//             else if (counter == middle)
//                 display += twoDigits.format(array[counter]) + "* ";
//             else
//                 display += twoDigits.format(array[counter]) + "  ";
//         }
//         display += "\n";
//     }

//     public static void main(String[] args) {
//         new ex9();
//     }
// }





// // แบบลัดเอาไว้ใช้งานจริง

package chapter6;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class ex9 {
    String display = "";
    public ex9() {
        int array[] = new int[30];
        Random rnd = new Random();
        boolean done = true;
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = rnd.nextInt(100);
        }
        Arrays.sort(array);
        do {
            int searchKey = Integer.parseInt(JOptionPane.showInputDialog("Enter number to search(-1 : exit): "));
            if (searchKey != -1) {
                int element = Arrays.binarySearch(array, searchKey);
                display = "Portions of array searched\n";
                buildOutput(array, searchKey); // ไม่จำเป้นต้องมีเอาไว้โชว์ข้อมูลเฉยๆ
                display += (element >= 0) ? "Found value in element " + element : "Value not found";
                JOptionPane.showMessageDialog(null, display);
            }
            else done = false;
        } while (done);
        System.exit(0);
    }

    public void buildOutput(int array[], int key) {
        DecimalFormat twoDigits = new DecimalFormat("00");
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] == key)
                display += twoDigits.format(array[counter]) + "* ";
            else
                display += twoDigits.format(array[counter]) + "  ";
        }
        display += "\n";
    }
    public static void main(String[] args) {
        new ex9();
    }
}