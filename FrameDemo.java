import javax.swing.*;
import java.awt.*;
class FrameDemo
{
	  public static void main(String[] args)
	  {
		  JFrame jf=new JFrame("DEMO");
		  jf.setVisible(true);
		  jf.setSize(600,600);
		  jf.setLayout(null);
		  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  JLabel jl=new JLabel("WELCOME TO ADVANCED JAVA PROGRAMMING");
		  jl.setForeground(Color.BLUE);
		  jl.setBounds(20,30,300,50);
		  jf.add(jl);
		  JLabel j2=new JLabel("HI FRIENDS");
		  j2.setForeground(Color.GREEN);
		  jf.add(j2);
		  j2.setBounds(20,80,300,50);
		  String a[]=new String[]{"b1","b2","b3","b4","b5"};
		  JButton[] jb=new JButton[5];
		  for(int i=0;i<5;i++)
		  {   jb[i]=new JButton(a[i]);
			  jb[i].setBounds(30+i*100,140,60,60);
			  jb[i].addActionListener(this);
			  jb[i].addActionPerformed(ActionEvent e)
			  {
				   l2.setText(a[i]);
			  }
		  }
		  for(int i=0;i<5;i++)
		  {
			  jf.add(jb[i]);
		  }
		  
	  }
}