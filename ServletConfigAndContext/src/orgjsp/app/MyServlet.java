package orgjsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * ServletConfig and ServletContext
 */

public class MyServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter writer = resp.getWriter();
		writer.print("Hiii ");
		
		
		ServletConfig config = getServletConfig();
		String string = config.getInitParameter("name");
		writer.println(string);
		
		
		//ServletContext context = getServletContext();
		//String string = context.getInitParameter("name");
		//writer.println(string);
		
	}

}
