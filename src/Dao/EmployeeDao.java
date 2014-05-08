package Dao;

import java.sql.*;

import Util.DBUtil;
import Util.SQLServerDBUtil;

public class EmployeeDao {
	private DBUtil sqlServerDBUtil;

	public void authentication(String username, String password) {
		// TODO Auto-generated method stub
		sqlServerDBUtil = new SQLServerDBUtil();
		Connection con = sqlServerDBUtil.getConnection();
		String strsql = "select * from Employee";
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(strsql);
//			pstmt.setString(1, username);
//			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String fname = rs.getString("Email");
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
