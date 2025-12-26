package chapter10;

public class Circle2 extends Point2{
    private double radius;

    public Circle2() {
    }

    public Circle2(int x, int y, double radius) {
        super(x, y); // call point2 constructor explicitly
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius < 0.0 ? 0.0 : radius);
    }

    public double getDiameter() { return 2 * getRadius(); }
    public double getCircumference() { return Math.PI * getDiameter(); }
    public double getArea() { return Math.PI * Math.pow(radius, 2); }
    public String toString() {
        return "Center = " + super.toString() + "; Radius = " + getRadius();
    }
}
