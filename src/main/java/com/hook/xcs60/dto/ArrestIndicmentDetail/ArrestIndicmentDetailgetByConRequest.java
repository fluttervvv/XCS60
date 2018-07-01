package com.hook.xcs60.dto.ArrestIndicmentDetail;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestIndicmentDetailgetByConRequest {
	
	@JsonProperty("IndicmentDetailID")
	Long indicmentDetailID;

	public Long getIndicmentDetailID() {
		return indicmentDetailID;
	}

	public void setIndicmentDetailID(Long indicmentDetailID) {
		this.indicmentDetailID = indicmentDetailID;
	}
	
}
