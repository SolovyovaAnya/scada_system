import java.awt.BorderLayout;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.Action;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.synth.ColorType;
import javax.swing.table.TableRowSorter;

public class JIFrameDemo {

	private static final Color Color = null;

	@SuppressWarnings({ "static-access", "deprecation" })
	public static void main(String[] a) {
		final JFrame jf = new JFrame("SCADA");

		final DBManager dbm = new DBManager("127.0.0.1", 5432, "scada",
				"postgres", "postgres");

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenSize.width -= 42;
		screenSize.height -= 42;
		jf.setSize(screenSize);
		jf.setLocation(20, 20);

		// меню в главном окошке
		JMenuBar mb = new JMenuBar();
		jf.setJMenuBar(mb);
		JMenu fm = new JMenu("Menu");

		// чекбоксы для меню и пункты меню
		JCheckBoxMenuItem mi2;
		mb.add(fm);
		mi2 = new JCheckBoxMenuItem();
		mi2.setLabel("Brighttness");
		mi2.setState(true);
		fm.add(mi2);
		JCheckBoxMenuItem mi3;
		mb.add(fm);
		mi3 = new JCheckBoxMenuItem();
		mi3.setLabel("Reference");
		mi3.setState(true);
		fm.add(mi3);
		JCheckBoxMenuItem mi4;
		mb.add(fm);
		mi4 = new JCheckBoxMenuItem();
		mi4.setLabel("Magnifier");
		mi4.setState(true);
		fm.add(mi4);
		JCheckBoxMenuItem mi5;
		mb.add(fm);
		mi5 = new JCheckBoxMenuItem();
		mi5.setLabel("Icons");
		mi5.setState(true);
		fm.add(mi5);
		JMenuItem mi6;
		fm.add(mi6 = new JMenuItem("Screen 2"));
		JMenuItem mi7;
		fm.add(mi7 = new JMenuItem("Screen 3"));
		JMenuItem mi8;
		fm.add(mi8 = new JMenuItem("Screen 4"));
		JMenuItem mi9;
		fm.add(mi9 = new JMenuItem("Screen 5"));
		JMenuItem mi10;
		fm.add(mi10 = new JMenuItem("Exit"));

		final JDesktopPane dtp = new JDesktopPane();
		jf.setContentPane(dtp);
		
		Screen2 screen2 = new Screen2("Screen 2",dtp);
		Screen3 screen3 = new Screen3("Screen 3",dtp);
		Screen4 screen4 = new Screen4("Screen 4",dtp);
		Screen5 screen5 = new Screen5("Screen 5",dtp);
		
		// выбор пунктов меню
		mi6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen2 screen2 = new Screen2("Screen 2",dtp);
			}
		});

		mi7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Screen3 screen3 = new Screen3("Screen 3",dtp);

			}
		});

		mi8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen4 screen4 = new Screen4("Screen 4",dtp);

			}
		});

		mi9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen5 screen5 = new Screen5("Screen 5",dtp);

			}
		});
		
		mi10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		dtp.setBackground(Color.DARK_GRAY);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				jf.setVisible(false);
				jf.dispose();
				System.exit(0);
			}
		});
	}

	/*private static void add(JScrollPane scrollPane) {
		// TODO Auto-generated method stub

	}*/
}
