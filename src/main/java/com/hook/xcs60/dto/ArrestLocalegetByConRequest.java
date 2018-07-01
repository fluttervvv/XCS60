package com.hook.xcs60.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestLocalegetByConRequest {
	
	Long localeID ;

	public Long getLocaleID() {
		return localeID;
	}
	
	@JsonProperty("LocaleID")
	public void setLocaleID(Long localeID) {
		this.localeID = localeID;
	}
	
}
