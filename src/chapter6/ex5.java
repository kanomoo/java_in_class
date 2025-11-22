// package chapter6;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex5 {
//     public void studentPol() {
//         int reponses[] =  {1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 4, 8, 6, 8, 10};
//         int frequency[] = new int[11];

//         // for each answer, select reponses element and use that value
//         // as frequency index to determine element to increment
//         for (int answer = 0; answer < reponses.length; answer++)
//             ++frequency[reponses[answer]]; // ใช้ ++ด้านหน้า ค่าจะถูกบวกก่อน แต่ใน code ไม่ได้ต่างจาก ++ หลัง
//         String output = "Raing\tFrequency\n";
//         // append frequencies to String output
//         for (int rating = 1; rating < frequency.length; rating++)
//             output += rating + "\t" + frequency[rating] + "\n";

//         JTextArea outputArea = new JTextArea();
//         outputArea.setText(output);

//         JOptionPane.showMessageDialog(null, outputArea, "Student Poll Program", JOptionPane.INFORMATION_MESSAGE);
//         System.exit(0);
//     } // end main

//     public static void main(String[] args) {
//         ex5 obj = new ex5();
//         obj.studentPol();
//     }
// }



package chapter6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex5 {

    public void studentPol() {
        int reponses[] = {1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 6, 7, 5, 6, 6, 5, 7, 5, 6, 4, 8, 6, 8, 10};
        int frequency[] = new int[11];
        String output = "Rating\tFrequency\n";
        for (int i = 0; i < reponses.length; i++)
            frequency[reponses[i]]++;
        for (int i = 1; i < frequency.length; i++)
            output += i + "\t" + frequency[i] + "\n";
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Student Poll Program", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void main(String[] args) {
        new ex5().studentPol();
    }
}