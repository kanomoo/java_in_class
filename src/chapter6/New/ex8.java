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

package chapter6.New;

import java.util.Random;

public class ex8 {
    int sum = 0;

    public ex8() {
        Random rnd = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = rnd.nextInt(101);
        for (int l : array)
            System.out.print(l + ", ");
        System.out.println("\n");
        bubbleSort(array);
        for (int l : array)
            System.out.print(l + "  ");
        System.out.println("\n\n" + sum);
    }

    public void bubbleSort(int array[]) {
        sum = 0;
        boolean done = true;
        for (int l = 1; l < array.length; l++) {
            done = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    done = false;
                }
            }
            sum++;
            if (done)
                break;
        }
    }

    public void swap(int array[], int first, int second) {
        int hold = array[first];
        array[first] = array[second];
        array[second] = hold;
    }

    public void binarySearch() {

    }

    public static void main(String[] args) {
        new ex8();
    }
}