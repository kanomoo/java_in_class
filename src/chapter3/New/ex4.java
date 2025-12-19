// package chapter3.New;

// import java.util.Scanner;

// public class ex4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter day of week : ");
//         int dayInput = scanner.nextInt();
//         String day = switch (dayInput) {
//             case 1 -> "Sunday";
//             case 2 -> "Monday";
//             case 3 -> "Tuesday";
//             default -> "unknow";
//         };
//         System.out.println("Day of week : " + dayInput + "\nDay Name : " + day);
//         scanner.close();
//     }
// }

package chapter3.New;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day of week : ");
        String dayName = "";
        int dayofWeek = scanner.nextInt();
        switch (dayofWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "unknow";
        }
        System.out.println("Day of week : " + dayofWeek + "\nDay Name : " + dayName);
        scanner.close();
    }
}