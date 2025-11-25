package chapter7;

public class ex2 {
    
    public static void main(String[] args) {
        System.out.println("Create object from Employee2");
        Employee2 emp = new Employee2(); // เพราะกำหน Employee2 เป็น instance สร้าง obj ใหม่ก่อน
        emp.setEmpId(12345); // กำหนดค่า attributes ของ class ด้วยหลักการ setter เพราะ field ถูกตั้งเป็น private ทำให้ไม่สามารถเข้าถึงหรือเปลี่บยค่าจากภายนอกคลายได้โดยตรง (ต้องใช้ method ในคลายเท่านั้น)   ที่ต้องกำหนดแบบนี้เพราะตั้ง attributes เป็น private
        emp.setEmpName("Somchai");
        emp.setEmpSalary(34500.00);
        System.out.println("Value obj.empId = " + emp.getEmpId()); // คืนค่า attributes ของ class คืนค่า attribute ด้วย getter (emp.getEmpId()) เพื่อดึงข้อมูลออกมาแสดง โดยไม่เปิดโครงสร้าง field ให้ภายนอกใช้โดยตรง ช่วยปกป้องข้อมูล
        System.out.println("Value obj.empName = " + emp.getEmpName());
        System.out.println("Value obj.empSalary = " + emp.getEmpSalary());
        System.out.println("Value obj = " + emp.toString());
    }
}
