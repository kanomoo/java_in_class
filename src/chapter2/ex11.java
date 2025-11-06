// package chapter2;
// import java.util.Scanner;

// public class ex11 {
//     public static void main(String[] args) {
//         String name1, name2;
//         Scanner scan = new Scanner(System.in); // create instance variable
//         System.out.print("Enter your name 1 : ");
//         name1 = scan.nextLine();
//         System.out.print("ENter your name 2 : ");
//         name2 = scan.nextLine();
//         System.out.println("Your entered name1 : \"" + name1 + "\"");
//         System.out.println("Your entered name2 : \"" + name2 + "\"");
//         scan.close();
//     }
// }

package chapter2;
import java.util.Scanner;

public class ex11 {
    String message;

    public ex11(int num1) {
        message = "Value 1 Argument";
    }

    public ex11(int num1, int num2) {
        message = "Value 2 Argument";
    }

    public static void main(String[] args) {
        // int num1;
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        num1 = scan.nextInt();
        System.out.print("Enter number2 : ");
        num2 = scan.nextInt();
        ex10 value1 = new ex10(num1);
        System.out.println(value1.message);
        ex10 value2 = new ex10(num1, num2);
        System.out.println(value2.message);
    }
}