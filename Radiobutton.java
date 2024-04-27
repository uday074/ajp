import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Radiobutton extends JFrame implements ActionListener {
    JLabel l1 = new JLabel("Name:");

    public Radiobutton() {
        setTitle("Year Selection");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton rb1 = new JRadioButton("1st Year");
        JRadioButton rb2 = new JRadioButton("2nd Year");
        JRadioButton rb3 = new JRadioButton("3rd Year");
        JRadioButton rb4 = new JRadioButton("4th Year");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        buttonGroup.add(rb3);
        buttonGroup.add(rb4);

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);

        setLayout(new FlowLayout());

        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(l1);
    }

    public void actionPerformed(ActionEvent e) {
        JRadioButton rb = (JRadioButton) e.getSource();
        String selectedYear = rb.getText();

        l1.setText("Selected Year: " + selectedYear);
    }

    public static void main(String[] args) {
        Radiobutton ex = new Radiobutton();
        ex.setVisible(true);
    }
}
