package com.lte.inventory.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lte.inventory.connection.CardConnectionHandler;
import com.lte.inventory.connection.ConnectionHandler;
import com.lte.inventory.dto.Card;
import com.lte.inventory.dto.Site;
@WebServlet(name="card",urlPatterns={"/card"})
public class CardServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		Card card=new Card();
		
		card.setId(req.getParameter("id"));
		card.setName(req.getParameter("name"));
		card.setEquip_inst_id(req.getParameter("equip_inst_id"));
		card.setDescription(req.getParameter("description"));
		card.setRole(req.getParameter("role"));
		card.setCard_type(req.getParameter("card_type"));
		card.setStatus(req.getParameter("status"));
		card.setSlot_occupancy(req.getParameter("slot_occupancy"));
		card.setSite_inst_id(req.getParameter("site_inst_id"));
		card.setBar_code(req.getParameter("bar_code"));
		card.setBatch_num(req.getParameter("batch_num"));
		CardConnectionHandler connectionHandler = new CardConnectionHandler();
		connectionHandler.saveCard(card);
		
			
		
	}
	

}
