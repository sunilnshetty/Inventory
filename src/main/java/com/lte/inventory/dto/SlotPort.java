package com.lte.inventory.dto;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="PORT_INST")
public class SlotPort {
@Id
private String id;
private String site;
private String status;
private String equipment_id;
private String slot_card;
private String channelization;
private String bandwidth;
private String description;
private String direction;
private String role;
@OneToOne
private ConnectorType ct;
//@OneToOne
//@OneToOne(cascade = CascadeType.ALL)
//@JoinColumn(name = "CONNECTOR_TYPE")
public ConnectorType getCt() {
	return ct;
}
public void setCt(ConnectorType ct) {
	this.ct = ct;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getEquipment_id() {
	return equipment_id;
}
public void setEquipment_id(String equipment_id) {
	this.equipment_id = equipment_id;
}

public String getSlot_card() {
	return slot_card;
}
public void setSlot_card(String slot_card) {
	this.slot_card = slot_card;
}
public String getChannelization() {
	return channelization;
}
public void setChannelization(String channelization) {
	this.channelization = channelization;
}
public String getBandwidth() {
	return bandwidth;
}
public void setBandwidth(String bandwidth) {
	this.bandwidth = bandwidth;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getDirection() {
	return direction;
}
public void setDirection(String direction) {
	this.direction = direction;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getSite() {
	return site;
}
public void setSite(String site) {
	this.site = site;
}

	
	
}
