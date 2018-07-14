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
@Table(name = "\"mas_province\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class MasProvince implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\"ProvinceCode\"")
    private String provinceCode;
    @Basic(optional = false)
    @Column(name = "\"ProvinceNameTH\"")
    private String provinceNameTH;
    @Column(name = "\"ProvinceNameEN\"")
    private String provinceNameEN;
    @Basic(optional = false)
    @Column(name = "\"IsActive\"")
    private short isActive;
    @Column(name = "\"EventDatetime\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDatetime;

    public MasProvince() {
    }

    public MasProvince(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public MasProvince(String provinceCode, String provinceNameTH, short isActive) {
        this.provinceCode = provinceCode;
        this.provinceNameTH = provinceNameTH;
        this.isActive = isActive;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceNameTH() {
        return provinceNameTH;
    }

    public void setProvinceNameTH(String provinceNameTH) {
        this.provinceNameTH = provinceNameTH;
    }

    public String getProvinceNameEN() {
        return provinceNameEN;
    }

    public void setProvinceNameEN(String provinceNameEN) {
        this.provinceNameEN = provinceNameEN;
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
        hash += (provinceCode != null ? provinceCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasProvince)) {
            return false;
        }
        MasProvince other = (MasProvince) object;
        if ((this.provinceCode == null && other.provinceCode != null) || (this.provinceCode != null && !this.provinceCode.equals(other.provinceCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasProvince[ provinceCode=" + provinceCode + " ]";
    }
    
}
