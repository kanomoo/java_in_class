
package chapter1;

import javax.swing.JOptionPane;

public class test {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Etner number"));
        JOptionPane.showMessageDialog(null, num + num);
    }
}