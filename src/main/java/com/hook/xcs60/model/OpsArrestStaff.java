/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "ops_arrest_staff", catalog = "", schema = "ILLEGAL60")
@NamedQueries({
    @NamedQuery(name = "OpsArrestStaff.findAll", query = "SELECT o FROM OpsArrestStaff o")
    , @NamedQuery(name = "OpsArrestStaff.findByStaffID", query = "SELECT o FROM OpsArrestStaff o WHERE o.staffID = :staffID")
    , @NamedQuery(name = "OpsArrestStaff.findByProgramCode", query = "SELECT o FROM OpsArrestStaff o WHERE o.programCode = :programCode")
    , @NamedQuery(name = "OpsArrestStaff.findByProcessCode", query = "SELECT o FROM OpsArrestStaff o WHERE o.processCode = :processCode")
    , @NamedQuery(name = "OpsArrestStaff.findByTitleName", query = "SELECT o FROM OpsArrestStaff o WHERE o.titleName = :titleName")
    , @NamedQuery(name = "OpsArrestStaff.findByFirstName", query = "SELECT o FROM OpsArrestStaff o WHERE o.firstName = :firstName")
    , @NamedQuery(name = "OpsArrestStaff.findByLastName", query = "SELECT o FROM OpsArrestStaff o WHERE o.lastName = :lastName")
    , @NamedQuery(name = "OpsArrestStaff.findByPositionCode", query = "SELECT o FROM OpsArrestStaff o WHERE o.positionCode = :positionCode")
    , @NamedQuery(name = "OpsArrestStaff.findByPositionName", query = "SELECT o FROM OpsArrestStaff o WHERE o.positionName = :positionName")
    , @NamedQuery(name = "OpsArrestStaff.findByPosLevel", query = "SELECT o FROM OpsArrestStaff o WHERE o.posLevel = :posLevel")
    , @NamedQuery(name = "OpsArrestStaff.findByPosLevelName", query = "SELECT o FROM OpsArrestStaff o WHERE o.posLevelName = :posLevelName")
    , @NamedQuery(name = "OpsArrestStaff.findByDepartmentCode", query = "SELECT o FROM OpsArrestStaff o WHERE o.departmentCode = :departmentCode")
    , @NamedQuery(name = "OpsArrestStaff.findByDepartmentName", query = "SELECT o FROM OpsArrestStaff o WHERE o.departmentName = :departmentName")
    , @NamedQuery(name = "OpsArrestStaff.findByDepartmentLevel", query = "SELECT o FROM OpsArrestStaff o WHERE o.departmentLevel = :departmentLevel")
    , @NamedQuery(name = "OpsArrestStaff.findByOfficeCode", query = "SELECT o FROM OpsArrestStaff o WHERE o.officeCode = :officeCode")
    , @NamedQuery(name = "OpsArrestStaff.findByOfficeName", query = "SELECT o FROM OpsArrestStaff o WHERE o.officeName = :officeName")
    , @NamedQuery(name = "OpsArrestStaff.findByOfficeShortName", query = "SELECT o FROM OpsArrestStaff o WHERE o.officeShortName = :officeShortName")
    , @NamedQuery(name = "OpsArrestStaff.findByContributorID", query = "SELECT o FROM OpsArrestStaff o WHERE o.contributorID = :contributorID")
    , @NamedQuery(name = "OpsArrestStaff.findByIsActive", query = "SELECT o FROM OpsArrestStaff o WHERE o.isActive = :isActive")})
public class OpsArrestStaff implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
//    @SequenceGenerator(name = "id_Sequence", sequenceName = "LOCATION_ID")
    @Column(name ="\"StaffID\"")
    @JsonProperty("StaffID")
    private BigDecimal staffID;
    
    @Column(name ="\"ProgramCode\"")
    @JsonProperty("ProgramCode")
    private String programCode;
    
    @Column(name ="\"ProcessCode\"")
    @JsonProperty("ProcessCode")
    private String processCode;
    
    @Column(name ="\"ArrestCode\"")
    @JsonProperty("ArrestCode")
    private String arrestCode;
    
    @Column(name ="\"StaffCode\"")
    @JsonProperty("StaffCode")
    private String staffCode;
    
    @Column(name ="\"TitleName\"")
    @JsonProperty("TitleName")
    private String titleName;
    @Column(name ="\"FirstName\"")
    @JsonProperty("FirstName")
    private String firstName;
    @Column(name ="\"LastName\"")
    @JsonProperty("LastName")
    private String lastName;
    @Column(name ="\"PositionCode\"")
    @JsonProperty("PositionCode")
    private String positionCode;
    @Column(name ="\"PositionName\"")
    @JsonProperty("PositionName")
    private String positionName;
    @Column(name ="\"PosLevel\"")
    @JsonProperty("PosLevel")
    private String posLevel;
    @Column(name ="\"PosLevelName\"")
    @JsonProperty("PosLevelName")
    private String posLevelName;
    @Column(name ="\"DepartmentCode\"")
    @JsonProperty("DepartmentCode")
    private String departmentCode;
    @Column(name ="\"DepartmentName\"")
    @JsonProperty("DepartmentName")
    private String departmentName;
    @Column(name ="\"DepartmentLevel\"")
    @JsonProperty("DepartmentLevel")
    private String departmentLevel;
    @Column(name ="\"OfficeCode\"")
    @JsonProperty("OfficeCode")
    private String officeCode;
    @Column(name ="\"OfficeName\"")
    @JsonProperty("OfficeName")
    private String officeName;
    @Column(name ="\"OfficeShortName\"")
    @JsonProperty("OfficeShortName")
    private String officeShortName;
    @Column(name ="\"ContributorID\"")
    @JsonProperty("ContributorID")
    private BigInteger contributorID;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    @JsonProperty("IsActive")
    private short isActive;
//    @JoinColumn(name ="\"StaffCode", referencedColumnName ="\"StaffCode\"")
//    @ManyToOne
//    private MasStaff staffCode;
//    @JoinColumn(name ="\"ArrestCode", referencedColumnName ="\"ArrestCode\"")
//    @ManyToOne
//    private OpsArrest arrestCode;

    public OpsArrestStaff() {
    }

    public OpsArrestStaff(BigDecimal staffID) {
        this.staffID = staffID;
    }

    public OpsArrestStaff(BigDecimal staffID, short isActive) {
        this.staffID = staffID;
        this.isActive = isActive;
    }

    public BigDecimal getStaffID() {
        return staffID;
    }

    public void setStaffID(BigDecimal staffID) {
        this.staffID = staffID;
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

    public BigInteger getContributorID() {
        return contributorID;
    }

    public void setContributorID(BigInteger contributorID) {
        this.contributorID = contributorID;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

//    public MasStaff getStaffCode() {
//        return staffCode;
//    }
//
//    public void setStaffCode(MasStaff staffCode) {
//        this.staffCode = staffCode;
//    }

//    public OpsArrest getArrestCode() {
//        return arrestCode;
//    }
//
//    public void setArrestCode(OpsArrest arrestCode) {
//        this.arrestCode = arrestCode;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffID != null ? staffID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsArrestStaff)) {
            return false;
        }
        OpsArrestStaff other = (OpsArrestStaff) object;
        if ((this.staffID == null && other.staffID != null) || (this.staffID != null && !this.staffID.equals(other.staffID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsArrestStaff[ staffID=" + staffID + " ]";
    }
    
}
