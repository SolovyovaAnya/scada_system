import java.awt.PopupMenu;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class Screen3 extends JInternalFrame{
	
	private JInternalFrame compFrame;
	private PopupMenu menu;
	
	public Screen3(String name, JDesktopPane dtp) {
		
		compFrame = new JInternalFrame(name, true, true, true, true);
		JLabel composer = new JLabel("лалала");
		compFrame.setContentPane(composer);
		compFrame.setSize(295, 420);
		compFrame.setLocation(1065, 5);
		compFrame.setVisible(true);
		menu = new Menu(compFrame);
		
		
		dtp.add(compFrame);
	
	}

}
