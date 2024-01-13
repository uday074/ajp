import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.math.BigInteger;
class Tasks extends JFrame implements ActionListener
{ 	
	static JLabel jl1;
	static JLabel jl2;
	static JTextField jtf1;
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	JButton jb5;
	public static void main(String[] ar)
	{
		 new Tasks();
	}
	Tasks()
	{
		super("Multiple Buttons Demo");
		jl1=new JLabel("Enter a number");
		jtf1=new JTextField(10);
		jb1=new JButton("Prime");
		jb2=new JButton("Even/Odd");
		jb3=new JButton("Factorial");
		jb4=new JButton("Armstrong");
		add(jl1);
		add(jtf1);
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		jl2=new JLabel();
		add(jl2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
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
			JButton jb=(JButton)ae.getSource();
			if(jb==jb1)
			{
				if(isPrime(x))
					jl2.setText("Prime Number");
				else
					jl2.setText("Not a Prime Number");
			}
			else if(jb==jb2)
			{
				if(evenOdd(x))
					jl2.setText("Even Number");
				else
					jl2.setText("Odd Number");
			}
			else if(jb==jb3)
			{
			    BigInteger f=fact(x);
				jl2.setText("Factorial: "+f);
			}
			else
			{
			   if(isArm(x))
				   jl2.setText("ArmStrong Number");
			   else
				   jl2.setText("Not an Armstrong Number");
			}
			
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Enter a Valid number");
		}
	}
	public static boolean evenOdd(int n)
	{
		if(n%2==0)
			return true;
		else
			return false;
	}
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
			
		return true;
	}
	public static boolean isArm(int n)
	{
		int c=0;
		int sum=0;
		int temp=n;
		int t=n;
		int rev=0;
		while(n!=0)
		{
			n/=10;
			++c;
		}
		while(temp!=0)
		{
			rev=temp%10;
			sum+=Math.pow(rev,c);
			temp/=10;
		}
		return sum==t;
	}
	public static BigInteger fact(int n)
	{
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=n;i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}