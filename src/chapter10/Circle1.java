// package chapter10;

// public class Circle1 extends Point1{
//     protected double radius; // Circle's radius

//     public Circle1() {
//         // imlicit call to Object constructor occurs here
//     }

//     public Circle1(int x, int y, double radius) {
//         // implicit call to Object constructor occurs here
//         this.x = x; // no need for validation
//         this.y = y; // no need for validation
//         setRadius(radius);
//     }

//     public void setRadius(double  radius) {
//         this.radius = (radius < 0 ? 0.0 : radius);
//     }

//     public double getRadius() {
//         return radius;
//     }

//     public double  getDiameter() {
//         return 2 * radius;
//     }

//     public double  getCircumference() {
//         return Math.PI * getDiameter();
//     }

//     public double  getArea() {
//         return Math.PI * radius * radius;
//     }

//     public String toString() {
//         return "Center = [" + getX() + ", " + getY() + "]; Radius = " + getRadius();
//     }
// }


package chapter10;

public class Circle1 extends Point1 {
    protected double radius;

    public Circle1() {
    }

    public Circle1(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        setRadius(radius);
    }

    public void  setRadius(double radius) {
        this.radius = (radius < 0 ? 0.0 : radius);
    }

    public double getRadius() {
        return  radius;
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
        return "Center = [" + getX() + ", " + getY() + "]; Radius = " + getRadius();
    }
}