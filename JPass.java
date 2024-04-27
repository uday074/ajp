import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class JPass extends JFrame implements ActionListener 
{
    JLabel fLabel = new JLabel("Enter File Name:");
    JTextField fField = new JTextField(20);
    JButton b1 = new JButton("Submit");
    JTextArea tarea = new JTextArea(10, 20);
    public JPass() 
	{
        setTitle("File Reader");
        setLayout(new FlowLayout());
        add(fLabel);
        add(fField);
        add(b1);
		add(tarea);
        b1.addActionListener(this);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) 
	{
        JButton b = (JButton) ae.getSource();
        if (b==b1) 
		{
            String fileName = fField.getText();
            try 
			{
				BufferedReader reader = new BufferedReader(new FileReader(fileName));
                tarea.setText("");
                String line;
                while ((line = reader.readLine()) != null) 
				{
                    tarea.append(line + "\n");
                }
            } catch (IOException e) 
			{
                JOptionPane.showMessageDialog(null, "Error reading file: ");
            }
        }
    }

    public static void main(String[] args) 
	{
        new JPass();
    }
}