package chapter9.test;

public class Student {
    private String studentCode = "";
    private String studentName = "";
    private String studentSurname = "";

    public Student(String code, String name, String surname) {
        setStudentCode(code);
        setStudentName(name);
        setStudentSurname(surname);
    }

    public void setStudentCode(String code) {
        studentCode = code;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public void setStudentSurname(String surname) {
        studentSurname = surname;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public String toString() {
        return getStudentCode() + " " + getStudentName() + " " + getStudentSurname();
    }
}
