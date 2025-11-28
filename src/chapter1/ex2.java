// package chapter1;

// public class ex2 {
//     public static void main(String[] args) {
//         System.out.println("ID : 68-060216-1203-7\nName : Paphavin\nSurname : Tithichunhakun\nGender : Male\nAge : 18");
//     }
// }

package chapter1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ex2 {

    public static void main(String[] args) {
        JTextArea outputArea = new JTextArea();
        String output = "";
        String id = JOptionPane.showInputDialog("Enter Id: ");
        String name = JOptionPane.showInputDialog("Enter Name: ");
        String surname = JOptionPane.showInputDialog("Enter Surname");
        String gender = JOptionPane.showInputDialog("Enter Gender:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age:"));
        String room = JOptionPane.showInputDialog("Enter Room:");
        output += "Id : " + id + "\nName : " + name + "\nSurname : " + surname + "\nGender: " + gender + "\nAge: " + age
                + "\nRoom: " + room;
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, output);

    }
}