package com.lte.inventory.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.exception.ConstraintViolationException;

import com.lte.inventory.connection.ConnectionHandler;
import com.lte.inventory.dto.Site;


@WebServlet(name="site",urlPatterns={"/site"})
public class SiteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		Site site = new Site();
		
		site.setSiteInstId(req.getParameter("name"));
		site.setSiteHumId(req.getParameter("name"));
		site.setClli(req.getParameter("clli"));
		site.setLatitude(req.getParameter("latitude"));
		site.setLongitude(req.getParameter("longitude"));
		site.setStatus(req.getParameter("status"));
		site.setSiteType(req.getParameter("siteType"));
		site.setSiteId(req.getParameter("siteId"));
		site.setStreet(req.getParameter("street"));
		site.setCity(req.getParameter("city"));
		site.setState(req.getParameter("state"));
		site.setPostCode(req.getParameter("pinCode"));
		site.setFloorNumber(req.getParameter("floor"));
		site.setRoom(req.getParameter("room"));
		site.setCountry(req.getParameter("country"));
		site.setRestrictions(req.getParameter("accessRestrictions"));
		site.setComments(req.getParameter("comments"));
		site.setContacts(req.getParameter("contactInformation"));
		site.setParentSiteInstId(req.getParameter("parentSite"));
		ConnectionHandler connectionHandler = new ConnectionHandler();
		try
		{
			connectionHandler.saveSite(site);
			resp.sendRedirect("sucess.html");
		}
		catch(ConstraintViolationException e)
		{
			resp.sendRedirect("alert.html");
		}
		
		
		
	
		
	}
}
