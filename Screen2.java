import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Screen2 {
	JInternalFrame mboxFrame;
	Menu menu;
	public Screen2(String name, JDesktopPane dtp) {
		final DBManager dbm = new DBManager("127.0.0.1", 5432, "scada",
				"postgres", "postgres");

		mboxFrame = new JInternalFrame(name, true, true, true, true);
		JLabel reader = new JLabel("тратратра");
		String[] columnNames = { "№", "First Name", "Last Name" };
		String[][] data = new String[50][3];
		try {
			ResultSet res = dbm.connection.createStatement().executeQuery(
					"SELECT * from table1;");

			for (int i = 0; i < 50; i++) {
				if (res.next()) {
					for (int j = 0; j < 3; j++) {
						data[i][j] = res.getString(j + 1);
					}
				}
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		JTable table = new JTable(data, columnNames) {
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}

		};

		table.setFillsViewportHeight(true);
		table.setAutoCreateRowSorter(true);
		JScrollPane scrollPane = new JScrollPane(table);

		JComponent component = new JComponent() {
		};
		component.setLayout(new BorderLayout());
		component.add(table.getTableHeader(), BorderLayout.PAGE_START);
		component.add(scrollPane, BorderLayout.CENTER);

		mboxFrame.setContentPane(component);
		mboxFrame.setSize(400, 420);
		mboxFrame.setLocation(5, 5);
		mboxFrame.setVisible(true);
		menu = new Menu(mboxFrame);
		dtp.add(mboxFrame);
	}

}
