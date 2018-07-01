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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_arrest_product\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({ @NamedQuery(name = "OpsArrestProduct.findAll", query = "SELECT o FROM OpsArrestProduct o"),
		@NamedQuery(name = "OpsArrestProduct.findByProductID", query = "SELECT o FROM OpsArrestProduct o WHERE o.productID = :productID"),
		@NamedQuery(name = "OpsArrestProduct.findByProductType", query = "SELECT o FROM OpsArrestProduct o WHERE o.productType = :productType"),
		@NamedQuery(name = "OpsArrestProduct.findByGroupCode", query = "SELECT o FROM OpsArrestProduct o WHERE o.groupCode = :groupCode"),
		@NamedQuery(name = "OpsArrestProduct.findByIsDomestic", query = "SELECT o FROM OpsArrestProduct o WHERE o.isDomestic = :isDomestic"),
		@NamedQuery(name = "OpsArrestProduct.findByProductCode", query = "SELECT o FROM OpsArrestProduct o WHERE o.productCode = :productCode"),
		@NamedQuery(name = "OpsArrestProduct.findByBrandCode", query = "SELECT o FROM OpsArrestProduct o WHERE o.brandCode = :brandCode"),
		@NamedQuery(name = "OpsArrestProduct.findByBrandNameTH", query = "SELECT o FROM OpsArrestProduct o WHERE o.brandNameTH = :brandNameTH"),
		@NamedQuery(name = "OpsArrestProduct.findByBrandNameEN", query = "SELECT o FROM OpsArrestProduct o WHERE o.brandNameEN = :brandNameEN"),
		@NamedQuery(name = "OpsArrestProduct.findBySubBrandCode", query = "SELECT o FROM OpsArrestProduct o WHERE o.subBrandCode = :subBrandCode"),
		@NamedQuery(name = "OpsArrestProduct.findBySubBrandNameTH", query = "SELECT o FROM OpsArrestProduct o WHERE o.subBrandNameTH = :subBrandNameTH"),
		@NamedQuery(name = "OpsArrestProduct.findBySubBrandNameEN", query = "SELECT o FROM OpsArrestProduct o WHERE o.subBrandNameEN = :subBrandNameEN"),
		@NamedQuery(name = "OpsArrestProduct.findByModelCode", query = "SELECT o FROM OpsArrestProduct o WHERE o.modelCode = :modelCode"),
		@NamedQuery(name = "OpsArrestProduct.findByModelName", query = "SELECT o FROM OpsArrestProduct o WHERE o.modelName = :modelName"),
		@NamedQuery(name = "OpsArrestProduct.findByFixNo1", query = "SELECT o FROM OpsArrestProduct o WHERE o.fixNo1 = :fixNo1"),
		@NamedQuery(name = "OpsArrestProduct.findByDegreeCode", query = "SELECT o FROM OpsArrestProduct o WHERE o.degreeCode = :degreeCode"),
		@NamedQuery(name = "OpsArrestProduct.findByDegree", query = "SELECT o FROM OpsArrestProduct o WHERE o.degree = :degree"),
		@NamedQuery(name = "OpsArrestProduct.findBySizeCode", query = "SELECT o FROM OpsArrestProduct o WHERE o.sizeCode = :sizeCode"),
		@NamedQuery(name = "OpsArrestProduct.findBySize", query = "SELECT o FROM OpsArrestProduct o WHERE o.size = :size"),
		@NamedQuery(name = "OpsArrestProduct.findBySizeUnitCode", query = "SELECT o FROM OpsArrestProduct o WHERE o.sizeUnitCode = :sizeUnitCode"),
		@NamedQuery(name = "OpsArrestProduct.findBySizeUnitName", query = "SELECT o FROM OpsArrestProduct o WHERE o.sizeUnitName = :sizeUnitName"),
		@NamedQuery(name = "OpsArrestProduct.findByFixNo2", query = "SELECT o FROM OpsArrestProduct o WHERE o.fixNo2 = :fixNo2"),
		@NamedQuery(name = "OpsArrestProduct.findBySequenceNo", query = "SELECT o FROM OpsArrestProduct o WHERE o.sequenceNo = :sequenceNo"),
		@NamedQuery(name = "OpsArrestProduct.findByProductDesc", query = "SELECT o FROM OpsArrestProduct o WHERE o.productDesc = :productDesc"),
		@NamedQuery(name = "OpsArrestProduct.findByCarNo", query = "SELECT o FROM OpsArrestProduct o WHERE o.carNo = :carNo"),
		@NamedQuery(name = "OpsArrestProduct.findByQty", query = "SELECT o FROM OpsArrestProduct o WHERE o.qty = :qty"),
		@NamedQuery(name = "OpsArrestProduct.findByQtyUnit", query = "SELECT o FROM OpsArrestProduct o WHERE o.qtyUnit = :qtyUnit"),
		@NamedQuery(name = "OpsArrestProduct.findByNetVolume", query = "SELECT o FROM OpsArrestProduct o WHERE o.netVolume = :netVolume"),
		@NamedQuery(name = "OpsArrestProduct.findByNetVolumeUnit", query = "SELECT o FROM OpsArrestProduct o WHERE o.netVolumeUnit = :netVolumeUnit"),
		@NamedQuery(name = "OpsArrestProduct.findByIsActive", query = "SELECT o FROM OpsArrestProduct o WHERE o.isActive = :isActive") })

