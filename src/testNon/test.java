package testNon;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class test {
    JTextArea textArea;
    public static void main(String[] args) {
        new test();
    }

    test() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter num :"));
        String output = "";
        for(int i = 0; i < num; i++) output += "*".repeat(i) + "\n";
        textArea = new JTextArea(output); textArea.setOpaque(false);
        JOptionPane.showMessageDialog(null, textArea);
    }

        
}