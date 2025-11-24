package chapter7;

public class Employee1 { // ประกาศ class Employee1
    public int empId; // set modifier (public) ให้ class อื่นใช้งานได้ และประกาศ attributes type int attributes name empId
    public String empName; // ถ้ากำหนด modifier เป็น public สามารถเข้าถึงได้จากทุกคลาส ทุกแพ็กเกจ ไม่จำกัดว่าต้องอยู่ใน package เดียวกัน
    public double empSalary; // ถ้าไม่กำหนดจะเป็น default (package-private)  เข้าถึงได้เฉพาะคลาสที่อยู่ใน package เดียวกัน    ไม่สามารถเข้าถึง attribute นี้จากคลาสที่อยู่นอก package เดียวกัน
}
