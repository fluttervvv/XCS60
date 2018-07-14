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

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author thanatep_s
 */
@Entity
@Table(name = "\"mas_district\"", catalog = "", schema = "ILLEGAL60")

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class MasDistrict implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\"DistrictCode\"")
    private String districtCode;
    @Basic(optional = false)
    @Column(name = "\"DistrictNameTH\"")
    private String districtNameTH;
    @Column(name = "\"DistrictNameEN\"")
    private String districtNameEN;
    @Column(name = "\"ProvinceCode\"")
    private String provinceCode;
    @Column(name = "\"OfficeCode\"")
    private String officeCode;
    @Column(name = "\"RdbCode\"")
    private String rdbCode;
    @Basic(optional = false)
    @Column(name = "\"IsActive\"")
    private short isActive;
    @Column(name = "\"EventDateTime\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDateTime;

    public MasDistrict() {
    }

    public MasDistrict(String districtCode) {
        this.districtCode = districtCode;
    }

    public MasDistrict(String districtCode, String districtNameTH, short isActive) {
        this.districtCode = districtCode;
        this.districtNameTH = districtNameTH;
        this.isActive = isActive;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictNameTH() {
        return districtNameTH;
    }

    public void setDistrictNameTH(String districtNameTH) {
        this.districtNameTH = districtNameTH;
    }

    public String getDistrictNameEN() {
        return districtNameEN;
    }

    public void setDistrictNameEN(String districtNameEN) {
        this.districtNameEN = districtNameEN;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getRdbCode() {
        return rdbCode;
    }

    public void setRdbCode(String rdbCode) {
        this.rdbCode = rdbCode;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    public Date getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(Date eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (districtCode != null ? districtCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasDistrict)) {
            return false;
        }
        MasDistrict other = (MasDistrict) object;
        if ((this.districtCode == null && other.districtCode != null) || (this.districtCode != null && !this.districtCode.equals(other.districtCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasDistrict[ districtCode=" + districtCode + " ]";
    }
    
}
