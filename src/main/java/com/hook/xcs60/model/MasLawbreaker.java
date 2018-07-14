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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"mas_lawbreaker\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "MasLawbreaker.findAll", query = "SELECT m FROM MasLawbreaker m")
    , @NamedQuery(name = "MasLawbreaker.findByLawbreakerID", query = "SELECT m FROM MasLawbreaker m WHERE m.lawbreakerID = :lawbreakerID")
    , @NamedQuery(name = "MasLawbreaker.findByEntityType", query = "SELECT m FROM MasLawbreaker m WHERE m.entityType = :entityType")
    , @NamedQuery(name = "MasLawbreaker.findByCompanyTitleCode", query = "SELECT m FROM MasLawbreaker m WHERE m.companyTitleCode = :companyTitleCode")
    , @NamedQuery(name = "MasLawbreaker.findByCompanyTitle", query = "SELECT m FROM MasLawbreaker m WHERE m.companyTitle = :companyTitle")
    , @NamedQuery(name = "MasLawbreaker.findByCompanyName", query = "SELECT m FROM MasLawbreaker m WHERE m.companyName = :companyName")
    , @NamedQuery(name = "MasLawbreaker.findByCompanyOtherName", query = "SELECT m FROM MasLawbreaker m WHERE m.companyOtherName = :companyOtherName")
    , @NamedQuery(name = "MasLawbreaker.findByCompanyRegistrationNo", query = "SELECT m FROM MasLawbreaker m WHERE m.companyRegistrationNo = :companyRegistrationNo")
    , @NamedQuery(name = "MasLawbreaker.findByCompanyLicenseNo", query = "SELECT m FROM MasLawbreaker m WHERE m.companyLicenseNo = :companyLicenseNo")
    , @NamedQuery(name = "MasLawbreaker.findByFoundedDate", query = "SELECT m FROM MasLawbreaker m WHERE m.foundedDate = :foundedDate")
    , @NamedQuery(name = "MasLawbreaker.findByLicenseDateForm", query = "SELECT m FROM MasLawbreaker m WHERE m.licenseDateForm = :licenseDateForm")
    , @NamedQuery(name = "MasLawbreaker.findByLicenseDateTo", query = "SELECT m FROM MasLawbreaker m WHERE m.licenseDateTo = :licenseDateTo")
    , @NamedQuery(name = "MasLawbreaker.findByTaxID", query = "SELECT m FROM MasLawbreaker m WHERE m.taxID = :taxID")
    , @NamedQuery(name = "MasLawbreaker.findByExciseRegNo", query = "SELECT m FROM MasLawbreaker m WHERE m.exciseRegNo = :exciseRegNo")
    , @NamedQuery(name = "MasLawbreaker.findByLawbreakerType", query = "SELECT m FROM MasLawbreaker m WHERE m.lawbreakerType = :lawbreakerType")
    , @NamedQuery(name = "MasLawbreaker.findByLawbreakerTitleCode", query = "SELECT m FROM MasLawbreaker m WHERE m.lawbreakerTitleCode = :lawbreakerTitleCode")
    , @NamedQuery(name = "MasLawbreaker.findByLawbreakerTitleName", query = "SELECT m FROM MasLawbreaker m WHERE m.lawbreakerTitleName = :lawbreakerTitleName")
    , @NamedQuery(name = "MasLawbreaker.findByLawbreakerFirstName", query = "SELECT m FROM MasLawbreaker m WHERE m.lawbreakerFirstName = :lawbreakerFirstName")
    , @NamedQuery(name = "MasLawbreaker.findByLawbreakerMiddleName", query = "SELECT m FROM MasLawbreaker m WHERE m.lawbreakerMiddleName = :lawbreakerMiddleName")
    , @NamedQuery(name = "MasLawbreaker.findByLawbreakerLastName", query = "SELECT m FROM MasLawbreaker m WHERE m.lawbreakerLastName = :lawbreakerLastName")
    , @NamedQuery(name = "MasLawbreaker.findByLawbreakerOtherName", query = "SELECT m FROM MasLawbreaker m WHERE m.lawbreakerOtherName = :lawbreakerOtherName")
    , @NamedQuery(name = "MasLawbreaker.findByLawbreakerDesc", query = "SELECT m FROM MasLawbreaker m WHERE m.lawbreakerDesc = :lawbreakerDesc")
    , @NamedQuery(name = "MasLawbreaker.findByIDCard", query = "SELECT m FROM MasLawbreaker m WHERE m.iDCard = :iDCard")
    , @NamedQuery(name = "MasLawbreaker.findByPassportNo", query = "SELECT m FROM MasLawbreaker m WHERE m.passportNo = :passportNo")
    , @NamedQuery(name = "MasLawbreaker.findByVISAType", query = "SELECT m FROM MasLawbreaker m WHERE m.vISAType = :vISAType")
    , @NamedQuery(name = "MasLawbreaker.findByPassportCountryName", query = "SELECT m FROM MasLawbreaker m WHERE m.passportCountryName = :passportCountryName")
    , @NamedQuery(name = "MasLawbreaker.findByPassportDateIn", query = "SELECT m FROM MasLawbreaker m WHERE m.passportDateIn = :passportDateIn")
    , @NamedQuery(name = "MasLawbreaker.findByPassportDateOut", query = "SELECT m FROM MasLawbreaker m WHERE m.passportDateOut = :passportDateOut")
    , @NamedQuery(name = "MasLawbreaker.findByBirthDate", query = "SELECT m FROM MasLawbreaker m WHERE m.birthDate = :birthDate")
    , @NamedQuery(name = "MasLawbreaker.findByGenderType", query = "SELECT m FROM MasLawbreaker m WHERE m.genderType = :genderType")
    , @NamedQuery(name = "MasLawbreaker.findByBloodType", query = "SELECT m FROM MasLawbreaker m WHERE m.bloodType = :bloodType")
    , @NamedQuery(name = "MasLawbreaker.findByNationalityCode", query = "SELECT m FROM MasLawbreaker m WHERE m.nationalityCode = :nationalityCode")
    , @NamedQuery(name = "MasLawbreaker.findByNationalityNameTH", query = "SELECT m FROM MasLawbreaker m WHERE m.nationalityNameTH = :nationalityNameTH")
    , @NamedQuery(name = "MasLawbreaker.findByRaceCode", query = "SELECT m FROM MasLawbreaker m WHERE m.raceCode = :raceCode")
    , @NamedQuery(name = "MasLawbreaker.findByRaceName", query = "SELECT m FROM MasLawbreaker m WHERE m.raceName = :raceName")
    , @NamedQuery(name = "MasLawbreaker.findByReligionCode", query = "SELECT m FROM MasLawbreaker m WHERE m.religionCode = :religionCode")
    , @NamedQuery(name = "MasLawbreaker.findByReligionName", query = "SELECT m FROM MasLawbreaker m WHERE m.religionName = :religionName")
    , @NamedQuery(name = "MasLawbreaker.findByMaritalStatus", query = "SELECT m FROM MasLawbreaker m WHERE m.maritalStatus = :maritalStatus")
    , @NamedQuery(name = "MasLawbreaker.findByCareer", query = "SELECT m FROM MasLawbreaker m WHERE m.career = :career")
    , @NamedQuery(name = "MasLawbreaker.findByGps", query = "SELECT m FROM MasLawbreaker m WHERE m.gps = :gps")
    , @NamedQuery(name = "MasLawbreaker.findByLocation", query = "SELECT m FROM MasLawbreaker m WHERE m.location = :location")
    , @NamedQuery(name = "MasLawbreaker.findByAddress", query = "SELECT m FROM MasLawbreaker m WHERE m.address = :address")
    , @NamedQuery(name = "MasLawbreaker.findByVillage", query = "SELECT m FROM MasLawbreaker m WHERE m.village = :village")
    , @NamedQuery(name = "MasLawbreaker.findByBuilding", query = "SELECT m FROM MasLawbreaker m WHERE m.building = :building")
    , @NamedQuery(name = "MasLawbreaker.findByFloor", query = "SELECT m FROM MasLawbreaker m WHERE m.floor = :floor")
    , @NamedQuery(name = "MasLawbreaker.findByRoom", query = "SELECT m FROM MasLawbreaker m WHERE m.room = :room")
    , @NamedQuery(name = "MasLawbreaker.findByAlley", query = "SELECT m FROM MasLawbreaker m WHERE m.alley = :alley")
    , @NamedQuery(name = "MasLawbreaker.findByRoad", query = "SELECT m FROM MasLawbreaker m WHERE m.road = :road")
    , @NamedQuery(name = "MasLawbreaker.findBySubDistrictCode", query = "SELECT m FROM MasLawbreaker m WHERE m.subDistrictCode = :subDistrictCode")
    , @NamedQuery(name = "MasLawbreaker.findBySubDistrict", query = "SELECT m FROM MasLawbreaker m WHERE m.subDistrict = :subDistrict")
    , @NamedQuery(name = "MasLawbreaker.findByDistrictCode", query = "SELECT m FROM MasLawbreaker m WHERE m.districtCode = :districtCode")
    , @NamedQuery(name = "MasLawbreaker.findByDistrict", query = "SELECT m FROM MasLawbreaker m WHERE m.district = :district")
    , @NamedQuery(name = "MasLawbreaker.findByProvinceCode", query = "SELECT m FROM MasLawbreaker m WHERE m.provinceCode = :provinceCode")
    , @NamedQuery(name = "MasLawbreaker.findByProvince", query = "SELECT m FROM MasLawbreaker m WHERE m.province = :province")
    , @NamedQuery(name = "MasLawbreaker.findByZipCode", query = "SELECT m FROM MasLawbreaker m WHERE m.zipCode = :zipCode")
    , @NamedQuery(name = "MasLawbreaker.findByTelephoneNo", query = "SELECT m FROM MasLawbreaker m WHERE m.telephoneNo = :telephoneNo")
    , @NamedQuery(name = "MasLawbreaker.findByEmail", query = "SELECT m FROM MasLawbreaker m WHERE m.email = :email")
    , @NamedQuery(name = "MasLawbreaker.findByFatherName", query = "SELECT m FROM MasLawbreaker m WHERE m.fatherName = :fatherName")
    , @NamedQuery(name = "MasLawbreaker.findByMotherName", query = "SELECT m FROM MasLawbreaker m WHERE m.motherName = :motherName")
    , @NamedQuery(name = "MasLawbreaker.findByRemarks", query = "SELECT m FROM MasLawbreaker m WHERE m.remarks = :remarks")
    , @NamedQuery(name = "MasLawbreaker.findByLinkPhoto", query = "SELECT m FROM MasLawbreaker m WHERE m.linkPhoto = :linkPhoto")
    , @NamedQuery(name = "MasLawbreaker.findByPhotoDesc", query = "SELECT m FROM MasLawbreaker m WHERE m.photoDesc = :photoDesc")
    , @NamedQuery(name = "MasLawbreaker.findByIsActive", query = "SELECT m FROM MasLawbreaker m WHERE m.isActive = :isActive")})
