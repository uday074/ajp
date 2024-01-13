import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class EvenOdd implements ActionListener
{   JLabel jl1;
    JLabel jl2;
	JTextField jtf1;
	JTextField jtf2;
	
	public static void main(String[] args)
	{
		new EvenOdd();
	}
	public EvenOdd()
	{
		JFrame jf=new JFrame("EvenOdd");
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(3);
		
		jf.setVisible(true);
		jl1=new JLabel("Enter a number");
		jf.add(jl1);
		jtf1=new JTextField(20);
		JButton jb=new JButton("Check Even/Odd");
		jl2=new JLabel("Result ");
		jtf2=new JTextField(20);
		jf.add(jtf1);
		jf.add(jb);
		jf.add(jl2);
		jf.add(jtf2);
		jb.addActionListener(this);
		jf.setSize(1600,960);
	}
	public void actionPerformed(ActionEvent e)
	{
		String txt=jtf1.getText();
		txt=txt.trim();
		try{
		int a=Integer.parseInt(txt);
		if(a%2==0)
			jtf2.setText("Even");
		else
			jtf2.setText("ODD");
		}
		catch(Exception ee)
		{
			JOptionPane.showMessageDialog(null,"Enter a valid number");
		}
	}
}