package com.quizprogram.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest 
{
	Connection connection = null;
	public Connection getConnectionDetails() { //utility
	try {
		//load derive a class
	Class.forName("com.mysql.jdbc.Driver");
	//establish connection
	connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root", "Systeam@123");
	} catch (Exception e) {
	e.printStackTrace();
	}
	return connection;
	}

}
