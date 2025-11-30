package chapter8;

import javax.swing.JFrame;

public class MyJFrame {
    JFrame window;
    public MyJFrame() {
        window = new JFrame("Create Object JFrame in Class");
        window.setSize(400, 400);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
