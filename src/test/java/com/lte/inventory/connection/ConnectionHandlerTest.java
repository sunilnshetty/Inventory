package com.lte.inventory.connection;

import com.lte.inventory.dto.ConnectorType;
import com.lte.inventory.dto.Site;

import junit.framework.TestCase;

public class ConnectionHandlerTest extends TestCase {

	public void testSaveSite() {
		
		Site site = new Site();
		site.setSiteHumId("K R Nagar");
		site.setSiteInstId("1");
		
		ConnectionHandler connectionHandler = new ConnectionHandler();
		
		connectionHandler.saveSite(site);
	}
	
	public void testSaveConnectorType(){
		ConnectorType connectorType = new ConnectorType();
		connectorType.setConnectorname("RJ");
		
		ConnectorTypeConnectionHandler connectionHandler = new ConnectorTypeConnectionHandler();
		connectionHandler.saveConnectorType(connectorType);
		
	}

}
