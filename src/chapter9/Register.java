package chapter9;

public class Register {
    private Student std;
    private Subject subject[];
    private int max = 3, count = -1;

    // Creates a new instance of Register
    public Register() {
        std = new Student();
        subject = new Subject[max];
    }

    public Register(Student std, int n) {
        this.std = std;
        this.max = n;
        subject = new Subject[this.max];
    }

    public void setStudent(Student std) {
        this.std = std;
    }

    public void setSubject(Subject sub) {
        this.subject[++count] = sub;
    }

    public void setSubject(Subject sub, int n ) {
        this.subject[n] = sub;
    }

    public String getStudent() {
        return std.toString();
    }

    public String getSubject(int n) {
        return subject[n].toString();
    }
}
