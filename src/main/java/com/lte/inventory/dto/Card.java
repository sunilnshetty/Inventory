package com.lte.inventory.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="CARD_INST")
public class Card {
	
	@Id
	@Column(name="ID")
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEquip_inst_id() {
		return equip_inst_id;
	}

	public void setEquip_inst_id(String equip_inst_id) {
		this.equip_inst_id = equip_inst_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSlot_occupancy() {
		return slot_occupancy;
	}

	public void setSlot_occupancy(String slot_occupancy) {
		this.slot_occupancy = slot_occupancy;
	}

	public String getSite_inst_id() {
		return site_inst_id;
	}

	public void setSite_inst_id(String site_inst_id) {
		this.site_inst_id = site_inst_id;
	}

	public String getBar_code() {
		return bar_code;
	}

	public void setBar_code(String bar_code) {
		this.bar_code = bar_code;
	}

	public String getBatch_num() {
		return batch_num;
	}

	public void setBatch_num(String batch_num) {
		this.batch_num = batch_num;
	}

	@Column(name="NAME")
	private String name;
	
	@Column(name="EQUIP_INST_ID")
	private String equip_inst_id;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="ROLE")
	private String role;
	
	@Column(name="CARD_TYPE")
	private String card_type;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="SLOT_OCCUPANCY")
	private String slot_occupancy;
	
	@Column(name="SITE_INST_ID")
	private String site_inst_id;
	
	@Column(name="BAR_CODE")
	private String bar_code;
	
	@Column(name="BATCH_NUM")
	private String batch_num;
	
	
}