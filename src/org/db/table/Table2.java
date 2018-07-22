package org.db.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

public class Table2 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class loaded");
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/school?" + "user=root&password=Password123");
		System.out.println("connection sucessfully");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into students values(?,?,?,?,?)");
		preparedStatement.setInt(1, 1234);
		preparedStatement.setString(2, "bijendra");
		preparedStatement.setString(3, "8077884898");
		preparedStatement.setString(4, "rathorebijendra1999@gmail.com");
		preparedStatement.setString(5, "noida 51");
		preparedStatement.execute("record inserted");
	}

}
