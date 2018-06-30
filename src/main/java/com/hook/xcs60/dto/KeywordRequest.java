package com.hook.xcs60.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KeywordRequest {
	
	String textsearch;

	
	public String getTextsearch() {
		return textsearch;
	}

	@JsonProperty("Textsearch")
	public void setTextsearch(String textsearch) {
		this.textsearch = textsearch;
	}
	
}
