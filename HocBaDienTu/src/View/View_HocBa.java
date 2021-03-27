package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JRadioButton;

public class View_HocBa extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		setBounds(100, 100, 792, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Học Bạ Học Sinh X");
		lblNewLabel.setBounds(259, 59, 339, 62);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(10, 106, 756, 394);
		contentPane.add(table);
		
		JRadioButton rdbtnK = new JRadioButton("Kì 2");
		rdbtnK.setBounds(592, 46, 109, 23);
		contentPane.add(rdbtnK);
	}
}