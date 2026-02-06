// package chapter6.New;

// import java.util.Random;

// import javax.swing.JOptionPane;

// public class ex7 {
    
//     public static void main(String[] args) {
//         ex7.start();
//     }

//     public static void start() {
//         int array[] = new int[100];
//         Random rnd = new Random();
//         boolean done = true;
//         String result;
//         for (int index = 0; index < array.length; index++)
//             array[index] = rnd.nextInt(101);
//         do {
//             String searchKey = JOptionPane.showInputDialog("Enter number to search(-1 : exit): ");
//             if (searchKey.equals("-1")) done = false;
//             else {
//                 int element = linearSearch(array, Integer.parseInt(searchKey));
//                 result = (element != -1) ? "Fount  value in element " + element : "value not found" ;
//                 JOptionPane.showMessageDialog(null, result);
//             }
//         } while (done);
//         System.exit(0);
//     }

//     public static int linearSearch(int array2[], int key) {
//         for (int index = 0; index < array2.length; index++)
//             if (array2[index] == key)
//                 return index;
//         return -1;
//     }
// }



// package chapter6.New;

// import java.util.Random;

// import javax.swing.JOptionPane;

// public class ex7 {

//     public void start() {
//         int[] array = new int[100];
//         Random rnd = new Random();
//         String output = "";
//         for (int i = 0; i < array.length; i++)
//             array[i] = rnd.nextInt(101);
//         while (true) {
//             int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number to search(-1 : exit):"));
//             if (num != -1) {
//                 for (int i = 0; i < array.length; i++) {
//                     if (num == array[i]) {
//                         output = "Found value in element " + i;
//                         break;
//                     }
//                     else output = "Value not found";
//                 }
//                 JOptionPane.showMessageDialog(null, output);
//             } else {
//                 System.exit(0);
//             }
//     }
// }

//     public static void main(String[] args) {
//         new ex7().start();
//     }
// }



// package chapter6.New;

// import java.util.Random;

// import javax.swing.JOptionPane;

// public class ex7 {

//     public ex7() {
//         int[] array = new int[100];
//         Random rnd = new Random();
//         for (int i = 0; i < array.length; i++) array[i] = rnd.nextInt(101);
//         // for (int l : array) System.out.print(l + ", ");
//         while (true) {
//             int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number to search(-1: exit):"));
//             if (num != -1) {
//                 int element = linearSearch(array, num);
//                 JOptionPane.showMessageDialog(null, (element != -1) ? "Found value in element " + element : "Value not found");
//             } else System.exit(0);
//         }
//     }

//     public int linearSearch(int[] array, int key) {
//         for (int i = 0; i < array.length; i++)
//             if (array[i] == key) return i;
//         return -1;
//     }

//     public static void main(String[] args) {
//         new ex7();
//     }
// }