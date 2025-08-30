import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MenuDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Menu Demo");

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem abotItem = new JMenuItem("About");

        exitItem.addActionListener(e-> System.exit(0));
        fileMenu.add(exitItem);
        helpMenu.add(abotItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);







    }
}
