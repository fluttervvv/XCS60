/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author thanatep_s
 */
@Entity
@Table(name = "\"mas_lawbreak_address\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@NamedQueries({
    @NamedQuery(name = "MasLawbreakAddress.findAll", query = "SELECT m FROM MasLawbreakAddress m")
    , @NamedQuery(name = "MasLawbreakAddress.findByLawbreakerAddressID", query = "SELECT m FROM MasLawbreakAddress m WHERE m.lawbreakerAddressID = :lawbreakerAddressID")
    , @NamedQuery(name = "MasLawbreakAddress.findByLawbreakerID", query = "SELECT m FROM MasLawbreakAddress m WHERE m.lawbreakerID = :lawbreakerID")
    , @NamedQuery(name = "MasLawbreakAddress.findByLawbreakerAddressRefID", query = "SELECT m FROM MasLawbreakAddress m WHERE m.lawbreakerAddressRefID = :lawbreakerAddressRefID")
    , @NamedQuery(name = "MasLawbreakAddress.findByGps", query = "SELECT m FROM MasLawbreakAddress m WHERE m.gps = :gps")
    , @NamedQuery(name = "MasLawbreakAddress.findByLocation", query = "SELECT m FROM MasLawbreakAddress m WHERE m.location = :location")
    , @NamedQuery(name = "MasLawbreakAddress.findByAddress", query = "SELECT m FROM MasLawbreakAddress m WHERE m.address = :address")
    , @NamedQuery(name = "MasLawbreakAddress.findByVillage", query = "SELECT m FROM MasLawbreakAddress m WHERE m.village = :village")
    , @NamedQuery(name = "MasLawbreakAddress.findByBuilding", query = "SELECT m FROM MasLawbreakAddress m WHERE m.building = :building")
    , @NamedQuery(name = "MasLawbreakAddress.findByFloor", query = "SELECT m FROM MasLawbreakAddress m WHERE m.floor = :floor")
    , @NamedQuery(name = "MasLawbreakAddress.findByRoom", query = "SELECT m FROM MasLawbreakAddress m WHERE m.room = :room")
    , @NamedQuery(name = "MasLawbreakAddress.findByAlley", query = "SELECT m FROM MasLawbreakAddress m WHERE m.alley = :alley")
    , @NamedQuery(name = "MasLawbreakAddress.findByRoad", query = "SELECT m FROM MasLawbreakAddress m WHERE m.road = :road")
    , @NamedQuery(name = "MasLawbreakAddress.findBySubDistrictCode", query = "SELECT m FROM MasLawbreakAddress m WHERE m.subDistrictCode = :subDistrictCode")
    , @NamedQuery(name = "MasLawbreakAddress.findBySubDistrict", query = "SELECT m FROM MasLawbreakAddress m WHERE m.subDistrict = :subDistrict")
    , @NamedQuery(name = "MasLawbreakAddress.findByDistrictCode", query = "SELECT m FROM MasLawbreakAddress m WHERE m.districtCode = :districtCode")
    , @NamedQuery(name = "MasLawbreakAddress.findByDistrict", query = "SELECT m FROM MasLawbreakAddress m WHERE m.district = :district")
    , @NamedQuery(name = "MasLawbreakAddress.findByProvinceCode", query = "SELECT m FROM MasLawbreakAddress m WHERE m.provinceCode = :provinceCode")
    , @NamedQuery(name = "MasLawbreakAddress.findByProvince", query = "SELECT m FROM MasLawbreakAddress m WHERE m.province = :province")
    , @NamedQuery(name = "MasLawbreakAddress.findByZipCode", query = "SELECT m FROM MasLawbreakAddress m WHERE m.zipCode = :zipCode")
    , @NamedQuery(name = "MasLawbreakAddress.findByTelephoneNo", query = "SELECT m FROM MasLawbreakAddress m WHERE m.telephoneNo = :telephoneNo")
    , @NamedQuery(name = "MasLawbreakAddress.findByEmail", query = "SELECT m FROM MasLawbreakAddress m WHERE m.email = :email")
    , @NamedQuery(name = "MasLawbreakAddress.findByIscurrentaddress", query = "SELECT m FROM MasLawbreakAddress m WHERE m.iscurrentaddress = :iscurrentaddress")})
@SequenceGenerator(name = "MasLawbreakAddressID_Sequence", schema = "ILLEGAL60", sequenceName = "\"MAS_LAWBREAKER_ADDRESS_SEQ\"", initialValue = 1, allocationSize = 1)
public class MasLawbreakAddress implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name ="\"LawbreakerAddressID\"")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MasLawbreakAddressID_Sequence")
    private BigDecimal lawbreakerAddressID;
    @Column(name ="\"LawbreakerID\"")
    private BigInteger lawbreakerID;
    @Column(name ="\"LawbreakerAddressRefID\"")
    private Short lawbreakerAddressRefID;
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
    @Column(name ="\"ISCURRENTADDRESS\"")
    private Short iscurrentaddress;

    public MasLawbreakAddress() {
    }

    public MasLawbreakAddress(BigDecimal lawbreakerAddressID) {
        this.lawbreakerAddressID = lawbreakerAddressID;
    }

    public BigDecimal getLawbreakerAddressID() {
        return lawbreakerAddressID;
    }

    public void setLawbreakerAddressID(BigDecimal lawbreakerAddressID) {
        this.lawbreakerAddressID = lawbreakerAddressID;
    }

    public BigInteger getLawbreakerID() {
        return lawbreakerID;
    }

    public void setLawbreakerID(BigInteger lawbreakerID) {
        this.lawbreakerID = lawbreakerID;
    }

    public Short getLawbreakerAddressRefID() {
        return lawbreakerAddressRefID;
    }

    public void setLawbreakerAddressRefID(Short lawbreakerAddressRefID) {
        this.lawbreakerAddressRefID = lawbreakerAddressRefID;
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

    public Short getIscurrentaddress() {
        return iscurrentaddress;
    }

    public void setIscurrentaddress(Short iscurrentaddress) {
        this.iscurrentaddress = iscurrentaddress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lawbreakerAddressID != null ? lawbreakerAddressID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasLawbreakAddress)) {
            return false;
        }
        MasLawbreakAddress other = (MasLawbreakAddress) object;
        if ((this.lawbreakerAddressID == null && other.lawbreakerAddressID != null) || (this.lawbreakerAddressID != null && !this.lawbreakerAddressID.equals(other.lawbreakerAddressID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model2.MasLawbreakAddress[ lawbreakerAddressID=" + lawbreakerAddressID + " ]";
    }
    
}
