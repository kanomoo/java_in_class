// package chapter5.New;

// import java.util.Scanner;

// public class ex4 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String name;
//         System.out.println("Enter name : ");
//         name = scanner.nextLine();
//         if (!name.isEmpty()) {
//             for (int index = 0; index < name.length(); index++) {
//                 System.out.println("Character : " + name.charAt(index) + " is ascill value : " + (byte) name.charAt(index));
//             }
//         } else
//             System.out.println("No data input.");
//         scanner.close();
//     }
// }





// package chapter5.New;

// import java.util.Scanner;

// public class ex4 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter name : ");
//         String name = scanner.nextLine();
//         if (!name.isEmpty()) {
//             for (int i = 0; i < name.length() ; i++)
//                 System.out.println("Character : " + name.charAt(i) + " is ascii value : " + (byte) name.charAt(i));
//         } else
//             System.out.println("No data input.");
//         scanner.close();
//     }
// }




package chapter5.New;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            for (int i = 0; i < name.length() ; i++)
                System.out.println("Character : " + name.charAt(i) + " is ascii value : " + (byte) name.charAt(i));
        } else
            System.out.println("No data input.");
        scanner.close();
    }
}