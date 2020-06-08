 package org.jsp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jsp.web.dao.StudentDao;
import org.jsp.web.model.Student;


public class GetStudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id =  Integer.parseInt(request.getParameter("id"));
		
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(id);
		
		HttpSession session = request.getSession();
		session.setAttribute("student", s1);
		
		response.sendRedirect("showstudent.jsp");
		
	//	RequestDispatcher rd = request.getRequestDispatcher("showstudent.jsp");
	//	rd.forward(request, response);
	}

	

}
