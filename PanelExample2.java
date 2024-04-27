import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PanelExample2
{
	public static void main(String args[])
	{
		new PanelExample2();
	}
	PanelExample2()
	{
		JFrame fr = new JFrame("PANEL");
		fr.setExtendedState(fr.MAXIMIZED_BOTH);
		fr.setLayout(new GridLayout(4,1));
	    fr.setDefaultCloseOperation(3);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JButton b1 = new JButton("Button1");
		JButton b2 = new JButton("Button2");
		JButton b3 = new JButton("Button3");
		JButton b4 = new JButton("Button1");
		JButton b5 = new JButton("Button2");
		JButton b6 = new JButton("Button1");
		JButton b7 = new JButton("Button1");
		JButton b8 = new JButton("Button2");
		JButton b9 = new JButton("Button3");
		JButton b10 = new JButton("Button4");
		p1.setBackground(Color.red);
		p2.setBackground(Color.blue);
		p3.setBackground(Color.green);
		p4.setBackground(Color.black);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p2.add(b4);
		p2.add(b5);
		p3.add(b6);
		p4.add(b7);
		p4.add(b8);
		p4.add(b9);
		p4.add(b10);		
		fr.add(p1);
		fr.add(p2);
		fr.add(p3);
		fr.add(p4);
		fr.setVisible(true);
		
	}
}