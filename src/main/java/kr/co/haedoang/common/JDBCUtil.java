package kr.co.haedoang.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//JDBC DB CONNECTION
public class JDBCUtil {
	//connection
	public static Connection getConnection() throws Exception{
		Class.forName(DBProperties.DRIVER);
		Connection con = 
			DriverManager.getConnection(DBProperties.URL1, DBProperties.USER, DBProperties.PASS);
		return con;
	}
	//close
	public static void close(PreparedStatement stmt, Connection con) {
		try{
			stmt.close();
		} catch(Exception e) {}
		
		if(con!=null) {
		try{
			con.close();
		} catch(Exception e) {}
		}//if end 
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if(rs != null) {
			try {
				if(!rs.isClosed()) rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		} //if-end 
		
		if(stmt != null) {
			try {
				if(!stmt.isClosed()) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}
		
		if(conn != null) {
			try {
				if(!conn.isClosed()) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
		
	}
	
}
