/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */

@Entity
@Table(name = "\"ops_arrest_indicment_detail\"", catalog = "", schema = "ILLEGAL60")
@NamedQueries({
		@NamedQuery(name = "OpsArrestIndicmentDetail.findAll", query = "SELECT o FROM OpsArrestIndicmentDetail o"),
		@NamedQuery(name = "OpsArrestIndicmentDetail.findByIndictmentDetailID", query = "SELECT o FROM OpsArrestIndicmentDetail o WHERE o.indictmentDetailID = :indictmentDetailID"),
		@NamedQuery(name = "OpsArrestIndicmentDetail.findByLawsuitType", query = "SELECT o FROM OpsArrestIndicmentDetail o WHERE o.lawsuitType = :lawsuitType"),
		@NamedQuery(name = "OpsArrestIndicmentDetail.findByIsActive", query = "SELECT o FROM OpsArrestIndicmentDetail o WHERE o.isActive = :isActive") })
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@SequenceGenerator(name = "indictmentDetailID_Sequence", schema = "ILLEGAL60", sequenceName = "\"ops_arrest_indicment_detail_S\"", initialValue = 1, allocationSize = 1)
public class OpsArrestIndicmentDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Id
	@Basic(optional = false)
	@Column(name = "\"IndictmentDetailID\"")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "indictmentDetailID_Sequence")
	private Long indictmentDetailID;
	@Column(name = "\"LawsuitType\"")
	private Short lawsuitType;
	@Column(name = "\"IsActive\"")
	private Short isActive;
	@JoinColumn(name = "\"IndictmentID\"", referencedColumnName = "\"IndictmentID\"")
	@ManyToOne(optional = false)
	private OpsArrestIndictment indictmentID;
	@JoinColumn(name = "\"LawbreakerID\"", referencedColumnName = "\"LawbreakerID\"")
	@ManyToOne(optional = false)
	private OpsArrestLawbreaker lawbreakerID;

	// @OneToMany(mappedBy = "indictmentDetailID")
	// private Collection<OpsLawsuitJudgement> opsLawsuitJudgementCollection;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "indictmentDetailID")
	// private Collection<OpsArrestProductDetail> opsArrestProductDetailCollection;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "indictmentDetailID")
	// private Collection<OpsCompareDetail> opsCompareDetailCollection;

	public OpsArrestIndicmentDetail() {
	}

	public OpsArrestIndicmentDetail(Long indictmentDetailID) {
		this.indictmentDetailID = indictmentDetailID;
	}
	
	public OpsArrestIndicmentDetail(String indictmentDetailID) {
		this.indictmentDetailID = Long.valueOf(indictmentDetailID);
	}

	public Long getIndictmentDetailID() {
		return indictmentDetailID;
	}

	public void setIndictmentDetailID(Long indictmentDetailID) {
		this.indictmentDetailID = indictmentDetailID;
	}

	public Short getLawsuitType() {
		return lawsuitType;
	}

	public void setLawsuitType(Short lawsuitType) {
		this.lawsuitType = lawsuitType;
	}

	public Short getIsActive() {
		return isActive;
	}

	public void setIsActive(Short isActive) {
		this.isActive = isActive;
	}

	public OpsArrestIndictment getIndictmentID() {
		return indictmentID;
	}

	public void setIndictmentID(OpsArrestIndictment indictmentID) {
		this.indictmentID = indictmentID;
	}

	@JsonProperty("Lawbreaker")
	public OpsArrestLawbreaker getLawbreakerID() {
		return lawbreakerID;
	}

	@JsonProperty("LawbreakerID")
	public void setLawbreakerID(OpsArrestLawbreaker lawbreakerID) {
		this.lawbreakerID = lawbreakerID;
	}
	//
	// @XmlTransient
	// public Collection<OpsLawsuitJudgement> getOpsLawsuitJudgementCollection() {
	// return opsLawsuitJudgementCollection;
	// }
	//
	// public void setOpsLawsuitJudgementCollection(Collection<OpsLawsuitJudgement>
	// opsLawsuitJudgementCollection) {
	// this.opsLawsuitJudgementCollection = opsLawsuitJudgementCollection;
	// }
	//
	// @XmlTransient
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
	//
	// @XmlTransient
	// public Collection<OpsCompareDetail> getOpsCompareDetailCollection() {
	// return opsCompareDetailCollection;
	// }
	//
	// public void setOpsCompareDetailCollection(Collection<OpsCompareDetail>
	// opsCompareDetailCollection) {
	// this.opsCompareDetailCollection = opsCompareDetailCollection;
	// }

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (indictmentDetailID != null ? indictmentDetailID.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof OpsArrestIndicmentDetail)) {
			return false;
		}
		OpsArrestIndicmentDetail other = (OpsArrestIndicmentDetail) object;
		if ((this.indictmentDetailID == null && other.indictmentDetailID != null)
				|| (this.indictmentDetailID != null && !this.indictmentDetailID.equals(other.indictmentDetailID))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.hook.xcs60.model.OpsArrestIndicmentDetail[ indictmentDetailID=" + indictmentDetailID + " ]";
	}

}
