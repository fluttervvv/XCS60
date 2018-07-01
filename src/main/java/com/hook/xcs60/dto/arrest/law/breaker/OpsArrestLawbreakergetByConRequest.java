package com.hook.xcs60.dto.arrest.law.breaker;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpsArrestLawbreakergetByConRequest {
	BigDecimal lawbreakerID;

	public BigDecimal getLawbreakerID() {
		return lawbreakerID;
	}

	@JsonProperty("LawbreakerID")
	public void setLawbreakerID(BigDecimal lawbreakerID) {
		this.lawbreakerID = lawbreakerID;
	}
	
}
