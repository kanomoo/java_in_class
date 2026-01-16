// package chapter5.New;

// import java.util.Scanner;

// public class ex6 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String str;
//         System.out.print("Enter your sentense : ");
//         str = scanner.nextLine();
//         if (!str.isBlank() && !str.isEmpty()) {
//             int pos, countWord = 0;
//             while (str.length() > 0) {
//                 pos = str.indexOf(" ");
//                 if (pos >= 0) {
//                     System.out.println(str.substring(0,pos));
//                     str = str.substring(pos + 1);
//                     countWord++;
//                 } else {
//                     System.out.println(str);
//                     str = "";
//                     countWord++;
//                 }
//             }
//             System.out.println("Sentense is " + countWord + " word.");
//         } else
//             System.out.println("No data input.");
//         scanner.close();
//     }
// }




// package chapter5.New;

// import java.util.Scanner;

// public class ex6 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your sentense : ");
//         String str = scanner.nextLine().trim();
//         int count = 1;
//         if (!str.isEmpty() && !str.isBlank()) {
//             for (int i = 0; i < str.length(); i++) {
//                 char ch = str.charAt(i);
//                 if (ch != ' ') System.out.print(ch);
//                 else {
//                     System.out.println();
//                     count++;
//                 }
//             }
//             System.out.println("Sentense is " + count + " word.");
//         }
//     }
// }


package chapter5.New;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentense : ");
        String str = scanner.nextLine().trim();
        int count = 0;
        if (!str.isEmpty()) {
            while (str.length() > 0) {
                int pos = str.indexOf(" ");
                if (pos >= 0) {
                    if (!str.substring(0, pos).isBlank() || !str.substring(0, pos).isEmpty()) {
                        System.out.println(str.substring(0, pos));
                        count ++;
                    }
                    str = str.substring(pos + 1);
                } else {
                    System.out.println(str);
                    str = "";
                    count ++;
                }
            }
            System.out.println("Sentense is " + count + " word.");
        } else System.out.println("No data input.");
        scanner.close();
    }
}