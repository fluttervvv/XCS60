package com.hook.xcs60.dto.arrest.law.breaker;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestLawbreakergetByConRequest {
	String LawbreakerId;

	public String getLawbreakerId() {
		return LawbreakerId;
	}

	@JsonProperty("LawbreakerID")
	public void setLawbreakerId(String lawbreakerId) {
		LawbreakerId = lawbreakerId;
	}
	
}
