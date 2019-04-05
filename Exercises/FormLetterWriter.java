import javax.swing.JOptionPane;
import java.awt.*;

public class FormLetterWriter {
    public static void main(String[] args){
        getName("Thaw Tar");
        greeting("Chaw Su", "Thaw Tar");
    }
    public static void getName(String lastName){
        JOptionPane.showMessageDialog(null, "Hello Mr. or Mrs " + lastName);


    }
    public static void greeting(String firstName, String lastName) {
        JOptionPane.showMessageDialog(null, "Dear " + firstName + " " + lastName);
        JOptionPane.showMessageDialog(null, "Thank you for your recent order.");
    }

}
