// Id    :  68-060216-1203-7
// Name  :  Mr.Paphavin Thitichunhakun
// Room  :  1 RC
// File Name Assign07_6806021612037.java

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Assign07_6806021612037{
    public static void main(String[] args) {
        new AppStudentGrade();
    }
}

class AppStudentGrade extends JFrame implements ActionListener {
    JPanel panelEnter, panelResult;
    JTextField textId, textName, textSurname, textScore;
    JButton btnSave, btnRead;
    JTextArea textArea;
    JScrollPane scrollPane;
    Container c = getContentPane();
    Font font = new Font("Tahoma", Font.BOLD, 16);
    Student std;

    public AppStudentGrade() {
        super("Application Student (By ID : 68-060216-1203-7)");
        initGui();
        setSize(450, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnSave) {
            try {
                std = new Student(textId.getText(), textId.getText(), textSurname.getText(), Integer.parseInt(textScore.getText()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("Students.txt", true));
                writer.write(std.toString() + "\n");
                writer.close();
                textId.setText(""); textName.setText(""); textSurname.setText(""); textScore.setText("");
                JOptionPane.showMessageDialog(c, "Save Allready.");

            } catch (Exception e) {JOptionPane.showMessageDialog(c, e, "Error Message", JOptionPane.ERROR_MESSAGE);}
        }
        else if (event.getSource() == btnRead) {
            try {
                String output = "";
                BufferedReader reader = new BufferedReader(new FileReader("Students.txt"));
                for (String str : reader.readAllLines()) output += (str + "\n");
                textArea.setText(output);
                reader.close();
                JOptionPane.showMessageDialog(c, "Read Data Allready.");
            } catch (Exception e) {JOptionPane.showMessageDialog(c, e, "Error Message", JOptionPane.ERROR_MESSAGE);}
        }
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        initPanelEnter();
        initPanelResult();
    }

    public void initPanelEnter() {
        panelEnter = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panelEnter.setPreferredSize(new Dimension(360,160));
        panelEnter.setBorder(new LineBorder(Color.RED));
        panelEnter.add(createJLabel("            Enter Id : "));
        panelEnter.add(textId = new JTextField(10)); textId.setFont(font);
        panelEnter.add(createJLabel("      Enter Name : "));
        panelEnter.add(textName = new JTextField(10)); textName.setFont(font);
        panelEnter.add(createJLabel(" Enter Surname : "));
        panelEnter.add(textSurname = new JTextField(10)); textSurname.setFont(font);
        panelEnter.add(createJLabel("      Enter Score : "));
        panelEnter.add(textScore = new JTextField(10)); textScore.setFont(font);
        panelEnter.add(btnSave = new JButton("Save Data")); btnSave.setFont(font); btnSave.addActionListener(this);
        c.add(panelEnter);
    }

    public void initPanelResult() {
        panelEnter = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelEnter.setPreferredSize(new Dimension(400,250));
        panelEnter.setBorder(new LineBorder(Color.gray));
        panelEnter.add(createJLabel("Data from File : "));
        panelEnter.add(btnRead = new JButton("Read File")); btnRead.setFont(font); btnRead.addActionListener(this);
        panelEnter.add(scrollPane = new JScrollPane(textArea = new JTextArea(10,29))); textArea.setForeground(Color.BLUE); textArea.setFont(new Font("Tahoma", Font.BOLD, 14));
        c.add(panelEnter);

    }

    public JLabel createJLabel(String title) {
        JLabel label = new JLabel(title);
        label.setFont(font); return label;
    }
}

class Person {
    private String name, surname;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "" + getName() + " ; " + getSurname() + " ; ";
    }
}

class Student extends Person {
    private String id;
    private int score = 0;

    public Student() {
    }

    public Student( String id, String name, String surname, int score) {
        super(name, surname);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toGrade() {
        if (score >= 80) return "A";
        else if (score >= 75) return "B+";
        else if (score >= 70) return "B";
        else if (score >= 65) return "C+";
        else if (score >= 60) return "C";
        else if (score >= 55) return "D+";
        else if (score >= 50) return "D";
        else return "F";
    }

    @Override
    public String toString() {
        return "Data Student : " + super.toString() + getScore() + " ; " + toGrade();
    }
}