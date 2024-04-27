import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class ajp extends JFrame implements ActionListener 
{
	JLabel l1 = new JLabel("Name:");
    JLabel l2 = new JLabel("Roll Number:");
    JLabel l3 = new JLabel("Age:");
    JTextField inp1 = new JTextField(10);
    JTextField inp2 = new JTextField(3);
    JTextField inp3 = new JTextField(20);
    JButton b1 = new JButton("Submit");
    public ajp() 
	{
        setTitle("Student Information");
        setLayout(new FlowLayout());
        add(l1);
        add(inp1);
        add(l2);
        add(inp2);
        add(l3);
        add(inp3);
        add(b1);
		b1.addActionListener(this);
		setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) 
	{
        JButton b = (JButton) ae.getSource();
        try
		{
			BufferedWriter wr = new BufferedWriter(new FileWriter("student.txt"));
            String name = inp1.getText();
            String rollNumber = inp2.getText();
            String age = inp3.getText();

            if (b == b1) 
			{ 
                wr.write(name + "," + rollNumber + "," + age);
                wr.close();
                inp1.setText("");
				inp2.setText("");
				inp3.setText("");
            }
        } 
		catch (IOException e) 
		{
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public static void main(String[] args) 
	{
        new ajp();
    }
}








import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class filereader extends JFrame implements ActionListener 
{
    JLabel fLabel = new JLabel("Enter File Name:");
    JTextField fField = new JTextField(20);
    JButton b1 = new JButton("Submit");
    JTextArea tarea = new JTextArea(10, 20);
    public filereader() 
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
        new filereader();
    }
}