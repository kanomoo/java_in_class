package Final;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Report_StudentID extends JFrame implements ActionListener {
    JPanel panelForm, panelReport;
    JLabel labelName;
    JComboBox<String> comboName;
    Container c = getContentPane();
    Student student;
    Font font = new Font("Courier New", Font.BOLD, 18);
    public static void main(String[] args) {
        new Report_StudentID();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        
    }

    Report_StudentID() {
        super("Report Student version - 1.0 : 6806021612037 Phapavin Thitichunhakun");
        c.setLayout(new FlowLayout());
        initData();
        initGui();
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void initData() {
        
    }

    public void initGui() {
        panelForm = new JPanel(new FlowLayout());
        panelForm.setPreferredSize(new Dimension(450,50));
        panelForm.setBorder(new LineBorder(Color.ORANGE,3));
        panelForm.add(labelName = new JLabel("Select name : ")); labelName.setFont(font);
        
        c.add(panelForm);
    }
}
