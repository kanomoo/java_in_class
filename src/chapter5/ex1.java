// package chapter5;

// public class ex1 {
//     public void displayInstance() {
//         System.out.println("Hello from Instance.");
//     }

//     public static void displayStatic() {
//         System.out.println("Hello from Static.");
//     }

//     public static void main(String[] args) {
//         System.out.println("Test call static method.");
//         ex1.displayStatic(); // static method เป็นของ class โดยตรงใช้ได้เลย
//         ex1 obj = new ex1(); // instance method คืออ็อบเจกต์ที่อาศัยโครงสร้างจากคลาส แต่ไม่เป็นของ class โดยตรง  ต้องเรียกใช้ผ่าน object หรือ instance ถ้าไม่มี object ต้องสร้างขึ้นมาใหม่ 
//         System.out.println("Test call instance method.");
//         obj.displayInstance(); // เรียกใช้ instance method ผ่าน instance หรือ object ของ class ex1
//     }
// }


package chapter5;

public class ex1 {
    public static void displayStatic() {
        System.out.println("Hello from Static.");
    }

    public void displayInstance() {
        System.out.println("Hello from Instance.");
    }

    public static void main(String[] args) {
        System.out.println("Test call static method.");
        ex1.displayStatic();
        ex1 obj = new ex1();
        System.out.println("Test call instance method");
        obj.displayInstance();
    }
}