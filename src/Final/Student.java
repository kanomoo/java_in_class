package Final;

public class Student extends Person{
    private String id, grade[] = new String[5];

    public Student() {
    }

    public Student(String id, String name, String surname, String[] grade) {
        super(name, surname);
        this.id = id;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getGrade() {
        return grade;
    }

    public void setGrade(String[] grade) {
        this.grade = grade;
    }

    public String toReportGpa() {
        String output = "";
        double  point, credit = 15.0, totalPoint = 0.0; int count = 1;
        for (String strGrade : grade) {
            if (strGrade.equals("A")) point = 4.0 * 3.0;
            else if (strGrade.equals("B+")) point = 3.5 * 3.0;
            else if (strGrade.equals("B")) point = 3.0 * 3.0;
            else if (strGrade.equals("C+")) point = 2.5 * 3.0;
            else if (strGrade.equals("C")) point = 2.0 * 3.0;
            else if (strGrade.equals("D+")) point = 1.5 * 3.0;
            else if (strGrade.equals("D")) point = 1.0 * 3.0;
            else point = 0.0;
            totalPoint += point;
            output += "Grade " + count++ + " (" + strGrade + ") : Credit 3.0 : Point " + point + "\n";
        }
        output += "========================";
        output += "\nTotal Credit " + credit + "\nTotal Point " + totalPoint + "\nGrade Point Average (GPA) : " + String.format("%.2f", (totalPoint / credit))  + "\n========================";
        return output;
    }

    @Override
    public String toString() {
        String output = "";
        output += "========================\nStudent ID : " + id + "\nStudent Name : " + super.toString() + "\n========================" + "\n" + toReportGpa();
        return output;
    }



}