@SequenceGenerator(name = "MaslawbreakerID_Sequence", schema = "ILLEGAL60", sequenceName = "\"mas_lawbreaker_SEQ\"", initialValue = 1, allocationSize = 1)
public class MasLawbreaker implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name ="\"LawbreakerID\"")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MaslawbreakerID_Sequence")
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
    @Column(name ="\"GPS\"")
    private String gps;
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
    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lawbreakerRefID")
//    private Collection<OpsArrestLawbreaker> opsArrestLawbreakerCollection;
    
//    @JoinColumn(name = "\"PassportCountryCode\"", referencedColumnName = "\"CountryCode\"")
    @Column(name = "\"PassportCountryCode\"")
    private String passportCountryCode;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "lawbreakerID")
    @JsonProperty("LawbreakerAddress")
    private Collection<MasLawbreakAddress> opsArrestLawbreakerAddressCollection;

    public MasLawbreaker() {
    }

    public MasLawbreaker(BigDecimal lawbreakerID) {
        this.lawbreakerID = lawbreakerID;
    }

    public MasLawbreaker(BigDecimal lawbreakerID, short entityType, short lawbreakerType, String lawbreakerFirstName, String lawbreakerLastName, String iDCard, Date birthDate, Character genderType, String nationalityCode, String raceCode, String maritalStatus, short isActive) {
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

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
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
//    public Collection<OpsArrestLawbreaker> getOpsArrestLawbreakerCollection() {
//        return opsArrestLawbreakerCollection;
//    }
//
//    public void setOpsArrestLawbreakerCollection(Collection<OpsArrestLawbreaker> opsArrestLawbreakerCollection) {
//        this.opsArrestLawbreakerCollection = opsArrestLawbreakerCollection;
//    }

    public String getPassportCountryCode() {
        return passportCountryCode;
    }

    public void setPassportCountryCode(String passportCountryCode) {
        this.passportCountryCode = passportCountryCode;
    }

    public Collection<MasLawbreakAddress> getOpsArrestLawbreakerAddressCollection() {
        return opsArrestLawbreakerAddressCollection;
    }

    public void setOpsArrestLawbreakerAddressCollection(Collection<MasLawbreakAddress> opsArrestLawbreakerAddressCollection) {
        this.opsArrestLawbreakerAddressCollection = opsArrestLawbreakerAddressCollection;
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
        if (!(object instanceof MasLawbreaker)) {
            return false;
        }
        MasLawbreaker other = (MasLawbreaker) object;
        if ((this.lawbreakerID == null && other.lawbreakerID != null) || (this.lawbreakerID != null && !this.lawbreakerID.equals(other.lawbreakerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.MasLawbreaker[ lawbreakerID=" + lawbreakerID + " ]";
    }
    
}
