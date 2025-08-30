import javax.swing.*;

public class MouseDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("MouseDemo");
        JLabel label = new JLabel("click me", SwingConstants.CENTER);

        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Label Clicked");
            }
        });

        frame.add(label);
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
