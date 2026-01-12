package test_sbt;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculateExponents extends JFrame implements ActionListener {
    Container container;
    JPanel panelBtn;
    JTextField textBase, textExponent;
    JButton calBtn, clearBtn;

    public CalculateExponents () {
        super("Calculate exponents.");
        container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        initGui();
        setSize(250,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        container.add(new JLabel("Base"));
        textBase = new JTextField(20);
        container.add(textBase);
        container.add(new JLabel("Exponent"));
        textExponent = new JTextField(20);
        container.add(textExponent);
        initPanelBtn();
        
    }

    public void initPanelBtn() {
        panelBtn = new JPanel();
        panelBtn.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        calBtn = new JButton("calculate");
        calBtn.addActionListener(this);
        panelBtn.add(calBtn);
        clearBtn = new JButton("Clear results");
        clearBtn.addActionListener(this);
        panelBtn.add(clearBtn);
        container.add(panelBtn);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }

    public static void main(String[] args) {
        new CalculateExponents();
    }
}