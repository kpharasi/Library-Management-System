package Servlet;
import bean.*;
import dao.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login_Servlet")
public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login_Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello I am in post method");
		System.out.println("Username is "+request.getParameter("username"));
		String username=request.getParameter("username");
		String password=request.getParameter("userpass");
		Member m=new Member();
		m.setMember_Id(username);
		m.setPassword(password);
		//login_dao ld=new login_dao();
		System.out.println("Name="+m.getMember_Id()+"Password="+m.getPassword());
		//ld.getDetails(m);
	}

}
