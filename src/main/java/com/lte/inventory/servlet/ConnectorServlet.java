package com.lte.inventory.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lte.inventory.connection.ConnectionHandler;
import com.lte.inventory.connection.ConnectorTypeConnectionHandler;
import com.lte.inventory.dto.ConnectorType;
@WebServlet(name="connector",urlPatterns={"/connector"})
public class ConnectorServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		ConnectorType ct=new ConnectorType();
		ct.setConnectorname(req.getParameter("name"));
		ConnectorTypeConnectionHandler connectionHandler = new ConnectorTypeConnectionHandler();
		connectionHandler.saveConnectorType(ct);
	}
	

}
