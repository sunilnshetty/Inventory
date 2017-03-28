package com.lte.inventory.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lte.inventory.connection.PortConnectionHandler;
import com.lte.inventory.dto.ConnectorType;
import com.lte.inventory.dto.SlotPort;

@WebServlet(name="port",urlPatterns={"/port"})
public class PortServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
	
	SlotPort port=new SlotPort();
	ConnectorType connectorType=new ConnectorType();
	connectorType.setConnectorname(req.getParameter("connector"));
	port.setId(req.getParameter("id")); 
	port.setSite(req.getParameter("site"));
	port.setStatus(req.getParameter("status")); 
	port.setEquipment_id(req.getParameter("equipment_id")); 	
	port.setSlot_card(req.getParameter("slot_card")); 
	port.setChannelization(req.getParameter("channelization")); 
	port.setBandwidth(req.getParameter("bandwidth")); 
	port.setDescription(req.getParameter("description")); 
	port.setDirection(req.getParameter("direction")); 
	port.setRole(req.getParameter("role")); 
	port.setCt(connectorType);
	PortConnectionHandler portconnectionhandler=new PortConnectionHandler();
	portconnectionhandler.savePort(port);
	
	
	
	

}
}
