// package chapter6.New;

// import java.text.DecimalFormat;
// import java.util.Random;

// import javax.swing.JOptionPane;

// public class ex8 {
//     String display = "";

//     public void MainProgram() {
//         int array[] = new int[30];
//         Random rnd = new Random();
//         boolean done = true;
//         String result, searchKey;
//         for (int i = 0; i < array.length; i++)
//             array[i] = rnd.nextInt(100);
//         bubbleSort(array);
//         do {
//             searchKey = JOptionPane.showInputDialog("Enter number to search(-1 : exit): ");
//             if (searchKey.equals("-1"))
//                 done = false;
//             else {
//                 display = "Positions of array searched\n";
//                 int element = binarySearch(array, Integer.parseInt(searchKey));
//                 result = (element != -1) ? "Found value in element " + element : "Value not found";
//                 display += result;
//                 JOptionPane.showMessageDialog(null, display);
//             }
//         } while (done);
//         System.exit(0);
//     }

//     public int binarySearch(int array2[], int key) {
//         int low = 0;
//         int hight = array2.length - 1;
//         int middle;
//         while (low <= hight) {
//             middle = (low + hight) / 2;
//             buildOutput(array2, low, middle, hight);
//             if (key == array2[middle])
//                 return middle;
//             else if (key < array2[middle])
//                 hight = middle - 1;
//             else
//                 low = middle + 1;
//         }
//         return -1;
//     }

//     void buildOutput(int array3[], int low, int middle, int high) {
//         DecimalFormat twoDigits = new DecimalFormat("00");
//         for (int index = 0; index < array3.length; index++) {
//             if (index < low || index > high)
//                 display += "    ";
//             else if (index == middle)
//                 display += twoDigits.format(array3[index]) + "* ";
//             else
//                 display += twoDigits.format(array3[index]) + "  ";
//         }
//         display += "\n";
//     }

//     public void bubbleSort(int array2[]) {
//         for (int pass = 1; pass < array2.length; pass++) {
//             for (int element = 0; element < array2.length - 1; element++) {
//                 if (array2[element] > array2[element + 1])
//                     swap(array2, element, element + 1);
//             }
//         }
//     }

//     public void swap(int array3[], int first, int second) {
//         int hold = array3[first];
//         array3[first] = array3[second];
//         array3[second] = hold;
//     }

//     public static void main(String[] args) {
//         new ex8().MainProgram();
//     }

// }







// package chapter6.New;

// import java.text.DecimalFormat;
// import java.util.Random;

// import javax.swing.JOptionPane;

// public class ex8 {
//     DecimalFormat twoDigits = new DecimalFormat("00");
//     Random rnd = new Random();
//     int[] array = new int[30];
//     String output;


//     public ex8() {
//         for (int i = 0; i < array.length; i++) array[i] = rnd.nextInt(101);
//         bubbleSort(array);
//         while (true) {
//             String num = JOptionPane.showInputDialog("Enter number to search(-1 : exit)");
//             if (num == null) {JOptionPane.showMessageDialog(null, "Exit Program..", "Message", JOptionPane.INFORMATION_MESSAGE); System.exit(0);}
//             else if (num.equals("-1")) System.exit(0);
//             else binarySearch(Integer.parseInt(num));
//         }
//     }


//     public void bubbleSort(int array[]) {
//         boolean done = true;
//         for (int l = 1; l < array.length; l++) {
//             done = true;
//             for (int i = 0; i < array.length - 1; i++) {
//                 if (array[i] > array[i + 1]) {
//                     swap(array, i, i + 1);
//                     done = false;
//                 }
//             }
//             if (done)
//                 break;
//         }
//     }

//     public void swap(int array[], int first, int second) {
//         int hold = array[first];
//         array[first] = array[second];
//         array[second] = hold;
//     }

//     public void binarySearch(int num) {
//         int low = 0, height = array.length, mid = (low + height) / 2;
//         output = "Potions of array searched\n";
//         while (low <= height) {
//             buildOutput(low, mid, height, num);
//             if (num > array[mid]) low = mid + 1;
//             else if (num < array[mid]) height = mid - 1;
//             else break;
//             mid = (low + height) / 2;
//         }
//         output += (num == array[mid]) ? "\nValue = " + array[mid] : "\nValue not found";
//         JOptionPane.showMessageDialog(null, output);

//     }

//     public void buildOutput(int low, int mid, int height, int num) {
//         for (int i = 0; i < array.length; i++) {
//             if (i == mid) output += array[i] + "* ";
//             else if (i >= low && i <= height) output += array[i] + "  ";
//             else output += "    ";
//         }
//         output += "\n";

//     }

//     public static void main(String[] args) {
//         new ex8();
//     }
// }








package chapter6.New;

import java.util.Random;

import javax.swing.JOptionPane;

public class ex8 {
    int array[] = new int[30];
    Random rnd = new Random();
    String num, output;

    public void MainProgram() {
        for (int i = 0; i < array.length; i++) array[i] = rnd.nextInt(100);
        bubbleSort();
        // for (int l : array) System.out.print(l + "  ");
        while (true) {
            num = JOptionPane.showInputDialog("Enter number binary search(-1 : Exit): ");
            if (num == null) {JOptionPane.showMessageDialog(null, "Exit Program..."); System.exit(0);}
            else if (num.equals("-1")) {JOptionPane.showMessageDialog(null, "Exit Program..."); System.exit(0);}
            else {binarySearch(Integer.parseInt(num));}
        }
    }

    public void bubbleSort() {
        boolean done = true;
        for (int l = 1; l < array.length; l++) {
            done = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) swap(i, i + 1);
                done = false;
            }
            if (done) break;
        }
    }

    public void swap(int first, int second) {
        int hold = array[first];
        array[first] = array[second];
        array[second] = hold;
    }

    public void binarySearch(int num) {
        int low = 0, height = array.length - 1, mid = (low + height) / 2;
        output = "Binary search\n";
        while (low <= height) {
            buildOutput(low, height, mid, num);
            if (num > array[mid]) low = mid + 1;
            else if (num < array[mid]) height = mid - 1;
            else break;
            mid = (low + height) / 2;
        }
        JOptionPane.showMessageDialog(null, output += (array[mid] == num) ? "Value = " + array[mid] : "Value not found");
    }

    public void buildOutput(int low, int height, int mid, int num) {
        for (int i = 0; i < array.length; i++) {
            if (i == mid) output += array[i] + "* ";
            else if (i >= low && i <= height) output += array[i] + "  ";
            else output += "    ";
        }
        output += "\n";
    }

    public static void main(String[] args) {
        new ex8().MainProgram();
    }
}