package chapter2;

public class ex10 {
    final double PI = 3.1416;
    String message;
    double area;

    public ex10(double radius) {
        message = "Circle";
        area = PI * radius * radius;
    }

    public ex10(double with, double height) {
        message = "Rectangle";
        area = with * height;
    }

    public static void main(String[] args) {
        // create instance variable
        ex10 circle = new ex10(10.0);
        System.out.print("Calculate Area " + circle.message);
        System.out.println(" = " + circle.area);
        // 
        ex10 rectangle = new ex10(12.0, 20.0);
        System.out.print("Calculate Area" + rectangle.message);
        System.out.println(" = " + rectangle.area);
    }
}

// package chapter2;

// public class ex10 {
//     String message;

//     public ex10(int value1, int value2){
//         message = "มีค่า 2 ค่า";
//     }

//     public ex10(int value) {
//         message = "มีค่า 1 ค่า";
//     }

//     public static void main(String[] args) {
//         ex10 value1 = new ex10(0);
//         System.out.println(value1.message);
//         ex10 value2 = new ex10(0, 0);
//         System.out.println(value2.message);
//     }
// }