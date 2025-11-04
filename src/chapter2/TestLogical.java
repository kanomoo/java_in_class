package chapter2;

public class TestLogical {
    public static void main(String[] args) {
        int x = 3, y = 6;
        System.out.print(" (x == 3) && (y != 6) = ");
        System.out.println((x == 3) && (y != 6));
        System.out.print(" (x == 3) || (y != 6) = ");
        System.out.println( ((x == 3) || (y != 6)));
        System.out.println(" !(x != y) = " + (!(x != y)));
    }
}
