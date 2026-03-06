package chapter10.New;

import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args) {
        Ex4Cylinder cylinder = new Ex4Cylinder(12, 23, 2.5, 5.7);
        String output = "X coordinate is " + cylinder.getX() + "\nY coordinate is " + cylinder.getY() + "\nRadius is " + cylinder.getRadius() + "\nHeight is " + cylinder.getHeight() +"\n";
        cylinder.setX(35); cylinder.setY(20); cylinder.setRadius(4.25); cylinder.setHeight(10.75);
        output += "\nThe new location, radius and height of cylinder are\n" + cylinder + "\n\nDiameter is " + cylinder.getDiameter() + "\nCircumference is " + cylinder.getCircumference() + "\nArea is " + cylinder.getArea() + "\nVolume is " + cylinder.getVolume();
        JOptionPane.showMessageDialog(null, output);
    }
}

class Ex4Point{
    private int x, y;

    public Ex4Point() {
    }

    public Ex4Point(int x, int y) {
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
        return "Ex4Point [x=" + x + ", y=" + y + "]";
    }
}

class Ex4Circle extends Ex4Point{
    private double radius;

    public Ex4Circle() {
    }

    public Ex4Circle(int x, int y, double radius) {
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
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Center = [" + getX() + ", " + getY() + "|; Radius = " + getRadius();
    }
}

class Ex4Cylinder extends Ex4Circle{
    private double height;

    public Ex4Cylinder() {
    }

    public Ex4Cylinder(int x, int y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * super.getArea() + getCircumference() * getHeight();
    }

    public double getVolume() {
        return super.getArea() * getHeight();
    }

    public  String toString() {
        return super.toString() + "; Height = " + getHeight();
    }
}