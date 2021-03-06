package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.jndi.toolkit.dir.ContainmentFilter;

import Model.Diem;

public class DAO_Diem {
	public static Connection conn;
	
	public static List<Diem> getLopHoc(int Ma_hs,int Ma_Cap,int Ma_khoi){
//		public static void main(String[] args) {
			
			List<Diem> list = new ArrayList<Diem>();
			ConnectToDB connect = new ConnectToDB();
			conn = connect.getConnection();
			try {
				String sql = "select * from DiemByID where Ma_Cap = "+Ma_Cap+" and Ma_hs = "+Ma_hs+" and Ma_Khoi_Hoc = "+Ma_khoi ;
//				System.out.println(sql);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				
				while(rs.next()) {
//					System.out.println(rs.getString(2));
					Diem diem = new Diem(rs.getString(1),rs.getString(2));
//					System.out.println(diem.getTenMonHoc());
					list.add(diem);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
	
	public static List<Diem> getDiemByIDMon(int idMon){
//		public static void main(String[] args) {
			
			List<Diem> list = new ArrayList<Diem>();
			ConnectToDB connect = new ConnectToDB();
			conn = connect.getConnection();
			try {
				String sql = "Select Ma_hs,(select Ho from Hoc_sinh where Diem.Ma_hs = Hoc_sinh.Ma_hs) as Ho,"
						+ "(select Ten from Hoc_sinh where Diem.Ma_hs = Hoc_sinh.Ma_hs) as Ten,"
						+ "Diem, Diem15p,Diem45p,DiemGiuaKi,DiemCuoiKi "
						+ "from Diem "
						+ "where Diem.Ma_Mon = " + idMon ;
//				System.out.println(sql);
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				
				while(rs.next()) {
					Diem diem = new Diem(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
					diem.setMa_hs(Integer.parseInt(rs.getString(1)));
					list.add(diem);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}
	public static String insertDiem(int ma_diem,int id_hs, int id_mon, int Diem, int Diem15p, int Diem45p, int DiemGiuaKi, int DiemCuoiKi) {
		String sqlInsert = "insert into "
				+ "Diem(Ma_Diem,Ma_hs,Ma_Mon,Diem,Diem15p,Diem45p,DiemGiuaKi,DiemCuoiKi) "
				+ "values (?,?,?,?,?,?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(sqlInsert);
			stmt.setInt(1, ma_diem);
			stmt.setInt(2, id_hs);
			stmt.setInt(3, id_mon);
			stmt.setInt(4, Diem);
			stmt.setInt(5, Diem15p);
			stmt.setInt(6, Diem45p);
			stmt.setInt(7, DiemGiuaKi);
			stmt.setInt(8, DiemCuoiKi);
	        stmt.execute();
	       
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
        return "OK";
	}
	public static int getLastRow() {
		ConnectToDB connect = new ConnectToDB();
		conn = connect.getConnection();
		try {
			String sql = "SELECT TOP 1 * FROM Diem ORDER BY Ma_Diem DESC" ;
//			System.out.println(sql);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				return Integer.parseInt(rs.getString(1));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
