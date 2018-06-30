package com.hook.xcs60.dto.arrest.staff;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestStaffgetByConRequest {
	
	String staffId;

	public String getStaffId() {
		return staffId;
	}

	@JsonProperty("StaffID")
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
}
