// package chapter4;

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
//                     System.out.println(str.substring(0, pos)); // ตั้งแต่ต้นถึงก่อน blank
//                     str = str.substring(pos + 1);
//                     countWord++;
//                 } else {
//                     System.out.println(str);
//                     str = "";
//                     countWord++;
//                 }
//             }
//             System.out.println("Sentense is " + countWord + " word.");
//         } else System.out.println("No data input.");
//         scanner.close();
//     }
// }


package chapter4;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentense : ");
        String str = scanner.nextLine();
        if (!str.isBlank() && !str.isEmpty()) { // ไม่มี balnk ไม่ว่างเปล่า
            int count = 0;
            while (str.length() > 0) { // เมื่อมีข้อมูลใน str
                int pos = str.trim().indexOf(" "); // trim ตัดค่า blank หน้าและหลังและหา index of blank
                if (pos > 0) { // ถ้าเจอค่า blank indexof จะเป็นบวก  แต่ถ้าไม่มี b;aml ค่าจะเป็นลบ เลยใช้ pos > 0
                    System.out.println(str.substring(0, pos)); // print start ที่ 0 และ stop ที่ pos หรือค่า blank
                    str = str.substring(pos + 1); // str start ที่หลัง balnk หรือ pos + 1 เป็นการตัดข้อมูลที่ print แล้วออก
                    count++;
                } else { // ถ้า pos ติดลบ หรือ ไม่เจอ index ของ blank
                    System.out.println(str);
                    str = "";
                    count++;
                }
            }
            System.out.println("Sentense is " + count + " word.");
        } else System.out.println("No data input.");
        scanner.close();
    }
}