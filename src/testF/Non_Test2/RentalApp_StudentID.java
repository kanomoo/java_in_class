package testF.Non_Test2;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class RentalApp_StudentID extends JFrame implements ActionListener {
    JPanel panelForm, panelType, panelBtn, panelResult;
    JTextField textBrand, textRate, textDays, textSeats, textEngine;
    JButton btnCal, btnClear;
    ButtonGroup group;
    JTextArea textArea;
    JRadioButton btnCar, btnMotor;
    Vehicle vehicle;
    Car car;
    Motorcycle motorcycle;
    Container c = getContentPane();
    public static void main(String[] args) {
        new RentalApp_StudentID();
    }

    RentalApp_StudentID() {
        super("Vehicle Rental System");
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        initComponents();
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnCal) {
            calculateAction();
        }
        else if (event.getSource() == btnClear) {
            textBrand.setText(""); textRate.setText(""); textDays.setText(""); textSeats.setText(""); textEngine.setText(""); textArea.setText(""); btnCar.setSelected(true);
            textSeats.setEditable(true); textEngine.setEditable(false);
        }
        else if (event.getSource() == btnCar) {
            textEngine.setText(""); textEngine.setEditable(false); textSeats.setEditable(true);
        }
        else if (event.getSource() == btnMotor) {
            textSeats.setText(""); textSeats.setEditable(false); textEngine.setEditable(true);
        }
    }

    public void initComponents() {
        initPanelForm();
        initPanelType();
        initPanelBtn();
        initPanelResult();
    }

    public void initPanelForm() {
        panelForm = new JPanel(new FlowLayout());
        panelForm.setPreferredSize(new Dimension(320,100));
        panelForm.setBorder(new LineBorder(Color.GRAY));
        panelForm.add(new JLabel("Brand :                ")); panelForm.add(textBrand = new JTextField(15));
        panelForm.add(new JLabel("Base Rate/Day : ")); panelForm.add(textRate = new JTextField(15));
        panelForm.add(new JLabel("Rent Days :         ")); panelForm.add(textDays = new JTextField(15));
        c.add(panelForm);
    }

    public void initPanelType() {
        panelType = new JPanel(new FlowLayout());
        panelType.setPreferredSize(new Dimension(320,100));
        panelType.setBorder(new LineBorder(Color.GRAY));
        panelType.add(new JLabel("Vehicle Type : "));
        panelType.add(btnCar = new JRadioButton("Car")); panelType.add(btnMotor = new JRadioButton("Motorcycle          "));
        btnCar.addActionListener(this); btnMotor.addActionListener(this);
        btnCar.setSelected(true);
        group = new ButtonGroup(); group.add(btnCar); group.add(btnMotor);
        panelType.add(new JLabel("Seats :              ")); panelType.add(textSeats = new JTextField(15));
        panelType.add(new JLabel("Engine CC :     ")); panelType.add(textEngine = new JTextField(15));
        textEngine.setEditable(false);
        c.add(panelType);
    }

    public void initPanelBtn() {
        panelBtn = new JPanel(new FlowLayout());
        panelBtn.setPreferredSize(new Dimension(320,50));
        panelBtn.setBorder(new LineBorder(Color.GRAY));
        panelBtn.add(btnCal = new JButton("Calculate")); btnCal.addActionListener(this);
        panelBtn.add(btnClear = new JButton("Clear")); btnClear.addActionListener(this);
        c.add(panelBtn);
    }

    public void initPanelResult() {
        panelResult = new JPanel(new FlowLayout());
        panelResult.setPreferredSize(new Dimension(320,100));
        panelResult.setBorder(new LineBorder(Color.GRAY));
        panelResult.add(textArea = new JTextArea(5,28));
        c.add(panelResult);
    }

    public void calculateAction() {
        if (!textBrand.getText().isEmpty() && !textRate.getText().isEmpty() && !textDays.getText().isEmpty() && (!textSeats.getText().isEmpty() || !textEngine.getText().isEmpty()) ) {
                if (btnCar.isSelected()) {
                    car = new Car(textBrand.getText(), Double.parseDouble(textRate.getText()), Integer.parseInt(textDays.getText()), Integer.parseInt(textSeats.getText()));
                    textArea.setText(car.getRentalSummary());
                }
                else if (btnMotor.isSelected()) {
                    motorcycle = new Motorcycle(textBrand.getText(), Double.parseDouble(textRate.getText()), Integer.parseInt(textDays.getText()), Integer.parseInt(textEngine.getText()));
                    textArea.setText(motorcycle.getRentalSummary());
                }
            }
            else {
                JOptionPane.showMessageDialog(c, "No input");
            }
    }
}

class Vehicle {
    protected String brand;
    protected double baseRatePerDay;
    protected int renDays;

    Vehicle(String brand, double rate, int days) {
        this.brand = brand;
        this.baseRatePerDay = rate;
        this.renDays = days;
    }

    public double calculateRent() {
        return baseRatePerDay * renDays;
    }

    public String getRentalSummary() {
        return "Brand : " + brand + " | Days : "  + renDays + " | ";
    }
}

class Car extends Vehicle{
    private int seats;

    public Car(String brand, double rate, int days, int seats) {
        super(brand, rate, days);
        this.seats = seats;
    }

    @Override
    public double calculateRent() {
        if (seats > 5) return super.calculateRent() + (renDays * 500.0);
        else return super.calculateRent();
    }

    @Override
    public String getRentalSummary() {
        return "[Car] " + super.getRentalSummary() + " Total Rent : " + calculateRent();
    }
}


class Motorcycle extends Vehicle{
    private int engineCC;

    public Motorcycle(String brand, double rate, int days, int engineCC) {
        super(brand, rate, days);
        this.engineCC = engineCC;
    }

    @Override
    public double calculateRent() {
        if (engineCC > 150) return super.calculateRent() + (renDays * 200.0);
        else return super.calculateRent();
    }

    @Override
    public String getRentalSummary() {
        return "[Motorcycle] " + super.getRentalSummary() + " Total Rent : " + calculateRent();
    }
}