package com.hook.xcs60.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(schema= "ILLEGAL60" ,name = "\"ops_arrest_staff\"")
public class ArrestStaff {
	
	public ArrestStaff() {
		super();
	}
	
	@Id
	@Column(name ="\"StaffID\"", unique = true)
	int staffId;
	
	@Column(name ="\"ProgramCode\"")
	String programCode;
	
	@Column(name ="\"ProcessCode\"")
	String processCode;
	
	@Column(name ="\"ArrestCode\"")
	String arrestCode;
	
	@Column(name ="\"StaffCode\"")
	String staffCode;

	@Column(name ="\"TitleName\"")
	String titleName;
	
	@Column(name ="\"FirstName\"")
	String firstName;

	@Column(name ="\"LastName\"")
	String lastName;
	
	@Column(name ="\"PositionCode\"")
	String positionCode;
	
	@Column(name ="\"PositionName\"")
	String positionName;
	
	@Column(name ="\"PosLevel\"")
	String posLevel;
	
	@Column(name ="\"PosLevelName\"")
	String posLevelName;
	
	@Column(name ="\"DepartmentCode\"")
	String departmentCode;
	
	@Column(name ="\"DepartmentName\"")
	String departmentName;
	
	@Column(name ="\"DepartmentLevel\"")
	String departmentLevel;
	
	@Column(name ="\"OfficeCode\"")
	String officeCode;
	
	@Column(name ="\"OfficeName\"")
	String officeName;

	@Column(name ="\"OfficeShortName\"")
	String officeShortName;
	
	@Column(name ="\"ContributorID\"")
	int contributorID;
	
	@Column(name ="\"IsActive\"")
	Boolean isActive;

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getProgramCode() {
		return programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	public String getProcessCode() {
		return processCode;
	}

	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getArrestCode() {
		return arrestCode;
	}

	public void setArrestCode(String arrestCode) {
		this.arrestCode = arrestCode;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPosLevel() {
		return posLevel;
	}

	public void setPosLevel(String posLevel) {
		this.posLevel = posLevel;
	}

	public String getPosLevelName() {
		return posLevelName;
	}

	public void setPosLevelName(String posLevelName) {
		this.posLevelName = posLevelName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLevel() {
		return departmentLevel;
	}

	public void setDepartmentLevel(String departmentLevel) {
		this.departmentLevel = departmentLevel;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeShortName() {
		return officeShortName;
	}

	public void setOfficeShortName(String officeShortName) {
		this.officeShortName = officeShortName;
	}

	public int getContributorID() {
		return contributorID;
	}

	public void setContributorID(int contributorID) {
		this.contributorID = contributorID;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
