import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MB extends JFrame implements ActionListener
{ 	static JLabel l1;
	static JLabel l2;
	static JLabel l3;
	static JTextField jtf1;
	static JTextField jtf2;
	static JTextField jtf3;
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	JButton jb5;
	public static void main(String[] ar)
	{
		 new MB();
	}
	MB()
	{
		super("Multiple Buttons Demo");
		l1=new JLabel("Enter n1");
		jtf1=new JTextField(10);
		l2=new JLabel("Enter n2");
		jtf2=new JTextField(10);
		l3=new JLabel("Result");
		jtf3=new JTextField(10);
		jb1=new JButton("Add");
		jb2=new JButton("Sub");
		jb3=new JButton("Mul");
		jb4=new JButton("Div");
		jb5=new JButton("Mod");
		add(l1);
		add(jtf1);
		add(l2);
		add(jtf2);
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		add(l3);
		add(jtf3);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		setDefaultCloseOperation(3);
		setLayout(new FlowLayout());
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int x=Integer.parseInt(jtf1.getText());
			int y=Integer.parseInt(jtf2.getText());
			int res=0;
			JButton jb=(JButton)ae.getSource();
			if(jb==jb1)
			{
				res=x+y;
			}
			else if(jb==jb2)
			{
				res=x-y;
			}
			else if(jb==jb3)
			{
			    res=x*y;
			}
			else if(jb==jb4)
			{
				try
				{
					res=x/y;
				}
				catch(ArithmeticException e)
				{
					JOptionPane.showMessageDialog(null,"second number should not be zero");
				}
			}
			else
			{
				try
				{
					res=x%y;
				}
				catch(ArithmeticException e)
				{
					JOptionPane.showMessageDialog(null,"second number should not be zero");
				}
			}
			jtf3.setEditable(false);
			jtf3.setText(" "+res);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Enter a Valid number");
		}
	}
}