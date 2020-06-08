package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addStudent")
public class IdFilter implements Filter {

   
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		int sid = Integer.parseInt(req.getParameter("sid"));
		String sname =req.getParameter("sname");

		
		if(sid>1)
		chain.doFilter(request, response);
		
		else {
			out.println("Invalid Input");
		}
		
		if(sname.length()>=3)

			chain.doFilter(request,response);

			else 
				
			out.println("Invalid text input");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
