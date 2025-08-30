import javax.swing.*;

public class DialogDemo {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "This is an info message!");
        int choice = JOptionPane.showConfirmDialog(null,"Exit Application?");
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }


    }
}
