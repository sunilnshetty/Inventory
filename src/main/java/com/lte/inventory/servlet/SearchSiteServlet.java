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
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		string1 = req.getParameter("name");
	
		Site site = new Site();
		
		SearchsiteHandler sshandler = new SearchsiteHandler();
		site = sshandler.retrieve_site(string1);
        String TextValue=site.getSiteInstId();
		PrintWriter out = resp.getWriter();
		
		req.setAttribute("TextValue",TextValue);
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>given below gives details of site information if u want to update the details update which ever felids and press update button otherwise if want to delect given site press delect button otherwise nothing button</h1> ");
		out.println("<form action='update' method='post'>");
       
        out.print("SiteName:<input type=\"text\" name=\"name\" readonly=\"readonly\" value=\"" +TextValue + "\">");
        out.print("siteType:<input type=\"text\" name=\"sitetype\" value=\"" +site.getSiteType() + "\">");
        out.print("</br>");
        out.print("Latitude:<input type=\"text\" name=\"latitude\" value=\"" +site.getLatitude() + "\">");
        out.print("Status:<input type=\"text\" name=\"status\" value=\"" +site.getStatus() + "\">");
        out.print("</br>");

       out.print("Longitude:<input type=\"text\" name=\"longitude\" value=\"" +site.getLongitude() + "\">");
        out.print("CLLI:<input type=\"text\" name=\"clli\" value=\"" +site.getClli() + "\">");
        out.print("</br>");

        out.print("SiteId:<input type=\"text\" name=\"siteid\" value=\"" +site.getSiteId() + "\">");
        out.print("Parentsite:<input type=\"text\" name=\"parentsite\" value=\"" +site.getParentSiteInstId() + "\">");
        out.print("</br>");

        out.print("Street:<input type=\"text\" name=\"street\" value=\"" +site.getStreet() + "\">");
        out.print("Floor:<input type=\"text\" name=\"floor\" value=\"" +site.getFloorNumber() + "\">");
        out.print("</br>");

        out.print("City:<input type=\"text\" name=\"city\" value=\"" +site.getCity() + "\">");
        out.print("Room:<input type=\"text\" name=\"room\" value=\"" +site.getRoom() + "\">");
        out.print("</br>");

        out.print("State:<input type=\"text\" name=\"state\" value=\"" +site.getState() + "\">");
        out.print("Country:<input type=\"text\" name=\"country\" value=\"" +site.getCountry() + "\">");
        out.print("</br>");

        out.print("PinCode:<input type=\"text\" name=\"pincode\" value=\"" +site.getPostCode() + "\">");
        out.print("AccessRestrictions:<input type=\"text\" name=\"accessrestrictions\" value=\"" +site.getRestrictions() + "\">");
        out.print("</br>");

        out.print("Comments:<input type=\"text\" name=\"comments\" value=\"" +site.getComments() + "\">");
        out.print("ContactInformation:<input type=\"text\" name=\"contactinformation\" value=\"" +site.getContacts() + "\">");
        out.print("</br>");

        out.println("<input type='submit' name='act' value='update'>");
        
 		out.println("<input type='submit' name='act' value='delete'>");
 		out.println("</form>");		
        
		out.println("</body>");
		out.println("</html>");

	}
}