// package chapter8;

// import java.awt.Color;
// import java.awt.Container;
// import java.awt.Dimension;
// import java.awt.FlowLayout;

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.border.LineBorder;

// public class MyPanel {
//     JFrame window;
//     JPanel panel1, panel2;
//     Container c;
//     public MyPanel() {
//         window = new JFrame("Test JPanel");
//         c = window.getContentPane();
//         c.setLayout(new FlowLayout());
//         panel1 = new JPanel();
//         panel1.setPreferredSize(new Dimension(350, 120)); // setPreferredSize(...) บอกความต้องการขนาด อ็อบเจ็กต์ Dimension(350, 120) ซึ่งแทนค่ากว้าง สูง พิกเซล        setPreferredSize(new Dimension(w, h)) = บอก layout manager ว่า “อยากได้ขนาดประมาณนี้” เลยใช้ Dimension แทนเลขสองตัว เพื่อให้เข้าชุดกับ API ด้านขนาดทั้งหมดของ Swing layout manager จะพยายามจัดให้ได้ใกล้เคียง แต่สุดท้ายจะ หดให้พอดีกับพื้นที่ที่มี
//         panel1.setLayout(new FlowLayout());
//         panel1.setBorder(new LineBorder(Color.RED, 3)); // เอา border ที่สร้างขึ้นไป “ใส่” ให้ panel1 คือ new LineBorder(Color.RED, 3) สร้างออบเจกต์เส้นขอบแบบเส้นตรง (LineBorder) สีแดง (Color.RED) ความหนา 3 พิกเซล
//         panel1.add(new JLabel("This is JPanel 1"));

//         panel2 = new JPanel();
//         panel2.setPreferredSize(new Dimension(350, 120));
//         panel2.setLayout(new FlowLayout());
//         panel2.setBorder(new LineBorder(Color.BLUE, 3)); // ใส่เส้นขอบสีแดงหนา 3 พิกเซล (LineBorder(Color.RED, 3)
//         panel2.add(new JLabel("This is JPanel 2"));

//         window.add(panel1);
//         window.add(panel2);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         window.setSize(400, 300);
//         window.setVisible(true);
//         window.setResizable(false); //ไม่ให้ผู้ใช้ปรับขนาดหน้าต่าง
//     }
// }




// package chapter8;

// import java.awt.Color;
// import java.awt.Container;
// import java.awt.Dimension;
// import java.awt.FlowLayout;

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.border.LineBorder;

// public class MyPanel {
//     JFrame window = new JFrame("Test JPanel");
//     JPanel panel1, panel2;
//     Container c = window.getContentPane();
//     public MyPanel() {
//         c.setLayout(new FlowLayout());
//         panel1 = new JPanel();
//         panel1.setLayout(new FlowLayout());
//         panel1.setPreferredSize(new Dimension(350, 120));
//         panel1.setBorder(new LineBorder(Color.RED, 3));
//         panel1.add(new JLabel("This is JPanel 1"));


//         panel2 = new JPanel();
//         panel2.setLayout(new FlowLayout());
//         panel2.setPreferredSize(new Dimension(350, 120));
//         panel2.setBorder(new LineBorder(Color.BLUE, 3));
//         panel2.add(new JLabel("This is JPanel 2"));

//         window.add(panel1);
//         window.add(panel2);
//         window.setSize(400, 300);
//         window.setVisible(true);
//         window.setResizable(false);
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }



package chapter8;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MyPanel {
    JFrame window = new JFrame("Test JPanel");
    JPanel panel1, panel2;
    Container c = window.getContentPane();
    public MyPanel() {
        c.setLayout(new FlowLayout());
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setPreferredSize(new Dimension(350, 120));
        panel1.setBorder(new LineBorder(Color.RED, 3));
        panel1.add(new JLabel("This is JPanel 1"));
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setPreferredSize(new Dimension(350, 120));
        panel2.setBorder(new LineBorder(Color.BLUE, 3));
        panel2.add(new JLabel("This is JPanel 2"));
        window.add(panel1);
        window.add(panel2);
        window.setSize(400, 300);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}