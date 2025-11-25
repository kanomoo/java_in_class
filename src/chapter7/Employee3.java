package chapter7;

public class Employee3 {
    private int empId;
    private String empName;
    private double empSalary;

    public Employee3() {
        
    }

    public Employee3(int id) {
        setEmpId(id);
    }

    public Employee3(int id, String name) { // ใช้ method overwriting ชื่อเดิมแต่ parameter รับหลายค่าหรือคนละ type ช่วยลดการกำหนดค่า
        setEmpId(id);
        setEmpName(name);
    }

    public Employee3(int id, String name, double salary) {
        setEmpId(id);
        setEmpName(name);
        setEmpSalary(salary);
    }

    public void setEmpId(int id) {
        empId = id;
    }

    public void setEmpName(String name) {
        empName = name;
    }

    public void setEmpSalary(double salary) {
        empSalary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
    
    public double getEmpSalary() {
        return empSalary;
    }

    public String toString() {
        return( getEmpId() + ", " + getEmpName() + ", " + getEmpSalary());
    }
}
