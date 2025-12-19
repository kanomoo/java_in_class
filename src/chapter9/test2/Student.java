package chapter9.test2;

public class Student {
    private String code;
    private String name;
    private String surname;

    public Student() {

    }

    public Student(String code, String name, String surname) {
        this.code = code;
        this.name = name;
        this.surname = surname;
    }

    public void setStudentCode(String code) {
        this.code = code;
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public void setStudentSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentCode() {
        return code;
    }

    public String getStudentName() {
        return name;
    }

    public String getStudentSurname() {
        return surname;
    }

    public String toString() {
        return code + " " + name + " " + surname;
    }
}
