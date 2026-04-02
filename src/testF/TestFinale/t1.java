package testF.TestFinale;

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

public class t1 extends JFrame implements ActionListener {
    JPanel panelResult, panelBtn, panelBtnResult;
    JTextField textResult;
    JButton btn[], btnResult;
    Font font = new Font("Tahoma", Font.BOLD, 18) ;
    String output = "", cal = "";
    double num = -1;
    Boolean dod = false;
    Container c = getContentPane();

    public static void main(String[] args) {
        new t1();
    }

    public t1() {
        super("Calculator ID-68-060216-9999-9 V.1.0");
        c.setLayout(new FlowLayout());
        initGui();
        setSize(450,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn[0]) { output += btn[0].getText(); textResult.setText(output);}
        else if (event.getSource() == btn[1]) { output += btn[1].getText(); textResult.setText(output);}
        else if (event.getSource() == btn[2]) { output += btn[2].getText(); textResult.setText(output);}
        else if (event.getSource() == btn[3]) {
            if (!output.isEmpty()) {
                num = Double.parseDouble(output);
                textResult.setText(output = "");
                dod = false;
                cal = btn[3].getText();
            }
        }
        else if (event.getSource() == btn[4]) { output += btn[4].getText(); textResult.setText(output);}
        else if (event.getSource() == btn[5]) { output += btn[5].getText(); textResult.setText(output);}
        else if (event.getSource() == btn[6]) { output += btn[6].getText(); textResult.setText(output);}
        else if (event.getSource() == btn[7]) {
            if (!output.isEmpty()) {
                num = Double.parseDouble(output);
                textResult.setText(output = "");
                dod = false;
                cal = btn[7].getText();
            }
        }
        else if (event.getSource() == btn[8]) { output += btn[8].getText(); textResult.setText(output); }
        else if (event.getSource() == btn[9]) { output += btn[9].getText(); textResult.setText(output); }
        else if (event.getSource() == btn[10]) { output += btn[10].getText(); textResult.setText(output); }
        else if (event.getSource() == btn[11]) {
            if (!output.isEmpty()) {
                num = Double.parseDouble(output);
                textResult.setText(output = "");
                dod = false;
                cal = btn[11].getText();
            }
        }
        else if (event.getSource() == btn[12]) { output += btn[12].getText(); textResult.setText(output); }
        else if (event.getSource() == btn[13]) {
            if (!output.isEmpty() && dod == false) {
                output += btn[13].getText(); dod = true;
                textResult.setText(output);
            }
        }
        else if (event.getSource() == btn[14]) { output = ""; num = 0; textResult.setText(output); dod = false; }
        else if (event.getSource() == btn[15]) {
            if (!output.isEmpty()) {
                num = Double.parseDouble(output);
                textResult.setText(output = "");
                dod = false;
                cal = btn[15].getText();
            }
        }
        else if (event.getSource() == btnResult) {
            if (cal.equals("/")) textResult.setText(output = String.valueOf(num / Double.parseDouble(output) ));
            else if (cal.equals("*")) textResult.setText(output = String.valueOf(num * Double.parseDouble(output)));
            else if (cal.equals("-")) textResult.setText(output = String.valueOf(num - Double.parseDouble(output)));
            else if (cal.equals("+")) textResult.setText(output = String.valueOf(num + Double.parseDouble(output)));
        }
    }

    public void initGui() {
        initLabelResult();
        initLabelBtn();
        initPanelBtnResult();
    }

    public void initLabelResult() {
        panelResult = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelResult.setPreferredSize(new Dimension(370, 50));
        panelResult.setBorder(new LineBorder(Color.black));
        panelResult.add(textResult = new JTextField(20)); textResult.setFont(font);
        textResult.setText(output);
        textResult.setHorizontalAlignment(JTextField.RIGHT); textResult.setEditable(false);
        c.add(panelResult);
    }

    public void initLabelBtn() {
        panelBtn = new JPanel(new GridLayout(4, 4, 3, 3));
        panelBtn.setPreferredSize(new Dimension(350,150));
        panelBtn.setBorder(new LineBorder(Color.black));
        String[] strBtn = {"1", "2", "3", "/", "4", "5", "6", "*", "7", "8", "9", "-", "0", ".", "C", "+"};
        btn = new JButton[strBtn.length];
        for (int i = 0; i < strBtn.length; i++) {
            btn[i] = new JButton(strBtn[i]);
            btn[i].addActionListener(this); btn[i].setFont(font);
            panelBtn.add(btn[i]);
        }
        c.add(panelBtn);
    }

    public void initPanelBtnResult() {
        panelBtnResult = new JPanel(new GridLayout(1, 1));
        panelBtnResult.setPreferredSize(new Dimension(350,30));
        panelBtnResult.add(btnResult = new JButton("=")); btnResult.setFont(font);
        btnResult.addActionListener(this);
        c.add(panelBtnResult);
    }
}
