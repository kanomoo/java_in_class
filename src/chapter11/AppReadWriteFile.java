// package chapter11;

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
// import javax.swing.JScrollPane;
// import javax.swing.JTextArea;
// import javax.swing.JTextField;

// import java.awt.Container;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class AppReadWriteFile extends JFrame implements ActionListener {
//     JPanel panel;
//     JTextField textField;
//     JLabel label;
//     JTextArea outputArea;
//     JScrollPane scrollPane;
//     Container c;
//     Font myFont = new Font("Tahoma", Font.BOLD, 18);

//     public AppReadWriteFile() {
//         super("Example Read and WRite File ");
//         c = getContentPane();
//         c.setLayout(new FlowLayout());
//         panel = new JPanel();
//         panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10 ,10));
//         panel.setPreferredSize(new Dimension(500, 70));
//         label = new JLabel("ENter file name : ");
//         label.setFont(myFont);
//         panel.add(label);
//         textField = new JTextField(16);
//         textField.addActionListener(this);
//         textField.setFont(myFont);
//         panel.add(textField);
//         c.add(panel);
//         outputArea = new JTextArea(12, 30);
//         outputArea.setEditable(false);
//         outputArea.setFont(myFont);
//         scrollPane = new JScrollPane(outputArea);
//         c.add(scrollPane);
//         setSize(600, 400);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//     }
    
//     @Override
//     public void actionPerformed(ActionEvent event) {
//         String filename = textField.getText().toString();
//         outputArea.setText("");
//         try {
//             FileReader in = new FileReader(filename); // อ่านทีละ char
//             BufferedReader reader = new BufferedReader(in); // อ่านทีละทีละ บรรทัด (readLine()) ช้ buffer 8KB อ่านทีละก้อน
//             FileWriter out = new FileWriter("output.txt");
//             BufferedWriter writer = new BufferedWriter(out);
//             String s1;
//             while ((s1 = reader.readLine()) != null) { // อ่านแต่ละบรรทัดแค่เขียน readLine อ่านให้แล้วเปลี่ยนบรรทัดให้ check แค่ null
//                 writer.write(s1 + "\n");
//                 outputArea.append(s1 + "\n");
//             }
//             reader.close();
//             in.close();
//             writer.close();
//             out.close();
//             System.out.println("Read and write data to file complete.");
//         }
//         catch (IOException exception) {
//             // exception.printStackTrace();
//             JOptionPane.showMessageDialog(this, "can not open file" + filename, "Error Message", JOptionPane.ERROR_MESSAGE);
//         }
//     }
//     public static void main(String[] args) {
//         new AppReadWriteFile();
//     }
// }





// package chapter11;

// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
// import javax.swing.JScrollPane;
// import javax.swing.JTextArea;
// import javax.swing.JTextField;

// import java.awt.Container;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class AppReadWriteFile extends JFrame implements ActionListener{
//     JPanel panel;
//     JTextField textField;
//     JTextArea outputArea;
//     JLabel label;
//     JScrollPane scrollPane;
//     Font myFont = new Font("Tahoma", Font.BOLD, 18);
//     Container c;

//     public AppReadWriteFile() {
//         super("Example Read and Write File");
//         panel = new JPanel();
//         panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10 ,10));
//         panel.setPreferredSize(new Dimension(500, 60));
//         c = getContentPane();
//         c.setLayout(new FlowLayout());
//         label = new JLabel("Enter file name : ");
//         label.setFont(myFont);
//         panel.add(label);
//         textField = new JTextField(15);
//         textField.addActionListener(this);
//         textField.setFont(myFont);
//         panel.add(textField);
//         c.add(panel);
//         outputArea = new JTextArea(12,29);
//         outputArea.setEditable(false);
//         outputArea.setFont(myFont);
//         scrollPane = new JScrollPane(outputArea);
//         c.add(scrollPane);
//         setSize(600, 400);
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     @Override
//     public void actionPerformed(ActionEvent event) {
//         String filename = textField.getText();
//         outputArea.setText("");
//         try {
//             FileReader in = new FileReader(filename); // อ่านทีละ char
//             BufferedReader reader = new BufferedReader(in); // อ่านทีละทีละ บรรทัด (readLine()) ช้ buffer 8KB อ่านทีละก้อน
//             FileWriter out = new FileWriter("output.txt");
//             BufferedWriter writer = new BufferedWriter(out);
//             String s1;
//             while ((s1 = reader.readLine()) != null) { // อ่านแต่ละบรรทัดแค่เขียน readLine อ่านให้แล้วเปลี่ยนบรรทัดให้ check แค่ null
//                 writer.write(s1 + "\n");
//                 outputArea.append(s1 + "\n");
//             }
//             reader.close();
//             in.close();
//             writer.close();
//             out.close();
//         }
//         catch (IOException e) {
//             JOptionPane.showMessageDialog(this, "can not open file" + filename , "Error Message", JOptionPane.ERROR_MESSAGE);
//         }
//     }
    
//     public static void main(String[] args) {
//         new AppReadWriteFile();
//     }
// }




package chapter11;

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

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppReadWriteFile extends JFrame implements ActionListener{
    JPanel panel;
    JLabel label;
    JTextField textField;
    JTextArea outputArea;
    JScrollPane scrollPane;
    Container c;
    Font myFont = new Font("Tahoma", Font.BOLD, 18);

    public AppReadWriteFile() {
        super("Example Read and Write File");
        c = getContentPane();
        c.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 60));
        label = new JLabel("Enter file name : ");
        label.setFont(myFont);
        panel.add(label);
        textField = new JTextField(15);
        textField.setFont(myFont);
        textField.addActionListener(this);
        panel.add(textField);
        outputArea = new JTextArea(12,30);
        outputArea.setFont(myFont);
        outputArea.setEditable(false);
        scrollPane = new JScrollPane(outputArea);
        c.add(panel);
        c.add(scrollPane);
        setSize(600, 400);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String filename = textField.getText();
        outputArea.setText("");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\chapter11\\output.txt"));
            String s1;
            while ((s1 = reader.readLine()) != null) {
                writer.write(s1 + "\n");
                outputArea.append(s1 + "\n");
            }
            reader.close(); // close stream input
            writer.close();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(this, "cannot open file " + filename, "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new AppReadWriteFile();
    }
}