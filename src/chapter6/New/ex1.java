package chapter6.New;

import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args) {
        ex1.createWithNew();
        ex1.createWithInitial();
        System.exit(0);
    }

    public static void createWithInitial() {
        int array[] = new int [10];
        String output = "Create with new statement\nIndex Value\n";
        for (int index = 0; index < array.length; index++) {
            output += String.format("%5d%7d", index, array[index]) + "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }

    public static void createWithNew() {
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        String output = "Create with new statement\nIndex Value\n";
        for (int index = 0; index < array.length; index++) {
            output += String.format("%5d%7d", index, array[index]) + "\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
