package test_sbt;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculateExponents extends JFrame implements ActionListener {
    Container container;
    JPanel panelText, panelBtn;
    JTextField textBase, textExponent;

    public CalculateExponents () {
        super("Calculate exponents.");
        container = getContentPane();
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        
    }

    public void initPanelText() {
        container.add(new JLabel("Base"));

    }

    public void initPanelBtn() {

    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }

    public static void main(String[] args) {
        new CalculateExponents();
    }
}