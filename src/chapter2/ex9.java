// package chapter2;

// public class ex9 {
//     public static void main(String[] args) {
//         final double PI = 3.1416;
//         double with = 22.0, height = 12.0, radius = 16.0, result;
//         char type;
//         String message;

//         type = '2';
//         result = (type == '1') ? (with * height) : (PI * (radius * radius));
//         message = (type == '1') ? ("Rectangle") : "Circle" ;
//         System.out.println("Calcuate Area" + message + " = " + result);
//     }
// }
package chapter2;

public class ex9 {
    public static void main(String[] args) {
        int grade = 80;
        String message;
        if (grade >= 80) {
            System.out.println("grade = A");
        } else if (grade >= 70) {
            System.out.println("grade = B");
        } else {
            System.out.println("grade = \" \"");
        }
        
        message = (grade >= 80) ? "A" : " ";
        System.out.println(message); 
        
    }
}