@SequenceGenerator(name = "productID_Sequence", schema= "ILLEGAL60", sequenceName = "\"ops_arrest_product_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsArrestProduct implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "\"ProductID\"")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productID_Sequence")
	private Long productID;
	@Basic(optional = false)
	@Column(name = "\"ProductType\"")
	private short productType;
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
	@Column(name = "\"CarNo\"")
	private String carNo;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "\"Qty\"")
	private Double qty;
	@Column(name = "\"QtyUnit\"")
	private Double qtyUnit;
	@Column(name = "\"NetVolume\"")
	private Double netVolume;
	@Column(name = "\"NetVolumeUnit\"")
	private Double netVolumeUnit;
	@Basic(optional = false)
	@Column(name = "\"IsActive\"")
	private short isActive;

	// @JoinColumn(name = "ArrestCode", referencedColumnName = "ArrestCode")
	// @ManyToOne
	// private OpsArrest arrestCode;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
	// private Collection<OpsArrestProductDetail> opsArrestProductDetailCollection;

	public OpsArrestProduct() {
	}

	public OpsArrestProduct(Long productID) {
		this.productID = productID;
	}
	public OpsArrestProduct(String productID) {
		this.productID = Long.valueOf(productID);
	}

	public OpsArrestProduct(Long productID, short productType, String groupCode, short isActive) {
		this.productID = productID;
		this.productType = productType;
		this.groupCode = groupCode;
		this.isActive = isActive;
	}

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public short getProductType() {
		return productType;
	}

	public void setProductType(short productType) {
		this.productType = productType;
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

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
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

	public Double getNetVolume() {
		return netVolume;
	}

	public void setNetVolume(Double netVolume) {
		this.netVolume = netVolume;
	}

	public Double getNetVolumeUnit() {
		return netVolumeUnit;
	}

	public void setNetVolumeUnit(Double netVolumeUnit) {
		this.netVolumeUnit = netVolumeUnit;
	}

	public short getIsActive() {
		return isActive;
	}

	public void setIsActive(short isActive) {
		this.isActive = isActive;
	}

	// public OpsArrest getArrestCode() {
	// return arrestCode;
	// }
	//
	// public void setArrestCode(OpsArrest arrestCode) {
	// this.arrestCode = arrestCode;
	// }
	//
	// public Collection<OpsArrestProductDetail>
	// getOpsArrestProductDetailCollection() {
	// return opsArrestProductDetailCollection;
	// }
	//
	// public void
	// setOpsArrestProductDetailCollection(Collection<OpsArrestProductDetail>
	// opsArrestProductDetailCollection) {
	// this.opsArrestProductDetailCollection = opsArrestProductDetailCollection;
	// }

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (productID != null ? productID.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof OpsArrestProduct)) {
			return false;
		}
		OpsArrestProduct other = (OpsArrestProduct) object;
		if ((this.productID == null && other.productID != null)
				|| (this.productID != null && !this.productID.equals(other.productID))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.hook.xcs60.model.OpsArrestProduct[ productID=" + productID + " ]";
	}

}
