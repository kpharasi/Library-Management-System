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

public class Faculty_dao {
	
	private Connection connect=null; 
	private PreparedStatement preparedStatement1=null;
	private PreparedStatement preparedStatement2=null;
	private ResultSet rs=null;
	
	
	public String get_Faculty_Details(Member m)
	{
		String pass="";
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connect=DriverManager.getConnection("jdbc:oracle:thin:@ora.csc.ncsu.edu:1521:orcl","kpharas","200109081");
				
		preparedStatement1=connect.prepareStatement("Select Password from Member where user_id=jpink");
		rs=preparedStatement1.executeQuery();	
		
		
		while(rs.next())
		{
			pass=rs.getString("Password");
		}
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return pass;
	}
	
}
