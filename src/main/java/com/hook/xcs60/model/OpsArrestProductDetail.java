/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_arrest_product_detail\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "OpsArrestProductDetail.findAll", query = "SELECT o FROM OpsArrestProductDetail o")
    , @NamedQuery(name = "OpsArrestProductDetail.findByProductDetailID", query = "SELECT o FROM OpsArrestProductDetail o WHERE o.productDetailID = :productDetailID")
    , @NamedQuery(name = "OpsArrestProductDetail.findByQty", query = "SELECT o FROM OpsArrestProductDetail o WHERE o.qty = :qty")
    , @NamedQuery(name = "OpsArrestProductDetail.findByQtyUnit", query = "SELECT o FROM OpsArrestProductDetail o WHERE o.qtyUnit = :qtyUnit")
    , @NamedQuery(name = "OpsArrestProductDetail.findBySize", query = "SELECT o FROM OpsArrestProductDetail o WHERE o.size = :size")
    , @NamedQuery(name = "OpsArrestProductDetail.findBySizeUnit", query = "SELECT o FROM OpsArrestProductDetail o WHERE o.sizeUnit = :sizeUnit")
    , @NamedQuery(name = "OpsArrestProductDetail.findByVolume", query = "SELECT o FROM OpsArrestProductDetail o WHERE o.volume = :volume")
    , @NamedQuery(name = "OpsArrestProductDetail.findByVolumeUnit", query = "SELECT o FROM OpsArrestProductDetail o WHERE o.volumeUnit = :volumeUnit")
    , @NamedQuery(name = "OpsArrestProductDetail.findByMistreatRate", query = "SELECT o FROM OpsArrestProductDetail o WHERE o.mistreatRate = :mistreatRate")
    , @NamedQuery(name = "OpsArrestProductDetail.findByFine", query = "SELECT o FROM OpsArrestProductDetail o WHERE o.fine = :fine")
    , @NamedQuery(name = "OpsArrestProductDetail.findByIsActive", query = "SELECT o FROM OpsArrestProductDetail o WHERE o.isActive = :isActive")})
public class OpsArrestProductDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name ="\"ProductDetailID\"")
    @GeneratedValue(strategy=GenerationType.SEQUENCE ,generator = "id_Sequence")
    private Long productDetailID;
    @Column(name ="\"IsProdcutCo\"")
    private String isProdcutCo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name ="\"Qty\"")
    private Double qty;
    @Column(name ="\"QtyUnit\"")
    private Double qtyUnit;
    @Column(name ="\"Size\"")
    private Double size;
    @Column(name ="\"SizeUnit\"")
    private Double sizeUnit;
    @Column(name ="\"Volume\"")
    private Double volume;
    @Column(name ="\"VolumeUnit\"")
    private Double volumeUnit;
    @Column(name ="\"MistreatRate\"")
    private String mistreatRate;
    @Column(name ="\"Fine\"")
    private String fine;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
//    @JoinColumn(name = "IndictmentDetailID", referencedColumnName = "IndictmentDetailID")
//    @ManyToOne(optional = false)
//    private OpsArrestIndicmentDetail indictmentDetailID;
    @JoinColumn(name = "\"ProductID\"", referencedColumnName = "\"ProductID\"")
    @ManyToOne(optional = false)
    private OpsArrestProduct productID;

    public OpsArrestProductDetail() {
    }

    public OpsArrestProductDetail(Long productDetailID) {
        this.productDetailID = productDetailID;
    }

    public OpsArrestProductDetail(Long productDetailID, short isActive) {
        this.productDetailID = productDetailID;
        this.isActive = isActive;
    }

    public Long getProductDetailID() {
        return productDetailID;
    }

    public void setProductDetailID(Long productDetailID) {
        this.productDetailID = productDetailID;
    }

    public String getIsProdcutCo() {
        return isProdcutCo;
    }

    public void setIsProdcutCo(String isProdcutCo) {
        this.isProdcutCo = isProdcutCo;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getQtyUnit() {
        return qtyUnit;
    }

    public void setQtyUnit(Double qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getSizeUnit() {
        return sizeUnit;
    }

    public void setSizeUnit(Double sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getVolumeUnit() {
        return volumeUnit;
    }

    public void setVolumeUnit(Double volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    public String getMistreatRate() {
        return mistreatRate;
    }

    public void setMistreatRate(String mistreatRate) {
        this.mistreatRate = mistreatRate;
    }

    public String getFine() {
        return fine;
    }

    public void setFine(String fine) {
        this.fine = fine;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

//    public OpsArrestIndicmentDetail getIndictmentDetailID() {
//        return indictmentDetailID;
//    }
//
//    public void setIndictmentDetailID(OpsArrestIndicmentDetail indictmentDetailID) {
//        this.indictmentDetailID = indictmentDetailID;
//    }

    public OpsArrestProduct getProductID() {
        return productID;
    }

    public void setProductID(OpsArrestProduct productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productDetailID != null ? productDetailID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsArrestProductDetail)) {
            return false;
        }
        OpsArrestProductDetail other = (OpsArrestProductDetail) object;
        if ((this.productDetailID == null && other.productDetailID != null) || (this.productDetailID != null && !this.productDetailID.equals(other.productDetailID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsArrestProductDetail[ productDetailID=" + productDetailID + " ]";
    }
    
}
