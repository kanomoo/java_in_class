package chapter8;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Tcontainer {
    public static void main(String[] args) {
        JFrame window = new JFrame("Swing Application");

        // create Container
        Container c = window.getContentPane();
        c.setLayout(new FlowLayout());
    }
}
