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
@Table(name = "\"mas_product\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class MasProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\"ProductID\"")
    private Long productID;
    @Basic(optional = false)
    @Column(name = "\"GroupCode\"")
    private String groupCode;
    @Column(name = "\"IsDomestic\"")
    private Short isDomestic;
    @Column(name = "\"ProductCode\"")
    private String productCode;
    @Column(name = "\"BrandCode\"")
    private String brandCode;
    @Column(name = "\"BrandNameTH\"")
    private String brandNameTH;
    @Column(name = "\"BrandNameEN\"")
    private String brandNameEN;
    @Column(name = "\"SubBrandCode\"")
    private String subBrandCode;
    @Column(name = "\"SubBrandNameTH\"")
    private String subBrandNameTH;
    @Column(name = "\"SubBrandNameEN\"")
    private String subBrandNameEN;
    @Column(name = "\"ModelCode\"")
    private String modelCode;
    @Column(name = "\"ModelName\"")
    private String modelName;
    @Column(name = "\"FixNo1\"")
    private Short fixNo1;
    @Column(name = "\"DegreeCode\"")
    private String degreeCode;
    @Column(name = "\"Degree\"")
    private Short degree;
    @Column(name = "\"SizeCode\"")
    private String sizeCode;
    @Column(name = "\"Size\"")
    private String size;
    @Column(name = "\"SizeUnitCode\"")
    private String sizeUnitCode;
    @Column(name = "\"SizeUnitName\"")
    private String sizeUnitName;
    @Column(name = "\"FixNo2\"")
    private Short fixNo2;
    @Column(name = "\"SequenceNo\"")
    private String sequenceNo;
    @Column(name = "\"ProductDesc\"")
    private String productDesc;
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

    public MasProduct() {
    }

    public MasProduct(Long productID) {
        this.productID = productID;
    }

    public MasProduct(Long productID, String groupCode, short isActive) {
        this.productID = productID;
        this.groupCode = groupCode;
        this.isActive = isActive;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Short getIsDomestic() {
        return isDomestic;
    }

    public void setIsDomestic(Short isDomestic) {
        this.isDomestic = isDomestic;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandNameTH() {
        return brandNameTH;
    }

    public void setBrandNameTH(String brandNameTH) {
        this.brandNameTH = brandNameTH;
    }

    public String getBrandNameEN() {
        return brandNameEN;
    }

    public void setBrandNameEN(String brandNameEN) {
        this.brandNameEN = brandNameEN;
    }

    public String getSubBrandCode() {
        return subBrandCode;
    }

    public void setSubBrandCode(String subBrandCode) {
        this.subBrandCode = subBrandCode;
    }

    public String getSubBrandNameTH() {
        return subBrandNameTH;
    }

    public void setSubBrandNameTH(String subBrandNameTH) {
        this.subBrandNameTH = subBrandNameTH;
    }

    public String getSubBrandNameEN() {
        return subBrandNameEN;
    }

    public void setSubBrandNameEN(String subBrandNameEN) {
        this.subBrandNameEN = subBrandNameEN;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Short getFixNo1() {
        return fixNo1;
    }

    public void setFixNo1(Short fixNo1) {
        this.fixNo1 = fixNo1;
    }

    public String getDegreeCode() {
        return degreeCode;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    public Short getDegree() {
        return degree;
    }

    public void setDegree(Short degree) {
        this.degree = degree;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSizeUnitCode() {
        return sizeUnitCode;
    }

    public void setSizeUnitCode(String sizeUnitCode) {
        this.sizeUnitCode = sizeUnitCode;
    }

    public String getSizeUnitName() {
        return sizeUnitName;
    }

    public void setSizeUnitName(String sizeUnitName) {
        this.sizeUnitName = sizeUnitName;
    }

    public Short getFixNo2() {
        return fixNo2;
    }

    public void setFixNo2(Short fixNo2) {
        this.fixNo2 = fixNo2;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
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
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasProduct)) {
            return false;
        }
        MasProduct other = (MasProduct) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasProduct[ productID=" + productID + " ]";
    }
    
}
