package chapter9.New;

import javax.swing.JFrame;

public class ex1 {
    public void startMain() {
        JFrame window = new JFrame("Create Object JFrame in Method main");
        window.setSize(500,300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ex1().startMain();
    }
}
