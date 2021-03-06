package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Dao.DAO_LopHoc;
import Dao.DAO_TruongHoc;
import Dao.GiaoVienDao;
import Model.HocSinh;
import Model.LopHoc;
import Model.TruongHoc;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class View_TruongHoc extends JFrame {

	private JPanel contentPane;
	private JTable table_cap1;
	private JTable table_cap2;
	private JTable table_cap3;
	private JTable table_lop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_TruongHoc frame = new View_TruongHoc();
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
	public View_TruongHoc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Danh Sach Tr\u01B0\u01A1ng Cap 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 451, 132);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 23, 431, 98);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Danh Sach Truong Cap 2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 154, 451, 155);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 22, 431, 122);
		panel_1.add(scrollPane_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Danh Sach Truong Cap 3", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 311, 451, 140);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 22, 431, 98);
		panel_2.add(scrollPane_2);
		
		String header[] = {"Ma truong","Ten truong","Dia Chi"};
		DefaultTableModel table_model1=new DefaultTableModel(header,0);
		DefaultTableModel table_model2=new DefaultTableModel(header,0);
		DefaultTableModel table_model3=new DefaultTableModel(header,0);
		
		table_cap1 = new JTable(table_model1);
		table_cap1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowSelected = table_cap1.getSelectedRow();
				String valueSelect = (String) table_cap1.getValueAt(rowSelected, 0);
				showLopHoc(Integer.parseInt(valueSelect),table_lop);
				
			}
		});
		showTruongHoc(1,table_cap1);
		scrollPane.setViewportView(table_cap1);
		
		table_cap2 = new JTable(table_model2);
		table_cap2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowSelected = table_cap2.getSelectedRow();
				String valueSelect = (String) table_cap2.getValueAt(rowSelected, 0);
				showLopHoc(Integer.parseInt(valueSelect),table_lop);
			}
		});
		showTruongHoc(2,table_cap2);
		scrollPane_1.setViewportView(table_cap2);
		
		table_cap3 = new JTable(table_model3);
		table_cap3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowSelected = table_cap3.getSelectedRow();
				String valueSelect = (String) table_cap3.getValueAt(rowSelected, 0);
				showLopHoc(Integer.parseInt(valueSelect),table_lop);
			}
		});
		showTruongHoc(3,table_cap3);
		scrollPane_2.setViewportView(table_cap3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Danh Sach Lop", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(471, 11, 232, 440);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 21, 212, 408);
		panel_3.add(scrollPane_3);
		
		String header_lop[] = {"Ma Lop","Ten Lop","Khoi Lop","GVCN"};
		DefaultTableModel table_model_lop=new DefaultTableModel(header_lop,0);
		
		table_lop = new JTable(table_model_lop);
		scrollPane_3.setViewportView(table_lop);
		
		
		
		
		
	}
	public static void showTruongHoc(int Ma_cap,JTable table) {
		DefaultTableModel df = (DefaultTableModel) table.getModel();
		df.setRowCount(0);
		List<TruongHoc> list = new ArrayList<TruongHoc>();
		list = DAO_TruongHoc.getTruongHoc(Ma_cap);
		for(TruongHoc th : list) {
			String[] data = {
					String.valueOf(th.getMa_school()),
					th.getTen_truong(),
					th.getDia_chi()
					
			};
			df.addRow(data);
		}
		table.setModel(df);
	}
	public static void showLopHoc(int Ma_school,JTable table) {
		DefaultTableModel df = (DefaultTableModel) table.getModel();
		df.setRowCount(0);
		List<LopHoc> list = new ArrayList<LopHoc>();
		list = DAO_LopHoc.getLopHoc(Ma_school);
		for(LopHoc lh : list) {
			String[] data = {
					String.valueOf(lh.getMa_class()),
					lh.getTen_lop(),
					String.valueOf(lh.getMa_KH()),
					lh.getGVCN()
					
			};
			df.addRow(data);
		}
		table.setModel(df);
	}
}
