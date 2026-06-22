
package com.bank.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
public static Connection getConnection(){
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
				    "jdbc:mysql://thomas.proxy.rlwy.net:48372/bankingapplication",
				    "root",
				    "zrIauDRkSEAGEwyCFCQmqQhfKkoesIQO"
				);
			
		} catch (ClassNotFoundException | SQLException e) {
			 
			System.out.println(e.getMessage());
		}
		
		return con;
		
	}

}
