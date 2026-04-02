package testF.Non_Test2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PayrollApp_StudentID extends JFrame implements ActionListener{
    JPanel panelFrom, panelBtn, panelResult;
    JTextField textId, textName, textSalary, textOt;
    JButton btnAdd, btnEdit, btnDelete, btnSave, btnLoad;
    JTextArea textArea;
    Container c = getContentPane();
    Employee employee;
    ArrayList<Employee> empList = new ArrayList<>();
    String file = "src\\testF\\Non_Test2\\employees.txt";

    public static void main(String[] args) {
        new PayrollApp_StudentID();
    }

    PayrollApp_StudentID() {
        super("Employee");
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        initComponents();
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnAdd) {
            addEmployeeAction();
        }
        else if (event.getSource() == btnEdit) {
            editEmployeeAction();
        }
        else if (event.getSource() == btnDelete) {
            deleteEmployeeAction();
        }
        else if (event.getSource() == btnSave) {
            saveToFileAction();
        }
        else if (event.getSource() == btnLoad) {
            loadFromFileAction();
        }
    }

    public void initComponents() {
        panelFrom = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelFrom.setPreferredSize(new Dimension(450,80));
        panelFrom.setBorder(new LineBorder(Color.BLACK));
        panelFrom.add(new JLabel("Emp ID :    ")); panelFrom.add(textId = new JTextField(12));
        panelFrom.add(new JLabel("Name :    ")); panelFrom.add(textName = new JTextField(12));
        panelFrom.add(new JLabel("Salary :    ")); panelFrom.add(textSalary = new JTextField(12));
        panelFrom.add(new JLabel("OT(Hr) :    ")); panelFrom.add(textOt = new JTextField(12));
        c.add(panelFrom);

        panelBtn = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBtn.setPreferredSize(new Dimension(450,50));
        panelBtn.setBorder(new LineBorder(Color.BLACK));
        panelBtn.add(btnAdd = new JButton("Add")); btnAdd.addActionListener(this);
        panelBtn.add(btnEdit = new JButton("Edit")); btnEdit.addActionListener(this);
        panelBtn.add(btnDelete = new JButton("Delete")); btnDelete.addActionListener(this);
        panelBtn.add(btnSave = new JButton("Save to File")); btnSave.addActionListener(this);
        panelBtn.add(btnLoad = new JButton("Load from File")); btnLoad.addActionListener(this);
        c.add(panelBtn);

        panelResult = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelResult.setPreferredSize(new Dimension(450,150));
        panelResult.setBorder(new LineBorder(Color.BLACK));
        panelResult.add(textArea = new JTextArea(7,40));
        c.add(panelResult);
    }

    public void refreshDisplay() {

    }

    public void addEmployeeAction() {
        try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                employee = new Employee(textId.getText(), textName.getText(), Double.parseDouble(textSalary.getText()), Integer.parseInt(textOt.getText()));
                textArea.append(employee.toDIsplayFormat() + "\n");
                writer.write(employee.toCSV() + "\n");
                writer.close();
            }
        catch (Exception e) {
            }
    }

    public void editEmployeeAction() {
        try {
                String output = "";
                textArea.setText("");
                empList.clear();
                BufferedReader reader = new BufferedReader(new FileReader(file));
                for (String s : reader.readAllLines()) {
                    String str[] = s.split(",");
                    employee = new Employee(str[0], str[1], Double.parseDouble(str[2]), Integer.parseInt(str[3]));
                    empList.add(employee);
                }
                for (int i = 0; i < empList.size(); i++) {
                    if (empList.get(i).getEmpId().equals(textId.getText())) {
                        empList.set(i, new Employee(textId.getText(), textName.getText(), Double.parseDouble(textSalary.getText()), Integer.parseInt(textOt.getText())));
                        textArea.append(empList.get(i).toDIsplayFormat() + "\n");
                        output += (empList.get(i).toCSV() + "\n");
                    }
                    else { output += (empList.get(i).toCSV() + "\n"); textArea.append(empList.get(i).toDIsplayFormat() + "\n");}
                }
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(output);
                reader.close();
                writer.close();
            }
        catch (Exception e) {
            }
    }

    public void deleteEmployeeAction() {
        try {
                String output = "";
                empList.clear();
                textArea.setText("");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                for (String s : reader.readAllLines()) {
                    String str[] = s.split(",");
                    employee = new Employee(str[0], str[1], Double.parseDouble(str[2]), Integer.parseInt(str[3]));
                    empList.add(employee);
                }
                for (int i = 0; i < empList.size(); i++) {
                    if (empList.get(i).getEmpId().equals(textId.getText())) {
                        empList.remove(i);
                    }
                    else {output += (empList.get(i).toCSV() + "\n"); textArea.append(empList.get(i).toDIsplayFormat() + "\n");}
                }
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(output);
                reader.close();
                writer.close();
            }
        catch (Exception e) {
            }
    }

    public void saveToFileAction() {
        try {
                String output = "";
                textArea.setText("");
                empList.clear();
                BufferedReader reader = new BufferedReader(new FileReader(file));
                for (String s : reader.readAllLines()) {
                    String str[] = s.split(",");
                    employee = new Employee(str[0], str[1], Double.parseDouble(str[2]), Integer.parseInt(str[3]));
                    empList.add(employee);
                }
                for (int i = 0; i < empList.size(); i++) {
                    output += (empList.get(i).toCSV() + "\n"); textArea.append(empList.get(i).toDIsplayFormat() + "\n");
                }
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(output);
                reader.close();
                writer.close();
            }
        catch (Exception e) {
            }
    }

    public void loadFromFileAction() {
        try {
                textArea.setText("");
                empList.clear();
                BufferedReader reader = new BufferedReader(new FileReader(file));
                for (String s : reader.readAllLines()) {
                    String str[] = s.split(",");
                    employee = new Employee(str[0], str[1], Double.parseDouble(str[2]), Integer.parseInt(str[3]));
                    empList.add(employee);
                }
                for (int i = 0; i < empList.size(); i++) {
                    textArea.append(empList.get(i).toDIsplayFormat() + "\n");
                }
                reader.close();
        }
        catch (Exception e) {}
    }

}

class Employee {
    private String empId, name;
    private double salary;
    private int otHours;
    
    public Employee(String empId, String name, double salary, int otHours) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.otHours = otHours;
    }

    public String getEmpId() {
        return this.empId;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setSalary(double s) {
        this.salary = s;
    }

    public void setOtHours(int ot) {
        this.otHours = ot;
    }

    public double calculateNetSalary() {
        return salary + (otHours * 150);
    }

    public String toCSV() {
        return empId + "," + name + "," + salary + "," + otHours;
    }
    
    public String toDIsplayFormat() {
        return "ID : " + empId + " | Name : " + name + " | Net : " + calculateNetSalary();
    }
}