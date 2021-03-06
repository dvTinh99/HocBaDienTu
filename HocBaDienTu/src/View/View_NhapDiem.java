package View;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Dao.DAO_Diem;
import Dao.GiaoVienDao;
import Model.Diem;
import Model.HocSinh;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class View_NhapDiem extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField TenHS;
	private JTextField ktMieng;
	private JTextField kt15p;
	private JTextField kt1tiet;
	private JTextField ktGiuaKi;
	private JTextField ktCuoiKi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_NhapDiem frame = new View_NhapDiem();
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
	public View_NhapDiem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Danh Sach Diem", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 802, 386);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 782, 354);
		panel.add(scrollPane);
		
		String header[] = {"id HS","Ten Hoc Sinh","Mieng","15p","45p","giua ki","cuoi ki"};
		DefaultTableModel table_model=new DefaultTableModel(header,0);
		
		table = new JTable(table_model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowSelected = table.getSelectedRow();
				TenHS.setText(String.valueOf(table.getValueAt(rowSelected, 1)));
				ktMieng.setText(String.valueOf(table.getValueAt(rowSelected, 2)));
				kt15p.setText(String.valueOf(table.getValueAt(rowSelected, 3)));
				kt1tiet.setText(String.valueOf(table.getValueAt(rowSelected, 4)));
				ktGiuaKi.setText(String.valueOf(table.getValueAt(rowSelected, 5)));
				ktCuoiKi.setText(String.valueOf(table.getValueAt(rowSelected, 6)));
			}
		});
		scrollPane.setViewportView(table);
		showHocSinh(table);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Nhap Diem", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 403, 577, 147);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Ten = new JLabel("Ten Hoc Sinh");
		Ten.setBounds(24, 28, 75, 14);
		panel_1.add(Ten);
		
		TenHS = new JTextField();
		TenHS.setBounds(132, 25, 117, 20);
		panel_1.add(TenHS);
		TenHS.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Diem Kiem Tra Mieng");
		lblNewLabel.setBounds(299, 28, 168, 14);
		panel_1.add(lblNewLabel);
		
		ktMieng = new JTextField();
		ktMieng.setBounds(477, 25, 86, 20);
		panel_1.add(ktMieng);
		ktMieng.setColumns(10);
		
		JLabel lblDiemKiemTra = new JLabel("Diem Kiem Tra 15p");
		lblDiemKiemTra.setBounds(24, 67, 162, 14);
		panel_1.add(lblDiemKiemTra);
		
		kt15p = new JTextField();
		kt15p.setColumns(10);
		kt15p.setBounds(169, 64, 86, 20);
		panel_1.add(kt15p);
		
		kt1tiet = new JTextField();
		kt1tiet.setColumns(10);
		kt1tiet.setBounds(477, 64, 86, 20);
		panel_1.add(kt1tiet);
		
		ktGiuaKi = new JTextField();
		ktGiuaKi.setColumns(10);
		ktGiuaKi.setBounds(169, 107, 86, 20);
		panel_1.add(ktGiuaKi);
		
		ktCuoiKi = new JTextField();
		ktCuoiKi.setColumns(10);
		ktCuoiKi.setBounds(477, 107, 86, 20);
		panel_1.add(ktCuoiKi);
		
		JLabel lblDiemKiemTra_2 = new JLabel("Diem Kiem Tra 45p");
		lblDiemKiemTra_2.setBounds(299, 82, 168, 14);
		panel_1.add(lblDiemKiemTra_2);
		
		JLabel lblDiemKiemTra_3 = new JLabel("Diem Kiem Tra Giua Ki");
		lblDiemKiemTra_3.setBounds(24, 110, 162, 14);
		panel_1.add(lblDiemKiemTra_3);
		
		JLabel lblDiemKiemTra_4 = new JLabel("Diem Kiem Tra Cuoi Ki");
		lblDiemKiemTra_4.setBounds(299, 119, 168, 14);
		panel_1.add(lblDiemKiemTra_4);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Thao Tac", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(597, 404, 215, 146);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		String[] listServer = { "SERVER 1", "SERVER 2", "SERVER 3"};
		
		JComboBox comboBox = new JComboBox(listServer);
		comboBox.setBounds(825, 38, 134, 22);
		contentPane.add(comboBox);
		
		JButton btn_luu = new JButton("Luu");
		btn_luu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nameServer = (String)comboBox.getSelectedItem();
				sysout

//				DAO_Diem dd = new DAO_Diem();
//				int lastIndex = dd.getLastRow();
//				int rowSelected = table.getSelectedRow();
//				int ma_diem = lastIndex + 1;
//				int id_hs = Integer.parseInt((String) table.getValueAt(rowSelected, 0));
//				int id_mon = 51;
//				int Diem = Integer.parseInt(ktMieng.getText());
//				int Diem15p = Integer.parseInt(kt15p.getText());
//				int Diem45p = Integer.parseInt(kt1tiet.getText());
//				int DiemGiuaKi = Integer.parseInt(ktGiuaKi.getText());
//				int DiemCuoiKi = Integer.parseInt(ktCuoiKi.getText());
//				
//				JOptionPane.showMessageDialog(null, dd.insertDiem(ma_diem, id_hs, id_mon, Diem, Diem15p, Diem45p, DiemGiuaKi, DiemCuoiKi));
//				showHocSinh(table);
			}
		});
		btn_luu.setBounds(10, 32, 195, 103);
		panel_2.add(btn_luu);
		
		
	}
	public static void showHocSinh(JTable table) {
		DefaultTableModel df = (DefaultTableModel) table.getModel();
		df.setRowCount(0);
		List<Diem> list = new ArrayList<Diem>();
		list = DAO_Diem.getDiemByIDMon(51);
		for(Diem diem : list) {
			String[] data = {
					String.valueOf(diem.getMa_hs()),
					diem.getHo()+" "+diem.getTen(),
					diem.getDiem(),
					diem.getDiem15p(),
					diem.getDiem45p(),
					diem.getDiemGiuaKi(),
					diem.getDiemCuoiKi()
					
			};
			df.addRow(data);
		}
		table.setModel(df);
	}
}
