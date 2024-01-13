import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyListener.*;
public class Add implements ActionListener,KeyListener
{   JLabel jl1;
    JLabel jl2;
	JLabel jl3;
	JTextField jtf1;
	JTextField jtf2;
	JTextField jtf3;
	public static void main(String[] args)
	{
		new Add();
	}
	public Add()
	{
		JFrame jf=new JFrame("Arithmetic");
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(3);
		
		jf.setVisible(true);
		jl1=new JLabel("Enter number-1");
		jf.add(jl1);
		jl2=new JLabel("Enter number-2");
		jl1.setForeground(Color.GREEN);
		jl2.setForeground(Color.GREEN);
		jtf1=new JTextField(20);
		JButton jb=new JButton("Add");
		jl3=new JLabel("Result ");
		jtf2=new JTextField(20);
		jtf3=new JTextField(20);
		jb.setFont(new Font("Times New Roman",Font.BOLD,18));
		jb.setForeground(Color.white);
		jb.setBackground(Color.black);
		jf.add(jtf1);
		jf.add(jl2);
		jf.add(jtf2);
		jf.add(jb);
		jf.add(jl3);
		jf.add(jtf3);
		jb.addActionListener(this);
		jtf3.addKeyListener(this);
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	public void actionPerformed(ActionEvent e)
	{
		String g=jtf1.getText();
		g=g.trim();
		String h=jtf2.getText();
		h=h.trim();
		try{
		int a=Integer.parseInt(g);
		int b=Integer.parseInt(h);
		int c=a+b;
		jtf3.setText(Integer.toString(c));
		
		}
		catch(Exception ee)
		{   jtf3.setText("");
			JOptionPane.showMessageDialog(null,"Enter a valid number");
			
		}
	}
	public void keyTyped(KeyEvent ft)
	{
		JOptionPane.showMessageDialog(null,"You cannot manupulate");
	}
	public void keyReleased(KeyEvent gt)
	{
	}
	public void keyPressed(KeyEvent jk)
	{
	}
}