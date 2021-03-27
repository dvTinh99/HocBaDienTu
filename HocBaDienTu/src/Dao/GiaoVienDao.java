package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.HocSinh;
import Model.MonHoc;

public class GiaoVienDao {
	public static Connection conn;

	public static List<MonHoc> getMonHoc(){
		List<MonHoc> list = new ArrayList<MonHoc>();
		ConnectToDB connect = new ConnectToDB();
		conn = connect.getConnection();
		try {
			String sql = "select Ma_Mon, Ten_Mon, Ma_cap from Mon_Hoc" ;
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
//				System.out.println(rs.getInt(3));
				MonHoc mh = new MonHoc(rs.getInt(1), rs.getString(2),rs.getInt(3));
				list.add(mh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static List<HocSinh> getHocSinh(){
//	public static void main(String[] args) {
		
	
		List<HocSinh> list = new ArrayList<HocSinh>();
		ConnectToDB connect = new ConnectToDB();
		conn = connect.getConnection();
		try {
			String sql = "SELECT [Ma_hs]"
					+ "      ,[Ho]"
					+ "      ,[Ten]"
					+ "      ,[Gioi_Tinh]"
					+ "      ,[Ngay_Sinh]"
					+ "      ,[Dia_Chi]"
					+ "      ,[Sdt]"
					+ "      ,[CMND]"
					+ "  FROM [HocBaDienTu].[dbo].[Hoc_sinh]" ;
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				HocSinh hs = new HocSinh(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
				list.add(hs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public static String insertHS(String ma_hs,String ho_hs,String ten_hs,String gioiTinh,String ngaySinh,String diaChi, String sdt,String cmnd) {
		String sqlInsert = "INSERT INTO [HocBaDienTu].[dbo].[Hoc_sinh]([Ma_hs]"
				+ "      ,[Ho]"
				+ "      ,[Ten]"
				+ "      ,[Gioi_Tinh]"
				+ "      ,[Ngay_Sinh]"
				+ "      ,[Dia_Chi]"
				+ "      ,[Sdt]"
				+ "      ,[CMND]) VALUES(?, ?, ?,?,?,?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(sqlInsert);
			stmt.setString(1, ma_hs);
	        stmt.setString(2, ho_hs);
	        stmt.setString(3, ten_hs);
	        stmt.setString(4, gioiTinh);
	        stmt.setString(5, ngaySinh);
	        stmt.setString(6, diaChi);
	        stmt.setString(7, sdt);
	        stmt.setString(8, cmnd);
	        stmt.execute();
	       
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
        return "OK";
        
	}
}
