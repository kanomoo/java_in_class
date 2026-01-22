package Ass3;

import javax.swing.JOptionPane;

public class Ass3_02 {
    int startH, startM, startS;
    int endH, endM, endS;
    String start;
    String end;
    public void start() {
        start = JOptionPane.showInputDialog("Enter start time : ");
        setStartTime(start);
        end = JOptionPane.showInputDialog("Enter end time : ");
        setEndTime(end);
        timeUse();
    }

    public void setStartTime(String str) {
        if (str.length() == 8) {
            startH = Integer.parseInt(str.substring(0, 2));
            startM = Integer.parseInt(str.substring(3, 5));
            startS = Integer.parseInt(str.substring(6, 8));
        }
    }

    public void setEndTime(String str) {
        if (str.length() == 8) {
            endH = Integer.parseInt(str.substring(0, 2));
            endM = Integer.parseInt(str.substring(3, 5));
            endS = Integer.parseInt(str.substring(6, 8));
        }
    }

    public void timeUse() {
        if (startH > endH) {
            String output = "Start Time : " + start + "\nEnd Time : " + end + "\nTime used : " + (startH - endH) + " Hours " + (startM - endM) + " minutes" + (startS - endS) + " seconds.";
            JOptionPane.showMessageDialog(null, output);
        }
        else {
            String output = "Start Time : " + start + "\nEnd Time : " + end + "\nTime used : " + (endH - startH ) + " Hours " + (endM - startM) + " minutes " + (endS - startS) + " seconds.";
            JOptionPane.showMessageDialog(null, output);

        }
    }

    public static void main(String[] args) {
        new Ass3_02().start();
    }
}
