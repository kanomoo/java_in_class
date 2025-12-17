package chapter9.test;

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

public class RegisterApplication extends JFrame implements ActionListener {
    Student std[];
    Subject sub[];
    Register reg;
    String studentStr[], subjectStr[];
    Container container = getContentPane();
    JPanel panelStd, panelSubject, panelResult, panelCommand;
    JScrollPane subScrollPane;
    JTextField stdText;
    JTextArea subTextArea;
    JComboBox<String> stdCombo, subCombo;
    JButton addstdBtn, addsubBtn, saveBtn, cancelBtn;
    int max = 5, count = 0;

    public RegisterApplication() {
        super(">>> Program Register <<<");
        setLocation(650, 150);
        container.setLayout(new FlowLayout());
        initStudentData();
        initSubjectData();
        initGui();
        reg = new Register(new Student(), max);
        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initStudentData() {
        std = new Student[3];
        studentStr = new String[3];
        std[0] = new Student("6006021690010", "Aaaaaa", "Bbbbbbb");
        std[1] = new Student("6006021690036", "Cccccc", "Ddddddd");
        std[2] = new Student("6006021690058", "Eeeeee", "Ggggggg");
        for(int i = 0; i < std.length; i++)
            studentStr[i] = std[i].toString();
        stdCombo = new JComboBox<String>(studentStr);
    }

    public void initSubjectData() {
        sub = new Subject[max];
        subjectStr = new String[max];
        sub[0] = new Subject("060243130", "Computer Programming", 3);
        sub[1] = new Subject("060243208", "Data Structure", 3);
        sub[2] = new Subject("060243209", "Data System", 3);
        sub[3] = new Subject("060243210", "Data Communiication", 3);
        sub[4] = new Subject("060243210", "Data Communiication II", 3);
        for(int i = 0; i < sub.length; i++)
            subjectStr[i] = sub[i].toString();
        subCombo = new JComboBox<String>(subjectStr);
    }

    public void guiStd() {
        panelStd = new JPanel();
        panelStd.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelStd.setPreferredSize(new Dimension(520, 80));
        panelStd.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panelStd.add(new JLabel("Select Student : "));
        panelStd.add(stdCombo);
        addstdBtn = new JButton("Add Student");
        addstdBtn.addActionListener(this);
        panelStd.add(addstdBtn);
        stdText = new JTextField(45);
        stdText.setEditable(false);
        panelStd.add(stdText);
        container.add(panelStd);
    }

    public void guiSub() {
        panelSubject = new JPanel();
        panelSubject.setLayout(new FlowLayout());
        panelSubject.setPreferredSize(new Dimension(520, 80));
        panelSubject.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        panelSubject.add(new JLabel("Select Subject : "));
        panelSubject.add(subCombo);
        addsubBtn = new JButton("Add Subject");
        addsubBtn.addActionListener(this);
        addsubBtn.setEnabled(false);;
        panelSubject.add(addsubBtn);
        container.add(panelSubject);
    }

    public void guiResult() {
        panelResult = new JPanel();
        panelResult.setLayout(new FlowLayout());
        panelResult.setPreferredSize(new Dimension(520, 120));
        panelResult.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        subTextArea = new JTextArea(6, 45);
        subTextArea.setEditable(false);
        subScrollPane = new JScrollPane(subTextArea);
        panelResult.add(subScrollPane);
        container.add(panelResult);
    }

    public void guiCommand() {
        panelCommand = new JPanel();
        panelCommand.setLayout(new FlowLayout());
        panelCommand.setPreferredSize(new Dimension(520, 40));
        panelCommand.setBorder(new LineBorder(Color.LIGHT_GRAY));
        saveBtn = new JButton("Save");
        saveBtn.addActionListener(this);
        saveBtn.setEnabled(false);
        cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(this);
        cancelBtn.setEnabled(false);
        panelCommand.add(saveBtn);
        panelCommand.add(cancelBtn);
        container.add(panelCommand);
    }

    public void initGui() {
        container.add(new JLabel("Course Registration Program"));
        guiStd();
        guiSub();
        guiResult();
        guiCommand();
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addstdBtn) {
            int n = stdCombo.getSelectedIndex();
            stdText.setText(std[n].toString());
            reg.setStudent(std[n]);
            addstdBtn.setEnabled(false);
            addsubBtn.setEnabled(true);
            saveBtn.setEnabled(true);
            cancelBtn.setEnabled(true);
        }
        else if (event.getSource() == addsubBtn) {
            int n  = subCombo.getSelectedIndex();
            subTextArea.append(sub[n].toString() + "\n");
            reg.setSubject(sub[n], count);
            count++;
            if (count == 5) addsubBtn.setEnabled(false);
        }
        else if (event.getSource() == saveBtn) {
            String output = "";
            output = "Student : " + reg.getStudent();
            output += "\nSubject:\n";
            for(int i = 0; i < count; i++)
                output += reg.getSubject(i) + "\n";
            JOptionPane.showMessageDialog(this, output);
            resetBtn();
            count = 0;
        }
        else if (event.getSource() == cancelBtn) {
            stdText.setText("");
            subTextArea.setText("");
            count = 0;
            resetBtn();
        }
    }

    public void resetBtn() {
        addstdBtn.setEnabled(true);
        addsubBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        cancelBtn.setEnabled(false);
        stdText.setText("");
        subTextArea.setText("");
    }

}
