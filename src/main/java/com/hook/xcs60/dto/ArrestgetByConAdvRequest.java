package com.hook.xcs60.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class ArrestgetByConAdvRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date occurrenceDateFrom;

    private String arrestCode;

    private String officeName;

    private Date occurrenceDateTo;

    private String noticeCode;

    private String staffName;

	public Date getOccurrenceDateFrom() {
		return occurrenceDateFrom;
	}

	public void setOccurrenceDateFrom(Date occurrenceDateFrom) {
		this.occurrenceDateFrom = occurrenceDateFrom;
	}

	public String getArrestCode() {
		return arrestCode;
	}

	public void setArrestCode(String arrestCode) {
		this.arrestCode = arrestCode;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public Date getOccurrenceDateTo() {
		return occurrenceDateTo;
	}

	public void setOccurrenceDateTo(Date occurrenceDateTo) {
		this.occurrenceDateTo = occurrenceDateTo;
	}

	public String getNoticeCode() {
		return noticeCode;
	}

	public void setNoticeCode(String noticeCode) {
		this.noticeCode = noticeCode;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	
	
}
