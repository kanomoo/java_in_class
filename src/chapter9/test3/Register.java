package chapter9.test3;

public class Register {
    private Student std;
    private Subject[] sub;
    private int max = 3, count = 0 ;

    public Register() {
        std = new Student();
        sub = new Subject[max];
    }

    public Register(Student std, int n) {
        this.std = std;
        this.max = n;
        sub = new Subject[n];
    }

    public void setStudent(Student std) {
        this.std = std;
    }

    public void setSubject(Subject sub) {
        this.sub[count++] = sub;
    }

    public void setSubject(Subject sub, int n) {
        this.sub[n] = sub;
    }

    public String getStudent() {
        return std.toString();
    }

    public String getSubject(int n) {
        return sub[n].toString();
    }

}
