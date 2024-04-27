import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class FileAppend
{
	static JLabel j1;
	static JLabel j2;
	static JLabel j3;
	static JTextField tf1;
	static JTextField tf2;
	static JTextField tf3;
	static JButton jb;
	public static void main(String args[])
	{
		FileAppend fr = new FileAppend();
	}
	FileAppend()
	{
		JFrame fr = new JFrame("FILE APPENDING");
		fr.setSize(500,500);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(null);
		j1 = new JLabel("Enter your Name");
		j2 = new JLabel("Enter your Roll Number");
		j3 = new JLabel("Enter your Branch");
		tf1 = new JTextField(15);
		tf2 = new JTextField(15);
		tf3 = new JTextField(15);
		jb = new JButton("Enter");
		j1.setBounds(40,40,150,20);
		j2.setBounds(40,100,200,20);
		j3.setBounds(40,160,200,20);
		tf1.setBounds(180,40,150,20);
		tf2.setBounds(200,100,150,20);
		tf3.setBounds(200,160,150,20);
		jb.setBounds(40,200,150,20);
		fr.add(j1);
		fr.add(j2);
		fr.add(j3);
		fr.add(tf1);
		fr.add(tf2);
		fr.add(tf3);
		fr.add(jb);
		fr.setVisible(true);
		jb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					String name = tf1.getText();
					String r_no = tf2.getText();
					String p_no = tf3.getText();
					try
					{
						FileWriter fw = new FileWriter("createDemo.txt",true);
						fw.write(name);
						fw.write("\n");
						fw.write(r_no);
						fw.write("\n");
						fw.write(p_no);
						fw.write("\n");
						fw.close();
						JOptionPane.showMessageDialog(null,"Data is inserted successfully!");
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null,"Exception");
					}
			}
		});
		
	}
}
