import javax.swing.*;

public class HelloSwing {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello Swing");
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);

        frame.add(label);
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
