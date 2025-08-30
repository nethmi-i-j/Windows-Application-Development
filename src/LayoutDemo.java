import javax.swing.*;
import java.awt.*;

public class LayoutDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Layout Demo");
        frame.setLayout(new BorderLayout());

        //Border Layout
//        frame.add(new JButton("North"), BorderLayout.NORTH);
//        frame.add(new JButton("South"), BorderLayout.SOUTH);
//        frame.add(new JButton("East"), BorderLayout.EAST);
//        frame.add(new JButton("West"), BorderLayout.WEST);
//        frame.add(new JButton("Center"), BorderLayout.CENTER);

        //FlowLayout
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(new JButton("one"));
        frame.add(new JButton("two"));
        frame.add(new JButton("three"));



        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
