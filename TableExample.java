import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableExample {
    public static void main(String args[]) {
        new TableExample();
    }

    TableExample() {
        JFrame fr = new JFrame("JTABLE");
        fr.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String header[] = {"ROLL NUMBER", "FIRST NAME", "LAST NAME"};
        String data[][] = {{"B21CN005", "Sarayu", "Polampalli"}, {"B21CN006", "Bharath", "Aruri"}};

        DefaultTableModel dt = new DefaultTableModel(data, header);
        JTable jt = new JTable(dt);

        JScrollPane scrollPane = new JScrollPane(jt);
        fr.add(scrollPane);

        fr.setVisible(true);
    }
}
