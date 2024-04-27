import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class scrollpane extends JFrame
{
	scrollpane()
	{
		super("JTable");
		String colname[]={"num","stuudent name","marks"};
		String rowdata[][]={
							{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},
							{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},
							{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},
							{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},
							{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},
							{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},
							{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},
							{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},
							{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},
							{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"},{"1","uday","35"},
							{"2","samudrala","36"},
							{"3","mahendar","37"}
							
						};
		JTable table=new JTable(rowdata,colname);
		
		JScrollPane jsp=new JScrollPane(table);
		
		add(jsp);
		
		setVisible(true);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new scrollpane();
	}
}