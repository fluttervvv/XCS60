/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author thanatep_s
 */
@Entity
@Table(name = "\"mas_staff\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class MasStaff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\"StaffCode\"")
    private String staffCode;
    @Column(name = "\"PerType\"")
    private Short perType;
    @Basic(optional = false)
    @Column(name = "\"TitleName\"")
    private String titleName;
    @Basic(optional = false)
    @Column(name = "\"FirstName\"")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "\"LastName\"")
    private String lastName;
    @Column(name = "\"OperationPosCode\"")
    private String operationPosCode;
    @Column(name = "\"OperationPosName\"")
    private String operationPosName;
    @Column(name = "\"ManagementPosCode\"")
    private String managementPosCode;
    @Column(name = "\"ManagementPosName\"")
    private String managementPosName;
    @Column(name = "\"PosLevel\"")
    private String posLevel;
    @Column(name = "\"PosLevelName\"")
    private String posLevelName;
    @Column(name = "\"RepresentationPosCode\"")
    private String representationPosCode;
    @Column(name = "\"RepresentationPosName\"")
    private String representationPosName;
    @Column(name = "\"OperationDeptCode\"")
    private String operationDeptCode;
    @Column(name = "\"OperationDeptName\"")
    private String operationDeptName;
    @Column(name = "\"UnderDeptCode\"")
    private String underDeptCode;
    @Column(name = "\"UnderDeptName\"")
    private String underDeptName;
    @Column(name = "\"DeptLevel\"")
    private String deptLevel;
    @Column(name = "\"OfficeCode\"")
    private String officeCode;
    @Column(name = "\"OfficeName\"")
    private String officeName;
    @Column(name = "\"OfficeShortName\"")
    private String officeShortName;
    @Column(name = "\"StatusCode\"")
    private Short statusCode;
    @Basic(optional = false)
    @Column(name = "\"IsActive\"")
    private short isActive;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffCode")
