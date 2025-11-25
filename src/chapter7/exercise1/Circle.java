package chapter7.exercise1;

public class Circle {
    private double cirRadius;

    public Circle() {
    }

    public Circle(double radius) {
        setCirRadius(radius);
    }

    public void setCirRadius(double radius) {
        cirRadius = radius;
    }

    public double getCirRadius() {
        return cirRadius;
    }

    public double CalArea() {
        return Math.PI * cirRadius * cirRadius;
    }

    public double CalParimeter() {
        return 2 * Math.PI * cirRadius;
    }
}
