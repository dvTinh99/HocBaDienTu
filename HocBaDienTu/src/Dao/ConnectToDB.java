package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToDB {
	ConnectToDB(){};
	private static String DB_URL = "jdbc:sqlserver://PC;"
            + "databaseName=HocBaDienTu;" ;
//            + "integratedSecurity=true";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123456789";
    public static Connection conn = null ;
public static Connection getConnection() {
	
    try {
        conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
//        System.out.println("connect successfully!");
        
    } catch (Exception ex) {
//        System.out.println("connect failure!");
        ex.printStackTrace();
    }
    return conn;
}
}
