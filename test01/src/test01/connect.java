package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connect {
	private static String DB_URL = "jdbc:sqlserver://PC;"
            + "databaseName=HocBaDienTu;" ;
//            + "integratedSecurity=true";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123456789";
public static void main(String[] args) {
	Connection conn = null;
    try {
        conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        System.out.println("connect successfully!");
        Statement stmt = conn.createStatement();
        // get data from table 'student'
        ResultSet rs = stmt.executeQuery("select * from LopHoc");
        // show data
        while (rs.next()) {
            System.out.println(rs.getString(1) + "  " + rs.getString(2) 
                    + "  " + rs.getString(3)+ "  " + rs.getString(4));
        }
        // close connection
        conn.close();
    } catch (Exception ex) {
        System.out.println("connect failure!");
        ex.printStackTrace();
    }
}
}
