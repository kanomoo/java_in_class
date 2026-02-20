package chapter10.New;

public class Subject {
    private String subjectCode = "";
    private String subjectName = "";
    private int subjectCredit = 3;

    public Subject(String subjectCode, String subjectName, int subjectCredit) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectCredit = subjectCredit;
    }

    public Subject() {
        
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectCredit() {
        return subjectCredit;
    }

    public void setSubjectCredit(int subjectCredit) {
        this.subjectCredit = subjectCredit;
    }

    @Override
    public String toString() {
        return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", subjectCredit="
                + subjectCredit + "]";
    }

}
