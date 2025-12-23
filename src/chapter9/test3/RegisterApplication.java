package chapter9.test3;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
    JPanel panelStd, panelSub, panelResult, panelCom;
    JComboBox<String> comboStd, comboSub;
    JButton addstdBtn, addsubBtn, saveBtn, cancelBtn;
    JTextField textStd;
    JTextArea subTextArea;
    JScrollPane scrollResult;
    String[] stringStd, stringSub;
    int count = 0;

    public RegisterApplication() {
        super(">>> RegisterApplication <<<");
        container.setLayout(new FlowLayout());
        reg = new Register(new Student(), 5);
        initStd();
        initSub();
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

    public void initSub() {
        sub = new Subject[5];
        stringSub = new String[5];
        sub[0] = new Subject("060243103", "Computer Programming", 3);
        sub[1] = new Subject("060243208", "Data Structure", 3);
        sub[2] = new Subject("060243209", "Database System", 3);
        sub[3] = new Subject("060243210", "Data Communication", 3);
        sub[4] = new Subject("060243210", "Data Communication II", 3);
        for (int n = 0; n < sub.length; n++) {
            stringSub[n] = sub[n].toString();
        }
    }
    
    public void initGui() {
        container.add(new JLabel("Course Registration Program"));
        guiStd();
        guiSub();
        guiResult();
        guiCom();
    }

    public void guiStd() {
        panelStd = new JPanel();
        panelStd.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelStd.setPreferredSize(new Dimension(520,80));
        panelStd.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panelStd.add(new JLabel("Select Student : "));
        comboStd = new JComboBox<>(stringStd);
        panelStd.add(comboStd);
        addstdBtn = new JButton("Add Student");
        addstdBtn.addActionListener(this);
        panelStd.add(addstdBtn);
        textStd = new JTextField(45);
        textStd.setEditable(false);
        panelStd.add(textStd);
        container.add(panelStd);
    }

    public void guiSub() {
        panelSub = new JPanel();
        panelSub.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelSub.setPreferredSize(new Dimension(520, 80));
        panelSub.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panelSub.add(new JLabel("Select Subject : "));
        comboSub = new JComboBox<>(stringSub);
        panelSub.add(comboSub);
        addsubBtn = new JButton("Add Subject");
        addsubBtn.setEnabled(false);
        addsubBtn.addActionListener(this);
        panelSub.add(addsubBtn);
        container.add(panelSub);
    }

    public void guiResult() {
        panelResult = new JPanel();
        panelResult.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelResult.setPreferredSize(new Dimension(520, 120));
        panelResult.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        subTextArea = new JTextArea(6,45);
        subTextArea.setEditable(false);
        scrollResult = new JScrollPane(subTextArea);
        panelResult.add(scrollResult);
        container.add(panelResult);
    }

    public void guiCom() {
        panelCom = new JPanel();
        panelCom.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelCom.setPreferredSize(new Dimension(520, 40));
        panelCom.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        saveBtn = new JButton("Save");
        saveBtn.addActionListener(this);
        saveBtn.setEnabled(false);
        panelCom.add(saveBtn);
        cancelBtn = new JButton("Cancel");
        cancelBtn.setEnabled(false);
        cancelBtn.addActionListener(this);
        panelCom.add(cancelBtn);
        container.add(panelCom);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addstdBtn) {
            int n = comboStd.getSelectedIndex();
            textStd.setText(stringStd[n]);
            reg.setStudent(std[n]);
            addstdBtn.setEnabled(false);
            addsubBtn.setEnabled(true);
            saveBtn.setEnabled(true);
            cancelBtn.setEnabled(true);
        }
        else if (event.getSource() == addsubBtn) {
            int n = comboSub.getSelectedIndex();
            subTextArea.append(sub[n].toString() + "\n");
            reg.setSubject(sub[n],count++);
            if (count == 5) {
                addsubBtn.setEnabled(false);
            }
        }
        else if (event.getSource() == saveBtn) {
            String output = "";
            output += "Student : " + reg.getStudent() + "\n";
            output += "Subject : \n";
            for (int n = 0; n < 5; n++) {
                output += reg.getSubject(n) + "\n";
            }
            JOptionPane.showMessageDialog(container, output, "Registration Data", JOptionPane.INFORMATION_MESSAGE);
            resetGui();
        }
        else if (event.getSource() == cancelBtn) {
            resetGui();
        }
    }

    public void resetGui() {
        textStd.setText("");
        subTextArea.setText("");
        addstdBtn.setEnabled(true);
        addsubBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        cancelBtn.setEnabled(false);
        count = 0;
    }
}
