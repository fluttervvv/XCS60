package com.hook.xcs60.dto.arrest.staff;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestStaffgetByConRequest {
	
	BigDecimal staffID;

	public BigDecimal getStaffID() {
		return staffID;
	}

	@JsonProperty("StaffID")
	public void setStaffID(BigDecimal staffID) {
		this.staffID = staffID;
	}

	@JsonProperty("StaffID")
	public void setStaffID(String staffID) {
		this.staffID = new BigDecimal(staffID);
	}
}
