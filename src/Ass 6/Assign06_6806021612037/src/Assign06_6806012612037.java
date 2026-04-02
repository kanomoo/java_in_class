// Id    :  68-060216-1203-7
// Name  :  Mr.Paphavin Thitichunhakun
// Room  :  1 RC
// File Name Assign06_6806021612037.java
import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Assign06_6806012612037 {
    String output;
    JTextArea textArea;
    Random rnd = new Random();
    Score score;
    String dataScore[];
    int count = 0;
    public static void main(String[] args) throws Exception {
        Assign06_6806012612037 obj = new Assign06_6806012612037();
        obj.mainProgram();
    }

    public void mainProgram() {
        while (true) {
            String input = JOptionPane.showInputDialog("Enter number of students (0-exit) : ");
            if (input == null || input.equals("0")) {JOptionPane.showMessageDialog(null, "Exit Program..."); System.exit(0);}
            else if (input.isEmpty()) { System.exit(0);}
            else if (Integer.parseInt(input) <= 20 && Integer.parseInt(input) > 0) {
                dataScore = new String[(Integer.parseInt(input) * 5)];
                count = 0;
                output = "No.\tMid\tFinal\tHW\tTotal\tGrade\n====================================================================\n";
                for (int i = 0; i < Integer.parseInt(input); i++) {
                    dataScore[count] = String.valueOf(i + 1); genScore();
                }
                report();
            }
            else JOptionPane.showMessageDialog(null, "Number of students not correct.");
        }
        
    }

    public void genScore() {
        dataScore[count + 1] = String.valueOf(rnd.nextDouble(31)); dataScore[count + 2] = String.valueOf(rnd.nextDouble(41)); dataScore[count + 3] = String.valueOf(rnd.nextDouble(31));
        score = new Score(Double.parseDouble(dataScore[count + 1]) , Double.parseDouble(dataScore[count + 2]), Double.parseDouble(dataScore[count + 3]));
        dataScore[count + 4] = score.toGrade();
        output += dataScore[count] + "\t" + score.toString();
        count += 4;
    }

    public void report() {
        textArea = new JTextArea(output);
        JOptionPane.showMessageDialog(null, textArea);
    }
}

class Score {
    private double midtermExam = 0.0;
    private double finalExam = 0.0;
    private double homework = 0.0;

    public Score() {}

    public Score(double m, double f, double h) {
        midtermExam = m;
        finalExam = f;
        homework = h;
    }

    public double getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(double midtermExam) {
        this.midtermExam = midtermExam;
    }

    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    public double getHomework() {
        return homework;
    }

    public void setHomework(double homework) {
        this.homework = homework;
    }

    public double toSum() {
        return midtermExam + finalExam + homework;
    }
    
    public String toGrade() {
        String grade;
        if (toSum() >= 80) grade = "A";
        else if (toSum() >= 70) grade = "B";
        else if (toSum() >= 60) grade = "C";
        else if (toSum() >= 50) grade = "D";
        else grade = "F";
        return grade;
    }

    public String toString() {
        DecimalFormat twoDigit = new DecimalFormat("#0");
        return twoDigit.format(midtermExam) + "\t" + twoDigit.format(finalExam) + "\t" + twoDigit.format(homework) + "\t" + twoDigit.format(toSum()) + "\t" + toGrade() + "\n";
    }
}