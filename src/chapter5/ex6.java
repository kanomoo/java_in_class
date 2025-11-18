// package chapter5;

// import java.text.DecimalFormat;

// import javax.swing.JOptionPane;
// import javax.swing.JTextArea;

// public class ex6 {
//     public void start() {
//         String output = "";
//         double principle, rate;
//         int year;
//         principle = Double.parseDouble(JOptionPane.showInputDialog("Enter principle : "));
//         year = Integer.parseInt(JOptionPane.showInputDialog("Enter year :"));
//         rate = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate(%) : "));
//         output = calAmount(principle, rate, year);
//         JTextArea outpuTextArea = new JTextArea();
//         outpuTextArea.setText(output);
//         JOptionPane.showMessageDialog(null, outpuTextArea);
//         System.exit(0);
//     }
//     public String calAmount(double principle, double rate, int year) {
//         String result = "";
//         double amount, interest;
//         DecimalFormat two = new DecimalFormat("#,###,##0.00");

//         result = "Principle : " + two.format(principle);
//         result += ", Inteest Rate : " + two.format(rate) + "%";
//         result += ", Year : " + year + "\n";
//         amount = principle;
//         rate = rate / 100;
//         result += "===============================================\n";
//         result += "Year\tPrinciple\tIIInterest\tTotal\n";
//         result += "===============================================\n";
//         for (int n = 1; n <= year; n++) {
//             interest = amount * rate;
//             result += n + "\t" + two.format(amount) + "\t" + two.format(interest) + "\t";
//             amount = amount + interest;
//             result += two.format(amount) + "\n";
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         new ex6().start();
//     }
// }


package chapter5;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex6 {
    public void start() {
        String output = "";
        double principle = Double.parseDouble(JOptionPane.showInputDialog("Enter principle : "));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter year :"));
        double interest = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate(%):"));
        JTextArea outpuTextArea = new JTextArea();
        outpuTextArea.setText(output);

    }
    public void calAmount() {
        
    }
}