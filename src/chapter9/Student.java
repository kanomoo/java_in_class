package chapter9;

public class Student {
    private String studentCode = "";
    private String studentName = "";
    private int studentCredit = 3;

    // Creates a new instance of Student
    public Student() {
    }

    public Student(String code, String name, int credit) {
        setStudentCode(code);
        setStudentName(name);
        setStudentCredit(credit);
    }

    public void setStudentCode(String code) {
        studentCode = code;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public void setStudentCredit(int credit) {
        studentCredit = credit;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentCredit() {
        return studentCredit;
    }

    public String toString() {
        return getStudentCode() + " " + getStudentName() + " " + getStudentCredit();
    }
}
