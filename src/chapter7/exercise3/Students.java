package chapter7.exercise3;

public class Students {
    private long id;
    private String name;
    private int score;
    private String grade;
    private String data = "";

    public Students() {
    }

    public void setStudentsId(long id) {
        this.id = id;
    }

    public void setStudentsname(String name) {
        this.name = name;
    }

    public void setStudentsScore(int score) {
        this.score = score;
    }

    public long getStudentsId() {
        return id;
    }

    public String getStudetnsName() {
        return name;
    }

    public int getStudentsScore() {
        return score;
    }

    public String grade(int score) {
        if (score >= 80) this.grade = "A";
        else if (score >= 75) this.grade = "B+";
        else if (score >= 70) this.grade = "B";
        else if (score >= 65) this.grade = "C+";
        else if (score >= 60) this.grade = "C";
        else if (score >= 55) this.grade = "D+";
        else if (score >= 50) this.grade = "D";
        else this.grade = "F";
        return this.grade;
    }

    public void addData(long id, String name, int score) {
        this.data += id + "\t" + name + "\t" + score + "\t" + grade(score) + "\n";
    }
    
    public String showData() {
        return data;
    }
}