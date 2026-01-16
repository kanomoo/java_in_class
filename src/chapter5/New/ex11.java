package chapter5.New;

import javax.swing.JOptionPane;

public class ex11 {

    public static void main(String[] args) {
        String choiceStr, strMenu;
        boolean done = true;
        int _main, $main, Main, main;
        strMenu = ">> Main Menu  <<\n 1. Random Integer Number(1 - 100)\n";
        strMenu += " 2. Check Prime Number\n 3. Convert Number Decimal to Binary\n";
        strMenu += " 4. Exit\n Enter choice : ";
        do {
            choiceStr = JOptionPane.showInputDialog(strMenu);
            if (choiceStr != null && choiceStr.length() > 0) {
                if (choiceStr.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Select choice 1", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (choiceStr.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Select choice 2", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (choiceStr.equals("3")) {
                    JOptionPane.showMessageDialog(null, "Select choice 3", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (choiceStr.equals("4")) {
                    done = false;
                } else {
                    JOptionPane.showMessageDialog(null, "no this cohice", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }
        } while (done);
        JOptionPane.showMessageDialog(null, "Exit Program!", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}