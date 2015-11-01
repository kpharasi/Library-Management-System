package dao;

import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import bean.*;

public class login_dao1 {
	
	
	private Connection connect=null; 
	private PreparedStatement preparedStatement1=null;
	private PreparedStatement preparedStatement2=null;
	private ResultSet rs=null;
	
	
	public void getDetails(Member m)
	{
		System.out.println("Hello I am in dao class");
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connect=DriverManager.getConnection("jdbc:oracle:thin:@ora.csc.ncsu.edu:1521:orcl","kpharas@orcl","200109081");
		
		System.out.println("Hello Hello Hello Connect="+connect);
		System.out.println("Hello I am in dao class12345");
		
		preparedStatement1=connect.prepareStatement("Select Password from Member where user_id=jpink");
		rs=preparedStatement1.executeQuery();	
		
		String pass="";
		while(rs.next())
		{
			pass=rs.getString("Password");
		}
		
		System.out.println("The password is"+pass);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
