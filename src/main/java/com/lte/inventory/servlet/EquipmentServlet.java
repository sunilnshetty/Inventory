package com.lte.inventory.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lte.inventory.connection.EquipmentConnectionhandler;
import com.lte.inventory.dto.Equipment;


@WebServlet(name="equipment",urlPatterns={"/equipment"})
public class EquipmentServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		Equipment equipment=new Equipment();
		equipment.setEquipmentInstId(req.getParameter("id"));
		equipment.setSite(req.getParameter("site"));
		equipment.setCategory(req.getParameter("category"));
		equipment.setStatus(req.getParameter("status"));
		equipment.setContainedIn(req.getParameter("containedin"));
		equipment.setVendor(req.getParameter("vendor"));
		equipment.setModel(req.getParameter("model"));
		equipment.setDescription(req.getParameter("description"));
		try {
			equipment.setOrdered(req.getParameter("ordered"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			equipment.setInservice(req.getParameter("inservice"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			equipment.setDue(req.getParameter("duedate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			equipment.setScheduled(req.getParameter("scheduled"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			equipment.setInstalled(req.getParameter("installed"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			equipment.setDecommission(req.getParameter("decommission"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			equipment.setPurchasedate(req.getParameter("purchase2"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		equipment.setClli(req.getParameter("clli"));
		equipment.setClet(req.getParameter("clet"));
		equipment.setNms(req.getParameter("nms"));
		equipment.setComments(req.getParameter("comments"));
		EquipmentConnectionhandler equipmentconnectionhandler=new EquipmentConnectionhandler();
		equipmentconnectionhandler.saveEquipment(equipment);
	}
}
