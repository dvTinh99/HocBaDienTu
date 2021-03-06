package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Dao.GiaoVienDao;
import Model.HocSinh;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class View_LopHoc extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txt_ma_hs;
	private JTextField txt_ho;
	private JTextField txt_ten;
	private JTextField txt_gioi_tinh;
	private JTextField txt_ngay_sinh;
	private JTextField txt_dia_chi;
	private JTextField txt_sdt;
	private JTextField txt_cmnd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_LopHoc frame = new View_LopHoc();
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
	public View_LopHoc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Danh Sach Hoc Sinh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 790, 242);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 23, 770, 205);
		
		
		String header[] = {"Ma Hoc Sinh","Ho","Ten","Gioi Tinh","Ngay Sinh","Dia Chi","SDT","CMND"};
		DefaultTableModel table_model=new DefaultTableModel(header,0);
		
		
		table = new JTable(table_model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowSelected = table.getSelectedRow();
//				int coloumnSelected = table.getSelectedColumn();
				txt_ma_hs.setText(String.valueOf(table.getValueAt(rowSelected, 0)));
				txt_ho.setText(String.valueOf(table.getValueAt(rowSelected, 1)));
				txt_ten.setText(String.valueOf(table.getValueAt(rowSelected, 2)));
				txt_gioi_tinh.setText(String.valueOf(table.getValueAt(rowSelected, 3)));
				txt_ngay_sinh.setText(String.valueOf(table.getValueAt(rowSelected, 4)));
				txt_dia_chi.setText(String.valueOf(table.getValueAt(rowSelected, 5)));
				txt_sdt.setText(String.valueOf(table.getValueAt(rowSelected, 6)));
				txt_cmnd.setText(String.valueOf(table.getValueAt(rowSelected, 7)));
			}
		});
		scrollPane.setViewportView(table);
		showHocSinh(table);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Chi Tiet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 253, 634, 202);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ma HS");
		lblNewLabel.setBounds(23, 32, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblHo = new JLabel("Ho");
		lblHo.setBounds(23, 72, 46, 14);
		panel_1.add(lblHo);
		
		JLabel lblTen = new JLabel("Ten");
		lblTen.setBounds(23, 111, 46, 14);
		panel_1.add(lblTen);
		
		JLabel lblGioiTinh = new JLabel("Gioi Tinh");
		lblGioiTinh.setBounds(23, 157, 71, 14);
		panel_1.add(lblGioiTinh);
		
		JLabel lblNgaySinh = new JLabel("Ngay Sinh");
		lblNgaySinh.setBounds(266, 32, 56, 14);
		panel_1.add(lblNgaySinh);
		
		JLabel lblDiaChi = new JLabel("Dia Chi");
		lblDiaChi.setBounds(266, 72, 56, 14);
		panel_1.add(lblDiaChi);
		
		JLabel lblSdt = new JLabel("SDT");
		lblSdt.setBounds(266, 111, 56, 14);
		panel_1.add(lblSdt);
		
		JLabel lblCmnd = new JLabel("CMND");
		lblCmnd.setBounds(266, 157, 56, 14);
		panel_1.add(lblCmnd);
		
		txt_ma_hs = new JTextField();
		txt_ma_hs.setBounds(67, 29, 161, 20);
		panel_1.add(txt_ma_hs);
		txt_ma_hs.setColumns(10);
		
		txt_ho = new JTextField();
		txt_ho.setColumns(10);
		txt_ho.setBounds(67, 69, 161, 20);
		panel_1.add(txt_ho);
		
		txt_ten = new JTextField();
		txt_ten.setColumns(10);
		txt_ten.setBounds(67, 108, 161, 20);
		panel_1.add(txt_ten);
		
		txt_gioi_tinh = new JTextField();
		txt_gioi_tinh.setColumns(10);
		txt_gioi_tinh.setBounds(94, 154, 134, 20);
		panel_1.add(txt_gioi_tinh);
		
		txt_ngay_sinh = new JTextField();
		txt_ngay_sinh.setColumns(10);
		txt_ngay_sinh.setBounds(332, 29, 161, 20);
		panel_1.add(txt_ngay_sinh);
		
		txt_dia_chi = new JTextField();
		txt_dia_chi.setColumns(10);
		txt_dia_chi.setBounds(332, 69, 161, 20);
		panel_1.add(txt_dia_chi);
		
		txt_sdt = new JTextField();
		txt_sdt.setColumns(10);
		txt_sdt.setBounds(332, 108, 161, 20);
		panel_1.add(txt_sdt);
		
		txt_cmnd = new JTextField();
		txt_cmnd.setColumns(10);
		txt_cmnd.setBounds(332, 154, 161, 20);
		panel_1.add(txt_cmnd);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Tuy Chon", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(654, 255, 133, 200);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Them");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ma_hs = txt_ma_hs.getText();
				String ho_hs = txt_ho.getText();
				String ten_hs = txt_ten.getText();
				String gioiTinh = txt_gioi_tinh.getText();
				String ngaySinh = txt_ngay_sinh.getText();
				String diaChi = txt_dia_chi.getText();
				String sdt = txt_sdt.getText();
				String cmnd = txt_cmnd.getText();
				GiaoVienDao gv = new GiaoVienDao();
				JOptionPane.showMessageDialog(null, gv.insertHS(ma_hs, ho_hs, ten_hs, gioiTinh, ngaySinh, diaChi, sdt, cmnd));
				showHocSinh(table);
				
			}
		});
		btnNewButton.setBounds(10, 70, 113, 23);
		panel_2.add(btnNewButton);
		
		JButton btnSua = new JButton("Sua");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ma_hs = txt_ma_hs.getText();
				String ho_hs = txt_ho.getText();
				String ten_hs = txt_ten.getText();
				String gioiTinh = txt_gioi_tinh.getText();
				String ngaySinh = txt_ngay_sinh.getText();
				String diaChi = txt_dia_chi.getText();
				String sdt = txt_sdt.getText();
				String cmnd = txt_cmnd.getText();
				GiaoVienDao gv = new GiaoVienDao();
				JOptionPane.showMessageDialog(null, gv.updateHS(ma_hs, ho_hs, ten_hs, gioiTinh, ngaySinh, diaChi, sdt, cmnd));
				showHocSinh(table);
			}
		});
		btnSua.setBounds(10, 104, 113, 23);
		panel_2.add(btnSua);
		
		JButton btnXoa = new JButton("Xoa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowSelect = table.getSelectedRow();
				int maHS  = Integer.parseInt((String)table.getValueAt(rowSelect, 0));
				GiaoVienDao gvDao = new GiaoVienDao();
				JOptionPane.showMessageDialog(null, gvDao.deleteHS(maHS));
				showHocSinh(table);
			}
		});
		btnXoa.setBounds(10, 138, 113, 23);
		panel_2.add(btnXoa);
		
		JButton btnLamMoi = new JButton("Lam Moi");
		btnLamMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showHocSinh(table);
			}
		});
		btnLamMoi.setBounds(10, 33, 113, 23);
		panel_2.add(btnLamMoi);

	}
	public static void showHocSinh(JTable table) {
		DefaultTableModel df = (DefaultTableModel) table.getModel();
		df.setRowCount(0);
		List<HocSinh> list = new ArrayList<HocSinh>();
		list = GiaoVienDao.getHocSinh();
		for(HocSinh hs : list) {
			String[] data = {
					String.valueOf(hs.getMa_hs()),
					hs.getHo(),
					hs.getTen(),
					hs.getGioiTinh(),
					hs.getNgaySinh(),
					hs.getDiaChi(),
					hs.getSdt(),
					hs.getCMND()
					
			};
			df.addRow(data);
		}
		table.setModel(df);
	}
}
