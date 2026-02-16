package chapter9.New;

import javax.swing.JFrame;

public class ex2 {
    public static void main(String[] args) {
        new MyJFrame();
    }
}

class MyJFrame {
    JFrame window;
    public MyJFrame() {
        window = new JFrame("Create Object JFrame in Class");
        window.setSize(500,300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
