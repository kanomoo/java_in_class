package chapter4.New;

public class ex1 {
    public void displayInstance() {
        System.out.println("Hello from Instance.");
    }

    public static void displayStatic() {
        System.out.println("Hello from Static.");
    }

    public static void main(String[] args) {
        System.out.println("Test call static method.");
        ex1.displayStatic();
        ex1 obj = new ex1();
        System.out.println("Test call instance method.");
        obj.displayInstance();
    }
}
