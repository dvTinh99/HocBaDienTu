package View;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Dao.GiaoVienDao;
import Model.MonHoc;

public class View_MonHoc extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_MonHoc frame = new View_MonHoc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View_MonHoc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Danh Sach Mon Hoc", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 492, 393);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 472, 361);
		
		
		
		String header[] = {"Ma Mon","Ten Mon","Ma Cap"};
		DefaultTableModel table_model=new DefaultTableModel(header,0);
		
		table = new JTable(table_model);
		scrollPane.setViewportView(table);
		showMonHoc(table);
		panel.add(scrollPane);
		
		
	}
public static void showMonHoc(JTable table) {
	DefaultTableModel df = (DefaultTableModel) table.getModel();
	List<MonHoc> list = new ArrayList<MonHoc>();
	list = GiaoVienDao.getMonHoc();
	for(Model.MonHoc mh : list) {
		String[] data = {
				String.valueOf(mh.getMa_mon()),
				mh.getTen_mon(),
				String.valueOf(mh.getMa_cap())
		};
		df.addRow(data);
	}
	table.setModel(df);
}
}
