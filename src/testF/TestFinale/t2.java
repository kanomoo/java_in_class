package testF.TestFinale;

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
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class t2 {
    public static void main(String[] args) {
        new AppStudentGrade();
    }
}

class AppStudentGrade extends JFrame implements ActionListener {
    JPanel panelFrom, panelResult;
    JTextField textId, textName, textSurname, textScore;
    JTextArea textArea;
    JScrollPane scrollPane;
    JButton btnSave, btnRead;
    Font font = new Font("Tahoma", Font.BOLD, 16);
    Student student;
    Person person;
    Container c = getContentPane();
    public static void main(String[] args) {
        
    }

    AppStudentGrade() {
        super("Application Student (By ID : 68-060216-9999-9)");
        c.setLayout(new FlowLayout());
        initGui();
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnSave) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\testF\\T1\\Students.txt", true))) {
                if (!textId.getText().isEmpty() && !textName.getText().isEmpty() && !textSurname.getText().isEmpty() && !textScore.getText().isEmpty()) {
                    student = new Student(textId.getText(), textName.getText(), textSurname.getText(), Integer.parseInt(textScore.getText()));
                    writer.write(student.toString() + "\n");
                    JOptionPane.showMessageDialog(c, "Save Already");
                }
            } catch (IOException e) {}
        }
        else if (event.getSource() == btnRead) {
            try (BufferedReader reader = new BufferedReader(new FileReader("src\\testF\\T1\\Students.txt"))) {
                textArea.setText("");
                for (String str :reader.readAllLines()) textArea.append(str + "\n");
                JOptionPane.showMessageDialog(c, "Read Data Already");
            } catch (IOException e) {}
        }
    }

    public void initGui() {
        initPanelFrom();
        initPanelResult();
    }

    public void initPanelFrom() {
        panelFrom = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelFrom.setPreferredSize(new Dimension(400,190));
        panelFrom.setBorder(new LineBorder(Color.RED));
        panelFrom.add(createJLabel("           Enter Id : ")); panelFrom.add(textId = new JTextField(10)); textId.setFont(font);
        panelFrom.add(createJLabel("     Enter Name : ")); panelFrom.add(textName = new JTextField(10)); textName.setFont(font);
        panelFrom.add(createJLabel("Enter Surname : ")); panelFrom.add(textSurname = new JTextField(10)); textSurname.setFont(font);
        panelFrom.add(createJLabel("     Enter Score : ")); panelFrom.add(textScore = new JTextField(10)); textScore.setFont(font);
        panelFrom.add(btnSave = new JButton("Save Data")); btnSave.addActionListener(this); btnSave.setFont(font);
        c.add(panelFrom);
    }

    public void initPanelResult() {
        panelResult = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelResult.setPreferredSize(new Dimension(450, 250));
        panelResult.setBorder(new LineBorder(Color.black));
        panelResult.add(createJLabel("Data from File : ")); panelResult.add(btnRead = new JButton("Read File")); btnRead.setFont(font); btnRead.addActionListener(this);
        panelResult.add(scrollPane = new JScrollPane(textArea = new JTextArea(9,27))); textArea.setFont(font); textArea.setForeground(Color.BLUE);
        c.add(panelResult);
    }

    public JLabel createJLabel(String title) {
        JLabel label = new JLabel(title); label.setFont(font);
        return label;
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
        return name + "; " + surname;
    }

}

class Student extends Person {
    private String id;
    private int score = 0;

    public Student() {
    }
    

    public Student(String name, String surname, String id, int score) {
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

    public void setScore(int s) {
        this.score = s;
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
        return "Data Student : " + id + "; " + super.toString() + "; " + id + "; " + toGrade();
    }
}
