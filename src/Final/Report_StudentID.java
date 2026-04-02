package Final;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class Report_StudentID extends JFrame implements ActionListener {
    JPanel panelForm, panelReport;
    JButton btnLoad;
    JTextArea textArea;
    JLabel labelName;
    JComboBox<String> comboName;
    ArrayList<Student> arrayData = new ArrayList<>();
    Container c = getContentPane();
    Student student;
    Font font = new Font("Courier New", Font.BOLD, 18);
    public static void main(String[] args) {
        new Report_StudentID();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnLoad) {
            textArea.setText(arrayData.get(comboName.getSelectedIndex()).toString());
        }
    }

    Report_StudentID() {
        super("Report Student version - 1.0 : 6806021612037 Phapavin Thitichunhakun");
        c.setLayout(new FlowLayout());
        initData();
        initGui();
        setSize(550,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void initData() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Final/Student.txt"));
            String[] listData, listNameSurname, listGrade;
            for (String data : reader.readAllLines()) {
                listData = data.split(","); listNameSurname = listData[1].split(" "); listGrade = listData[2].split(" ");
                student = new Student(listData[0], listNameSurname[0], listNameSurname[1], listGrade);
                arrayData.add(student);
            }
            listNameSurname = new String[arrayData.size()]; int count = 0;
            for (Student std : arrayData) listNameSurname[count++] = std.getName() + " " + std.getSurname();
            comboName = new JComboBox<>(listNameSurname); comboName.setFont(font);
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void initGui() {
        panelForm = new JPanel(new FlowLayout());
        panelForm.setPreferredSize(new Dimension(500,50));
        panelForm.setBorder(new LineBorder(Color.ORANGE,3));
        panelForm.add(labelName = new JLabel("Select name : ")); labelName.setFont(font);
        panelForm.add(comboName);
        panelForm.add(btnLoad = new JButton("Load Data")); btnLoad.setFont(font); btnLoad.addActionListener(this);
        c.add(panelForm);

        panelReport = new JPanel(new FlowLayout());
        panelReport.setPreferredSize(new Dimension(500,350));
        panelReport.setBorder(new LineBorder(Color.ORANGE,3));
        panelReport.add(textArea = new JTextArea(15,40)); textArea.setFont(font); textArea.setEditable(false);
        c.add(panelReport);
    }
}
