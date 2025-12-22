package chapter9.test3;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterApplication extends JFrame implements ActionListener {
    Register reg;
    Student[] std;
    Subject[] sub;
    Container container = getContentPane();
    JPanel panelStd, panelSubJ, panelResult, panelCom;
    JComboBox comboStd, comboSub;
    String[] stringStd, stringSub;

    public RegisterApplication() {
        super(">>> RegisterApplication <<<");
        container.setLayout(new FlowLayout());
        initStd();
        initGui();
        setSize(600, 500);
        setVisible(true);
        setLocation(500, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initStd() {
        stringStd = new String[3];
        std = new Student[3];
        std[0] = new Student("600603190020", "Paphavin", "Thiti");
        std[1] = new Student("600603183240", "Warunya", "Gapung");
        std[2] = new Student("600603950300", "Pimwaree", "Mahawang");
        for (int n = 0; n < std.length; n++)
            stringStd[n] = std[n].toString();
    }
    
    public void initGui() {
        container.add(new JLabel("Course Registration Program"));
        guiStd();
    }

    public void guiStd() {
        panelStd = new JPanel();
        panelStd.setLayout(new FlowLayout());
        panelStd.setPreferredSize(new Dimension(455,80));
        panelStd.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panelStd.add(new JLabel("Select Student: "));
        comboStd = new JComboBox<>(stringStd);
        panelStd.add(comboStd);
        container.add(panelStd);
    }

    public void actionPerformed(ActionEvent event) {
    }
}
