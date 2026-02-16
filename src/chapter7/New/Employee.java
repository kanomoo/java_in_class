package chapter7.New;

public class Employee {
    static String companyName = "Kmutnb";
    String name;
    double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Company Name : " + Employee.companyName +  "\nName : " + name + "\nSalary : " + salary);
    }
}
