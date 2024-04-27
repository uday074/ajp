import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBox1 
{

    public static void main(String[] args) 
	{
        JFrame frame = new JFrame("JCheckBox Test");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox ac = new JCheckBox("C");
        JCheckBox j1 = new JCheckBox("java");
        JCheckBox j2 = new JCheckBox("python");
        JCheckBox j3 = new JCheckBox("c++");
		ac.setSelected(true);


        JLabel output = new JLabel("You have selected: ");

        frame.add(new JLabel("Languages Known"));
        frame.add(ac);
        frame.add(j1);
        frame.add(j2);
        frame.add(j3);
        frame.add(output);
       
        ItemListener itemListener = new ItemListener() 
		{
            public void itemStateChanged(ItemEvent itemEvent) 
			{
                StringBuilder selectedLanguages = new StringBuilder("You have selected: ");
                if(ac.isSelected()) 
					selectedLanguages.append("C, ");
                if (j1.isSelected()) 
					selectedLanguages.append("java, ");
                if (j2.isSelected()) 
					selectedLanguages.append("python, ");
                if (j3.isSelected()) 
					selectedLanguages.append("c++, ");

  
                output.setText(selectedLanguages.toString());
            }
        };

        ac.addItemListener(itemListener);
        j1.addItemListener(itemListener);
        j2.addItemListener(itemListener);
        j3.addItemListener(itemListener);

        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}