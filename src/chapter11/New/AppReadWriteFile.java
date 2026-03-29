package chapter11.New;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppReadWriteFile extends JFrame implements ActionListener{
    JPanel panelForm;
    JTextField textName;
    JLabel label1, label2, label3;
    JButton saveBtn, readBtn;
    JTextArea outputArea;
    JScrollPane scrollPane;
    Container c;
    Font myFont = new Font("Tahoma", Font.BOLD, 16);
    final String FILENAME = "src\\chapter11\\New\\name.txt";

    public static void main(String[] args) {
        new AppReadWriteFile();
    }

    public AppReadWriteFile() {
        super(" Example Read and Write Product");
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        guiForm();
        c.add(saveBtn = new JButton(" Save ")); saveBtn.setFont(myFont); saveBtn.addActionListener(this);
        c.add(readBtn = new JButton(" Read ")); readBtn.setFont(myFont); readBtn.addActionListener(this);
        c.add(scrollPane = new JScrollPane(outputArea = new JTextArea(10, 30))); outputArea.setEditable(false); outputArea.setFont(myFont);
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void guiForm() {
        panelForm = new JPanel(new GridLayout(1, 2));
        panelForm.setPreferredSize(new Dimension(400, 40));
        panelForm.add(label1 = new JLabel("Enter Name : ")); label1.setFont(myFont);
        panelForm.add(textName = new JTextField(10)); textName.addActionListener(this); textName.setFont(myFont);
        c.add(panelForm);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == saveBtn) {
            save();
        } else if (event.getSource() == readBtn) {
            read();
        }
    }

    public void save() {
        String nameStr;
        nameStr = textName.getText();
        if (!nameStr.isEmpty()) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true));
                writer.write(nameStr + "\n");
                writer.close();
                JOptionPane.showMessageDialog(this, "Save already");
                textName.setText("");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "can not write data", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Data not complete", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void read() {
        outputArea.setText("");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
            String s1;
            while ((s1 = reader.readLine()) != null) {
                outputArea.append(s1 + "\n");
            }
            // for (String s :reader.readAllLines()) s1 += s + "\n";
            // outputArea.setText(s1);
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Can ont read FIle", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
}
