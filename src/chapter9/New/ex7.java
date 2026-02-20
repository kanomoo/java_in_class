package chapter9.New;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class ex7 {
    public static void main(String[] args) {
        new WindowsGui4();
    }
}

class WindowsGui4 extends JFrame implements ActionListener{
    JList<String> list;
    JComboBox<String> comboBox;
    Container c = getContentPane();
    Font font = new Font("Tahoma", Font.BOLD, 16);

    public WindowsGui4() {
        super("GUI 4 : JList, JComboBox");
        c.setLayout(new FlowLayout());
        list = new JList<String>(new String[] {"List 1", "List 2", "List 3", "List 4"});
        list.setFont(font);
        comboBox = new JComboBox<>(new String[] {"ComboBox 1", "ComboBox 2", "ComboBox 3"});
        comboBox.setFont(font);
        c.add(list);
        c.add(comboBox);
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
    }
}
