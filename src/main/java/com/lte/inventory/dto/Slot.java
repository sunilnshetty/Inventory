package com.lte.inventory.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SLOT_INST")
public class Slot {
	@Id
	@Column(name="SLOT_INST_ID")
	private String id;
	@Column(name="EQUP_INST_ID")
	private String equp_id;
	@Column(name="DESCRIPTION")
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEqup_id() {
		return equp_id;
	}
	public void setEqup_id(String equp_id) {
		this.equp_id = equp_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
