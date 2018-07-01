/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"mas_subdistrict\"", catalog = "", schema = "ILLEGAL60")
@NamedQueries({
    @NamedQuery(name = "MasSubdistrict.findAll", query = "SELECT m FROM MasSubdistrict m")
    , @NamedQuery(name = "MasSubdistrict.findBySubdistrictCode", query = "SELECT m FROM MasSubdistrict m WHERE m.subdistrictCode = :subdistrictCode")
    , @NamedQuery(name = "MasSubdistrict.findBySubdistrictNameTH", query = "SELECT m FROM MasSubdistrict m WHERE m.subdistrictNameTH = :subdistrictNameTH")
    , @NamedQuery(name = "MasSubdistrict.findBySubdistrictNameEN", query = "SELECT m FROM MasSubdistrict m WHERE m.subdistrictNameEN = :subdistrictNameEN")
    , @NamedQuery(name = "MasSubdistrict.findByDistrictCode", query = "SELECT m FROM MasSubdistrict m WHERE m.districtCode = :districtCode")
    , @NamedQuery(name = "MasSubdistrict.findByOffCode", query = "SELECT m FROM MasSubdistrict m WHERE m.offCode = :offCode")
    , @NamedQuery(name = "MasSubdistrict.findByRdbCode", query = "SELECT m FROM MasSubdistrict m WHERE m.rdbCode = :rdbCode")
    , @NamedQuery(name = "MasSubdistrict.findByIsActive", query = "SELECT m FROM MasSubdistrict m WHERE m.isActive = :isActive")
    , @NamedQuery(name = "MasSubdistrict.findByEventDatetime", query = "SELECT m FROM MasSubdistrict m WHERE m.eventDatetime = :eventDatetime")})
public class MasSubdistrict implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name ="\"SubdistrictCode\"")
    private String subdistrictCode;
    @Basic(optional = false)
    @Column(name ="\"SubdistrictNameTH\"")
    private String subdistrictNameTH;
    @Column(name ="\"SubdistrictNameEN\"")
    private String subdistrictNameEN;
    @Basic(optional = false)
    @Column(name ="\"DistrictCode\"")
    private String districtCode;
    @Column(name ="\"OffCode\"")
    private String offCode;
    @Column(name ="\"RdbCode\"")
    private String rdbCode;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
    @Column(name ="\"EventDatetime\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDatetime;

    public MasSubdistrict() {
    }

    public MasSubdistrict(String subdistrictCode) {
        this.subdistrictCode = subdistrictCode;
    }

    public MasSubdistrict(String subdistrictCode, String subdistrictNameTH, String districtCode, short isActive) {
        this.subdistrictCode = subdistrictCode;
        this.subdistrictNameTH = subdistrictNameTH;
        this.districtCode = districtCode;
        this.isActive = isActive;
    }

    public String getSubdistrictCode() {
        return subdistrictCode;
    }

    public void setSubdistrictCode(String subdistrictCode) {
        this.subdistrictCode = subdistrictCode;
    }

    public String getSubdistrictNameTH() {
        return subdistrictNameTH;
    }

    public void setSubdistrictNameTH(String subdistrictNameTH) {
        this.subdistrictNameTH = subdistrictNameTH;
    }

    public String getSubdistrictNameEN() {
        return subdistrictNameEN;
    }

    public void setSubdistrictNameEN(String subdistrictNameEN) {
        this.subdistrictNameEN = subdistrictNameEN;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getOffCode() {
        return offCode;
    }

    public void setOffCode(String offCode) {
        this.offCode = offCode;
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

    public Date getEventDatetime() {
        return eventDatetime;
    }

    public void setEventDatetime(Date eventDatetime) {
        this.eventDatetime = eventDatetime;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subdistrictCode != null ? subdistrictCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasSubdistrict)) {
            return false;
        }
        MasSubdistrict other = (MasSubdistrict) object;
        if ((this.subdistrictCode == null && other.subdistrictCode != null) || (this.subdistrictCode != null && !this.subdistrictCode.equals(other.subdistrictCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasSubdistrict[ subdistrictCode=" + subdistrictCode + " ]";
    }
    
}
