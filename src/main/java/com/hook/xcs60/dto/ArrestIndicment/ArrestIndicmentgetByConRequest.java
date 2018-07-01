package com.hook.xcs60.dto.ArrestIndicment;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestIndicmentgetByConRequest {
	
	@JsonProperty("IndicmentID")
	Long indicmentID;

	public Long getIndicmentID() {
		return indicmentID;
	}

	public void setIndicmentID(Long indicmentID) {
		this.indicmentID = indicmentID;
	}
}
