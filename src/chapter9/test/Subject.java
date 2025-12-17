package chapter9.test;

public class Subject {
    private String subjectCode = "";
    private String subjectName = "";
    private int subjectCredit = 3;

    public Subject() {
        
    }
    
    public Subject(String code, String name, int credit) {
        setSubjectCode(code);
        setSubjectName(name);
        setSubjectCredit(credit);
}

    public void setSubjectCode(String code) {
        subjectCode = code;
    }

    public void setSubjectName(String name) {
        subjectName = name;
    }

    public void setSubjectCredit(int credit) {
        subjectCredit = credit;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectCredit() {
        return subjectCredit;
    }

    public String toString() {
        return getSubjectCode() + " " + getSubjectName() + " " + getSubjectCredit();
    }
}
