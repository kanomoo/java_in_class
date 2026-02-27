package chapter9.New;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class StudentApplication extends JFrame implements ActionListener {
    Register reg;
    Student std, stdList[];
    Project pro, proList[];
    Score score;
    Container c = getContentPane();
    JPanel panelStd, panelPro, PanelReport;
    JComboBox<String> comboStd, comboPro, comboScore;
    JTextField textStd, textScore, textHomeWork, textMid, textFinal;
    JTextArea textAreaPro;
    JScrollPane scrollPane;
    JButton btnStd, btnPro, btnReport, btnClear;
    String strStdList[], strProList[];
    int max = 3, count = 0, choice[] = new int[max];

    public static void main(String[] args) {
        new StudentApplication();
    }

    public StudentApplication() {
        super("Student Application");
        initGui();
        setSize(500, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        c.add(new JLabel("Student Application"));
        initData();
        createPanelStd(); createPanelPro(); createPanelReport();
    }

    public void initData() {
        reg = new Register();
        initStdData();
        initProData();
        initScoreData();
    }

    public void initStdData() {
        std = new Student();
        stdList = new Student[3];
        stdList[0] = new Student("6806021612037", "Paphavin", "Thitichunhakun");
        stdList[1] = new Student("6806021612048", "John", "Smit");
        stdList[2] = new Student("6806021612080", "Jame", "Son");
        strStdList = new String[stdList.length];
        for (int i = 0 ; i < stdList.length; i++) strStdList[i] = stdList[i].toString();
    }

    public void initProData() {
        pro = new Project();
        proList = new Project[5];
        proList[0] = new Project("6201482", "Computer Programming", "3");
        proList[1] = new Project("6201179", "Java OOP", "3");
        proList[2] = new Project("6201235", "JavaScript", "3");
        proList[3] = new Project("6201852", "TypeScript", "3");
        proList[4] = new Project("6201462", "Fundamental", "3");
        strProList = new String[proList.length];
        for (int i = 0; i < proList.length; i++) strProList[i] = "               " + proList[i].toString() + "            ";
        for (int i = 0; i < max; i++) choice[i] = -1;
    }

    public void initScoreData() {
        score = new Score();
    }

    public void createPanelStd() {
        panelStd = createPanel(480, 80);
        panelStd.add(new JLabel("Student :"));
        comboStd = createComboBox(panelStd, strStdList);
        btnStd = createButton(panelStd, "Add Student");
        textStd = createTextField(panelStd, 39, false);
    }

    public void createPanelPro() {
        panelPro = createPanel(480, 250);
        panelPro.add(new JLabel("Project :"));
        comboPro = createComboBox(panelPro, strProList);
        panelPro.add(new JLabel("Score HomeWork :"));
        textHomeWork = createTextField(panelPro, 25, true);
        panelPro.add(new JLabel("Score Midterm :     "));
        textMid = createTextField(panelPro, 25, true);
        panelPro.add(new JLabel("Score Final :            "));
        textFinal = createTextField(panelPro, 25, true);
        btnPro = createButton(panelPro, "Add Project");
        panelPro.add(scrollPane = new JScrollPane(textAreaPro = new JTextArea(4,35)));
        textAreaPro.setEditable(false);
    }

    public void createPanelReport() {
        PanelReport = createPanel(480, 50);
        btnReport = createButton(PanelReport, "Report");
        btnClear = createButton(PanelReport, "Clear");
    }

    public JPanel createPanel(int wight, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setPreferredSize(new Dimension(wight, height));
        panel.setBorder(new LineBorder(Color.GRAY));
        c.add(panel);
        return panel;
    }

    public JComboBox<String> createComboBox(JPanel panel, String[] title) {
        JComboBox<String> combo = new JComboBox<>(title);
        panel.add(combo);
        return combo;
    }

    public JTextField createTextField(JPanel panel, int len, boolean edit) {
        JTextField textField = new JTextField(len);
        textField.setEditable(edit);
        textField.addActionListener(this);
        textField.setHorizontalAlignment(JTextField.CENTER);
        panel.add(textField);
        return textField;
        
    }

    public JButton createButton(JPanel panel, String title) {
        JButton btn = new JButton(title);
        btn.addActionListener(this);
        panel.add(btn);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnStd) {
            textStd.setText(String.valueOf(comboStd.getSelectedItem()));
            reg.setStd(stdList[comboStd.getSelectedIndex()]);
            btnStd.setEnabled(false);
        }
        else if (event.getSource() == btnPro) {
            boolean check = true;
            for (int c : choice) if (c == comboPro.getSelectedIndex()) check = false;
            if (count < 3 && check == true) {
                if (textHomeWork.getText().isEmpty() || textMid.getText().isEmpty() || textFinal.getText().isEmpty()) JOptionPane.showMessageDialog(c, "Error : Score Input is Empty");
                else {
                    score = new Score(Integer.parseInt(textHomeWork.getText()), Integer.parseInt(textMid.getText()), Integer.parseInt(textFinal.getText()));
                    choice[count] = comboPro.getSelectedIndex();
                    textAreaPro.append(String.valueOf(comboPro.getSelectedItem()) + " Total : " + score.toSum() + "\n");
                    reg.setProject(proList[comboPro.getSelectedIndex()], count);
                    reg.setScore(score, count);
                    count++;
                    if (count >= 3) {
                        btnPro.setEnabled(false);
                        textHomeWork.setEditable(false); textMid.setEditable(false); textFinal.setEditable(false);
                    }
                }
            }
            else if (check == false) {JOptionPane.showMessageDialog(c, "Error : Project in data");}
            textHomeWork.setText(""); textMid.setText(""); textFinal.setText("");
        }
        else if (event.getSource() == btnReport) {
            String output = "Student Data\n";
            output += reg.getStd().toString() + "\n";
            for (int i = 0; i < count; i++) output += reg.getProject(i).toString() + " Total : " + reg.getScore(i).toSum() + "\n";
            JOptionPane.showMessageDialog(c, output);
        }
        else if (event.getSource() == btnClear) {
            count = 0;
            btnStd.setEnabled(true); btnPro.setEnabled(true);
            textHomeWork.setEditable(true); textMid.setEditable(true); textFinal.setEditable(true);
            textStd.setText(""); textHomeWork.setText(""); textMid.setText(""); textFinal.setText("");
            textAreaPro.setText("");
            reg = new Register(); std = new Student(); pro = new Project();
            for (int i = 0; i < max; i++) choice[i] = -1;
        }
    }

}

