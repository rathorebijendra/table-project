package org.db.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Table4 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class loaded");
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/school?" + "user=root&password=Password123");
		System.out.println("connection sucessfully");
		PreparedStatement preparedStatement = connection.prepareStatement(" insert into students value(?,?,?,?,?)");
		preparedStatement.setInt(1, 4567);
		preparedStatement.setString(2, "rathore");
		preparedStatement.setString(3, "8650958854");
		preparedStatement.setString(4, "zxcvbnm7654");
		preparedStatement.setString(5, "fakirabad");
		preparedStatement.execute();
		System.out.println(" record inserted");

	}
}