package chapter9.test2;

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

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class RegisterApplication extends JFrame implements ActionListener{
    Register reg;
    Student std[];
    Subject sub[];
    Container container;
    JPanel panelStd, panelSub, panelResult, panelCom;
    JComboBox<String> comboStd, comboSub;
    JButton addstdBtn, addsubBtn, saveBtn, cancelBtn;
    JTextField stdText;
    JTextArea resultText;
    JScrollPane resultPane;
    String[] stringStd, stringSub;
    int max = 5, count = 0;

    public RegisterApplication() {
        super(">>> Program Register <<<");
        container = getContentPane();
        container.setLayout(new FlowLayout());
        reg = new Register(new Student(), max);
        initStd();
        initSub();
        initGui();
        setSize(600, 500);
        setVisible(true);
        setLocation(700, 1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initStd() {
        std = new Student[3];
        stringStd = new String[3];
        std[0] = new Student("6806021612037", "Paphavin", "Thiti");
        std[1] = new Student("6806021612456", "Pimwaree", "Maha");
        std[2] = new Student("6806021612654", "Warunya", "Gapoung");
        for (int n = 0; n < 3; n++)
            stringStd[n] = std[n].toString();
    }

    public void initSub() {
        sub = new Subject[max];
        stringSub = new String[max];
        sub[0] = new Subject("060243103", "Computer Programmin", 3);
        sub[1] = new Subject("060243208", "Data Structure", 3);
        sub[2] = new Subject("060243209", "Database System", 3);
        sub[3] = new Subject("060243210", "Data Communication", 3);
        sub[4] = new Subject("060243211", "Data Communicatoin II", 3);
        for(int n = 0; n < max; n++)
            stringSub[n] = sub[n].toString();
    }

    public void initGui() {
        container.add(new JLabel("Course Registration Program"));
        guiStd();
        guiSub();
        guiResult();
        guiCommand();
    }

    public void guiStd() {
        panelStd = new JPanel();
        panelStd.setLayout(new FlowLayout());
        panelStd.setPreferredSize(new Dimension(520, 80));
        panelStd.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panelStd.add(new JLabel("Select Student: "));
        comboStd = new JComboBox<String>(stringStd);
        panelStd.add(comboStd);
        addstdBtn = new JButton("Add Student");
        addstdBtn.addActionListener(this);
        panelStd.add(addstdBtn);
        stdText = new JTextField(45);
        stdText.setEditable(false);
        panelStd.add(stdText);
        container.add(panelStd);
    }

    public void guiSub() {
        panelSub = new JPanel();
        panelSub.setLayout(new FlowLayout());
        panelSub.setPreferredSize(new Dimension(520,80));
        panelSub.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panelSub.add(new JLabel("Select Subject: "));
        comboSub = new JComboBox<String>(stringSub);
        panelSub.add(comboSub);
        addsubBtn = new JButton("Add Subject");
        addsubBtn.addActionListener(this);
        addsubBtn.setEnabled(false);
        panelSub.add(addsubBtn);
        container.add(panelSub);
    }

    public void guiResult() {
        panelResult = new JPanel();
        panelResult.setLayout(new FlowLayout());
        panelResult.setPreferredSize(new Dimension(520,120));
        panelResult.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        resultText = new JTextArea(6,45);
        resultText.setEditable(false);
        resultPane = new JScrollPane(resultText);
        panelResult.add(resultPane);
        container.add(panelResult);
    }

    public void guiCommand() {
        panelCom = new JPanel();
        panelCom.setLayout(new FlowLayout());
        panelCom.setPreferredSize(new Dimension(520, 40));
        panelCom.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        saveBtn = new JButton("Save");
        saveBtn.addActionListener(this);
        saveBtn.setEnabled(false);
        panelCom.add(saveBtn);
        cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(this);
        cancelBtn.setEnabled(false);
        panelCom.add(cancelBtn);
        container.add(panelCom);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addstdBtn) {
            int n = comboStd.getSelectedIndex();
            stdText.setText(stringStd[n]);
            reg.setStudent(std[n]);
            addstdBtn.setEnabled(false);
            addsubBtn.setEnabled(true);
            saveBtn.setEnabled(true);
            cancelBtn.setEnabled(true);
        }
        else if (event.getSource() == addsubBtn) {
            int n = comboSub.getSelectedIndex();
            resultText.append(stringSub[n].toString() + "\n");
            reg.setSubject(sub[n], count);
            count++;
            if (count == 5) addsubBtn.setEnabled(false);
        }
        else if (event.getSource() == saveBtn) {
            String output = "Student : ";
            output += reg.getStudent() + "\n";
            output += "Subject:\n";
            for(int n = 0; n < count; n++ )
                output += reg.getSubject(n) + "\n";
            JOptionPane.showMessageDialog(this, output);
            resetGui();
        }
        else if (event.getSource() == cancelBtn) {
            resetGui();
        }
    }

    public void resetGui() {
        addstdBtn.setEnabled(true);
        addsubBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        cancelBtn.setEnabled(false);
        stdText.setText("");
        resultText.setText("");
        count = 0;
    }
}
