package chapter10.New;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class RegisterApplication extends JFrame implements ActionListener {
    Register reg;
    Student std[];
    Subject sub[];
    JPanel panelStd, panelSub, panelResult, panelBtn;
    JComboBox<String> comboStd;
    JButton btnStd, btnSub, btnSave, btnCancle;
    Container c = getContentPane();

    public static void main(String[] args) {
        new RegisterApplication();
    }
    
    public RegisterApplication() {
        super(">>> Program Register <<<");
        initGui();
        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        c.add(new JLabel("Course Registration Program"));
        initPanelStd();
    }

    public void initPanelStd() {
        panelStd = createPanel(450, 100);
        panelStd.add(new JLabel("Select Student : "));
        std = new Student[3];
        std[0] = new Student("6806021612037", "Paphavin", "Thitichunhakun");
        std[1] = new Student("6806021616789", "John", "Smit");
        std[2] = new Student("6806021617389", "Zim", "Son");
        String stdString[] = new String[std.length];
        for (int i = 0; i < std.length; i++) {
            stdString[i] = std[0].toString();
        }
        panelStd.add(comboStd = new JComboBox<>(stdString));
    }

    public void initPanelSub() {

    }

    public void initPanelResult() {

    }

    public void initPanelBtn() {

    }

    public JPanel createPanel(int width, int heigh) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width, heigh));
        panel.setBorder(new LineBorder(Color.BLACK));
        c.add(panel);
        return panel;
    }

    public JButton createBtn(String title) {
        JButton btn = new JButton(title);
        btn.
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
