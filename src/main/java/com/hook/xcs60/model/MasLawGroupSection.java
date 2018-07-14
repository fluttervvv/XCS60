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

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"mas_law_group_section\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class MasLawGroupSection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "\"SectionNo\"")
    private Long sectionNo;
    @Column(name = "\"SectionName\"")
    private String sectionName;
    @Column(name = "\"SectionDesc1\"")
    private String sectionDesc1;
    @Column(name = "\"IsActive\"")
    private Short isActive;
    @OneToMany(mappedBy = "sectionNo")
    private Collection<MasLawGroupSubsection> masLawGroupSubsectionCollection;
//    @JoinColumn(name = "LawGroupID", referencedColumnName = "LawGrouopID")
//    @ManyToOne
//    private MasLawGroup lawGroupID;
    
	@OneToMany(mappedBy = "subSectionID")
    private Collection<MasLawGroupSubsectionRule> masLawGroupSubsectionRuleCollection;
    
    @Column(name = "\"LawGroupID\"")
    private BigDecimal lawGroupID;
    
    @Column(name = "\"SectionDesc2\"")
    private String sectionDesc2;
    
    @Column(name = "\"SectionDesc3\"")
    private String sectionDesc3;

    public MasLawGroupSection() {
    }

    public MasLawGroupSection(Long sectionNo) {
        this.sectionNo = sectionNo;
    }

    public Long getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(Long sectionNo) {
        this.sectionNo = sectionNo;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionDesc1() {
        return sectionDesc1;
    }

    public void setSectionDesc1(String sectionDesc1) {
        this.sectionDesc1 = sectionDesc1;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    public BigDecimal getLawGroupID() {
		return lawGroupID;
	}

	public void setLawGroupID(BigDecimal lawGroupID) {
		this.lawGroupID = lawGroupID;
	}

	public String getSectionDesc2() {
		return sectionDesc2;
	}

	public void setSectionDesc2(String sectionDesc2) {
		this.sectionDesc2 = sectionDesc2;
	}

	public String getSectionDesc3() {
		return sectionDesc3;
	}

	public void setSectionDesc3(String sectionDesc3) {
		this.sectionDesc3 = sectionDesc3;
	}

//	@XmlTransient
    public Collection<MasLawGroupSubsection> getMasLawGroupSubsectionCollection() {
        return masLawGroupSubsectionCollection;
    }

    public void setMasLawGroupSubsectionCollection(Collection<MasLawGroupSubsection> masLawGroupSubsectionCollection) {
        this.masLawGroupSubsectionCollection = masLawGroupSubsectionCollection;
    }

  public Collection<MasLawGroupSubsectionRule> getMasLawGroupSubsectionRuleCollection() {
	  return masLawGroupSubsectionRuleCollection;
	}

	public void setMasLawGroupSubsectionRuleCollection(Collection<MasLawGroupSubsectionRule> masLawGroupSubsectionRuleCollection) {
	  this.masLawGroupSubsectionRuleCollection = masLawGroupSubsectionRuleCollection;
	}
    
//    public MasLawGroup getLawGroupID() {
//        return lawGroupID;
//    }
//
//    public void setLawGroupID(MasLawGroup lawGroupID) {
//        this.lawGroupID = lawGroupID;
//    }
  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sectionNo != null ? sectionNo.hashCode() : 0);
        return hash;
    }


	@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasLawGroupSection)) {
            return false;
        }
        MasLawGroupSection other = (MasLawGroupSection) object;
        if ((this.sectionNo == null && other.sectionNo != null) || (this.sectionNo != null && !this.sectionNo.equals(other.sectionNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasLawGroupSection[ sectionNo=" + sectionNo + " ]";
    }
    
}
