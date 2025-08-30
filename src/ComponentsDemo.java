import javax.swing.*;

public class ComponentsDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Components Demo");
        JPanel panel = new JPanel();

        panel.add(new JLabel("Name: "));
        panel.add(new JTextField(10));
        panel.add(new JButton("Submit"));
        panel.add(new JCheckBox("Subscribe"));
        panel.add(new JComboBox<>(new String[]{"Red","Green","Blue"}));  //drop down list

        frame.add(panel);
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }


}
