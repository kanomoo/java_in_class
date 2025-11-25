// package chapter7;

// public class Employee2 {
//     private int empId;
//     private String empName;
//     private double empSalary;

//     public Employee2() { // การประกาศ public Employee2() {} แม้จะว่างเปล่า ช่วยให้สร้างอ็อบเจกต์ได้จากภายนอกคลาส โดยไม่ต้องส่งพารามิเตอร์ใด ๆ เหมาะสำหรับกรณีใช้ setter methods หรือสร้าง object เปล่าไว้ใช้งานต่อได้.
//     }

//     public void setEmpId(int id) {
//         empId = id; // กำหนดค่า
//     }

//     public void setEmpName(String name) {
//         empName = name;
//     }

//     public void setEmpSalary(double salary) {
//         empSalary = salary;
//     }

//     public int getEmpId() {
//         return empId; // คืนค่า
//     }

//     public String getEmpName() {
//         return empName;
//     }

//     public double getEmpSalary() {
//         return empSalary;
//     }

//     public String toString() {
//         return( getEmpId() + ", " + getEmpName() + ", " + getEmpSalary()); // โชว์ข้อมูลเฉยๆ
//     }
// }






package chapter7;

public class Employee2 {

    private int empId;
    private String empName;
    private double empSalary;

    public Employee2() {
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
        return(getEmpId() + ", " + getEmpName() + ", " + getEmpSalary());
    }

}