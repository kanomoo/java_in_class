package chapter10.New;


public class Register {
    private Student std;
    private Subject sub[];
    private int max = 3;
    private int count = -1;

    public Register() {
    }

    public Register(Student std, int n) {
        this.std = std;
        max = n;
        sub = new Subject[max];
    }

    public void setStudent(Student std) {
        this.std = std;
    }

    public void setSubject(Subject sub) {

        if (count < max) {
            ++count;
            this.sub[count] = sub;
        }
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
