package com.lte.inventory.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="EQUIPMENT_INST")
public class Equipment {
	@Id
	@Column(name="EQUIPMENT_INST_ID")
	private String equipmentInstId;

	public String getEquipmentInstId() {
		return equipmentInstId;
	}

	public void setEquipmentInstId(String equipmentInstId) {
		this.equipmentInstId = equipmentInstId;
	}
	
	@Column(name="SITE")
	private String site;

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	private String status;
	private String containedIn;
	private String category;
	private String vendor;
	private String model;
	private String description;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContainedIn() {
		return containedIn;
	}

	public void setContainedIn(String containedIn) {
		this.containedIn = containedIn;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	private Date ordered;
	public Date getOrdered() {
		return ordered;
	}

	public void setOrdered(String ordered) throws ParseException {
		 
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(ordered);  
	    //System.out.println(sDate1+"\t"+date1); 
		this.ordered = date1;
	}

	private Date inservice;

	public Date getInservice() {
		return inservice;
	}

	public void setInservice(String inservice) throws ParseException {
		Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(inservice);  
		this.inservice = date2;
	}
	private Date due;
	
	public Date getDue() {
		return due;
	}

	public void setDue(String due) throws ParseException{
		Date date3=new SimpleDateFormat("dd/MM/yyyy").parse(due);  
		this.due = date3;
	}
	private Date scheduled;
	private Date installed;
	private Date decommission;
	private Date purchasedate;
	public Date getScheduled() {
		return scheduled;
	}

	public void setScheduled(String scheduled) throws ParseException {
		Date date4=new SimpleDateFormat("dd/MM/yyyy").parse(scheduled);  
		this.scheduled = date4;
	}

	public Date getInstalled() {
		return installed;
	}

	public void setInstalled(String installed) throws ParseException {
		Date date5=new SimpleDateFormat("dd/MM/yyyy").parse(installed);  
		this.installed = date5;
	}

	public Date getDecommission() {
		return decommission;
	}

	public void setDecommission(String decommission) throws ParseException {
		Date date6=new SimpleDateFormat("dd/MM/yyyy").parse(decommission);  
		this.decommission = date6;
	}

	public Date getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(String purchasedate) throws ParseException {
		Date date7=new SimpleDateFormat("dd/MM/yyyy").parse(purchasedate);
		this.purchasedate = date7;
	}
	private String clli;
	private String clet;
	private String nms;
	@Lob
	private String comments;

	public String getClli() {
		return clli;
	}

	public void setClli(String clli) {
		this.clli = clli;
	}

	public String getClet() {
		return clet;
	}

	public void setClet(String clet) {
		this.clet = clet;
	}

	public String getNms() {
		return nms;
	}

	public void setNms(String nms) {
		this.nms = nms;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setOrdered(Date ordered) {
		this.ordered = ordered;
	}

	public void setInservice(Date inservice) {
		this.inservice = inservice;
	}

	public void setDue(Date due) {
		this.due = due;
	}

	public void setScheduled(Date scheduled) {
		this.scheduled = scheduled;
	}

	public void setInstalled(Date installed) {
		this.installed = installed;
	}

	public void setDecommission(Date decommission) {
		this.decommission = decommission;
	}

	public void setPurchasedate(Date purchasedate) {
		this.purchasedate = purchasedate;
	}
	
}
