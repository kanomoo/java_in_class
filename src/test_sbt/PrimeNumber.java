package test_sbt;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeNumber extends JFrame implements ActionListener{
    JTextField textStart, textEnd;
    JButton searchBtn, clearBtn;
    JPanel panelBtn;
    Container container;

    public static void main(String[] args) {
        new PrimeNumber();
    }

    public PrimeNumber() {
        super("Finding prime numbers.");
        container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        initGui();
        setSize(200,250);
        setVisible(true);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        container.add(new JLabel("The beginning (start)"));
        textStart = new JTextField(15);
        container.add(textStart);
        container.add(new JLabel("End"));
        textEnd = new JTextField(15);
        container.add(textEnd);
        searchBtn = new JButton("search");
        container.add(searchBtn);
        clearBtn = new JButton("Clear data");
        container.add(clearBtn);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

    }
}
