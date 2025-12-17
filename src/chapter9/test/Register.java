package chapter9.test;

public class Register {
    private Student std;
    private Subject[] subjects;
    private int max = 3, count = 0;

    public Register() {
        std = new Student();
        subjects = new Subject[max];
    }
    
    public Register(Student std, int n) {
        this.std = std;
        this.max = n;
        subjects = new Subject[this.max];
    }

    public void setStudent(Student std) {
        this.std = std;
    }

    public void setSubject(Subject sub) {
        this.subjects[count++] = sub;
    }

    public void setSubject(Subject sub, int n) {
        this.subjects[n] = sub;
    }

    public String getStudent() {
        return std.toString();
    }

    public String getSubject(int n) {
        return subjects[n].toString();
    }
}