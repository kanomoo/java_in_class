// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex6 {
//     public ex6() { // แบบ constructor ไม่มีชนิดข้อมูล ใช้สำหรับสร้างและกำหนดค่าเริ่มต้นให้กับอ็อบเจกต์ตอนถูกสร้าง เราไม่ต้องใส่ return เพราะ constructor จะคืนค่าอัตโนมัติเป็นอ็อบเจกต์ที่ถูกสร้างโดยคำสั่ง new
//         int array[] = {1, 2, 3, 4, 5};
//         String output = "Effects of passing entire array by reference:\n" + "The values of the original array are:\n";

//         // append original array elemtns to String output
//         for (int counter = 0; counter < array.length; counter++)
//             output += "   " + array[counter];
//         modifyArray(array); // array passed by reference ตัวแปรภายในเมธอดจะถูกอ้างอิง (reference) ของอาเรย์ตัวเดิม pass by reference คือการส่งค่าแบบ  เมธอดสามารถแก้ไขค่าของสมาชิกอาเรย์ที่ตัวแปรอ้างถึงได้ และการเปลี่ยนแปลงนี้จะสะท้อนกลับมายังอาเรย์ต้นทาง  ทำให้การส่งตัวแปรไปยังเมธอดเรียกใช้งานเป็นการส่งที่อยู่ของตัวแปรนั้น (memory address) แทนที่จะส่งค่าจริง   เมธอดที่ได้รับข้อมูลนี้ไป สามารถแก้ไขค่าที่อยู่ในตัวแปรต้นทางได้โดยตรง
//         output += "\n\nThe values of the modified array are:\n";
//         // append modified array elements to String output
//         for (int counter = 0; counter < array.length; counter++)
//             output += "   " + array[counter];
//         output += "\n\n Effects of passing array element by value:\n" + "array[3] before modifyElement: " + array[3];
//         modifyElement(array[3]); // attempt to modify array[3] ส่งสมาชิกของอาเรย์ทีละตัว ค่าของสมาชิกนั้นจะถูกส่งเป็นค่า (pass by value) เมธอดจะได้รับค่าสำเนา ทำให้การเปลี่ยนแปลงในเมธอดไม่มีผลกับสมาชิกในอาเรย์ต้นทาง
//         output += "\narray[3] after modifyElement: " + array[3];

//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Passing Array", JOptionPane.INFORMATION_MESSAGE);
//     } // end method init

//     // multiply each each element of an array by 2
//     public void modifyArray(int array2[]) {
//         for (int counter = 0; counter < array2.length; counter++)
//             array2[counter] *= 2;
//     }

//     public void modifyElement(int element) {
//         element *= 2;
//     }

//     public static void main(String[] args) {
//         new ex6();
//     }
// }





// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex6 {

//     public ex6(){
//         int array[] = {1, 2, 3, 4, 5};
//         String output = "Effects of passing entrie array by reference:\nThe values of the original array are:\n";
//         for (int i = 0; i < array.length; i++)
//             output += "   " + array[i];
//         output += "\n\nThe values of the modified array are:\n";
//         modifyArray(array);
//         for (int i = 0; i < array.length; i++)
//             output += "   " + array[i];
//         output += "\n\nEffects of passing array element by value:\naray[3] before modifyElement: " + array[3];
//         modifyElement(array[3]);
//         output += "\narray[3] after modifyElement: " + array[3];
//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea, "Passing Array", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     }

//     public void modifyArray(int array[]) {
//         for (int i = 0; i < array.length; i++)
//             array[i] *= 2;
//     }

//     public void modifyElement(int element) {
//         element *= 2;
//     }

//     public static void main(String[] args) {
//         new ex6();
//     }
// }




package chapter6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex6 {

    public ex6() {
        int array[] = {1, 2, 3, 4, 5,};
        String output = "Effects of passing entire array by reference:\nThe values of the original array are:\n";
        for (int i = 0; i < array.length; i++)
            output += "   " + array[i];
        modifyArray(array);
        output += "\n\nThe values of the modified array are:\n";
        for (int i = 0; i < array.length; i++)
            output += "   " + array[i];
        output += "\n\nEffects of passing array element by value:\narray[3] before modifyElement: " + array[3];
        modifyElement(array[3]);
        output += "\narray[3] after modifyElement: " + array[3];
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Passing Array", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public void modifyArray(int array[]) {
        for (int i = 0; i < array.length; i++)
            array[i] *= 2;
    }

    public void modifyElement(int Element) {
        Element *= 2;
    }

    public static void main(String[] args) {
        new ex6();
    }
}