// package chapter9.New;

// import java.awt.Color;
// import java.awt.Container;
// import java.awt.Dimension;
// import java.awt.FlowLayout;

// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.border.LineBorder;

// public class ex3 {
//     public static void main(String[] args) {
//         new MyWindow();
//     }
// }

// class MyWindow {
//     JFrame window = new JFrame("Test JPanel");
//     JPanel panel1, panel2;
//     Container c;
//     public MyWindow() {
//         c = window.getContentPane();
//         c.setLayout(new FlowLayout());
//         panel1 = new JPanel();
//         panel1.setPreferredSize(new Dimension(350, 120));
//         panel1.setLayout(new FlowLayout());
//         panel1.setBorder(new LineBorder(Color.RED, 2));

//         panel2 = new JPanel();
//         panel2.setLayout(new FlowLayout());
//         panel2.setPreferredSize(new Dimension(350, 120));
//         panel2.setBorder(new LineBorder(Color.BLUE, 2));

//         window.add(panel1);
//         window.add(panel2);

//         window.setSize(500, 300);
//         window.setVisible(true);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         window.setResizable(false);
//     }
    
// }


package chapter9.New;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ex3 {
    public static void main(String[] args) {
        new MyWindow();
    }
}

class MyWindow {
    JFrame window;
    JPanel panel1, panel2;
    Container c;
    public MyWindow() {
        window = new JFrame("Test JPanel");
        c = window.getContentPane();
        c.setLayout(new FlowLayout());

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setPreferredSize(new Dimension(200,100));
        panel1.setBorder(new LineBorder(Color.RED, 2));

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setPreferredSize(new Dimension(200,100));
        panel2.setBorder(new LineBorder(Color.RED, 2));

        window.setSize(500,200);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
    }
}