package com.lte.inventory.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lte.inventory.connection.SearchsiteHandler;
import com.lte.inventory.dto.Site;

@WebServlet(name="update",urlPatterns={"/update"})

public class UpdateServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Site site1;

	/**
	 * 
	 */
	protected void getUpdate(Site[] site)
	{
		site1 = site[0];
		//String s=site[0].getSiteInstId();
System.out.println("hello" + site1.getSiteInstId());
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		//string1 =req.getParameter("name");
		//string2 =req.getParameter("status");
		//string3 =req.getParameter("site_type");
		//Site[] site= new Site[10];
		//UpdateServlet update=new UpdateServlet();
		//SearchsiteHandler sshandler = new SearchsiteHandler();
		//site=sshandler.retrieve_site(string1,string2,string3);
		//update.getUpdate(site);
		PrintWriter out=resp.getWriter();
			
			
		  out.println("<html>");
		  		
		  out.println("<body>hello");
		  
		 // for(int i = 0;i<site.length;i++)
		 // {
		  		
		  out.println("<form>");
		  
		  out.println("<p>helloeveryone</p>");
		  
		  out.println("<table>");
	  		
		  out.println("<tr>");	
		  		
		  out.println("<td>Sunil");
		  		
		  out.println("</td>");
		  		
		  out.println("</tr>");
		 
		  	
		  out.println("</table>");
		  
		  out.println("<table>");
		  		
		  out.println("<tr>");	
		  		
		  out.println("<td>"+site1.getSiteInstId());
		  		
		  out.println("</td>");
		  		
		  out.println("</tr>");
		 
		  	
		  out.println("</table>");
		  	
		  out.println("</br>");
		  		
		  out.println("<input type='submit' value='show'/>");
		  		
		  out.println("</form>");
		  
		  		
		  out.println("</body>");
		  		
		  out.println("</html>");
		 
	}

	}
