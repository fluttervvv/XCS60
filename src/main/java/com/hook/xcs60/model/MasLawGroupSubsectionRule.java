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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"mas_law_group_subsection_rule\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class MasLawGroupSubsectionRule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\"SubSectionRuleID\"")
    private Long subSectionRuleID;
    @Basic(optional = false)
    @Column(name = "\"IsActive\"")
    private short isActive;
//    @JoinColumn(name = "SubSectionID", referencedColumnName = "SubSectionID")
//    @ManyToOne
//    private MasLawGroupSubsection subSectionID;
    
    @Column(name = "\"SubSectionID\"")
    private short subSectionID;
    
    @Column(name = "\"SectionNo\"")
    private short sectionNo;
    
    public MasLawGroupSubsectionRule() {
    }

    public MasLawGroupSubsectionRule(Long subSectionRuleID) {
        this.subSectionRuleID = subSectionRuleID;
    }

    public MasLawGroupSubsectionRule(Long subSectionRuleID, short isActive) {
        this.subSectionRuleID = subSectionRuleID;
        this.isActive = isActive;
    }

    

    public Long getSubSectionRuleID() {
		return subSectionRuleID;
	}

	public void setSubSectionRuleID(Long subSectionRuleID) {
		this.subSectionRuleID = subSectionRuleID;
	}

	public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

//    public MasLawGroupSubsection getSubSectionID() {
//        return subSectionID;
//    }
//
//    public void setSubSectionID(MasLawGroupSubsection subSectionID) {
//        this.subSectionID = subSectionID;
//    }

    
    public short getSubSectionID() {
		return subSectionID;
	}

	public void setSubSectionID(short subSectionID) {
		this.subSectionID = subSectionID;
	}
	
    public short getSectionNo() {
		return sectionNo;
	}

    @JsonIgnore
	public void setSectionNo(short sectionNo) {
		this.sectionNo = sectionNo;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (subSectionRuleID != null ? subSectionRuleID.hashCode() : 0);
        return hash;
    }

	@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasLawGroupSubsectionRule)) {
            return false;
        }
        MasLawGroupSubsectionRule other = (MasLawGroupSubsectionRule) object;
        if ((this.subSectionRuleID == null && other.subSectionRuleID != null) || (this.subSectionRuleID != null && !this.subSectionRuleID.equals(other.subSectionRuleID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasLawGroupSubsectionRule[ subSectionDetailID=" + subSectionRuleID + " ]";
    }
    
}
