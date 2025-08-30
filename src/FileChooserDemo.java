import javax.swing.*;
import java.io.File;

public class FileChooserDemo {

    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();

        int choice = chooser.showOpenDialog(null);
        if (choice == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            JOptionPane.showMessageDialog(null,"You selected: " + file.getAbsolutePath());
        }

    }
}
