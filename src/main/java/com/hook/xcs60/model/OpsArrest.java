/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(schema= "ILLEGAL60" ,name = "\"ops_arrest\"")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class OpsArrest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name ="\"ArrestCode\"")
    private String arrestCode;
    @Basic(optional = false)
    @Column(name ="\"ArrestDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrestDate;
    @Basic(optional = false)
    @Column(name ="\"ArrestTime\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrestTime;
    @Basic(optional = false)
    @Column(name ="\"OccurrenceDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date occurrenceDate;
    @Column(name ="\"OccurrenceTime\"")
    private String occurrenceTime;
    @Column(name ="\"ArrestStationCode\"")
    private String arrestStationCode;
    @Basic(optional = false)
    @Column(name ="\"ArrestStation\"")
    private String arrestStation;
    @Basic(optional = false)
    @Column(name ="\"HaveCulprit\"")
    private short haveCulprit;
    @Column(name ="\"Behaviour\"")
    private String behaviour;
    @Column(name ="\"Testimony\"")
    private String testimony;
    @Column(name ="\"Prompt\"")
    private String prompt;
    @Column(name ="\"IsMatchNotice\"")
    private String isMatchNotice;
    @Basic(optional = false)
    @Column(name ="\"ArrestDesc\"")
    private String arrestDesc;
    @Column(name ="\"InvestigationSurveyDocument\"")
    private String investigationSurveyDocument;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
    
    @Column(name = "\"NoticeCode\"")
    private String noticeCode;
    
 

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "arrestCode")
    private Collection<OpsArrestIndictment> opsArrestIndictmentCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "arrestCode")
    private Collection<OpsArrestLocale> opsArrestLocaleCollection;
    
    @OneToMany(mappedBy = "arrestCode")
    private Collection<OpsArrestProduct> opsArrestProductCollection;
    
    @OneToMany(mappedBy = "arrestCode")
    private Collection<OpsArrestLawbreaker> opsArrestLawbreakerCollection;
    

    @OneToMany(mappedBy = "arrestCode")
    private Collection<OpsArrestStaff> opsArrestStaffCollection;
    

    public OpsArrest() {
    }

    public OpsArrest(String arrestCode) {
        this.arrestCode = arrestCode;
    }

    public OpsArrest(String arrestCode, Date arrestDate, Date arrestTime, Date occurrenceDate, String arrestStation, short haveCulprit, String arrestDesc, short isActive) {
        this.arrestCode = arrestCode;
        this.arrestDate = arrestDate;
        this.arrestTime = arrestTime;
        this.occurrenceDate = occurrenceDate;
        this.arrestStation = arrestStation;
        this.haveCulprit = haveCulprit;
        this.arrestDesc = arrestDesc;
        this.isActive = isActive;
    }

    public String getNoticeCode() {
 		return noticeCode;
 	}

 	public void setNoticeCode(String noticeCode) {
 		this.noticeCode = noticeCode;
 	}
    
    
    public String getArrestCode() {
        return arrestCode;
    }

    public void setArrestCode(String arrestCode) {
        this.arrestCode = arrestCode;
    }

    public Date getArrestDate() {
        return arrestDate;
    }

    public void setArrestDate(Date arrestDate) {
        this.arrestDate = arrestDate;
    }

    public Date getArrestTime() {
        return arrestTime;
    }

    public void setArrestTime(Date arrestTime) {
        this.arrestTime = arrestTime;
    }

    public Date getOccurrenceDate() {
        return occurrenceDate;
    }

    public void setOccurrenceDate(Date occurrenceDate) {
        this.occurrenceDate = occurrenceDate;
    }

    public String getOccurrenceTime() {
        return occurrenceTime;
    }

    public void setOccurrenceTime(String occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }

    public String getArrestStationCode() {
        return arrestStationCode;
    }

    public void setArrestStationCode(String arrestStationCode) {
        this.arrestStationCode = arrestStationCode;
    }

    public String getArrestStation() {
        return arrestStation;
    }

    public void setArrestStation(String arrestStation) {
        this.arrestStation = arrestStation;
    }

    public short getHaveCulprit() {
        return haveCulprit;
    }

    public void setHaveCulprit(short haveCulprit) {
        this.haveCulprit = haveCulprit;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getTestimony() {
        return testimony;
    }

    public void setTestimony(String testimony) {
        this.testimony = testimony;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getIsMatchNotice() {
        return isMatchNotice;
    }

    public void setIsMatchNotice(String isMatchNotice) {
        this.isMatchNotice = isMatchNotice;
    }

    public String getArrestDesc() {
        return arrestDesc;
    }

    public void setArrestDesc(String arrestDesc) {
        this.arrestDesc = arrestDesc;
    }

    public String getInvestigationSurveyDocument() {
        return investigationSurveyDocument;
    }

    public void setInvestigationSurveyDocument(String investigationSurveyDocument) {
        this.investigationSurveyDocument = investigationSurveyDocument;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }
    
  
    
    public Collection<OpsArrestIndictment> getOpsArrestIndictmentCollection() {
        return opsArrestIndictmentCollection;
    }

    @JsonProperty("ArrestIndictment")
    public void setOpsArrestIndictmentCollection(Collection<OpsArrestIndictment> opsArrestIndictmentCollection) {
        this.opsArrestIndictmentCollection = opsArrestIndictmentCollection;
    }
    
    
    public Collection<OpsArrestLocale> getOpsArrestLocaleCollection() {
        return opsArrestLocaleCollection;
    }

    @JsonProperty("ArrestLocale")
    public void setOpsArrestLocaleCollection(Collection<OpsArrestLocale> opsArrestLocaleCollection) {
        this.opsArrestLocaleCollection = opsArrestLocaleCollection;
    }
    

    public Collection<OpsArrestProduct> getOpsArrestProductCollection() {
        return opsArrestProductCollection;
    }

    @JsonProperty("ArrestProduct")
    public void setOpsArrestProductCollection(Collection<OpsArrestProduct> opsArrestProductCollection) {
        this.opsArrestProductCollection = opsArrestProductCollection;
    }
    
    public Collection<OpsArrestLawbreaker> getOpsArrestLawbreakerCollection() {
        return opsArrestLawbreakerCollection;
    }

    @JsonProperty("ArrestLawbreaker")
    public void setOpsArrestLawbreakerCollection(Collection<OpsArrestLawbreaker> opsArrestLawbreakerCollection) {
        this.opsArrestLawbreakerCollection = opsArrestLawbreakerCollection;
    }

    public Collection<OpsArrestStaff> getOpsArrestStaffCollection() {
        return opsArrestStaffCollection;
    }

    @JsonProperty("ArrestStaff")
    public void setOpsArrestStaffCollection(Collection<OpsArrestStaff> opsArrestStaffCollection) {
        this.opsArrestStaffCollection = opsArrestStaffCollection;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arrestCode != null ? arrestCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsArrest)) {
            return false;
        }
        OpsArrest other = (OpsArrest) object;
        if ((this.arrestCode == null && other.arrestCode != null) || (this.arrestCode != null && !this.arrestCode.equals(other.arrestCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsArrest[ arrestCode=" + arrestCode + " ]";
    }
    
}
