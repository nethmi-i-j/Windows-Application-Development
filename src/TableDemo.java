import javax.swing.*;

public class TableDemo {

    public static void main(String[] args) {

        String[] columns = {"ID", "Name", "Marks"};
        String[][] data = {
                {"1", "Alice", "85"} ,
                {"2", "Bob", "90"},
                {"3", "Charlie", "78"}
        };

        JTable table = new JTable(data,columns);
        JFrame frame = new JFrame("Table Demo");
        frame.add(new JScrollPane(table));
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
