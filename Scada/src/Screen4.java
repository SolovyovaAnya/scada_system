import java.awt.PopupMenu;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class Screen4 extends JInternalFrame{
	
	private JInternalFrame listFrame;
	private PopupMenu menu;
	
	public Screen4(String name, JDesktopPane dtp) {
		JInternalFrame listFrame = new JInternalFrame("Screen 4", true, true,
				true, true);
		JLabel list = new JLabel("блаблабла");
		listFrame.setContentPane(list);
		listFrame.setLocation(5, 430);
		listFrame.setSize(1355, 215);
		listFrame.setVisible(true);
		
		menu = new Menu(listFrame);
		dtp.add(listFrame);

	}
}
