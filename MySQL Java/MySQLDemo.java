package com.uttamsoft.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLDemo {

	public static void main(String[] args) throws Exception
	{
		//load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection between java application with MySQL database
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_intro","root","Tanmoy@123#");
		
		//create statement object
		
		Statement st= con.createStatement();
		
		//taking table name dynamically
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the table name: ");
		
		String tname= br.readLine();
		
		//write and execute sql query
		
		String query= "create table "+ tname+ " (Name varchar(25), Age int, sex char(1), doj date, city varchar(15), salary float)";
		
		st.executeUpdate(query);
		
		System.out.println(tname+" table created successfully");
		
		//Close the connection
		
		st.close();
		
		con.close();
	}

}
