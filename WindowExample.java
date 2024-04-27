import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowExample implements WindowListener
{
	JFrame fr;
	JTextArea ta;
	public static void main(String args[])
	{
		new WindowExample();
	}
	WindowExample ()
	{
		fr = new JFrame("Window Listener Examlpe");
		fr.setLayout(new BorderLayout());
		fr.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fr.setDefaultCloseOperation(3);
		ta = new JTextArea();
		fr.add(ta,BorderLayout.CENTER);
		fr.addWindowListener(this);  
		fr.setVisible(true);
	}
	public void windowActivated (WindowEvent a) 
	{    
		ta.append("Window is Activated\n");  
	}    
  

	public void windowClosed (WindowEvent a) 
	{   	
		System.out.println("Window is Closed\n");  
		fr.dispose();		
	}    
  
 
	public void windowClosing (WindowEvent a) 
	{    
		System.out.println("Window is Closing\n");  
		fr.dispose();
	}    
  

	public void windowDeactivated (WindowEvent a) 
	{    
		ta.append("Window is Deactivated\n");     
	}    
  

	public void windowDeiconified (WindowEvent a) 
	{    
		ta.append("Window is Deiconified\n");    
	}    
  
  
	public void windowIconified(WindowEvent a) 
	{    
		ta.append("Window is Iconified\n");      
	}    
	public void windowOpened(WindowEvent a) 
	{    
		ta.append("Window is Opened\n");     
	}    
	
}