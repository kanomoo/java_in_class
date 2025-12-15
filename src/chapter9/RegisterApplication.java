package chapter9;

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

public class RegisterApplication extends JFrame implements ActionListener{
    Student std[];
    Subject sub[];
    String studentStr[], subjectStr[];
    Container container;
    JComboBox<String> stdCombo, subCombo;
    JLabel stdLabel, subLabel;
    JButton addstdBtn, addsubBtn, saveBtn, clearBtn, cancleBtn;
    JTextField stdText;
    JTextArea subTextArea;
    JScrollPane subScroll;
    JPanel panelStd, panelSubject, panelResult, panelCommand;
    Register reg;
    int Max = 5, count = 0;

    public RegisterApplication() {
        super(">>>   Program Register   <<<");
        container = getContentPane();
        container.setLayout(new FlowLayout());
        initStudentData();
        initSubjectData();
        initGui();
        reg = new Register(new Student(), Max);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void initStudentData() {
        std = new Student[3];
        studentStr = new String[3];
        std[0] = new Student("6006021690010", "Aaaaaa", "Bbbbbbb");
        std[1] = new Student("6006021690036", "Cccccc", "Ddddddd");
        std[2] = new Student("6006021690058", "Eeeeee", "Ggggggg");
        for(int n = 0; n < std.length ; n++)
            studentStr[n] = std[n].toString();
    }

    public void initSubjectData() {
        sub = new Subject[5];
        subjectStr = new String[5];
        sub[0] = new Subject("060243103", "Computer Programming", 3);
        sub[1] = new Subject("060243208", "Data Structure", 3);
        sub[2] = new Subject("060243209", "Database System", 3);
        sub[3] = new Subject("060243210", "Data Communication", 3);
        sub[4] = new Subject("060243211", "Data Communication II", 3);
        for(int n = 0; n < sub.length ; n++)
            subjectStr[n] = sub[n].toString();
    }

    public void initGui() {
        container.add(new JLabel(" Course  Registration  Program"));
        guiStd();
        guiSubject();
        guiResult();
        guiCommand();
    }

    public void guiStd() {
        panelStd = new JPanel();
        panelStd.setPreferredSize(new Dimension(450, 80));
        panelStd.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        panelStd.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        stdLabel = new JLabel("Select Student : ");
        panelStd.add(stdLabel);
        stdCombo = new JComboBox<String>(studentStr);
        stdCombo.setMaximumRowCount(3);
        panelStd.add(stdCombo);
        addstdBtn = new JButton("Add Student");
        addstdBtn.addActionListener(this);
        panelStd.add(addstdBtn);
        stdText = new JTextField(45);
        stdText.setEditable(false);
        panelStd.add(stdText);
        container.add(panelStd);
    }

    public void guiSubject() {
        panelSubject = new JPanel();
        panelSubject.setPreferredSize(new Dimension(450, 80));
        panelSubject.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        panelSubject.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        subLabel = new JLabel("Select Subject : ");
        panelSubject.add(subLabel);
        subCombo = new JComboBox<String>(subjectStr);
        subCombo.setMaximumRowCount(5);
        panelSubject.add(subCombo);
        addsubBtn = new JButton("Add Subject");
        addsubBtn.setEnabled(false);
        addsubBtn.addActionListener(this);
        panelSubject.add(addsubBtn);
        container.add(panelSubject);
    }

    public void guiResult() {
        panelResult = new JPanel();
        panelResult.setPreferredSize(new Dimension(450, 120));
        panelResult.setLayout(new FlowLayout());
        panelResult.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        subTextArea = new JTextArea(6, 45);
        subTextArea.setEditable(false);
        subScroll= new JScrollPane(subTextArea);
        panelResult.add(subScroll);
        container.add(panelResult);
    }

    public void guiCommand() {
        panelCommand = new JPanel();
        panelCommand.setPreferredSize(new Dimension(450, 40));
        panelCommand.setLayout(new FlowLayout());
        panelCommand.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
        saveBtn = new JButton(" Save ");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(this);
        panelCommand.add(saveBtn);

        cancleBtn = new JButton(" Cancel ");
        cancleBtn.setEnabled(false);
        cancleBtn.addActionListener(this);
        panelCommand.add(cancleBtn);
        container.add(panelCommand);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addstdBtn) {
            int n = stdCombo.getSelectedIndex();
            stdText.setText(std[n].toString());
            reg.setStudent(std[n]);
            addstdBtn.setEnabled(false);
            addsubBtn.setEnabled(true);
            saveBtn.setEnabled(true);
            cancleBtn.setEnabled(true);
        }
        else if (event.getSource() == addsubBtn) {
            int n = subCombo.getSelectedIndex();
            subTextArea.append(sub[n].toString() + "\n");
            reg.setSubject(sub[n], count);
            count++;
            if (count == 5) addsubBtn.setEnabled(false);
        }
        else if (event.getSource() == saveBtn) {
            String output = "";
            output = "Student :" + reg.getStudent();
            output += "\nSubject:\n";
            for(int n = 0; n < count; n++)
                output += reg.getSubject(n) + "\n";
            JOptionPane.showMessageDialog(this, output, "Registration Data",JOptionPane.INFORMATION_MESSAGE);
            resetBtn();
            count = 0;
        }
        else if (event.getSource() == cancleBtn) {
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
        cancleBtn.setEnabled(false);
        stdText.setText("");
        subTextArea.setText("");
    }
}
