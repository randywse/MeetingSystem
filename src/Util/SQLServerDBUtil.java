package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerDBUtil implements DBUtil {

	public Connection getConnection() {
		Connection con = null;
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String connectDB = "jdbc:sqlserver://HONGYI-PC\\HONGYI:1433;DatabaseName=MeetingSystem";
		String user = "MeetingSystem";
		String password = "Password!";
			try {
				Class.forName(JDriver);
				con = DriverManager.getConnection(connectDB, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	    return con;
	}

}
