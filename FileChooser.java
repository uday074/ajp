import javax.swing.*;
import javax.swing.filechooser.*;
public class FileChooser
{
	public static void main(String args[])
	{
		JFrame fr = new JFrame("File Chooser");
		fr.setLayout(null);
		fr.setSize(500,500);
		fr.setDefaultCloseOperation(3);
		fr.setVisible(true);
		JFileChooser fc = new JFileChooser();
		fc.showSaveDialog(fr);
	}
}