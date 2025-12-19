// package chapter3.New;

// import java.util.Scanner;

// public class ex2 {
//     Scanner scanner = new Scanner(System.in);

//     public ex2() {
//         System.out.print("Enter three integers : ");
//         int min = 0;
//         int n1 = scanner.nextInt();
//         int n2 = scanner.nextInt();
//         int n3 = scanner.nextInt();
//         if (n1 < n2) {
//             if (n1 < n3)
//                 min = n1;
//             else
//                 min = n3;
//         } else if (n2 < n1) {
//             if (n2 < n3)
//                 min = n2;
//             else
//                 min = n3;
//         }
//         System.out.println("Minimum vlaue : " + min);
//     }

//     public static void main(String[] args) {
//         new ex2();
//     }
// }

package chapter3.New;

import javax.swing.JOptionPane;

public class ex2 {

    public static void menu() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1 : "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2 : "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 3 : "));
        int min = Math.min(num1, num2);
        min = Math.min(num3, min);
        JOptionPane.showMessageDialog(null, "Minimum vlaue : " + min);
    }

    public static void main(String[] args) {
        ex2.menu();
    }
}