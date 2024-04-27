import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Directions
{
	JFrame fr;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JTextArea ta;
	public static void main(String args[])
	{
		new Directions();
	}
	Directions()
	{
		fr = new JFrame("BORDER LAYOUT EXAMPLE");
		fr.setExtendedState(fr.MAXIMIZED_BOTH);
		fr.setLayout(new BorderLayout());
		fr.setDefaultCloseOperation(3);
		ta = new JTextArea();
		b1 = new JButton("NORTH");
		b2 = new JButton("SOUTH");
		b3 = new JButton("EAST");
		b4 = new JButton("WEST");
		fr.add(b1, BorderLayout.NORTH);
		fr.add(b2, BorderLayout.SOUTH);
		fr.add(b3, BorderLayout.EAST);
		fr.add(b4, BorderLayout.WEST);
		fr.add(ta, BorderLayout.CENTER);
		fr.setVisible(true);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String a = "";
				ta.append("You are heading towards North \n");
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String a = "";
				ta.append("You are heading towards South \n");
			}
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String a = "";
				ta.append("You are heading towards East \n");
			}
		});
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String a = "";
				ta.append("You are heading towards West \n");
			}
		});
	}
}