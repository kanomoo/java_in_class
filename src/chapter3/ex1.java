// package chapter3;
// import java.util.Scanner;

// public class ex1 {
//     public static void main(String[] args) {
//         float num;
//         String name;
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your name : ");
//         name = scanner.nextLine();
//         if (name == "Java") { // ใช้ == เปรียนเทียบค่า String ไม่ได้ String ไม่ใช่ primitive types แต่เป็น class
//             System.out.println("Hello, " + name);
//         }
//         System.out.println("Good bye, " + name);
//         scanner.close();
        
//     }
// }

package chapter3;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        name = scanner.nextLine();
        if (name.equals("Java")) { // เปรียบเทียบค่าทีละ char ของ String ใน object String ที่เลือก
            System.out.println("Hello, " + name);
        }
        System.out.println("Good bye, " + name);
        scanner.close();
        
    }
}
