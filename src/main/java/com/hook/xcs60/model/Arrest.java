package com.hook.xcs60.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(schema= "ILLEGAL60" ,name = "\"ops_arrest\"")
public class Arrest {

	public Arrest() {
		super();
	}

	
	@Id
	@Column(name ="\"ArrestCode\"", unique = true)
	String arrestCode ;
	

	@Column(name ="\"ArrestDate\"")
	Date arrestDate ;
	
	
	@Column(name ="\"ArrestTime\"")
	Date arrestTime;
	
	@Column(name ="\"OccurrenceDate\"")
	Date occurrenceDate;
	
	@Column(name ="\"OccurrenceTime\"")
	String occurrenceTime ;
	
	@Column(name ="\"ArrestStationCode\"")
	String arrestStationCode ;
	
	@Column(name ="\"ArrestStation\"")
	String arrestStation;
	
	@Column(name ="\"HaveCulprit\"")
	Boolean haveCulprit ;
	
	@Column(name ="\"Behaviour\"")
	String behaviour ;
	
	@Column(name ="\"Testimony\"")
	String testimony ;
	
	@Column(name ="\"Prompt\"")
	String prompt ;
	
	@Column(name ="\"IsMatchNotice\"")
	String isMatchNotice ;
	
	@Column(name ="\"ArrestDesc\"")
	String arrestDesc ;
	
	@Column(name ="\"NoticeCode\"")
	String noticeCode ;
	
	@Column(name ="\"InvestigationSurveyDocument\"")
	String investigationSurveyDocument ;
	
	@Column(name ="\"InvestigationCode\"")
	String investigationCode ;
	
	@Column(name ="\"IsActive\"")
	Boolean isActive;

	public String getArrestCode() {
		return arrestCode;
	}

	public void setArrestCode(String arrestCode) {
		this.arrestCode = arrestCode;
	}

	public Date getArrestDate() {
		return arrestDate;
	}

	public void setArrestDate(Date arrestDate) {
		this.arrestDate = arrestDate;
	}

	public Date getArrestTime() {
		return arrestTime;
	}

	public void setArrestTime(Date arrestTime) {
		this.arrestTime = arrestTime;
	}

	public Date getOccurrenceDate() {
		return occurrenceDate;
	}

	public void setOccurrenceDate(Date occurrenceDate) {
		this.occurrenceDate = occurrenceDate;
	}

	public String getOccurrenceTime() {
		return occurrenceTime;
	}

	public void setOccurrenceTime(String occurrenceTime) {
		this.occurrenceTime = occurrenceTime;
	}

	public String getArrestStationCode() {
		return arrestStationCode;
	}

	public void setArrestStationCode(String arrestStationCode) {
		this.arrestStationCode = arrestStationCode;
	}

	public String getArrestStation() {
		return arrestStation;
	}

	public void setArrestStation(String arrestStation) {
		this.arrestStation = arrestStation;
	}

	public Boolean getHaveCulprit() {
		return haveCulprit;
	}

	public void setHaveCulprit(Boolean haveCulprit) {
		this.haveCulprit = haveCulprit;
	}

	public String getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}

	public String getTestimony() {
		return testimony;
	}

	public void setTestimony(String testimony) {
		this.testimony = testimony;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public String getIsMatchNotice() {
		return isMatchNotice;
	}

	public void setIsMatchNotice(String isMatchNotice) {
		this.isMatchNotice = isMatchNotice;
	}

	public String getArrestDesc() {
		return arrestDesc;
	}

	public void setArrestDesc(String arrestDesc) {
		this.arrestDesc = arrestDesc;
	}

	public String getNoticeCode() {
		return noticeCode;
	}

	public void setNoticeCode(String noticeCode) {
		this.noticeCode = noticeCode;
	}

	public String getInvestigationSurveyDocument() {
		return investigationSurveyDocument;
	}

	public void setInvestigationSurveyDocument(String investigationSurveyDocument) {
		this.investigationSurveyDocument = investigationSurveyDocument;
	}

	public String getInvestigationCode() {
		return investigationCode;
	}

	public void setInvestigationCode(String investigationCode) {
		this.investigationCode = investigationCode;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

		
}
