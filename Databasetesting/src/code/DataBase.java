package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;






public class DataBase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
	//	url should belike
		// "jdbc:mysql://"+host+":"+port+"/databasename";
		//"jdbc:mysql://localhost:3306/sys
		
		String host ="localhost";
		String port ="3306";
		
	// Not working due to Statement package jdbc	
	Connection conn =	DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/sys", "root", "Varun@243");
	java.sql.Statement a = conn.createStatement();
	ResultSet rs=a.executeQuery ("select * from sys");
		
	System.out.println(	rs.getString("name"));
	}

}
