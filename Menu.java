import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Menu extends PopupMenu {
	PopupMenu menu;
	protected int lastX, lastY, w, h;
	public Menu(JInternalFrame compFrame) {
		compFrame.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {

				if (e.getModifiers() == MouseEvent.BUTTON3_MASK) {

					System.out.println("click");
					JPopupMenu popupMenu = new JPopupMenu();
					JMenuItem item = new JMenuItem("Свойства");
					popupMenu.add(item);
					JMenuItem item2 = new JMenuItem("Настройки");
					popupMenu.setVisible(true);
					popupMenu.add(item2);
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
		
				}
			}
		});
	}
}
