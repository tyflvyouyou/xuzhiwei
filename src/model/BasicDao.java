package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicDao {
	//public Connection connect() throws SQLException, NamingException{
	//		DataSource ds = null; //DataSourceの参照変数
	//		Connection con = null; //Connectionオブジェクトの参照変数
	//		Context context = null;
	//		String localName = "java:comp/env/jdbc/testCon";
	//		//コンテキストの生成
	//		context = new InitialContext();
	//		//コンテキストを検索
	//		ds = (DataSource)context.lookup(localName);
	//		// データベースへ接続
	//		con = ds.getConnection();
	private final String url = "jdbc:mysql://localhost:3306/yasui?serverTimezone=JST&characterEncoding=UTF-8";
	private final String username = "yasui";
	private final String password = "password";

	public Connection connect() throws ClassNotFoundException, SQLException {
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
		//return conn;
	}

	public void disconnect(Connection conn) throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}
}
