package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.MonHoc;
import Model.TruongHoc;

public class DAO_TruongHoc {
	public static Connection conn;

	public static List<TruongHoc> getTruongHoc(int Ma_cap){
//	public static void main(String[] args) {
		
		List<TruongHoc> list = new ArrayList<TruongHoc>();
		ConnectToDB connect = new ConnectToDB();
		conn = connect.getConnection();
		try {
			String sql = "SELECT [Ma_school]"
					+ "      ,[Ten_truong]"
					+ "      ,[Dia_chi]"
					+ "  FROM [HocBaDienTu].[dbo].[Truong_Hoc]"
					+ "  where Ma_cap = "+Ma_cap ;
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
//				System.out.println(rs.getString(2));
				TruongHoc th = new TruongHoc(rs.getInt(1), rs.getString(2),rs.getString(3), Ma_cap);
				list.add(th);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
