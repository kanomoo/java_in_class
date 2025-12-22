package chapter9.test3;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterApplication extends JFrame implements ActionListener {
    Container container = getContentPane();
    JPanel panelStd, panelSubJ, panelResult, panelCom;

    public RegisterApplication() {
        super(">>> RegisterApplication <<<");
        container.setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setLocation(500, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent event) {
    }
}
