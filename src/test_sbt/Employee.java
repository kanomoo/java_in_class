package test_sbt;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Employee extends JFrame implements ActionListener{
    JTextField textName, textHours;
    JComboBox<String> comboEmp;
    JButton calBtn, clearBtn;
    JTextArea outputArea;
    DecimalFormat fmt = new DecimalFormat("###,##0.00");
    String[] stringEmp;
    String output;
    Container container;

    public Employee() {
        super("Calculate employee");
        container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 10 ,10));
        initGui();
        initOut();
        setSize(300,350);
        setVisible(true);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        container.add(new JLabel("Employee Name"));
        textName = new JTextField(20);
        container.add(textName);
        container.add(new JLabel("Number of working hours"));
        textHours = new JTextField(20);
        container.add(textHours);
        container.add(new JLabel("Employee position"));
        stringEmp = new String[3];
        stringEmp[0] = "Operational";
        stringEmp[1] = "Supervisory";
        stringEmp[2] = "Managerial";
        comboEmp = new JComboBox<>(stringEmp);
        container.add(comboEmp);
        calBtn = new JButton("Calculate");
        calBtn.addActionListener(this);
        container.add(calBtn);
        clearBtn = new JButton("Clear");
        clearBtn.addActionListener(this);
        container.add(clearBtn);
    }

    public void initOut() {
        outputArea = new JTextArea(6,20);
        container.add(outputArea);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String output = "";
        double total = 0, rate = 0;
        double ex = 0, bonus;
        if (event.getSource() == calBtn) {
            if (!textName.getText().isEmpty() && !textHours.getText().isEmpty()){
                int n = comboEmp.getSelectedIndex();
                int hours = Integer.parseInt(textHours.getText());
                output += "Employee name: " + textName.getText();
                output += "\nPosition: " + comboEmp.getSelectedItem();
                output += "\nTotal working hours: " + textHours.getText();
                if (n == 0) rate = 100;
                else if (n == 1) rate = 200;
                else if (n == 2) rate = 300;
                if (hours >= 160) {
                    ex = hours - 160;
                    bonus = (ex * 1.5) * rate;
                    total = ((160 * rate) + (bonus));
                    output += "\nHours exceeded: " + (int) ex + " hours";
                    output += "\nBonus: " + fmt.format(bonus) + " THB";
                }
                else total = hours * rate;
                output += "\nTotal salary: " + fmt.format(total) + " THB";
                outputArea.setText(output);
                textName.setText("");
                textHours.setText("");
            }
            else {
                JOptionPane.showMessageDialog(this, "Not Calculate", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (event.getSource() == clearBtn) {
            textName.setText("");
            textHours.setText("");
            outputArea.setText("");
        }
    }

    public static void main(String[] args) {
        new Employee();
    }
}
