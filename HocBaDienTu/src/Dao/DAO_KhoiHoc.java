package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.KhoiHoc;



public class DAO_KhoiHoc {
	public static Connection conn;

	public static List<KhoiHoc> getKhoiHoc(int Ma_cap){
//	public static void main(String[] args) {
		
		List<KhoiHoc> list = new ArrayList<KhoiHoc>();
		ConnectToDB connect = new ConnectToDB();
		conn = connect.getConnection();
		try {
			String sql = "SELECT [MaKH]"
					+ "      ,[TenKH]"
					+ "  FROM [HocBaDienTu].[dbo].[Khoi_Hoc]"
					+ "  where Ma_cap ="+Ma_cap ; ;
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
//				System.out.println(rs.getString(2));
				KhoiHoc kh = new KhoiHoc(rs.getInt(1), rs.getString(2));
				list.add(kh);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
