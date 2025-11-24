// package chapter6;

// import java.awt.Font;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex11 {
//     int grades[][] = { {77, 68, 86, 73},
//                        {96, 87, 89, 81},
//                        {70, 90, 86, 81} };
//     int students, exams;
//     String output;
//     JTextArea outputArea;

//     public ex11() {
//         students = grades.length;
//         exams = grades[0].length; // number of students
//         // create JTextArea and attach to applet
//         outputArea = new JTextArea();
//         // build output string
//         output = "The array is:\n";
//         buildString();
//         output += "\n\nLowest grade: " + minimum() + "\nHighest grade: " + maximum() + "\n";
//         // call method average to calculate each students' average
//         for ( int counter = 0; counter < students; counter++)
//             output += "\nAverage for student " + counter + " is " + average( grades[counter]); // pass one row of array grades

//         // change outputArea's display font
//         outputArea.setFont(new Font("Consolas", Font.PLAIN, 14));  // สร้างอ็อบเจกต์ Font ขึ้นมาใหม่   กำหนดให้ใช้ฟอนต์ชื่อ "Consolas" ซึ่งเป็นฟอนต์แบบแบบแบบ monospaced หรือ fixed-width   กำหนดสไตล์เป็น Font.PLAIN คือฟอนต์ปกติ (ไม่หนา ไม่เอียง)    กำหนดขนาดฟอนต์เป็น 14 พิกเซล
//         // place output string in outputArea
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea);
//     } // end method init

//     public int minimum() {
//         // assume first element of grades array is smllest
//         int lowGrade = grades[0][0];
//         // loop through rows of grades array
//         for (int row = 0; row < students; row++)
//             for (int column = 0; column < exams; column++)
//                 //if grade is less than lowGrade, assign it to lowGrade
//             if (grades[row][column] < lowGrade)
//                 lowGrade = grades[row][column];
//         return lowGrade; // return lowest grade;
//     } // end method minimum

//     public int maximum() {
//         // assume first element of grades arra is largest
//         int hightGrade = grades[0][0];
//         // loop through rows of grades array
//         for (int row = 0; row < students; row++)
//             // loop through columns of current row
//             for (int column = 0; column < exams; column++)
//                 if (grades[row][column] > hightGrade)
//                     hightGrade = grades[row][column];
//         return hightGrade; // retyrb highest grade
//     } // end method maximum

//     // determine average grade for particular student (or set of grades)
//     public double average (int setOfGrades[]) {
//         int total = 0;
//         // sum grades for one student
//         for (int count = 0; count < setOfGrades.length; count++)
//             total += setOfGrades[count];
        
//         // return average of grades
//         return (double) total / setOfGrades.length;
//     } // end method average

//     // build output String
//     public void buildString() {
//         output += "           "; // used to align column heads
//         for (int counter = 0; counter < exams; counter++)
//             output += "[" + counter + "]   ";
//         // create rows/columns of text representing array grades
//         for (int row = 0; row < students; row++) {
//             output += "\ngrades[" + row + "]   ";
//             for  (int column = 0; column < exams; column++)
//                 output += grades[row][column] + "    ";
//         }
//     } // end method buildString

//     public static void main(String[] args) {
//         new ex11();
//     }
// }




// package chapter6;

// import java.awt.Font;
// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex11 {

//     int grades[][] = { {77, 68, 86, 73}, {96, 87, 89, 81}, {70, 90, 86, 81} };
//     int students, exams;
//     String output;
//     JTextArea outputArea;

//     public ex11() {
//         students = grades.length;
//         exams = grades[0].length;
//         outputArea = new JTextArea();
//         output = "The array is:\n";
//         buildString();
//         output += "\n\nLowest grade: " + minimum() + "\nHighest grade: " + maximum() + "\n";
//         for (int counter = 0; counter < students; counter++)
//             output += "\nAverage for student " + counter + "  is  " + average(grades[counter]);
//         outputArea.setFont(new Font("Consolas", Font.PLAIN, 14));
//         outputArea.setText(output);
//         JOptionPane.showMessageDialog(null, outputArea);
//     }

//     public void buildString() {
//         output += "           ";
//         for (int counter = 0; counter < exams; counter++)
//             output += "[" + counter + "]   ";
//         for (int row = 0; row < students; row++) {
//             output += "\ngrades[" + row + "]   ";
//             for (int column = 0; column < exams; column++) {
//                 output += grades[row][column] + "    ";
//             }
//         }
//     }

//     public int minimum() {
//         int lowGrade = grades[0][0];
//         for (int row = 0; row < students; row++)
//             for (int column = 0; column < exams; column++)
//                 if (grades[row][column] < lowGrade)
//                     lowGrade = grades[row][column];
//         return lowGrade;
//     }

//     public int maximum() {
//         int highGrade = grades[0][0];
//         for (int row = 0; row < students; row++)
//             for (int column = 0; column < exams; column++)
//                 if (grades[row][column] > highGrade)
//                 highGrade = grades[row][column];
//         return highGrade;
//     }

//     public double average(int setOfGrades[]) {
//         int total = 0;
//         for (int counter = 0; counter < setOfGrades.length; counter++)
//             total += setOfGrades[counter];

//         return (double) total / setOfGrades.length;
//     }

//     public static void main(String[] args) {
//         new ex11();
//     }
// }












// int min = Arrays.stream(array).min().getAsInt();
// int max = Arrays.stream(array).max().getAsInt();

// double average = Arrays.stream(array).average().getAsDouble();


package chapter6;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex11 {
    int grades[][] = {{77, 68, 86, 73}, {96, 87, 89, 81}, {70, 90, 86, 81}};
    String output;
    int students, exams;
    JTextArea outputArea = new JTextArea();

    public ex11() {
        students = grades.length;
        exams = grades[0].length;
        output = "The array is:\n";
        buildOutput();
        output += "\nLowest grade: " + minimum() + "\nHighest grade: " + maximum() + "\n\n";
        for (int counter = 0; counter < students; counter++)
            output += "Average for student " + counter + " is " + average(grades[counter]) + "\n";
        outputArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea);
        System.exit(0);
    }

    public void buildOutput() {
        output += "           ";
        for (int count = 0; count < exams; count++)
            output += "[" + count + "]  ";
        output += "\n";
        for (int row = 0; row < students; row++) {
            output += "grades[" + row + "]   ";
            for (int column = 0; column < exams; column++)
                output += grades[row][column] + "   ";
            output += "\n";
        }
    }

    public int minimum() {
        int lowgrade = grades[0][0];
        for (int row = 0; row < students; row++)
            for (int column = 0; column < exams; column++)
                if (grades[row][column] < lowgrade)
                    lowgrade = grades[row][column];
        return lowgrade;
    }

    public int maximum() {
        int highgrade = grades[0][0];
        for (int row = 0; row < students; row++)
            for (int column = 0; column < exams; column++)
                if (grades[row][column] > highgrade)
                    highgrade = grades[row][column];
        return highgrade;
    }

    public double average(int setOfGrades[]) {
        int total = 0;
        for (int column = 0; column < exams; column++)
            total += setOfGrades[column];
        return (double) total / exams;
    }

    public static void main(String[] args) {
        new ex11();
        
    }
}