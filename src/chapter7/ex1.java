package chapter7;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Create object from Employee");
        Employee1 emp = new Employee1(); // สร้าง object emp จาก class Employee1
        System.out.println("Value obj.empId = " + emp.empId); // แสดงข้อมูล attribute(ลักษณะ) จาก object emp
        System.out.println("Value obj.empName = " + emp.empName);
        System.out.println("Value obj.empSalary = " + emp.empSalary);
    }
}
