// package chapter9;

// public class Person {
//     private String name;
//     private String surname;
//     private static int count = 0; // number of objects in memory

//     public Person(String name, String surname) {
//         this.name = name;
//         this.surname = surname;
//         ++count; // increment static count of employees
//         System.out.println("Person contructor: " + this.name + " " + this. surname);
//     }

//     protected void finalize() { // ทำความสะอาด เช่น ปิดไฟล์, ปล่อยทรัพยากร เรียกใช้อัตโนมัติตอน object กำลังจะถูกGarbage Collected (ทำลาย)
//         --count; // decrement static count of employees
//         System.out.println("Person finalizer: " + this.name + "; count = " + count);
//     }

//     // get first name
//     public String getName() {
//         return this.name;
//     }

//     // get surname
//     public String getSurname() {
//         return this.surname;
//     }

//     // static method to get static count value
//     public static int getCount() {
//         return count;
//     }
// }




package chapter9;

public class Person {
    private String name;
    private String surname;
    private static int count = 0;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        ++count;
        System.out.println("Person constructor: " + this.name + " " + this.surname);
    }

    protected void finalize() {
        --count;
        System.out.println("Person finalizer: " + this.name + " " + this.surname + " ; count = " + count);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public static int getCount() {
        return count;
    }
}