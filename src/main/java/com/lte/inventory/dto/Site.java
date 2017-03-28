package com.lte.inventory.dto;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
@Entity
@Table(name="SITE_INST")
public class Site implements Serializable {
	
	
	@Id
	@Column(name="SITE_INST_ID",unique = true, nullable=false)
	private String siteInstId;

	public String getSiteInstId() {
		return siteInstId;
	}

	public void setSiteInstId(String siteInstId) {
		this.siteInstId = siteInstId;
	}

	@Column(name="SITE_HUM_ID")
	private String siteHumId;
	
	@Column(name="CLLI")
	private String clli;
	
	@Column(name="LATITUDE")
	private String latitude;
	
	@Column(name="LONGITUDE")
	private String longitude;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="SITE_TYPE")
	private String siteType;
	
	@Column(name="SITE_ID")
	private String siteId;
	
	
	
	private String parentSiteInstId;
	
	@Lob
	@Column(name="STREET")
	private String street;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="POST_CODE")
	private String postCode;
	
	@Column(name="FLOOR_NUMBER")
	private String floorNumber;
	
	@Column(name="ROOM")
	private String room;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Lob
	@Column(name="RESTRICTIONS")
	private String restrictions;
	
	@Lob
	@Column(name="COMMENTS")
	private String comments;
	
	@Lob
	@Column(name="CONTACTS")
	private String contacts;
	
	

	public String getSiteHumId() {
		return siteHumId;
	}

	public void setSiteHumId(String siteHumId) {
		this.siteHumId = siteHumId;
	}

	public String getClli() {
		return clli;
	}

	public void setClli(String clli) {
		this.clli = clli;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSiteType() {
		return siteType;
	}

	public void setSiteType(String siteType) {
		this.siteType = siteType;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getParentSiteInstId() {
		return parentSiteInstId;
	}
		
	public void setParentSiteInstId(String parentSiteInstId) {
		this.parentSiteInstId = parentSiteInstId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
   
   
}
