package model;

import java.sql.Connection;
import java.sql.SQLException;

public class test01 {
	String username = "";
	String userpasswd = "";

	public static void main(String[] args) {
		LoginDao logindao = new LoginDao();
		try {
			Connection conn = logindao.connect();
			if (logindao.Checker(conn, "admin", "1password")) {
				System.out.println("SUCCESS");
			} else {
				System.out.println("FAIL");
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
