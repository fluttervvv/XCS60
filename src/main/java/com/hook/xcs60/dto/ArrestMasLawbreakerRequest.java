package com.hook.xcs60.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArrestMasLawbreakerRequest {
	
	private short entityType;
	private short lawbreakerType;
	private String iDCard;
	private String passportNo;
	private String companyRegistrationNo;	
	private String CompanyName;
	private String lawbreakerName;
	
	public short getEntityType() {
		return entityType;
	}
	
	@JsonProperty("EntityType")
	public void setEntityType(short entityType) {
		this.entityType = entityType;
	}
	
	public short getLawbreakerType() {
		return lawbreakerType;
	}
	
	@JsonProperty("LawbreakerType")
	public void setLawbreakerType(short lawbreakerType) {
		this.lawbreakerType = lawbreakerType;
	}
	
	public String getiDCard() {
		return iDCard;
	}
	
	@JsonProperty("IDCard")
	public void setiDCard(String iDCard) {
		this.iDCard = iDCard;
	}
	
	public String getPassportNo() {
		return passportNo;
	}
	
	@JsonProperty("PassportNo")
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	
	public String getCompanyRegistrationNo() {
		return companyRegistrationNo;
	}
	
	@JsonProperty("CompanyRegistrationNo")
	public void setCompanyRegistrationNo(String companyRegistrationNo) {
		this.companyRegistrationNo = companyRegistrationNo;
	}
	
	public String getCompanyName() {
		return CompanyName;
	}
	
	@JsonProperty("CompanyName")
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	
	public String getLawbreakerName() {
		return lawbreakerName;
	}
	
	@JsonProperty("LawbreakerName")
	public void setLawbreakerName(String lawbreakerName) {
		this.lawbreakerName = lawbreakerName;
	}

	
	
}
