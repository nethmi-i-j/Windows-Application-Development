import javax.swing.*;

public class ButtonsDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Demo");
        JButton btn = new JButton("click me");

        btn.addActionListener(e ->{
            JOptionPane.showMessageDialog(frame, "Button Clicked");
        });

        frame.add(btn);
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
