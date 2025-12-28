// package chapter11;

// import java.awt.Container;
// import java.awt.Dimension;
// import java.awt.FlowLayout;
// import java.awt.Font;
// import java.awt.GridLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
// import javax.swing.JScrollPane;
// import javax.swing.JTextArea;
// import javax.swing.JTextField;

// public class AppProduct extends JFrame implements ActionListener {
//     JPanel panelForm;
//     JTextField textCode, textName, textPrice;
//     JLabel label1, label2, label3;
//     JButton saveBtn, readBtn;
//     JTextArea outputArea;
//     JScrollPane scrollPane;
//     Container c;
//     Font myFont = new Font("Tahoma", Font.BOLD, 16);
//     String FILENAME = "products.txt";

//     public AppProduct() {
//         super("Example Read and Write Product ");
//         c = getContentPane();
//         c.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
//         guiForm();
//         saveBtn = new JButton("Save Product ");
//         saveBtn.setFont(myFont);
//         saveBtn.addActionListener(this);
//         c.add(saveBtn);
//         readBtn = new JButton("Read Product ");
//         readBtn.setFont(myFont);
//         readBtn.addActionListener(this);
//         c.add(readBtn);
//         outputArea = new JTextArea(10, 30);
//         outputArea.setEditable(false);
//         outputArea.setFont(myFont);
//         scrollPane = new JScrollPane(outputArea);
//         c.add(scrollPane);
//         setSize(500, 450);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
        
//     }

//     public void guiForm() {
//         panelForm = new JPanel();
//         panelForm.setLayout(new GridLayout(3, 2));
//         panelForm.setPreferredSize(new Dimension(400, 100));
//         label1 = new JLabel("Enter Product Code : ");
//         label1.setFont(myFont);
//         textCode = new JTextField(10);
//         textCode.addActionListener(this);
//         textCode.setFont(myFont);
//         panelForm.add(label1);
//         panelForm.add(textCode);
//         label2 = new JLabel("Enter Product Name : ");
//         label2.setFont(myFont);
//         panelForm.add(label2);
//         textName = new JTextField(10);
//         textName.setFont(myFont);
//         panelForm.add(textName);
//         label3 = new JLabel("Enter Product Price : ");
//         label3.setFont(myFont);
//         panelForm.add(label3);
//         textPrice = new JTextField(10);
//         textPrice.setFont(myFont);
//         panelForm.add(textPrice);
//         c.add(panelForm);
//     }

//     @Override
//     public void actionPerformed(ActionEvent event) {
//         if (event.getSource() == saveBtn) {
//             saveProduct();
//         }
//         else if (event.getSource() == readBtn) {
//             readProduct();
//         }
//     }

//     public void saveProduct() {
//         String codeStr, nameStr, priceStr;
//         codeStr = textCode.getText();
//         nameStr = textCode.getText();
//         priceStr = textPrice.getText();
//         if (!codeStr.isEmpty() && !nameStr.isEmpty() && !priceStr.isEmpty()) {
//             String dataStr = codeStr + "," + nameStr + "," + priceStr;
//             try {
//                 BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true)); // ture คือ append true ทุกครั้งที่ save  เพิ่มข้อมูลต่อท้ายไฟล์เก่า ถ้าไม่จะเขียนทับไฟล์เก่า
//                 writer.write(dataStr + "\n");
//                 writer.close();
//                 JOptionPane.showMessageDialog(this, " Save already");
//                 textCode.setText("");
//                 textName.setText("");
//                 textPrice.setText("");
//             }
//             catch (IOException exception) {
//                 JOptionPane.showMessageDialog(this, "can not write data", "Error Message ", JOptionPane.ERROR_MESSAGE);
//             }
//         }
//         else {
//             JOptionPane.showMessageDialog(this, "Data not complete", "Error Message", JOptionPane.ERROR_MESSAGE);
//         }
//     }

//     public void readProduct() {
//         outputArea.setText("");
//         try {
//             BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
//             String s1;
//             while ((s1 = reader.readLine()) != null) {
//                 outputArea.append(s1 + "\n");
//             }
//             reader.close(); // close stream input
//         }
//         catch (IOException exception) {
//             JOptionPane.showMessageDialog(this, "can not read file", "Error Messagge", JOptionPane.ERROR_MESSAGE);
//         }
//     }

//     public static void main(String[] args) {
//         new AppProduct();
//     }
// }





package chapter11;

import java.awt.Container;
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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppProduct extends JFrame implements ActionListener{
    JPanel panelFrom;
    JLabel labelCode, labelName, labelPrice;
    JTextField textCode, textName, textPrice;
    JButton saveBtn, readBtn;
    JTextArea outputArea;
    JScrollPane scrollPane;
    Font myFont = new Font("Tahoma", Font.BOLD, 16);
    Container c;
    final String FILENAME = "src\\chapter11\\products.txt";

    public AppProduct() {
        super("Example Read and White Product");
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        guiForm();
        guiBtn();
        guiOutputArea();
        setSize(550, 450);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void guiForm() {
        panelFrom = new JPanel();
        panelFrom.setLayout(new GridLayout(3, 2));
        labelCode = new JLabel("Enter Product Code : ");
        labelCode.setFont(myFont);
        panelFrom.add(labelCode);
        textCode = new JTextField(15);
        textCode.setFont(myFont);
        panelFrom.add(textCode);
        labelName = new JLabel("Enter Product Name : ");
        labelName.setFont(myFont);
        panelFrom.add(labelName);
        textName = new JTextField(15);
        textName.setFont(myFont);
        panelFrom.add(textName);
        labelPrice = new JLabel("Enter Product Price : ");
        labelPrice.setFont(myFont);
        panelFrom.add(labelPrice);
        textPrice = new JTextField(15);
        textPrice.setFont(myFont);
        panelFrom.add(textPrice);
        c.add(panelFrom);
    }

    public void guiBtn() {
        saveBtn = new JButton("Save Product");
        saveBtn.setFont(myFont);
        saveBtn.addActionListener(this);
        c.add(saveBtn);
        readBtn = new JButton("Read Product");
        readBtn.setFont(myFont);
        readBtn.addActionListener(this);
        c.add(readBtn);
    }

    public void guiOutputArea() {
        outputArea = new JTextArea(10,30);
        outputArea.setFont(myFont);
        scrollPane = new JScrollPane(outputArea);
        c.add(scrollPane);
    }

    public void saveProduct() {
        String codeStr = textCode.getText();
            String nameStr = textName.getText();
            String priceStr = textPrice.getText();
            if (!codeStr.isEmpty() && !nameStr.isEmpty() && !priceStr.isEmpty()) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true));
                    writer.write(codeStr + "," + nameStr + "," + priceStr + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Save already");
                    textCode.setText("");
                    textName.setText("");
                    textPrice.setText("");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Cannot Open File", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Cannot Save Product", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
    }

    public void readProduct() {
        try {
            outputArea.setText("");
            BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
            String s1;
            while ((s1 = reader.readLine()) != null) {
                outputArea.append(s1 + "\n");
            }
            reader.close();
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Cannot Read Product" , "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == saveBtn) {
            saveProduct();
        }
        else if (event.getSource() == readBtn) {
            readProduct();
        }
    }

    public static void main(String[] args) {
        new AppProduct();
    }
}