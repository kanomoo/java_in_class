package Final;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppLoan_StudentID extends JFrame implements ActionListener{
    JPanel panelFrom, panelBtn, panelReport;
    JTextField textPrice, textRate;
    JComboBox<String> comboDown, comboMont;
    Font font = new Font("Courier New", Font.BOLD, 20);
    Container c = getContentPane();

    public static void main(String[] args) {
        new AppLoan_StudentID();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
    }

    AppLoan_StudentID() {
        super("AppLoan version 1.0 - 6806021612037 - Phapavin Thitichunkahun");
        c.setLayout(new FlowLayout());
        initData();
        initGui();
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void initData() {
        String[] listDown = {"0","5","10","15","20"}, listMont = {"2","4","8","12","24","36","48"};
        comboDown = new JComboBox<>(listDown); comboMont = new JComboBox<>(listMont);
        comboDown.setFont(font); comboMont.setFont(font);
    }

    public void initGui() {
        panelFrom = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelFrom.setPreferredSize(new Dimension(400,200));
        panelFrom.setBorder(new LineBorder(Color.ORANGE,2));
        panelFrom.add(createLabel("        Price : ")); panelFrom.add(textPrice = new JTextField(10)); textPrice.setFont(font);
        panelFrom.add(createLabel(" Down Payment : ")); panelFrom.add(comboDown);
        panelFrom.add(createLabel("Interest Rate : ")); panelFrom.add(textRate = new JTextField(10)); textRate.setFont(font);
        panelFrom.add(createLabel("Interest Rate : ")); panelFrom.add(comboMont);
        c.add(panelFrom);
    }

    public JLabel createLabel(String title) {
        JLabel label = new JLabel(title); label.setFont(font); return label;
    }




}
