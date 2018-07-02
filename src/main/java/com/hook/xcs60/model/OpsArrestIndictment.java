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

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_arrest_indictment\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@SequenceGenerator(name = "indictmentID_Sequence", schema = "ILLEGAL60", sequenceName = "\"ops_indictment_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsArrestIndictment implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "\"IndictmentID\"")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "indictmentID_Sequence")
    private Long indictmentID;
    
    @Column(name = "\"IsProve\"")
    private Short isProve;
    @Column(name = "\"IsActive\"")
    private Short isActive;
    
   

	@Column(name ="\"GuiltBaseID\"")
    private Long guiltBaseID ; 
    
    
    @Column(name  ="\"ArrestCode\"")
    private String arrestCode;
    
    
    public Long getGuiltBaseID() {
		return guiltBaseID;
	}

	public void setGuiltBaseID(Long guiltBaseID) {
		this.guiltBaseID = guiltBaseID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setArrestCode(String arrestCode) {
		this.arrestCode = arrestCode;
	}
    
//    @JoinColumn(name = "GuiltBaseID", referencedColumnName = "GuiltBaseID")
//    @ManyToOne(optional = false)
//    private MasLawGuiltbase guiltBaseID;
//    @JoinColumn(name = "ArrestCode", referencedColumnName = "ArrestCode")
//    @ManyToOne(optional = false)
//    private OpsArrest arrestCode;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "indictmentID")
//    private Collection<OpsLawsuit> opsLawsuitCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "indictmentID")
	private Collection<OpsArrestIndicmentDetail> opsArrestIndicmentDetailCollection;
//    @OneToMany(mappedBy = "indictmentID")
//    private Collection<OpsProve> opsProveCollection;
    
    

    public OpsArrestIndictment() {
    }

    public OpsArrestIndictment(Long indictmentID) {
        this.indictmentID = indictmentID;
    }

    public Long getIndictmentID() {
        return indictmentID;
    }

    public void setIndictmentID(Long indictmentID) {
        this.indictmentID = indictmentID;
    }

    public Short getIsProve() {
        return isProve;
    }

    public void setIsProve(Short isProve) {
        this.isProve = isProve;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    
//    public MasLawGuiltbase getGuiltBaseID() {
//        return guiltBaseID;
//    }
//
//    public void setGuiltBaseID(MasLawGuiltbase guiltBaseID) {
//        this.guiltBaseID = guiltBaseID;
//    }

//    public OpsArrest getArrestCode() {
//        return arrestCode;
//    }
//
//    public void setArrestCode(OpsArrest arrestCode) {
//        this.arrestCode = arrestCode;
//    }

//    @XmlTransient
//    public Collection<OpsLawsuit> getOpsLawsuitCollection() {
//        return opsLawsuitCollection;
//    }
//
//    public void setOpsLawsuitCollection(Collection<OpsLawsuit> opsLawsuitCollection) {
//        this.opsLawsuitCollection = opsLawsuitCollection;
//    }
//
    
    public Collection<OpsArrestIndicmentDetail> getOpsArrestIndicmentDetailCollection() {
        return opsArrestIndicmentDetailCollection;
    }

    public void setOpsArrestIndicmentDetailCollection(Collection<OpsArrestIndicmentDetail> opsArrestIndicmentDetailCollection) {
        this.opsArrestIndicmentDetailCollection = opsArrestIndicmentDetailCollection;
    }
//
//    @XmlTransient
//    public Collection<OpsProve> getOpsProveCollection() {
//        return opsProveCollection;
//    }
//
//    public void setOpsProveCollection(Collection<OpsProve> opsProveCollection) {
//        this.opsProveCollection = opsProveCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indictmentID != null ? indictmentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsArrestIndictment)) {
            return false;
        }
        OpsArrestIndictment other = (OpsArrestIndictment) object;
        if ((this.indictmentID == null && other.indictmentID != null) || (this.indictmentID != null && !this.indictmentID.equals(other.indictmentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsArrestIndictment[ indictmentID=" + indictmentID + " ]";
    }
    
}
