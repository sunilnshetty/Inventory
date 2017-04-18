package com.lte.inventory.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.lte.inventory.connection.ConnectionHandler;
import com.lte.inventory.connection.UpdateConnectionHandler;
import com.lte.inventory.dto.Site;
@WebServlet(name="update",urlPatterns={"/update"})
public class Update extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		Site site = new Site();
        String sitename= req.getParameter("name");
        String latitude= req.getParameter("latitude");
        String status= req.getParameter("status");
        String longitude= req.getParameter("longitude");
        String clli= req.getParameter("clli");
        String siteid= req.getParameter("siteid");
        String sitetype= req.getParameter("sitetype");
        String parentsite= req.getParameter("parentsite");
        String street= req.getParameter("street");
        String floor= req.getParameter("floor");
        String city= req.getParameter("city");
        String room= req.getParameter("room");
        String state= req.getParameter("state");
        String country= req.getParameter("country");
        String pincode= req.getParameter("pincode");
        String accessrestrictions= req.getParameter("accessrestrictions");
        String comments= req.getParameter("comments");
        String contactinformation= req.getParameter("contactinformation");
        String act = req.getParameter("act");
		UpdateConnectionHandler updateconnectionHandler = new UpdateConnectionHandler();
		if (act == null) {
		    
		} else if (act.equals("delete")) {
			updateconnectionHandler.deleteSite(sitename);
		} else if (act.equals("update")) {
		    //update button was pressed
			updateconnectionHandler.updateSite(sitename,latitude,status,longitude,clli,siteid,sitetype,parentsite,street,floor,city,room,state,country,pincode,accessrestrictions,comments,contactinformation);
			
		} else {
		    //someone has altered the HTML and sent a different value!
		}
		

	
	}

}
