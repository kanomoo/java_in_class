package chapter8.New;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name : " + name + "\nAge : " + age;
    }
}
