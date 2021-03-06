package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.LopHoc;
import Model.TruongHoc;

public class DAO_LopHoc {
	public static Connection conn;

	public static List<LopHoc> getLopHoc(int Ma_school){
//	public static void main(String[] args) {
		
		List<LopHoc> list = new ArrayList<LopHoc>();
		ConnectToDB connect = new ConnectToDB();
		conn = connect.getConnection();
		try {
			String sql = "SELECT TOP (1000) [Ma_class]"
					+ "	  ,Ten_lop"
					+ "	  ,[Ma_KH]"
					+ "      ,(select Ten from Giao_vien where Lop_Hoc.Ma_gvcn = Giao_vien.Ma_gv) as GVCN"
					+ "  FROM [HocBaDienTu].[dbo].[Lop_Hoc]"
					+ "  where Ma_school = "+Ma_school ;
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
//				System.out.println(rs.getString(2));
				LopHoc lh = new LopHoc(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4));
				list.add(lh);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
