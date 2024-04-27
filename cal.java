import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class cal extends JFrame// implements ActionListener
{
	public JButton jb1=new JButton("open ");
	
	/*public JLabel j1=new JLabel("num:");
	public JLabel j2=new JLabel("num:");
	public JTextField jf1=new JTextField(14);
	public JTextField jf2=new JTextField(14);
	public JTextField jf3=new JTextField(14);*/
	public cal()
	{
		super("add");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		//setLayout(new GridLayout(4,3));
		JPanel bp=new JPanel(new FlowLayout());
		for(int i=0;i<60;i++)
		{
			bp.add(new JButton("Button : "+(i+1)));
		}
		add(bp);
		/*add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(j1);
		add(jf1);
		add(j2);
		add(jf2);
		add(jf3);
		*/
		//jb1.addActionListener(this);
		//jb2.addActionListener(this);
		//jb3.addActionListener(this);
		//jb4.addActionListener(this);
	}
	/*public void actionPerformed(ActionEvent ae)
	{
		JButton but=(JButton)ae.getSource();
		if(but==jb1)
		{
			new comboB();
		}
	}*/
	public static void main(String args[])
	{
		new cal();
	}
}

