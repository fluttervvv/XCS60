/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_arrest_lawbreaker\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@SequenceGenerator(name = "lawbreakerID_Sequence", schema = "ILLEGAL60",sequenceName = "\"ops_arrest_lawbreaker_SEQ\"", initialValue = 1, allocationSize = 1)
public class OpsArrestLawbreaker implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "lawbreakerID_Sequence")
    @Column(name ="\"LawbreakerID\"")
    private BigDecimal lawbreakerID;
    @Basic(optional = false)
    @Column(name ="\"EntityType\"")
    private short entityType;
    @Column(name ="\"CompanyTitleCode\"")
    private String companyTitleCode;
    @Column(name ="\"CompanyTitle\"")
    private String companyTitle;
    @Column(name ="\"CompanyName\"")
    private String companyName;
    @Column(name ="\"CompanyOtherName\"")
    private String companyOtherName;
    @Column(name ="\"CompanyRegistrationNo\"")
    private String companyRegistrationNo;
    @Column(name ="\"CompanyLicenseNo\"")
    private String companyLicenseNo;
    @Column(name ="\"FoundedDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date foundedDate;
    @Column(name ="\"LicenseDateForm\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date licenseDateForm;
    @Column(name ="\"LicenseDateTo\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date licenseDateTo;
    @Column(name ="\"TaxID\"")
    private String taxID;
    @Column(name ="\"ExciseRegNo\"")
    private String exciseRegNo;
    @Basic(optional = false)
    @Column(name ="\"LawbreakerType\"")
    private short lawbreakerType;
    @Column(name ="\"LawbreakerTitleCode\"")
    private String lawbreakerTitleCode;
    @Column(name ="\"LawbreakerTitleName\"")
    private String lawbreakerTitleName;
    @Basic(optional = false)
    @Column(name ="\"LawbreakerFirstName\"")
    private String lawbreakerFirstName;
    @Column(name ="\"LawbreakerMiddleName\"")
    private String lawbreakerMiddleName;
    @Basic(optional = false)
    @Column(name ="\"LawbreakerLastName\"")
    private String lawbreakerLastName;
    @Column(name ="\"LawbreakerOtherName\"")
    private String lawbreakerOtherName;
    @Column(name ="\"LawbreakerDesc\"")
    private String lawbreakerDesc;
    @Basic(optional = false)
    @Column(name ="\"IDCard\"")
    @JsonProperty("IDCard")
    private String iDCard;
    @Column(name ="\"PassportNo\"")
    private String passportNo;
    @Column(name ="\"VISAType\"")
    private Short vISAType;
    @Column(name ="\"PassportCountryCode\"")
    private String passportCountryCode;
    @Column(name ="\"PassportCountryName\"")
    private String passportCountryName;
    @Column(name ="\"PassportDateIn\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date passportDateIn;
    @Column(name ="\"PassportDateOut\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date passportDateOut;
    @Basic(optional = false)
    @Column(name ="\"BirthDate\"")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Basic(optional = false)
    @Column(name ="\"GenderType\"")
    private Character genderType;
    @Column(name ="\"BloodType\"")
    private String bloodType;
    @Basic(optional = false)
    @Column(name ="\"NationalityCode\"")
    private String nationalityCode;
    @Column(name ="\"NationalityNameTH\"")
    private String nationalityNameTH;
    @Basic(optional = false)
    @Column(name ="\"RaceCode\"")
    private String raceCode;
    @Column(name ="\"RaceName\"")
    private String raceName;
    @Column(name ="\"ReligionCode\"")
    private String religionCode;
    @Column(name ="\"ReligionName\"")
    private String religionName;
    @Basic(optional = false)
    @Column(name ="\"MaritalStatus\"")
    private String maritalStatus;
    @Column(name ="\"Career\"")
    private String career;
    @Column(name ="\"CoordinateX\"")
    private String coordinateX;
    @Column(name ="\"CoordinateY\"")
    private String coordinateY;
    @Column(name ="\"Location\"")
    private String location;
    @Column(name ="\"Address\"")
    private String address;
    @Column(name ="\"Village\"")
    private String village;
    @Column(name ="\"Building\"")
    private String building;
    @Column(name ="\"Floor\"")
    private String floor;
    @Column(name ="\"Room\"")
    private String room;
    @Column(name ="\"Alley\"")
    private String alley;
    @Column(name ="\"Road\"")
    private String road;
    @Column(name ="\"SubDistrictCode\"")
    private String subDistrictCode;
    @Column(name ="\"SubDistrict\"")
    private String subDistrict;
    @Column(name ="\"DistrictCode\"")
    private String districtCode;
    @Column(name ="\"District\"")
    private String district;
    @Column(name ="\"ProvinceCode\"")
    private String provinceCode;
    @Column(name ="\"Province\"")
    private String province;
    @Column(name ="\"ZipCode\"")
    private String zipCode;
    @Column(name ="\"TelephoneNo\"")
    private String telephoneNo;
    @Column(name ="\"Email\"")
    private String email;
    @Column(name ="\"FatherName\"")
    private String fatherName;
    @Column(name ="\"MotherName\"")
    private String motherName;
    @Column(name ="\"Remarks\"")
    private String remarks;
    @Column(name ="\"LinkPhoto\"")
    private String linkPhoto;
    @Column(name ="\"PhotoDesc\"")
    private String photoDesc;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lawbreakerID")
//    private Collection<OpsArrestIndicmentDetail> opsArrestIndicmentDetailCollection;
//    @JoinColumn(name = "LawbreakerRefID", referencedColumnName = "LawbreakerID")
//    @ManyToOne(optional = false)
//    private MasLawbreaker lawbreakerRefID;
//    @JoinColumn(name = "ArrestCode", referencedColumnName = "ArrestCode")
//    @ManyToOne
//    private OpsArrest arrestCode;

    @Column(name = "\"ArrestCode\"")
    private String arrestCode;
    @Column(name = "\"LawbreakerRefID\"")
    private String lawbreakerRefID;
    
    @Transient
    @JsonProperty("ArrestLawBreakerAddress")
    private List<OpsArrestLawbreakerAddress> arrestLawBreakerAddressList; 
    
    public OpsArrestLawbreaker() {
    }

    public OpsArrestLawbreaker(BigDecimal lawbreakerID) {
        this.lawbreakerID = lawbreakerID;
    }
    
    public OpsArrestLawbreaker(Long lawbreakerID) {
        this.lawbreakerID = new BigDecimal(lawbreakerID);
    }
    
    public OpsArrestLawbreaker(String lawbreakerID) {
        this.lawbreakerID = new BigDecimal(lawbreakerID);
    }
    
    
    
    
    

    public OpsArrestLawbreaker(BigDecimal lawbreakerID, short entityType, short lawbreakerType, String lawbreakerFirstName, String lawbreakerLastName, String iDCard, Date birthDate, Character genderType, String nationalityCode, String raceCode, String maritalStatus, short isActive) {
        this.lawbreakerID = lawbreakerID;
        this.entityType = entityType;
        this.lawbreakerType = lawbreakerType;
        this.lawbreakerFirstName = lawbreakerFirstName;
        this.lawbreakerLastName = lawbreakerLastName;
        this.iDCard = iDCard;
        this.birthDate = birthDate;
        this.genderType = genderType;
        this.nationalityCode = nationalityCode;
        this.raceCode = raceCode;
        this.maritalStatus = maritalStatus;
        this.isActive = isActive;
    }

    public BigDecimal getLawbreakerID() {
        return lawbreakerID;
    }

    public void setLawbreakerID(BigDecimal lawbreakerID) {
        this.lawbreakerID = lawbreakerID;
    }

    public short getEntityType() {
        return entityType;
    }

    public void setEntityType(short entityType) {
        this.entityType = entityType;
    }

    public String getCompanyTitleCode() {
        return companyTitleCode;
    }

    public void setCompanyTitleCode(String companyTitleCode) {
        this.companyTitleCode = companyTitleCode;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyOtherName() {
        return companyOtherName;
    }

    public void setCompanyOtherName(String companyOtherName) {
        this.companyOtherName = companyOtherName;
    }

    public String getCompanyRegistrationNo() {
        return companyRegistrationNo;
    }

    public void setCompanyRegistrationNo(String companyRegistrationNo) {
        this.companyRegistrationNo = companyRegistrationNo;
    }

    public String getCompanyLicenseNo() {
        return companyLicenseNo;
    }

    public void setCompanyLicenseNo(String companyLicenseNo) {
        this.companyLicenseNo = companyLicenseNo;
    }

    public Date getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(Date foundedDate) {
        this.foundedDate = foundedDate;
    }

    public Date getLicenseDateForm() {
        return licenseDateForm;
    }

    public void setLicenseDateForm(Date licenseDateForm) {
        this.licenseDateForm = licenseDateForm;
    }

    public Date getLicenseDateTo() {
        return licenseDateTo;
    }

    public void setLicenseDateTo(Date licenseDateTo) {
        this.licenseDateTo = licenseDateTo;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getExciseRegNo() {
        return exciseRegNo;
    }

    public void setExciseRegNo(String exciseRegNo) {
        this.exciseRegNo = exciseRegNo;
    }

    public short getLawbreakerType() {
        return lawbreakerType;
    }

    public void setLawbreakerType(short lawbreakerType) {
        this.lawbreakerType = lawbreakerType;
    }

    public String getLawbreakerTitleCode() {
        return lawbreakerTitleCode;
    }

    public void setLawbreakerTitleCode(String lawbreakerTitleCode) {
        this.lawbreakerTitleCode = lawbreakerTitleCode;
    }

    public String getLawbreakerTitleName() {
        return lawbreakerTitleName;
    }

    public void setLawbreakerTitleName(String lawbreakerTitleName) {
        this.lawbreakerTitleName = lawbreakerTitleName;
    }

    public String getLawbreakerFirstName() {
        return lawbreakerFirstName;
    }

    public void setLawbreakerFirstName(String lawbreakerFirstName) {
        this.lawbreakerFirstName = lawbreakerFirstName;
    }

    public String getLawbreakerMiddleName() {
        return lawbreakerMiddleName;
    }

    public void setLawbreakerMiddleName(String lawbreakerMiddleName) {
        this.lawbreakerMiddleName = lawbreakerMiddleName;
    }

    public String getLawbreakerLastName() {
        return lawbreakerLastName;
    }

    public void setLawbreakerLastName(String lawbreakerLastName) {
        this.lawbreakerLastName = lawbreakerLastName;
    }

    public String getLawbreakerOtherName() {
        return lawbreakerOtherName;
    }

    public void setLawbreakerOtherName(String lawbreakerOtherName) {
        this.lawbreakerOtherName = lawbreakerOtherName;
    }

    public String getLawbreakerDesc() {
        return lawbreakerDesc;
    }

    public void setLawbreakerDesc(String lawbreakerDesc) {
        this.lawbreakerDesc = lawbreakerDesc;
    }

    public String getIDCard() {
        return iDCard;
    }

    public void setIDCard(String iDCard) {
        this.iDCard = iDCard;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public Short getVISAType() {
        return vISAType;
    }

    public void setVISAType(Short vISAType) {
        this.vISAType = vISAType;
    }

    public String getPassportCountryCode() {
        return passportCountryCode;
    }

    public void setPassportCountryCode(String passportCountryCode) {
        this.passportCountryCode = passportCountryCode;
    }

    public String getPassportCountryName() {
        return passportCountryName;
    }

    public void setPassportCountryName(String passportCountryName) {
        this.passportCountryName = passportCountryName;
    }

    public Date getPassportDateIn() {
        return passportDateIn;
    }

    public void setPassportDateIn(Date passportDateIn) {
        this.passportDateIn = passportDateIn;
    }

    public Date getPassportDateOut() {
        return passportDateOut;
    }

    public void setPassportDateOut(Date passportDateOut) {
        this.passportDateOut = passportDateOut;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Character getGenderType() {
        return genderType;
    }

    public void setGenderType(Character genderType) {
        this.genderType = genderType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String getNationalityNameTH() {
        return nationalityNameTH;
    }

    public void setNationalityNameTH(String nationalityNameTH) {
        this.nationalityNameTH = nationalityNameTH;
    }

    public String getRaceCode() {
        return raceCode;
    }

    public void setRaceCode(String raceCode) {
        this.raceCode = raceCode;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getReligionCode() {
        return religionCode;
    }

    public void setReligionCode(String religionCode) {
        this.religionCode = religionCode;
    }

    public String getReligionName() {
        return religionName;
    }

    public void setReligionName(String religionName) {
        this.religionName = religionName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(String coordinateX) {
        this.coordinateX = coordinateX;
    }

    public String getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(String coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getSubDistrictCode() {
        return subDistrictCode;
    }

    public void setSubDistrictCode(String subDistrictCode) {
        this.subDistrictCode = subDistrictCode;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLinkPhoto() {
        return linkPhoto;
    }

    public void setLinkPhoto(String linkPhoto) {
        this.linkPhoto = linkPhoto;
    }

    public String getPhotoDesc() {
        return photoDesc;
    }

    public void setPhotoDesc(String photoDesc) {
        this.photoDesc = photoDesc;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

//    @XmlTransient
//    public Collection<OpsArrestIndicmentDetail> getOpsArrestIndicmentDetailCollection() {
//        return opsArrestIndicmentDetailCollection;
//    }
//
//    public void setOpsArrestIndicmentDetailCollection(Collection<OpsArrestIndicmentDetail> opsArrestIndicmentDetailCollection) {
//        this.opsArrestIndicmentDetailCollection = opsArrestIndicmentDetailCollection;
//    }

//    public MasLawbreaker getLawbreakerRefID() {
//        return lawbreakerRefID;
//    }
//
//    public void setLawbreakerRefID(MasLawbreaker lawbreakerRefID) {
//        this.lawbreakerRefID = lawbreakerRefID;
//    }

//    public OpsArrest getArrestCode() {
//        return arrestCode;
//    }
//
//    public void setArrestCode(OpsArrest arrestCode) {
//        this.arrestCode = arrestCode;
//    }
    
    public String getArrestCode() {
		return arrestCode;
	}

	public void setArrestCode(String arrestCode) {
		this.arrestCode = arrestCode;
	}

	public String getLawbreakerRefID() {
		return lawbreakerRefID;
	}

	public void setLawbreakerRefID(String lawbreakerRefID) {
		this.lawbreakerRefID = lawbreakerRefID;
	}

    public String getiDCard() {
		return iDCard;
	}

	public void setiDCard(String iDCard) {
		this.iDCard = iDCard;
	}

	public List<OpsArrestLawbreakerAddress> getArrestLawBreakerAddressList() {
		return arrestLawBreakerAddressList;
	}

	public void setArrestLawBreakerAddressList(List<OpsArrestLawbreakerAddress> arrestLawBreakerAddressList) {
		this.arrestLawBreakerAddressList = arrestLawBreakerAddressList;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (lawbreakerID != null ? lawbreakerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsArrestLawbreaker)) {
            return false;
        }
        OpsArrestLawbreaker other = (OpsArrestLawbreaker) object;
        if ((this.lawbreakerID == null && other.lawbreakerID != null) || (this.lawbreakerID != null && !this.lawbreakerID.equals(other.lawbreakerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsArrestLawbreaker[ lawbreakerID=" + lawbreakerID + " ]";
    }
    
}
