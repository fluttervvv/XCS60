package com.hook.xcs60.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestLocalegetByConRequest {
	
	String localeID ;

	public String getLocaleID() {
		return localeID;
	}
	
	@JsonProperty("LocaleID")
	public void setLocaleID(String localeID) {
		this.localeID = localeID;
	}
	
	
	
}
