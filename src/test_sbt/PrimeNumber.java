package test_sbt;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeNumber extends JFrame implements ActionListener {
    JTextField textStart, textEnd;
    JButton searchBtn, clearBtn;
    JPanel panelBtn;
    JTextArea outputArea;
    JScrollPane scrollPane;
    Container container;


    public PrimeNumber() {
        super("Finding prime numbers.");
        container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        initGui();
        setSize(210, 400);
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
        searchBtn.addActionListener(this);
        container.add(searchBtn);
        clearBtn = new JButton("Clear data");
        clearBtn.addActionListener(this);
        container.add(clearBtn);
        outputArea = new JTextArea(10, 16);
        scrollPane = new JScrollPane(outputArea);
        container.add(scrollPane);
    }

    public void checkPrime(String output, int start, int end) {
        int count = 0;
        boolean firstLine = true;
        if (start >= 2 && end >= 2) {
            for (int i = start; i <= end; i++) {
                String stringPrime = i + "";
                String comma = (i == start ? " " : ", ");
                boolean isPrimeNumber = true;
                for (int n = 2; n <= (i / 2); n++) {
                    if (i % n == 0) {
                        stringPrime = "";
                        isPrimeNumber = false;
                        break;
                    } 
                    else {
                        if (n == (i /2)) {
                            if (isPrimeNumber == true) {
                                count++ ;
                                if (count == 6 && firstLine) {
                                    comma = "\n";
                                    count = 0 ; 
                                    firstLine = false;
                                }
                                else if (count == 9) {
                                    count = 0 ; comma = "\n";
                                }
                            }
                        }
                        stringPrime = comma + i;
                    }
                }
                output += stringPrime;
            }
        }
        else {
            output += "\nThere are no prime numbers \nin this range.";
        }
        outputArea.setText(output);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == searchBtn) {
            int numStart = Integer.parseInt(textStart.getText());
            int numEnd = Integer.parseInt(textEnd.getText());
            String output = "Number range: " + numStart + " to " + numEnd + "\nPrime numbers: ";
            checkPrime(output, numStart, numEnd);
        } 
        else if (event.getSource() == clearBtn) {
            textStart.setText("");
            textEnd.setText("");
            outputArea.setText("");
        }
    }

    public static void main(String[] args) {
        new PrimeNumber();
    }
}
