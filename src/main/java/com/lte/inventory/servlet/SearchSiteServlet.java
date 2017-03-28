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

@WebServlet(name = "ssite", urlPatterns = { "/ssite" })
public class SearchSiteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String string1;
	//private String string2;
	//private String string3;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		string1 = req.getParameter("name");
		//string2 = req.getParameter("status");
		//string3 = req.getParameter("site_type");
		Site site = new Site();
		//UpdateServlet update = new UpdateServlet();
		SearchsiteHandler sshandler = new SearchsiteHandler();
		site = sshandler.retrieve_site(string1);

		PrintWriter out = resp.getWriter();
		String var=site.getSiteHumId();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='update.html' method='post'>");
        out.println("<p>press the button if you want to update the details</p>");
        out.println("<input type='submit' value='submit'>");
 		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}
}