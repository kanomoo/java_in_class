// package chapter10;

// public class Point {
//     private  int x; // x part of coordinate pair
//     private  int y; // y part of coordinate pair

//     // no-argument constructor
//     public Point() {
//         // implicit call to Object constructor occurs here
//     }

//     // constructor
//     public Point(int x, int y) {
//         // implicit call to Object contructor occurs here
//         this.x = x; // no need for validation
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
//         this.y = y; // no nned for validation
//     }

//     // return y from coordinate pair
//     public int getY() {
//         return y;
//     }

//     // return STring representation of Point obejct
//     public String toString() {
//         return "[" + getX() + ", " + getY() + "]";
//     }
// }


package chapter10;

public class Point {
    private int x, y;
    
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}