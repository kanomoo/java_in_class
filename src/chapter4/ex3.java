// double r = Math.random(); // ผลลัพธ์ 0.0 ถึง 0.999...

// double r = Math.random() * max; // เช่น max = 50 ได้ผลลัพธ์ 0.0 ถึง 49.999...
// double r = min + Math.random() * (max - min); // กำหนด min, max ได้เอง เช่น 10.0-20.0

// int r = (int)(Math.random() * max); // 0 ถึง max-1 เพราะ ถ้า max เป็น 15 จะสุ่มได้ถึง 14.999999

// int r = 15 + (int)(Math.random() * (25 - 15 + 1)); // ตัวอย่างการสุ่ม min 15 ถึง 25
// int r = 15 + (int)(Math.random() * 11); 
// // การกำหนด min ต้องบวกเพิ่มเพราะ random เริ่มต้นที่ 0.0 ต้องบวกเพื่อจะ random ตั้งแต่ค่าที่บวกแล้วเช่น 15
// // การกำหนด mix ต้องคูณเพิ่มเพราะ random มีค่าสูงสุดที่ 0.999... คูณไปเพื่อจะ random สูงสุดตามค่าที่คูณแล้ว
// // การแปลงเป็น (int) เพื่อตัดทศนิยมออกแล้วนำไปใช้งาน ที่แแปลงเป็น int ได้เนื่องจากตามหลักของ java การเปลี่ยนข้อมูลที่มีความสำคัญมากกว่าเป็นข้อมูลที่มีความสำคัญน้อยกว่าจะมีการสูญเสียข้อมูล

// int r = min  + (int)(Math.random() * (max - min + 1)) ; // min ถึง max






// package chapter4;

// public class ex3 {
//     public static void main(String[] args) {
//         int value;
//         String output = "Random number 0 to 9 : \n";
//         for (int c = 1; c <= 10; c++) {
//             value = (int) (Math.random() * 10);
//             output += value + ", ";
//         }
//         System.out.println(output);
//         output = "\nRandom number 15 to 25 : \n";
//         for (int c = 1; c <= 10; c++) {
//             value = 15 + (int) (Math.random() * 11);
//             output += value + ", ";
//         }
//         System.out.println(output);
//     }
// }






package chapter4;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Random number 0 to 9 : ");
        for (int i  = 1; i <= 10; i++)
            System.out.print((int) (Math.random() * 10) + (i != 10 ? ", " : ""));
        System.out.println("\nRandom number 15 to 25 : ");
        for (int i  = 1; i <= 10; i++)
            System.out.print(15 + (int) (Math.random() * (25 - 15 + 1)) + (i != 10 ? ", " : ""));
    }
}