package chapter4;

import javax.swing.JOptionPane;

public class ex10 {
    public static void main(String[] args) {
        String output = "Number input: ";
        int max = 0;
        int min = 0;
        for (int i = 1; i <= 5; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter integer number #" + i)); // แปลง string เป็น int 
            max = Math.max(max, num);
            min = Math.min((i == 1) ? max : min, num); // ต้องใช้ max มาเปรียบเทียบรอบแรกเพราะให้ตัวเปรียเทียบเป็น 0 ไม่ได้
            output += num + " ";
        }
        JOptionPane.showMessageDialog(null, output + "\nMinimum value = " + min + "\nMaximum value = " + max, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}