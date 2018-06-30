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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Pratin
 */
@Entity
@Table(name = "ops_arrest_locale", catalog = "", schema = "ILLEGAL60")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsArrestLocale.findAll", query = "SELECT o FROM OpsArrestLocale o")
    , @NamedQuery(name = "OpsArrestLocale.findByLocaleID", query = "SELECT o FROM OpsArrestLocale o WHERE o.localeID = :localeID")
    , @NamedQuery(name = "OpsArrestLocale.findByIsArrest", query = "SELECT o FROM OpsArrestLocale o WHERE o.isArrest = :isArrest")
    , @NamedQuery(name = "OpsArrestLocale.findByGps", query = "SELECT o FROM OpsArrestLocale o WHERE o.gps = :gps")
    , @NamedQuery(name = "OpsArrestLocale.findByLocation", query = "SELECT o FROM OpsArrestLocale o WHERE o.location = :location")
    , @NamedQuery(name = "OpsArrestLocale.findByAddress", query = "SELECT o FROM OpsArrestLocale o WHERE o.address = :address")
    , @NamedQuery(name = "OpsArrestLocale.findByVillage", query = "SELECT o FROM OpsArrestLocale o WHERE o.village = :village")
    , @NamedQuery(name = "OpsArrestLocale.findByBuilding", query = "SELECT o FROM OpsArrestLocale o WHERE o.building = :building")
    , @NamedQuery(name = "OpsArrestLocale.findByFloor", query = "SELECT o FROM OpsArrestLocale o WHERE o.floor = :floor")
    , @NamedQuery(name = "OpsArrestLocale.findByRoom", query = "SELECT o FROM OpsArrestLocale o WHERE o.room = :room")
    , @NamedQuery(name = "OpsArrestLocale.findByAlley", query = "SELECT o FROM OpsArrestLocale o WHERE o.alley = :alley")
    , @NamedQuery(name = "OpsArrestLocale.findByRoad", query = "SELECT o FROM OpsArrestLocale o WHERE o.road = :road")
    , @NamedQuery(name = "OpsArrestLocale.findBySubDistrict", query = "SELECT o FROM OpsArrestLocale o WHERE o.subDistrict = :subDistrict")
    , @NamedQuery(name = "OpsArrestLocale.findByDistrictCode", query = "SELECT o FROM OpsArrestLocale o WHERE o.districtCode = :districtCode")
    , @NamedQuery(name = "OpsArrestLocale.findByDistrict", query = "SELECT o FROM OpsArrestLocale o WHERE o.district = :district")
    , @NamedQuery(name = "OpsArrestLocale.findByProvinceCode", query = "SELECT o FROM OpsArrestLocale o WHERE o.provinceCode = :provinceCode")
    , @NamedQuery(name = "OpsArrestLocale.findByProvince", query = "SELECT o FROM OpsArrestLocale o WHERE o.province = :province")
    , @NamedQuery(name = "OpsArrestLocale.findByZipCode", query = "SELECT o FROM OpsArrestLocale o WHERE o.zipCode = :zipCode")
    , @NamedQuery(name = "OpsArrestLocale.findByPolicestation", query = "SELECT o FROM OpsArrestLocale o WHERE o.policestation = :policestation")
    , @NamedQuery(name = "OpsArrestLocale.findByIsActive", query = "SELECT o FROM OpsArrestLocale o WHERE o.isActive = :isActive")})
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
    
    @JsonProperty("LocaleID")
    public void setLocaleID(Long localeID) {
        this.localeID = localeID;
    }

    public Short getIsArrest() {
        return isArrest;
    }
    
    @JsonProperty("IsArrest")
    public void setIsArrest(Short isArrest) {
        this.isArrest = isArrest;
    }

    public String getGps() {
        return gps;
    }

    @JsonProperty("GPS")
    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getLocation() {
        return location;
    }

    @JsonProperty("Location")
    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }
    
    @JsonProperty("Address")
    public void setAddress(String address) {
        this.address = address;
    }

    public String getVillage() {
        return village;
    }
    
    @JsonProperty("Village")
    public void setVillage(String village) {
        this.village = village;
    }

    public String getBuilding() {
        return building;
    }
    
    @JsonProperty("Building")
    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }
    
    @JsonProperty("Floor")
    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoom() {
        return room;
    }
    
    @JsonProperty("Room")
    public void setRoom(String room) {
        this.room = room;
    }

    public String getAlley() {
        return alley;
    }
    
    @JsonProperty("Alley")
    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getRoad() {
        return road;
    }
    
    @JsonProperty("Road")
    public void setRoad(String road) {
        this.road = road;
    }

    public String getSubDistrict() {
        return subDistrict;
    }
    
    @JsonProperty("SubDistrict")
    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getDistrictCode() {
        return districtCode;
    }
    
    @JsonProperty("DistrictCode")
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrict() {
        return district;
    }

    @JsonProperty("District")
    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvinceCode() {
        return provinceCode;
    }
    
    @JsonProperty("ProvinceCode")
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvince() {
        return province;
    }

    @JsonProperty("Province")
    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty("ZipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPolicestation() {
        return policestation;
    }
    
    @JsonProperty("Policestation")
    public void setPolicestation(String policestation) {
        this.policestation = policestation;
    }

    public short getIsActive() {
        return isActive;
    }
    
    @JsonProperty("IsActive")
    public void setIsActive(short isActive) {
        this.isActive = isActive;
    }

    
    public MasSubdistrict getSubDistrictCode() {
        return subDistrictCode;
    }

    public void setSubDistrictCode(MasSubdistrict subDistrictCode) {
        this.subDistrictCode = subDistrictCode;
    }

    @JsonProperty("ArrestItems")
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
