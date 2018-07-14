package com.hook.xcs60.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class ArrestNoticegetByConAdvRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getNoticeCode() {
		return noticeCode;
	}

	public void setNoticeCode(String noticeCode) {
		this.noticeCode = noticeCode;
	}

	public Date getNoticeDateFrom() {
		return noticeDateFrom;
	}

	public void setNoticeDateFrom(Date noticeDateFrom) {
		this.noticeDateFrom = noticeDateFrom;
	}

	public Date getNoticeDateTo() {
		return noticeDateTo;
	}

	public void setNoticeDateTo(Date noticeDateTo) {
		this.noticeDateTo = noticeDateTo;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getSuspectName() {
		return suspectName;
	}

	public void setSuspectName(String suspectName) {
		this.suspectName = suspectName;
	}

	String noticeCode ;
	
	Date noticeDateFrom;
	
	Date noticeDateTo;
	
	String staffName;
	
	String officeName;
	
	String suspectName;
	
}
