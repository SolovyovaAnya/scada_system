import java.awt.PopupMenu;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class Screen5 extends JInternalFrame{
	
	private JInternalFrame dialogFrame;
	private PopupMenu menu;
	
	public Screen5(String name, JDesktopPane dtp) {

		JInternalFrame dialogFrame = new JInternalFrame("Screen 5", true, true,
				true, true);
		JLabel content = new JLabel("Î‡Î‡dfngsdfgs,");
		dialogFrame.setContentPane(content);
		dialogFrame.setSize(650, 420);
		dialogFrame.setLocation(410, 5);
		dialogFrame.setVisible(true);
		menu = new Menu(dialogFrame);
		dtp.add(dialogFrame);

	}
}


