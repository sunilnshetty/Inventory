package com.lte.inventory.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.lte.inventory.connection.SlotConnectionHandler;
import com.lte.inventory.dto.Slot;



@WebServlet(name="slot",urlPatterns={"/slot"})
public class SlotServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		Slot slot=new Slot();
		slot.setEqup_id(req.getParameter("equipmentid"));
		slot.setDescription(req.getParameter("description"));
		slot.setId(req.getParameter("id"));
		SlotConnectionHandler slotconnectionHandler = new SlotConnectionHandler();
		slotconnectionHandler.saveSlot(slot);
		
	}
}
