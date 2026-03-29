package Final;

import java.util.Arrays;

public class Student extends Person{
    private String id, grade[] = new String[5];

    public Student() {
    }

    public Student(String id, String name, String surname, String[] grade) {
        super(name, surname);
        this.id = id;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getGrade() {
        return grade;
    }

    public void setGrade(String[] grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", grade=" + Arrays.toString(grade) + "]";
    }



}
