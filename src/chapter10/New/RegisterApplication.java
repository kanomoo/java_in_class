package chapter10.New;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class RegisterApplication extends JFrame implements ActionListener {
    Register reg;
    Student std[];
    Subject sub[];
    JPanel panelStd, panelSub, panelResult, panelBtn;
    JTextField textFieldStd;
    JTextArea textArea;
    JComboBox<String> comboStd, comboSub;
    JButton btnStd, btnSub, btnSave, btnCancle;
    JScrollPane scrollPane;
    Container c = getContentPane();
    int count = 0, max = 3, choiceSub[] = new int[max + 1];

    public static void main(String[] args) {
        new RegisterApplication();
    }
    
    public RegisterApplication() {
        super(">>> Program Register <<<");
        initGui();
        setSize(550,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initGui() {
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        c.add(new JLabel("Course Registration Program"));
        initData();
        initPanelStd();
        initPanelSub();
        initPanelResult();
        initPanelBtn();
    }

    public void initData() {
        reg = new Register(new Student(), 5);
        for (int i = 0; i <= max; i++) choiceSub[i] = -1;
    }

    public void initPanelStd() {
        panelStd = createPanel(500, 80);
        panelStd.add(new JLabel("Select Student : "));
        std = new Student[3];
        std[0] = new Student("6806021612037", "Paphavin", "Thitichunhakun");
        std[1] = new Student("6806021616789", "John", "Smit");
        std[2] = new Student("6806021617389", "Zim", "Son");
        String stdString[] = new String[std.length];
        for (int i = 0; i < std.length; i++) stdString[i] = std[i].toString();
        panelStd.add(comboStd = new JComboBox<>(stdString));
        btnStd = createBtn("Add Student");
        panelStd.add(btnStd);
        panelStd.add(textFieldStd = new JTextField(43));
        textFieldStd.setEditable(false);
    }

    public void initPanelSub() {
        panelSub = createPanel(500, 80);
        panelSub.add(new JLabel("Select Subject : "));
        sub = new Subject[5];
        sub[0] = new Subject("060243103", "Computer Programming", 3);
        sub[1] = new Subject("060243280", "Data Structure", 3);
        sub[2] = new Subject("060243216", "Data Commutation", 3);
        sub[3] = new Subject("060243246", "Data Mine", 3);
        sub[4] = new Subject("060243286", "SoftWare", 3);
        String subString[] = new String[sub.length];
        for (int i = 0; i < sub.length; i++) subString[i] = sub[i].toString();
        panelSub.add(comboSub = new JComboBox<>(subString));
        panelSub.add(btnSub = createBtn("Add Subject"));
        c.add(panelSub);
    }

    public void initPanelResult() {
        panelResult = createPanel(500, 100);
        panelResult.add(scrollPane = new JScrollPane(textArea = new JTextArea(5,42)));
        textArea.setEditable(false);
        c.add(panelResult);
    }

    public void initPanelBtn() {
        panelBtn = createPanel(500, 50);
        panelBtn.add(btnSave = createBtn("Save"));
        panelBtn.add(btnCancle= createBtn("Cancel"));
        c.add(panelBtn);
    }

    public JPanel createPanel(int width, int heigh) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        panel.setPreferredSize(new Dimension(width, heigh));
        panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
        c.add(panel);
        return panel;
    }

    public JButton createBtn(String title) {
        JButton btn = new JButton(title);
        btn.addActionListener(this);
        return btn;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnStd) {
            btnStd.setEnabled(false);
            textFieldStd.setText("" + comboStd.getSelectedItem());
            reg.setStudent(std[comboStd.getSelectedIndex()]);
        } else if (event.getSource() == btnSub) {
            boolean choice = false;
            for (int i : choiceSub) if (i == comboSub.getSelectedIndex()) {choice = true; break;}
            if (choice == false) {
                if (count < max) {
                    choiceSub[count + 1] = comboSub.getSelectedIndex();
                    reg.setSubject(sub[comboSub.getSelectedIndex()], count);
                    textArea.append(comboSub.getSelectedItem() + "\n");
                    count++;
                }
            }
            if (count >= max) {
                btnSub.setEnabled(false);
            }
        } else if (event.getSource() == btnSave) {
                String output = reg.getStudent() + "\nSubject:\n";
                for (int i = 0; i < count; i++) output += reg.getSubject(i) + "\n";
                JOptionPane.showMessageDialog(null, output);
        } else if (event.getSource() == btnCancle) {
            btnStd.setEnabled(true);
            textFieldStd.setText("");
            btnSub.setEnabled(true);
            textArea.setText("");
            for (int i = 0; i <= max; i++) choiceSub[i] = -1;
            count = 0;
            reg.setStudent(new Student());
        }
    }
}