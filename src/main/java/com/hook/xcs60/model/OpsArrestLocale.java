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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "\"ops_arrest_locale\"", catalog = "", schema = "ILLEGAL60")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class OpsArrestLocale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "LOCATION_ID")
    @Column(name ="\"LocaleID\"")
    private Long localeID;
    @Column(name ="\"IsArrest\"")
    private Short isArrest;
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
    @Column(name ="\"Policestation\"")
    private String policestation;
    @Basic(optional = false)
    @Column(name ="\"IsActive\"")
    private short isActive;
    @JoinColumn(name ="\"SubDistrictCode\"", referencedColumnName ="\"SubdistrictCode\"")
    @ManyToOne
    private MasSubdistrict subDistrictCode;
    @JoinColumn(name ="\"ArrestCode\"", referencedColumnName ="\"ArrestCode\"")
    @ManyToOne(optional = false)
    private OpsArrest arrestCode;

    public OpsArrestLocale() {
    }

    public OpsArrestLocale(Long localeID) {
        this.localeID = localeID;
    }

    public OpsArrestLocale(Long localeID, short isActive) {
        this.localeID = localeID;
        this.isActive = isActive;
    }

    public Long getLocaleID() {
        return localeID;
    }
    
    public void setLocaleID(Long localeID) {
        this.localeID = localeID;
    }

    public Short getIsArrest() {
        return isArrest;
    }
    
    public void setIsArrest(Short isArrest) {
        this.isArrest = isArrest;
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

    public String getPolicestation() {
        return policestation;
    }
    
    public void setPolicestation(String policestation) {
        this.policestation = policestation;
    }

    public short getIsActive() {
        return isActive;
    }

    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    
    public MasSubdistrict getSubDistrictCode() {
        return subDistrictCode;
    }

    public void setSubDistrictCode(MasSubdistrict subDistrictCode) {
        this.subDistrictCode = subDistrictCode;
    }

    //@JsonProperty("ArrestItems")
    @JsonIgnore
    public OpsArrest getArrestCode() {
        return arrestCode;
    }

    @JsonProperty("ArrestCode")
    public void setArrestCode(OpsArrest arrestCode) {
        this.arrestCode = arrestCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (localeID != null ? localeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpsArrestLocale)) {
            return false;
        }
        OpsArrestLocale other = (OpsArrestLocale) object;
        if ((this.localeID == null && other.localeID != null) || (this.localeID != null && !this.localeID.equals(other.localeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hook.xcs60.model.OpsArrestLocale[ localeID=" + localeID + " ]";
    }
    
}
