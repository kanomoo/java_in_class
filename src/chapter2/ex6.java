// package chapter2;

// public class ex6 {
//     long id = 6806021612037L;
//     String name = "Somchai";
//     String surname = "Cheingpongpan";
//     int age = 24;

//     public ex6() { // constrator method ไว้เรียกใช้ำสำหรับสร้าง object //
        
//     }

//     public static void main(String[] args) {
//         String info;
//         ex6 person = new ex6(); //create object
//         info = person.name + " " + person.surname;
//         info += ", " + person.age + " year old.";
//         System.out.println("ID : " + person.id);
//         System.out.println("Data person : " + info);
//         System.out.println("================================");
//         person.name = "John";
//         person.surname = "Smith";
//         person.age = 29;
//         info = person.name + " " + person.surname;
//         info += ", " + person.age + " year old.";
//         System.out.println("ID : " + person.id);
//         System.out.println("New data person : " + info);
//     }
// }

package chapter2;

public class ex6 {
    long id = 6706021610000L;
    String name = "Somchai", surname = "Cheingpongpan";
    int age = 24;

    public ex6() {
        
    }

    public static void main(String[] args) {
        String info;
        ex6 person = new ex6();
        info = "ID : " + person.id + "\n" + "Data person : " + person.name + " " + person.surname + ", " + person.age + " year old.";
        System.out.println(info + "\n============================");
        person.name = "John";
        person.surname = "Smith";
        person.age = 29;
        info = "ID : " + person.id + "\n" + "Data person : " + person.name + " " + person.surname + ", " + person.age + " year old.";
        System.out.println(info);
    }
}