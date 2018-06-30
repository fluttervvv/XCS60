package com.hook.xcs60.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(schema= "ILLEGAL60" ,name = "\"ops_arrest_locale\"")
public class ArrestLocale {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="\"LocaleID\"", unique = true)
	Long localeId;

	@Column(name ="\"IsArrest\"")
	Boolean isArrest ;
	
	@Column(name ="\"ArrestCode\"")
	String arrestCode;
	
	@Column(name ="\"GPS\"")
	String GPS;
	
	@Column(name ="\"Location\"")
	String location;
	
	@Column(name ="\"Address\"")
	String address;
	
	@Column(name ="\"Village\"")
	String village;

	@Column(name ="\"Building\"")
	String building;
	
	@Column(name ="\"Floor\"")
	String floor ;

	@Column(name ="\"Room\"")
	String room;

	@Column(name ="\"Alley\"")
	String alley;

	@Column(name ="\"Road\"")
	String road ;

	@Column(name ="\"SubDistrictCode\"")
	String subDistrictCode ;

	@Column(name ="\"SubDistrict\"")
	String subDistrict ;

	@Column(name ="\"DistrictCode\"")
	String districtCode;

	@Column(name ="\"District\"")
	String district;

	@Column(name ="\"ProvinceCode\"")
	String provinceCode;

	@Column(name ="\"Province\"")
	String province;

	@Column(name ="\"ZipCode\"")
	String zipCode;

	@Column(name ="\"Policestation\"")
	String policestation;

	@Column(name ="\"IsActive\"")
	Boolean isActive;

}
