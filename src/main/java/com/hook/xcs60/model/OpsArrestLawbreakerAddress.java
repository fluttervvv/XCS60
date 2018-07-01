/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hook.xcs60.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_arrest_lawbreaker_address\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class OpsArrestLawbreakerAddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "\"LawbreakerAddressID\"")
    private Short lawbreakerAddressID;
    @Column(name = "\"LawbreakerAddressRefID\"")
    private Short lawbreakerAddressRefID;
    @Column(name = "\"GPS\"")
    private String gps;
    @Column(name = "\"Location\"")
    private String location;
    @Column(name = "\"Address\"")
    private String address;
    @Column(name = "\"Village\"")
    private String village;
    @Column(name = "\"Building\"")
    private String building;
    @Column(name = "\"Floor\"")
    private String floor;
    @Column(name = "\"Room\"")
    private String room;
    @Column(name = "\"Alley\"")
    private String alley;
    @Column(name = "\"Road\"")
    private String road;
    @Column(name = "\"SubDistrictCode\"")
    private String subDistrictCode;
    @Column(name = "\"SubDistrict\"")
    private String subDistrict;
    @Column(name = "\"DistrictCode\"")
    private String districtCode;
    @Column(name = "\"District\"")
    private String district;
    @Column(name = "\"ProvinceCode\"")
    private String provinceCode;
    @Column(name = "\"Province\"")
    private String province;
    @Column(name = "\"ZipCode\"")
    private String zipCode;
    @Column(name = "\"TelephoneNo\"")
    private String telephoneNo;
    @Column(name = "\"EMAIL\"")
    private String email;
    @Column(name = "\"IsCurrentAddress\"")
    private Short isCurrentAddress;
    @Column(name = "\"IsActive\"")
    private Short isActive;
//    @JoinColumn(name = "LawbreakerID", referencedColumnName = "LawbreakerID")
//    @ManyToOne
//    private MasLawbreaker lawbreakerID;
    
    @Column(name = "\"LawbreakerID\"")
    private BigDecimal lawbreakerID;

    public OpsArrestLawbreakerAddress() {
    }

    public OpsArrestLawbreakerAddress(Short lawbreakerAddressID) {
        this.lawbreakerAddressID = lawbreakerAddressID;
    }

    public Short getLawbreakerAddressID() {
        return lawbreakerAddressID;
    }

    public void setLawbreakerAddressID(Short lawbreakerAddressID) {
        this.lawbreakerAddressID = lawbreakerAddressID;
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

    public Short getIsCurrentAddress() {
        return isCurrentAddress;
    }

    public void setIsCurrentAddress(Short isCurrentAddress) {
        this.isCurrentAddress = isCurrentAddress;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

//    public MasLawbreaker getLawbreakerID() {
//        return lawbreakerID;
//    }
//
//    public void setLawbreakerID(MasLawbreaker lawbreakerID) {
//        this.lawbreakerID = lawbreakerID;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lawbreakerAddressID != null ? lawbreakerAddressID.hashCode() : 0);
        return hash;
    }

    public BigDecimal getLawbreakerID() {
		return lawbreakerID;
	}

	public void setLawbreakerID(BigDecimal lawbreakerID) {
		this.lawbreakerID = lawbreakerID;
	}

	@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsArrestLawbreakerAddress)) {
            return false;
        }
        OpsArrestLawbreakerAddress other = (OpsArrestLawbreakerAddress) object;
        if ((this.lawbreakerAddressID == null && other.lawbreakerAddressID != null) || (this.lawbreakerAddressID != null && !this.lawbreakerAddressID.equals(other.lawbreakerAddressID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsArrestLawbreakerAddress[ lawbreakerAddressID=" + lawbreakerAddressID + " ]";
    }
    
}
