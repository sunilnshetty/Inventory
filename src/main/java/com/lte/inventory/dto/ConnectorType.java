package com.lte.inventory.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CONNECTOR_TYPE")
public class ConnectorType {
	
	@Id
	@Column(name="NAME")
	private String connectorname;

	public String getConnectorname() {
		return connectorname;
	}

	public void setConnectorname(String connectorname) {
		this.connectorname = connectorname;
	}
    
	

}
