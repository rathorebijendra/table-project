package org.db.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Table3 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class loaded");
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/school?" + "user=root&password=Password123");
		System.out.println("connection sucessfully");
		Statement statement = connection.createStatement();
		String query = "select * from students";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			int studentId = resultSet.getInt(1);
			System.out.print(studentId + " ");
			String studentName = resultSet.getString(2);
			System.out.print(studentName + " ");
			String phoneNumber = resultSet.getString(3);
			System.out.print(phoneNumber + " ");
			String emailId = resultSet.getString(4);
			System.out.print(emailId + " ");
			String address = resultSet.getString(5);
			System.out.println(address + "");

		}

	}

}
