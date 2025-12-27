package chapter10;

public class ConstructorFinalizerTest {
    public static void main(String[] args) {
    Point3 point;
    Circle3 circle1, circle2;

    point = new Point3(11, 22);
    System.out.println();
    circle1 = new Circle3(72, 29, 4.5);

    System.out.println();
    circle2 = new Circle3(5, 7, 10.67);

    point = null; // mark for garbage collection
    circle1 = null;
    circle2 = null;

    System.out.println();
    System.gc(); // call the garbage collector
    }
}
