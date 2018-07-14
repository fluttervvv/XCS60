/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author thanatep_s
 */
@Entity
@Table(name = "\"mas_office\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class MasOffice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\"OfficeCode\"")
    private String officeCode;
    @Basic(optional = false)
    @Column(name = "\"OfficeName\"")
    private String officeName;
    @Column(name = "\"OfficeShortName\"")
    private String officeShortName;
    @Column(name = "\"INDCOffice\"")
    private String iNDCOffice;
    @Column(name = "\"SubDistrictCode\"")
    private String subDistrictCode;
    @Column(name = "\"SubOfficeCode\"")
    private String subOfficeCode;
    @Column(name = "\"EffectiveDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effectiveDate;
    @Column(name = "\"ExpirationDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDate;
    @Basic(optional = false)
    @Column(name = "\"IsActive\"")
    private short isActive;
    @Column(name = "\"EventDatetime\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDatetime;

    public MasOffice() {
    }

    public MasOffice(String officeCode) {
        this.officeCode = officeCode;
    }

    public MasOffice(String officeCode, String officeName, short isActive) {
        this.officeCode = officeCode;
        this.officeName = officeName;
        this.isActive = isActive;
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

    public String getINDCOffice() {
        return iNDCOffice;
    }

    public void setINDCOffice(String iNDCOffice) {
        this.iNDCOffice = iNDCOffice;
    }

    public String getSubDistrictCode() {
        return subDistrictCode;
    }

    public void setSubDistrictCode(String subDistrictCode) {
        this.subDistrictCode = subDistrictCode;
    }

    public String getSubOfficeCode() {
        return subOfficeCode;
    }

    public void setSubOfficeCode(String subOfficeCode) {
        this.subOfficeCode = subOfficeCode;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    public Date getEventDatetime() {
        return eventDatetime;
    }

    public void setEventDatetime(Date eventDatetime) {
        this.eventDatetime = eventDatetime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (officeCode != null ? officeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasOffice)) {
            return false;
        }
        MasOffice other = (MasOffice) object;
        if ((this.officeCode == null && other.officeCode != null) || (this.officeCode != null && !this.officeCode.equals(other.officeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasOffice[ officeCode=" + officeCode + " ]";
    }
    
}
