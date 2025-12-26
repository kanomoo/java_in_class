// package chapter10;

// public class Point1 {
//     protected int x; // x part of coordinate pair
//     protected int y; // y part of coordinate pair

//     // no-argument constructor
//     public Point1() {
//         // implicit call to Object constructor occurs here
//     }

//     // constructor
//     public Point1(int x, int y) {
//         // implicit call to Object constructor occurs here
//         this.x = x; // no need for validatoin
//         this.y = y; // no need for validation
//     }

//     // set x in coordinate pair
//     public void setX(int x) {
//         this.x = x; // no need for validation
//     }

//     // return x from coordinate pair
//     public int getX() {
//         return x;
//     }

//     // set y in coordinate pair
//     public void setY(int y) {
//         this.y = y; // no need for validation
//     }

//     // return y from coordinate pair
//     public int getY() {
//         return y;
//     }

//     // return String representtaion of Point object
//     public String toString() {
//         return "[" + getX() + ", " + getY() + "]";
//     }
// }


package chapter10;

public class Point1 {
    protected int x, y;

    public Point1() {
    }

    public Point1(int x, int y) {
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

    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}