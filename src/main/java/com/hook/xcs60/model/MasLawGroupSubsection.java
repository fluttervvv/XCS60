/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"mas_law_group_subsection\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class MasLawGroupSubsection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\"SubSectionID\"")
    private Long subSectionID;
    @Basic(optional = false)
    @Column(name = "\"SubSectionNo\"")
    private BigInteger subSectionNo;
    @Column(name = "\"SubSectionType\"")
    private String subSectionType;
    @Column(name = "\"SubSectionDesc\"")
    private String subSectionDesc;
    @Basic(optional = false)
    @Column(name = "\"IsActive\"")
    private short isActive;
//    @JoinColumn(name = "\"SectionNo", referencedColumnName = "\"SectionNo\"")
//    @ManyToOne
//    private MasLawGroupSection sectionNo;
//    @OneToMany(mappedBy = "subSectionID")
//    private Collection<MasLawGroupSubsectionRule> masLawGroupSubsectionRuleCollection;
    
    @Column(name = "\"SectionNo\"")
    private Long sectionNo;

    public MasLawGroupSubsection() {
    }

    public MasLawGroupSubsection(Long subSectionID) {
        this.subSectionID = subSectionID;
    }

    public MasLawGroupSubsection(Long subSectionID, BigInteger subSectionNo, short isActive) {
        this.subSectionID = subSectionID;
        this.subSectionNo = subSectionNo;
        this.isActive = isActive;
    }

    public Long getSubSectionID() {
        return subSectionID;
    }

    public void setSubSectionID(Long subSectionID) {
        this.subSectionID = subSectionID;
    }

    public BigInteger getSubSectionNo() {
        return subSectionNo;
    }

    public void setSubSectionNo(BigInteger subSectionNo) {
        this.subSectionNo = subSectionNo;
    }

    public String getSubSectionType() {
        return subSectionType;
    }

    public void setSubSectionType(String subSectionType) {
        this.subSectionType = subSectionType;
    }

    public String getSubSectionDesc() {
        return subSectionDesc;
    }

    public void setSubSectionDesc(String subSectionDesc) {
        this.subSectionDesc = subSectionDesc;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

//    public MasLawGroupSection getSectionNo() {
//        return sectionNo;
//    }
//
//    public void setSectionNo(MasLawGroupSection sectionNo) {
//        this.sectionNo = sectionNo;
//    }

//    @XmlTransient
//    public Collection<MasLawGroupSubsectionRule> getMasLawGroupSubsectionRuleCollection() {
//        return masLawGroupSubsectionRuleCollection;
//    }
//
//    public void setMasLawGroupSubsectionRuleCollection(Collection<MasLawGroupSubsectionRule> masLawGroupSubsectionRuleCollection) {
//        this.masLawGroupSubsectionRuleCollection = masLawGroupSubsectionRuleCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subSectionID != null ? subSectionID.hashCode() : 0);
        return hash;
    }

    public Long getSectionNo() {
		return sectionNo;
	}

	public void setSectionNo(Long sectionNo) {
		this.sectionNo = sectionNo;
	}

	@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasLawGroupSubsection)) {
            return false;
        }
        MasLawGroupSubsection other = (MasLawGroupSubsection) object;
        if ((this.subSectionID == null && other.subSectionID != null) || (this.subSectionID != null && !this.subSectionID.equals(other.subSectionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasLawGroupSubsection[ subSectionID=" + subSectionID + " ]";
    }
    
}
