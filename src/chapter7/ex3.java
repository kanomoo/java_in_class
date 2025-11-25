package chapter7;

public class ex3 {
    
    public static void main(String[] args) {
        System.out.println("Create object from Employee3");
        Employee3 emp1 = new Employee3();
        Employee3 emp2 = new Employee3(11111);
        Employee3 emp3 = new Employee3(222, "Somchai");
        Employee3 emp4 = new Employee3(3333, "Somchai", 23400.0);

        System.out.println("Value in emp1 = " + emp1.toString());
        System.out.println("Value in emp2 = " + emp2.toString());
        System.out.println("Value in emp3 = " + emp3.toString());
        System.out.println("Value in emp4 = " + emp4.toString());
    }
}
