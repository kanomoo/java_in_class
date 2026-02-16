package chapter7.New;

public class Circle {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("area = " + (Math.PI * Math.pow(2, radius)));
    }

    public void circumference() {
        System.out.println("circumference = " + (2 * Math.PI * radius));
    }

}
