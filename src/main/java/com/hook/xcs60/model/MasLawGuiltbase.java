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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"mas_law_guiltbase\"", catalog = "", schema = "ILLEGAL60")
public class MasLawGuiltbase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\"GuiltBaseID\"")
    private Long guiltBaseID;
    @Basic(optional = false)
    @Column(name = "\"SubSectionRuleID\"")
    private long subSectionRuleID;
    @Basic(optional = false)
    @Column(name = "\"GuiltBaseName\"")
    private String guiltBaseName;
    @Basic(optional = false)
    @Column(name = "\"Fine\"")
    private double fine;
    @Basic(optional = false)
    @Column(name = "\"IsProve\"")
    private short isProve;
    @Column(name = "\"Remark\"")
    private String remark;
    @Basic(optional = false)
    @Column(name = "\"IsActive\"")
    private short isActive;
    @Column(name = "\"IsCompare\"")
    private short isCompare;
    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "guiltBaseID")
//    private Collection<OpsArrestIndictment> opsArrestIndictmentCollection;

    public MasLawGuiltbase() {
    }

    public MasLawGuiltbase(Long guiltBaseID) {
        this.guiltBaseID = guiltBaseID;
    }

    public MasLawGuiltbase(Long guiltBaseID, long subSectionRuleID, String guiltBaseName, double fine, short isProve, short isActive) {
        this.guiltBaseID = guiltBaseID;
        this.subSectionRuleID = subSectionRuleID;
        this.guiltBaseName = guiltBaseName;
        this.fine = fine;
        this.isProve = isProve;
        this.isActive = isActive;
    }

    public Long getGuiltBaseID() {
        return guiltBaseID;
    }

    public void setGuiltBaseID(Long guiltBaseID) {
        this.guiltBaseID = guiltBaseID;
    }

    public long getSubSectionRuleID() {
		return subSectionRuleID;
	}

	public void setSubSectionRuleID(long subSectionRuleID) {
		this.subSectionRuleID = subSectionRuleID;
	}

	public short getIsCompare() {
		return isCompare;
	}

	public void setIsCompare(short isCompare) {
		this.isCompare = isCompare;
	}

	public String getGuiltBaseName() {
        return guiltBaseName;
    }

    public void setGuiltBaseName(String guiltBaseName) {
        this.guiltBaseName = guiltBaseName;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public short getIsProve() {
        return isProve;
    }

    public void setIsProve(short isProve) {
        this.isProve = isProve;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

//    @XmlTransient
//    public Collection<OpsArrestIndictment> getOpsArrestIndictmentCollection() {
//        return opsArrestIndictmentCollection;
//    }
//
//    public void setOpsArrestIndictmentCollection(Collection<OpsArrestIndictment> opsArrestIndictmentCollection) {
//        this.opsArrestIndictmentCollection = opsArrestIndictmentCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guiltBaseID != null ? guiltBaseID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasLawGuiltbase)) {
            return false;
        }
        MasLawGuiltbase other = (MasLawGuiltbase) object;
        if ((this.guiltBaseID == null && other.guiltBaseID != null) || (this.guiltBaseID != null && !this.guiltBaseID.equals(other.guiltBaseID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasLawGuiltbase[ guiltBaseID=" + guiltBaseID + " ]";
    }
    
}
