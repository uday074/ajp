import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class comboB extends JFrame implements ActionListener 
{
    JComboBox<String> cb = new JComboBox<>();
    JLabel l1 = new JLabel("You have selected: ");

    public comboB() {
        setTitle("Branch Selection");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        cb.addItem("CSN");
        cb.addItem("CSE");
        cb.addItem("IT");
        cb.addItem("Civil");
        cb.addItem("Mech");

        

        cb.addActionListener(this);

        setLayout(new FlowLayout());

        add(cb);
        add(l1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
	{
        String selectedBranch = (String) cb.getSelectedItem();
        l1.setText("You have selected: " + selectedBranch);
    }

    public static void main(String[] args) 
	{
        new comboB();
    }
}


