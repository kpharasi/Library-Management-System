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
import bean.*;
public class Student_dao {
	
	private Connection connect=null; 
	private PreparedStatement preparedStatement1=null;
	private PreparedStatement preparedStatement2=null;
	private ResultSet rs=null;
	
	
	public String[] get_Student_Details(Member m)
	{
		String pass="";
		String member_id="";
		String s[]=new String[2];
	try
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		connect=DriverManager.getConnection("jdbc:oracle:thin:@ora.csc.ncsu.edu:1521:orcl","kpharas","200109081");	
		preparedStatement1=connect.prepareStatement("Select Member_ID,Password from Member where user_id=?");
		preparedStatement1.setString(1, m.getUser_Id());
		rs=preparedStatement1.executeQuery();	
		
		
		
		while(rs.next())
		{
			member_id=rs.getString("Member_ID");
			pass=rs.getString("Password");
		}
		
		
		s[0]=member_id;
		s[1]=pass;
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return s;
	}
	
	
	public void update_student_details(Member m)
	{
		// write an update query
	}
	
}
