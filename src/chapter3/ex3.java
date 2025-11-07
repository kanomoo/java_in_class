// package chapter3;
// import java.util.Scanner;

// public class ex3 {
//     public static void main(String[] args) {
//         int num1, num2, num3, min = 0;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter three integers : ");
//         num1 = scanner.nextInt();
//         num2 = scanner.nextInt();
//         num3 = scanner.nextInt();
//         if (num1 < num2)
//             if (num1 < num3)
//                 min = num1;
//             else
//                 min = num3;
//         else if (num2 < num3)
//             min = num2;
//         else min = num3;
//         System.out.println("Minimum value : " + min);
//         scanner.close();
//     }
// }

// package chapter3;
// import java.util.Scanner;

// public class ex3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int num1, num2, num3, min = 0;
//         System.out.print("Enter three integers : ");
//         num1 = scan.nextInt();
//         num2 = scan.nextInt();
//         num3 = scan.nextInt();
//         if (num1 < num2)
//             min = num1;
//         if (num1 > num2)
//             min = num2;
//         if (num3 < min)
//             min = num3;
//         System.out.println("Minimum value : " + min);
//         scan.close();
//     }
// }

package chapter3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, min = 0;
        System.out.print("Enter three integers : "); 
        num1 = scan.nextInt(); //Scanner จะอ่านตัวเลขทีละค่าโดยแยกจากช่องว่าง
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        if (num1 < num2)
            if (num1 < num3) min = num1;
            else min = num3;
        else if (num2 < num3) min = num2;
        else min = num3;
        System.out.println("Minimum value : " + min);
        scan.close();
    }
}