package com.uttamsoft.jdbc;

import java.sql.Statement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class Insert
{
	public static void main(String[] args) 
	{
		Connection con= null;
		Statement st= null;
		BufferedReader br= null;	
		
		try
		{
			//load the driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection between java application with MySQL database
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_intro","root","Tanmoy@123#");
			
			//create statement object
			
		    st= con.createStatement();
			
			br= new BufferedReader(new InputStreamReader(System.in));
			
			while(true)
			{
				System.out.println("Enter Student Name:");
				
				String sname= br.readLine();
				
				System.out.println("Enter Student age:");
				
				int sage= Integer.parseInt(br.readLine());
				
				System.out.println("Enter the sex of Student:");
				
				String ssex= br.readLine();
				
				System.out.println("Enter the Date of join:");
				
				String sdoj= br.readLine();
				
				System.out.println("Enter the City:");
				
				String scity= br.readLine();
				
				System.out.println("Enter the Salary");
				
				float ssalary= Float.parseFloat(br.readLine());
				
				String query="insert into student values( '"+ sname + "', " + sage + ", '" + ssex + "', '" + sdoj + "', '" + scity + "', " + ssalary + ") ";
				
				st.executeUpdate(query);
				
				System.out.println("Do you want to add one more student's details?[yes/no]");
				
				String option= br.readLine();
				
				if(option.equalsIgnoreCase("yes"))
					continue;
				
				else
					break;					
			}
			
			System.out.println("Students' detail inserted successfully");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				br.close();
				st.close();
				con.close();
			}
			
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
	}
}
