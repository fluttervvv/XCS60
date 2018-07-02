package com.hook.xcs60.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestupdDeleteRequest implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@JsonProperty("ArrestCode")
	String arrestCode;

	public String getArrestCode() {
		return arrestCode;
	}

	public void setArrestCodee(String arrestupdDelete) {
		this.arrestCode = arrestupdDelete;
	}
}
