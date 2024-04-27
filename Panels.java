import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Panels extends JFrame implements ActionListener
{
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JButton b1 = new JButton("BLACK");
    JButton b2 = new JButton("WHITE");
	JButton b3 = new JButton("GREEN");
    JButton b4 = new JButton("BLUE");
    JButton b5 = new JButton("CYAN");
    Panels()
    {
        setTitle("Panels");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
		b4.addActionListener(this);
        b5.addActionListener(this);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
		p1.add(b4);
        p1.add(b5);
		b1.setBounds(10,30,70,35);
		b2.setBounds(70,30,70,35);
		b3.setBounds(140,30,70,35);
		b4.setBounds(210,30,70,35);
		b5.setBounds(280,30,70,35);
		p2.setBounds(20,80,200,200);
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        setVisible(true);
		setSize(750,750);
    }
    public void actionPerformed(ActionEvent ae)
    {
        JButton b=(JButton)ae.getSource();
        if(b==b1)
        {
            p2.setBackground(Color.BLACK);
        }
        else if(b==b2)
        {
            p2.setBackground(Color.WHITE);
        }
		else if(b==b3)
        {
            p2.setBackground(Color.GREEN);
        }
		else if(b==b4)
        {
            p2.setBackground(Color.BLUE);
        }
        else if(b==b5)
        {
            p2.setBackground(Color.CYAN);
        }
    }
      public static void main(String[] args)
      {
          new Panels();
      }
    }