//    private Collection<OpsCompareStaff> opsCompareStaffCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffCode")
//    private Collection<OpsRequestrewardeStaff> opsRequestrewardeStaffCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffCode")
//    private Collection<OpsLawsuitStaff> opsLawsuitStaffCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffCode")
//    private Collection<OpsProveStaff> opsProveStaffCollection;
//    @OneToMany(mappedBy = "staffCode")
//    private Collection<OpsArrestStaff> opsArrestStaffCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffCode")
//    private Collection<OpsInvestigateTeam> opsInvestigateTeamCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffCode")
//    private Collection<OpsNoticeStaff> opsNoticeStaffCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffCode")
//    private Collection<OpsRevenueStaff> opsRevenueStaffCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staffCode")
//    private Collection<OpsRequestbribeStaff> opsRequestbribeStaffCollection;

    public MasStaff() {
    }

    public MasStaff(String staffCode) {
        this.staffCode = staffCode;
    }

    public MasStaff(String staffCode, String titleName, String firstName, String lastName, short isActive) {
        this.staffCode = staffCode;
        this.titleName = titleName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public Short getPerType() {
        return perType;
    }

    public void setPerType(Short perType) {
        this.perType = perType;
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

    public String getOperationPosCode() {
        return operationPosCode;
    }

    public void setOperationPosCode(String operationPosCode) {
        this.operationPosCode = operationPosCode;
    }

    public String getOperationPosName() {
        return operationPosName;
    }

    public void setOperationPosName(String operationPosName) {
        this.operationPosName = operationPosName;
    }

    public String getManagementPosCode() {
        return managementPosCode;
    }

    public void setManagementPosCode(String managementPosCode) {
        this.managementPosCode = managementPosCode;
    }

    public String getManagementPosName() {
        return managementPosName;
    }

    public void setManagementPosName(String managementPosName) {
        this.managementPosName = managementPosName;
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

    public String getRepresentationPosCode() {
        return representationPosCode;
    }

    public void setRepresentationPosCode(String representationPosCode) {
        this.representationPosCode = representationPosCode;
    }

    public String getRepresentationPosName() {
        return representationPosName;
    }

    public void setRepresentationPosName(String representationPosName) {
        this.representationPosName = representationPosName;
    }

    public String getOperationDeptCode() {
        return operationDeptCode;
    }

    public void setOperationDeptCode(String operationDeptCode) {
        this.operationDeptCode = operationDeptCode;
    }

    public String getOperationDeptName() {
        return operationDeptName;
    }

    public void setOperationDeptName(String operationDeptName) {
        this.operationDeptName = operationDeptName;
    }

    public String getUnderDeptCode() {
        return underDeptCode;
    }

    public void setUnderDeptCode(String underDeptCode) {
        this.underDeptCode = underDeptCode;
    }

    public String getUnderDeptName() {
        return underDeptName;
    }

    public void setUnderDeptName(String underDeptName) {
        this.underDeptName = underDeptName;
    }

    public String getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(String deptLevel) {
        this.deptLevel = deptLevel;
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

    public Short getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Short statusCode) {
        this.statusCode = statusCode;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

//    @XmlTransient
//    public Collection<OpsCompareStaff> getOpsCompareStaffCollection() {
//        return opsCompareStaffCollection;
//    }
//
//    public void setOpsCompareStaffCollection(Collection<OpsCompareStaff> opsCompareStaffCollection) {
//        this.opsCompareStaffCollection = opsCompareStaffCollection;
//    }
//
//    @XmlTransient
//    public Collection<OpsRequestrewardeStaff> getOpsRequestrewardeStaffCollection() {
//        return opsRequestrewardeStaffCollection;
//    }
//
//    public void setOpsRequestrewardeStaffCollection(Collection<OpsRequestrewardeStaff> opsRequestrewardeStaffCollection) {
//        this.opsRequestrewardeStaffCollection = opsRequestrewardeStaffCollection;
//    }
//
//    @XmlTransient
//    public Collection<OpsLawsuitStaff> getOpsLawsuitStaffCollection() {
//        return opsLawsuitStaffCollection;
//    }
//
//    public void setOpsLawsuitStaffCollection(Collection<OpsLawsuitStaff> opsLawsuitStaffCollection) {
//        this.opsLawsuitStaffCollection = opsLawsuitStaffCollection;
//    }
//
//    @XmlTransient
//    public Collection<OpsProveStaff> getOpsProveStaffCollection() {
//        return opsProveStaffCollection;
//    }
//
//    public void setOpsProveStaffCollection(Collection<OpsProveStaff> opsProveStaffCollection) {
//        this.opsProveStaffCollection = opsProveStaffCollection;
//    }
//
//    @XmlTransient
//    public Collection<OpsArrestStaff> getOpsArrestStaffCollection() {
//        return opsArrestStaffCollection;
//    }
//
//    public void setOpsArrestStaffCollection(Collection<OpsArrestStaff> opsArrestStaffCollection) {
//        this.opsArrestStaffCollection = opsArrestStaffCollection;
//    }
//
//    @XmlTransient
//    public Collection<OpsInvestigateTeam> getOpsInvestigateTeamCollection() {
//        return opsInvestigateTeamCollection;
//    }
//
//    public void setOpsInvestigateTeamCollection(Collection<OpsInvestigateTeam> opsInvestigateTeamCollection) {
//        this.opsInvestigateTeamCollection = opsInvestigateTeamCollection;
//    }
//
//    @XmlTransient
//    public Collection<OpsNoticeStaff> getOpsNoticeStaffCollection() {
//        return opsNoticeStaffCollection;
//    }
//
//    public void setOpsNoticeStaffCollection(Collection<OpsNoticeStaff> opsNoticeStaffCollection) {
//        this.opsNoticeStaffCollection = opsNoticeStaffCollection;
//    }
//
//    @XmlTransient
//    public Collection<OpsRevenueStaff> getOpsRevenueStaffCollection() {
//        return opsRevenueStaffCollection;
//    }
//
//    public void setOpsRevenueStaffCollection(Collection<OpsRevenueStaff> opsRevenueStaffCollection) {
//        this.opsRevenueStaffCollection = opsRevenueStaffCollection;
//    }
//
//    @XmlTransient
//    public Collection<OpsRequestbribeStaff> getOpsRequestbribeStaffCollection() {
//        return opsRequestbribeStaffCollection;
//    }
//
//    public void setOpsRequestbribeStaffCollection(Collection<OpsRequestbribeStaff> opsRequestbribeStaffCollection) {
//        this.opsRequestbribeStaffCollection = opsRequestbribeStaffCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffCode != null ? staffCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasStaff)) {
            return false;
        }
        MasStaff other = (MasStaff) object;
        if ((this.staffCode == null && other.staffCode != null) || (this.staffCode != null && !this.staffCode.equals(other.staffCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasStaff[ staffCode=" + staffCode + " ]";
    }
    
}
