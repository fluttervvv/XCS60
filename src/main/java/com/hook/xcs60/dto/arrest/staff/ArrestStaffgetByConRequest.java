package com.hook.xcs60.dto.arrest.staff;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestStaffgetByConRequest {
	
	int staffID;

	public Integer getStaffID() {
		return staffID;
	}

	@JsonProperty("StaffID")
	public void setStaffID(Integer staffID) {
		this.staffID = staffID;
	}
	
	
	
}
