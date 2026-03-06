package chapter10.New;

public class ex2 {
    public static void main(String[] args) {
        Ex2Circle circle = new Ex2Circle(50, 30, 10.2);

        System.out.println("Circle : " + circle);
        System.out.println("Diameter : " + circle.getDiameter());
        System.out.println("Circumference : " + circle.getCircumference());
        System.out.println("Area : " + circle.getArea());
    }
}

class Ex2Point {
    protected int x, y;

    public Ex2Point() {
    }

    public Ex2Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + x + ", y=" + y + "]";
    }
}

class Ex2Circle extends Ex2Point {
    protected double radius;

    public Ex2Circle() {
    }

    public Ex2Circle(int x, int y, double radius) {
        this.x = x; this.y = y; setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius < 0.0 ? 0.0 : radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Center = [" +  this.x + ", " +  this.y + "]; Radius = " + getRadius();
    }
}
