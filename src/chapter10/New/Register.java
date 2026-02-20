package chapter10.New;


public class Register {
    private Student std;
    private Subject sub[];
    private int max = 3;
    private int count = -1;

    public Register() {
    }

    public Register(Student std, int n) {
        
    }

    public void setStudent(Student std) {
        this.std = std;
    }

    public void setSubject(Subject sub) {
        if (count < max) {
            this.sub[count] = sub;
            ++count;
        }
    }

    public void setSubject(Subject sub, int n) {
        this.sub[n] = sub;
    }

    public String getStudent() {
        return std.toString();
    }

    public String getSubject() {
        return sub.toString();
    }
}