class Student {
    private String id = "";
    private String name = "", surname = "";
    public Student() {}
    public Student(String id, String name, String surname) { this.id = id; this.name = name; this.surname = surname;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public String toString() {return id + " " + name + " " + surname;}
}

class Project {
    private String id = "", credit = "";
    private String name = "";
    public Project() {}
    public Project(String id, String name, String credit) {this.id = id; this.credit = credit; this.name = name;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getCredit() {return credit;}
    public void setCredit(String credit) {this.credit = credit;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String toString() {return id + " " + name + " " + credit;}
}

class Score {
    private int homeScore = 0, midScore= 0, finalScore = 0;
    public Score() {}
    public Score(int homeScore, int midScore, int finalScore) {this.homeScore = homeScore; this.midScore = midScore; this.finalScore = finalScore;}
    public int getHomeScore() {return homeScore;}
    public void setHomeScore(int homeScore) {this.homeScore = homeScore;}
    public int getMidScore() {return midScore;}
    public void setMidScore(int midScore) {this.midScore = midScore;}
    public int getFinalScore() {return finalScore;}
    public void setFinalScore(int finalScore) {this.finalScore = finalScore;}
    public int toSum() {return homeScore + midScore + finalScore;}
    public String toString() {return homeScore + " " + midScore + " " + finalScore;}
}

class Register {
    private Student std;
    private Project project[];
    private Score score[];
    private int max = 3;
    public Register() {std = new Student(); project = new Project[max]; score = new Score[max];}
    public Student getStd() {return std;}
    public void setStd(Student std) {this.std = std;}
    public Project getProject(int i) {return project[i];}
    public void setProject(Project project, int i) {this.project[i] = project;}
    public Score getScore(int i) {return score[i];}
    public void setScore(Score score, int i) {this.score[i] = score;}
    public int getMax() {return max;}
    public void setMax(int max) {this.max = max;}

}
