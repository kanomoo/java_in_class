package chapter10.New;

public class ex3 {
    public static void main(String[] args) {
        Ex3Circle circle = new Ex3Circle(37, 43, 2.5);
        String output = "X coordinate is " + circle.getX() + "\nY coordinate is " + circle.getY() + "\nRadius is " + circle.getRadius();
        circle.setX(35); circle.setY(20); circle.setRadius(4.25);
        output += "\n\nThe new location and radius of circle are\n" + circle.toString() + "\nDiameter is " + circle.getDiameter() + "\nCircumference is " + circle.getCircumference() + "\nArea is " + circle.getArea();
        System.out.println(output);
    }
}

class Ex3Point{
    private int x, y;

    public Ex3Point() {
    }

    public Ex3Point(int x, int y) {
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
        return "Ex3Point [x=" + x + ", y=" + y + "]";
    }
}

class Ex3Circle extends Ex3Point{
    private double radius;

    public Ex3Circle() {
    }

    public Ex3Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Center = [" + getX() + ", " + getY() + "|; Radius = " + getRadius();
    }
}
