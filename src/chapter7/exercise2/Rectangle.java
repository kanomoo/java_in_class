package chapter7.exercise2;

public class Rectangle {
    private double width;
    private double hight;

    public Rectangle() {
    }

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public void setWight(double width) {
        this.width = width;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWight() {
        return width;
    }

    public double getHight() {
        return hight;
    }

    public double getArea() {
        return width * hight;
    }

    public double getParimeter() {
        return 2 * (width * hight);
    }
}
