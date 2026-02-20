package chapter10.New;

public class Student {
    private String stdId = "";
    private String stdName = "";
    private String stdSurname = "";

    public Student() {
    }

    public Student(String stdId, String stdName, String stdSurname) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdSurname = stdSurname;
    }

    public String getStdId() {
        return stdId;
    }
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
    public String getStdName() {
        return stdName;
    }
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
    public String getStdSurname() {
        return stdSurname;
    }
    public void setStdSurname(String stdSurname) {
        this.stdSurname = stdSurname;
    }

    @Override
    public String toString() {
        return stdId + " " + stdName + " " + stdSurname;
    }
    
}
