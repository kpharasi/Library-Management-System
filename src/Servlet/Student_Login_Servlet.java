package Servlet;
import dao.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Member;

@WebServlet("/Student_Login_Servlet")
public class Student_Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Student_Login_Servlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("userpass");
		
		Member m=new Member();
		m.setUser_Id(username);
		m.setPassword(password);
		Student_dao sd=new Student_dao();
		String s[]=new String[2];
		System.out.println("Name="+m.getUser_Id()+"Password="+m.getPassword());
		s=sd.get_Student_Details(m);
		System.out.println("HERE"+s[0]);
		
		if(s[1].equals(password))
		{
			//request.setAttribute("Member_Id",s[0]);
			// Redirect to student.jsp after setting session variable
			HttpSession session=request.getSession();
			session.setAttribute("Member_Id", s[0]);
			RequestDispatcher rd=request.getRequestDispatcher("./bootstrap/student.jsp");
			
			rd.forward(request,response);
			
			
		}
	
	}

}
