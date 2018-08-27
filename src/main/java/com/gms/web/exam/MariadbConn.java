package com.gms.web.exam;

import java.sql.*;

public class MariadbConn {
	public String exam() {
		 Connection conn;
		 Statement stmt;
		 String s ="";
		 try {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager .getConnection(
						"jdbc:mariadb://localhost:3306/mariadb", 
						"mariadb", 
						"mariadb");
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(
						"SELECT NAME FROM MEMBER WHERE NAME = '혜리'"
						);			
				if(rs.next()) {
					s=rs.getString("NAME");
				}else {
					s="연결실패";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		 return s;
		}
	
}
