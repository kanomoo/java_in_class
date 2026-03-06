package chapter10.New;

import java.awt.Container;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        new myJFrame();
    }
}

class myJFrame extends JFrame {
    Container c = getContentPane();
    public myJFrame() {
        super();
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}