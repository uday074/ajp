import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Border extends JFrame
{   JButton jb1=new JButton("North");
	JButton jb2=new JButton("East");
	JButton jb3=new JButton("South");
	JButton jb4=new JButton("West");
	JTextArea jta=new JTextArea();
	public static void main(String[] a)
	{
	  new Border();
	}
	Border()
	{
		super("Border Layout");
		setDefaultCloseOperation(3);
		add(jb1,BorderLayout.NORTH);
		add(jb2,BorderLayout.EAST);
		add(jb3,BorderLayout.SOUTH);
		add(jb4,BorderLayout.WEST);
		add(jta);
		jb1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{	
				jta.append("You are heading towards north"+'\n');
			}
		});
		jb2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{	
				jta.append("You are heading towards east"+'\n');
			}
		});
		jb3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{	
				jta.append("You are heading towards south"+'\n');
			}
		});
		jb4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{	
				jta.append("You are heading towards west"+'\n');
			}
		});
		setVisible(true);
	}
}