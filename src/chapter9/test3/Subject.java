package chapter9.test3;

public class Subject {
    private String code;
    private String name;
    private int credit = 3;

    public Subject() {
    }

    public Subject(String code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    public void setSubjectCode(String code) {
        this.code = code;
    }

    public void setSubjectName(String name) {
        this.name = name;
    }

    public void setSubjectCredit(int credit) {
        this.credit = credit;
    }

    public String getSubjectCode() {
        return code;
    }

    public String getSubjectName() {
        return name;
    }

    public int getSubjectCredit() {
        return credit;
    }

    public String toString() {
        return code + " " + name + " " + credit;
    }
}
