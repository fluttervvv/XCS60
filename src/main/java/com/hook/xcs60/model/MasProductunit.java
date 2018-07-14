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

/**
 *
 * @author thanatep_s
 */
@Entity
@Table(name = "\"mas_productunit\"", catalog = "", schema = "ILLEGAL60")
public class MasProductunit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\"ProductUnitCode\"")
    private String productUnitCode;
    @Column(name = "\"ProductUnitNameTH\"")
    private String productUnitNameTH;
    @Column(name = "\"ProductUnitNameEN\"")
    private String productUnitNameEN;
    @Column(name = "\"ProductUnitShortName\"")
    private String productUnitShortName;
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

    public MasProductunit() {
    }

    public MasProductunit(String productUnitCode) {
        this.productUnitCode = productUnitCode;
    }

    public MasProductunit(String productUnitCode, short isActive) {
        this.productUnitCode = productUnitCode;
        this.isActive = isActive;
    }

    public String getProductUnitCode() {
        return productUnitCode;
    }

    public void setProductUnitCode(String productUnitCode) {
        this.productUnitCode = productUnitCode;
    }

    public String getProductUnitNameTH() {
        return productUnitNameTH;
    }

    public void setProductUnitNameTH(String productUnitNameTH) {
        this.productUnitNameTH = productUnitNameTH;
    }

    public String getProductUnitNameEN() {
        return productUnitNameEN;
    }

    public void setProductUnitNameEN(String productUnitNameEN) {
        this.productUnitNameEN = productUnitNameEN;
    }

    public String getProductUnitShortName() {
        return productUnitShortName;
    }

    public void setProductUnitShortName(String productUnitShortName) {
        this.productUnitShortName = productUnitShortName;
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
        hash += (productUnitCode != null ? productUnitCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasProductunit)) {
            return false;
        }
        MasProductunit other = (MasProductunit) object;
        if ((this.productUnitCode == null && other.productUnitCode != null) || (this.productUnitCode != null && !this.productUnitCode.equals(other.productUnitCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasProductunit[ productUnitCode=" + productUnitCode + " ]";
    }
    
}
