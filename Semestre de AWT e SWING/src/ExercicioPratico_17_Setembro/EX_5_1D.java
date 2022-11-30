package ExercicioPratico_17_Setembro;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;
import java.awt.event.*;

public class EX_5_1D JFrame implements ActionListener {
	
public EX_5_1D(){
	
}
	public boolean handleEvent(Event e)
	{
	   if (e.id == Event.WINDOW_DESTROY) 
	      System.exit(0);           
	      return (super.handleEvent(e));
	}
	public void actionPerformed(ActionEvent e)
	{
	}
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
		}	
		public static void main(String arg[])
		{
			new EX_5_1C().setVisible(true);
		}

}
