import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainFrame extends JFrame implements ActionListener 
{
	static JButton jb1;
	static JButton jb2;
	static JButton jb3;
    public MainFrame() 
	{
        setTitle("MainFrame");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
		jb1=new JButton("comboB");
		jb2=new JButton("Radiobutton");
		jb3=new JButton("CheckBox1");
        add(jb1);
        add(jb2);
		add(jb3);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) 
	{
        JButton but = (JButton) e.getSource();
		if(but==jb1)
		{
			new comboB();
		}
		if(but==jb2)
		{
			new Radiobutton();
		}
		if(but==jb3)
		{
			new CheckBox1();
		}
    }
    public static void main(String[] args) 
	{
        new MainFrame();
    }
}