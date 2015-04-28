package com.yonyou.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
		public static Connection getConnection() throws SQLException, ClassNotFoundException{
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XDP";
			String user = "IFSAPP";
			String pwd = "ifsapp";     
			return DriverManager.getConnection(url, user, pwd);
		}
}
