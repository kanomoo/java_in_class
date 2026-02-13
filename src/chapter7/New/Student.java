package chapter7.New;

public class Student {
    String name;
    int age;

    public Student() {
        name = "Unknown";
        age = 0;
    }

    public Student(String n , int a) {
        name = n;
        age = a;
    }

    public void displayInfo() {
        System.out.println(name + " is " + age + " years old.");
    }
}
