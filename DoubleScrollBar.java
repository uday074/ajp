import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class DoubleScrollBar extends JPanel {

  JLabel label;
  JScrollBar hbar,vbar;
  Font myFont=new Font("Book Antiqua",Font.BOLD , 30);
    

  public DoubleScrollBar() {
    
	setLayout(new BorderLayout());
	
    label = new JLabel();
	label.setFont(myFont);
    

     hbar = new JScrollBar(JScrollBar.HORIZONTAL, 30, 0, 0, 300);
     vbar = new JScrollBar(JScrollBar.VERTICAL, 30, 0, 0, 300);


    hbar.addAdjustmentListener(new MyAdjustmentListener());
    vbar.addAdjustmentListener(new MyAdjustmentListener());

    add(hbar, BorderLayout.SOUTH);
    add(vbar, BorderLayout.EAST);
    add(label, BorderLayout.CENTER);
  }

  class MyAdjustmentListener implements AdjustmentListener {
    public void adjustmentValueChanged(AdjustmentEvent e) {
		String startingData="<html><body>";
		
		String endingData="</body></html>";
		
		String htmldata=startingData+
					"<p>Ver Bar:"+vbar.getValue()+"</p>"
					+"<p>Hor Bar:"+ hbar.getValue()+"</p>"
					+endingData;
		
    
	
	  label.setText(htmldata);
    }
  }

  public static void main(String s[]) {
    JFrame frame = new JFrame("Scroll Bar Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new DoubleScrollBar());
    frame.setSize(200, 200);
    frame.setVisible(true);
  }
}