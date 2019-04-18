package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao extends BasicDao {

	public boolean Checker(Connection conn, String username, String userpasswd) throws SQLException {
		String sql = "Select * from yasui_user where name = ? AND passwd = ? ";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, username);
			pstmt.setString(2, userpasswd);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String passwd = rs.getString("passwd");
				System.out.println(name);
				System.out.println(passwd);
//				//デバッグ用
//				if (name.equals(username))
//					;
//				if (passwd.equals(userpasswd))
//					;
				return true;
			}
			System.out.println("FALLS");
			return false;
		} catch (SQLException e) {
			System.out.println("FALLS");
			return false;
		}
	}

}
