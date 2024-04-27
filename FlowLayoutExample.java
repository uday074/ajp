import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FlowLayoutExample
{
	JFrame fr;
	public static void main(String args[])
	{
		new FlowLayoutExample();
	}
	public FlowLayoutExample()
	{
		fr = new JFrame("Flow Layout");
		fr.setLayout(new FlowLayout(FlowLayout.LEFT,40,60));
		fr.setDefaultCloseOperation(3);
		fr.setExtendedState(fr.MAXIMIZED_BOTH);
		JLabel l1 = new JLabel("Enter a number");
		JLabel l2 = new JLabel("Enter a number");
		JTextField t1= new JTextField(15);
		JTextField t2= new JTextField(15);
		JButton j1 = new JButton("Add");
		JButton j2 = new JButton("Subtract");
		JButton j3 = new JButton("Multiply");
		JButton j4 = new JButton("Divide");
		fr.add(l1);
		fr.add(t1);
		fr.add(l2);
		fr.add(t2);
		fr.add(j1);
		fr.add(j2);
		fr.add(j3);
		fr.add(j4);
		
		
		fr.setVisible(true);
	}
	

}