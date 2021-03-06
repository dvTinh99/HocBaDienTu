package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Dao.DAO_Diem;
import Dao.DAO_KhoiHoc;
import Dao.GiaoVienDao;
import Model.Diem;
import Model.KhoiHoc;
import Model.MonHoc;

public class View_HocBa extends JFrame {

	private JPanel contentPane;
	private JTable table_diem;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox Lop;
	private int Ma_cap ;
	private int Ma_khoi = 3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_HocBa frame = new View_HocBa();
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
	public View_HocBa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Diem", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 391, 482);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 371, 450);
		panel.add(scrollPane);
		
		String header[] = {"Ten Mon","Diem"};
		DefaultTableModel table_model=new DefaultTableModel(header,0);
		table_diem = new JTable(table_model);
		scrollPane.setViewportView(table_diem);
		
		Lop = new JComboBox();
		Lop.setBounds(486, 54, 113, 22);
		contentPane.add(Lop);
		
		
		String[] capList = { "Cap 1", "Cap 2", "Cap 3"};
		JComboBox Cap = new JComboBox(capList);
		Cap.addItemListener(new ItemChangeListener());
		Cap.setBounds(486, 21, 113, 22);
		contentPane.add(Cap);
		
		
		
		String[] kiHoc = { "Ki 1", "Ki 2"};
		JComboBox HocKi = new JComboBox(kiHoc);
		HocKi.setSelectedIndex(1);
		HocKi.setBounds(486, 89, 113, 22);
		contentPane.add(HocKi);
		
		JLabel lblNewLabel = new JLabel("Nam Hoc");
		lblNewLabel.setBounds(411, 178, 65, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHocLuc = new JLabel("Hoc Luc");
		lblHocLuc.setBounds(411, 210, 65, 14);
		contentPane.add(lblHocLuc);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(486, 175, 113, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(486, 207, 113, 20);
		contentPane.add(textField_1);
		
		JButton btn_hocBa = new JButton("Xem Hoc Ba");
		btn_hocBa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ma_khoi = Integer.parseInt(Lop.getSelectedItem().toString());
				getDiem(1, Ma_cap,Ma_khoi, table_diem);
			}
		});
		btn_hocBa.setBounds(486, 122, 113, 42);
		contentPane.add(btn_hocBa);
		
		
	}
	
	public static List<KhoiHoc> listKhoiHocByCap(int Ma_cap,JComboBox comboBox){
		comboBox.removeAllItems();
		List<KhoiHoc> khoiHoc = new ArrayList<>();
		khoiHoc = DAO_KhoiHoc.getKhoiHoc(Ma_cap);
//		String[] khoi = new String[khoiHoc.size()];
		for (KhoiHoc kh : khoiHoc) {
			comboBox.addItem(kh.getTenKH());
		}
		return khoiHoc;
	}
	public static void getDiem(int Ma_hs,int Ma_Cap,int Ma_khoi,JTable table) {
		DefaultTableModel df = (DefaultTableModel) table.getModel();
		df.setRowCount(0);
		List<Diem> listDiem = new ArrayList<>();
		listDiem = DAO_Diem.getLopHoc(Ma_hs, Ma_Cap,Ma_khoi);
		for(Diem diem : listDiem) {
//			System.out.println(diem.getTenMonHoc());
			String[] data = {
					diem.getTenMonHoc(),
					diem.getDiem()
			};
			df.addRow(data);
		}
		table.setModel(df);
	}
	
	class ItemChangeListener implements ItemListener{
	    @Override
	    public void itemStateChanged(ItemEvent event) {
	       if (event.getStateChange() == ItemEvent.SELECTED) {
	          Object item = event.getItem();
	          String select = String.valueOf(item.toString());
				switch (select) {
				case "Cap 1":
					Ma_cap = 1;
					listKhoiHocByCap(1,Lop);
					break;
				case "Cap 2":
					Ma_cap = 2;
					listKhoiHocByCap(2,Lop);
					break;
				case "Cap 3":
					Ma_cap = 3;
					listKhoiHocByCap(3,Lop);
					break;
				case "10":
					Ma_khoi = 10;
					break;
				case "11":
					Ma_khoi = 11;
					break;
				case "12":
					Ma_khoi = 12;
					break;
				}
	       }
	    }   
	}
	
}
