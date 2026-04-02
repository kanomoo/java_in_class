// Id    :  68-060216-1203-7
// Name  :  Mr.Paphavin Thitichunhakun
// Room  :  1 RC
// File Name Calculator_6806021612037.java

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_6806021612037 extends JFrame implements ActionListener  {
    JPanel panelResult, panelBtn, panelCal;
    JTextField textResult;
    JButton btn[];
    Container c = getContentPane();
    Font fontResult = new Font("Tahoma",Font.BOLD,18), font = new Font("Tahoma",Font.BOLD,15);
    String strList[] = {"1", "2", "3", "/", "4", "5", "6", "*", "7", "8", "9", "-", "0", ".", "C", "+"}, str = "", cal = "";
    Boolean Cal = false;
    double num1, num2, total;

    public static void main(String[] args) throws Exception {
        new Calculator_6806021612037();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn[0]) { str += btn[0].getText(); textResult.setText(str);}
        else if (event.getSource() == btn[1]) { str += btn[1].getText(); textResult.setText(str);}
        else if (event.getSource() == btn[2]) { str += btn[2].getText(); textResult.setText(str);}
        else if (event.getSource() == btn[3]) {
            try {num1 = Double.parseDouble(str);}
            catch (Exception e) {}
            cal = btn[3].getText();
            str = ""; textResult.setText(str);
            Cal = true;
        }
        else if (event.getSource() == btn[4]) { str += btn[4].getText(); textResult.setText(str);}
        else if (event.getSource() == btn[5]) { str += btn[5].getText(); textResult.setText(str);}
        else if (event.getSource() == btn[6]) { str += btn[6].getText(); textResult.setText(str);}
        else if (event.getSource() == btn[7]) {
            try {num1 = Double.parseDouble(str);}
            catch (Exception e) {}
            cal = btn[7].getText();
            str = ""; textResult.setText(str);
            Cal = true;
        }
        else if (event.getSource() == btn[8]) { str += btn[8].getText(); textResult.setText(str);}
        else if (event.getSource() == btn[9]) { str += btn[9].getText(); textResult.setText(str);}
        else if (event.getSource() == btn[10]) { str += btn[10].getText(); textResult.setText(str);}
        else if (event.getSource() == btn[11]) {
            try {num1 = Double.parseDouble(str);}
            catch (Exception e) {}
            cal = btn[11].getText();
            str = ""; textResult.setText(str);
            Cal = true;
        }
        else if (event.getSource() == btn[12]) { str += btn[12].getText(); textResult.setText(str);}
        else if (event.getSource() == btn[13]) {
            Boolean dod = false;
            for (int i = 0; i < str.length(); i++) if (str.charAt(i) == '.') dod = true;
            if (!dod) str += btn[13].getText(); textResult.setText(str);
        }
        else if (event.getSource() == btn[14]) { num1 = 0; num2 = 0; total = 0; str = ""; textResult.setText(str);}
        else if (event.getSource() == btn[15]) {
            try {num1 = Double.parseDouble(str);}
            catch (Exception e) {}
            cal = btn[15].getText();
            str = ""; textResult.setText(str);
            Cal = true;
        }
        else if (event.getSource() == btn[16]) {
            if (Cal == true) {
                try {num2 = Double.valueOf(str);}
                catch (Exception e) {}
                str = ""; textResult.setText(str);
                if (cal.equals("/")) textResult.setText(String.valueOf(total = num1 / num2));
                else if (cal.equals("*")) textResult.setText(String.valueOf(total = num1 * num2));
                else if (cal.equals("-")) textResult.setText(String.valueOf(total = num1 - num2));
                else if (cal.equals("+")) textResult.setText(String.valueOf(total = num1 + num2));
                num1 = total;
                Cal = false;
            }
            else {}
        }
    }

    public Calculator_6806021612037() {
        super("Calculator ID-68-060216-1203-7 V. 1.0");
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        initGui();
        setSize(430,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void initGui() {
        initPanelResult();
        initPanelBtn();
        initPanelCal();
    }

    public void initPanelResult() {
        panelResult = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelResult.setPreferredSize(new Dimension(360, 40));
        panelResult.setBorder(new LineBorder(Color.black));
        panelResult.add(textResult = new JTextField(20));
        textResult.setFont(fontResult); textResult.setHorizontalAlignment(JTextField.RIGHT);
        textResult.setEditable(false);
        c.add(panelResult);
    }

    public void initPanelBtn() {
        panelBtn = new JPanel(new GridLayout(4, 4, 2, 2));
        panelBtn.setPreferredSize(new Dimension(330, 150));
        panelBtn.setBorder(new LineBorder(Color.BLACK));
        btn = new JButton[strList.length + 1];
        for (int i = 0; i < strList.length; i++) {
            btn[i] = new JButton(strList[i]);
            btn[i].setFont(font);
            btn[i].addActionListener(this);
            panelBtn.add(btn[i]);
        }
        c.add(panelBtn);
    }

    public void initPanelCal() {
        panelCal = new JPanel(new GridLayout(1,1));
        panelCal.setPreferredSize(new Dimension(330, 30));
        btn[strList.length] = new JButton("="); btn[strList.length].setFont(font);
        btn[strList.length].addActionListener(this);
        panelCal.add(btn[strList.length]);
        c.add(panelCal);
    }

    
}
