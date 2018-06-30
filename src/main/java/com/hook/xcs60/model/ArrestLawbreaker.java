package com.hook.xcs60.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(schema= "ILLEGAL60" ,name = "\"ops_arrest_lawbreaker\"")
public class ArrestLawbreaker {
	
	public ArrestLawbreaker() {
		super();
	}
	
	@Id
	@Column(name ="\"LawbreakerID\"", unique = true)
	int lawbreakerId;
	
	@Column(name ="\"ArrestCode\"")
	String arrestCode;
	
	@Column(name ="\"LawbreakerRefID\"")
	int lawbreakerRefID;
	 
	@Column(name ="\"EntityType\"")
	int entityType;

	@Column(name ="\"CompanyTitleCode\"")
	String companyTitleCode;

	@Column(name ="\"CompanyName\"")
	String companyName;
	

	@Column(name ="\"CompanyOtherName\"")
	String companyOtherName;

	@Column(name ="\"CompanyRegistrationNo\"")
	String companyRegistrationNo;
 
	@Column(name ="\"CompanyLicenseNo\"")
	String companyLicenseNo;

	@Column(name ="\"FoundedDate\"")
	Date FoundedDate;
	
	@Column(name ="\"LicenseDateForm\"")
	Date licenseDateForm;
	
	@Column(name ="\"LicenseDateTo\"")
	Date licenseDateTo;

	@Column(name ="\"TaxID\"")
	String taxID;

	@Column(name ="\"ExciseRegNo\"")
	String exciseRegNo;
	
	@Column(name ="\"LawbreakerType\"")
	Boolean lawbreakerType;
	
	@Column(name ="\"LawbreakerTitleCode\"")
	String lawbreakerTitleCode;
	
	@Column(name ="\"LawbreakerTitleName\"")
	String lawbreakerTitleName;

	@Column(name ="\"LawbreakerFirstName\"")
	String lawbreakerFirstName;

	@Column(name ="\"LawbreakerMiddleName\"")
	String lawbreakerMiddleName;
	
	@Column(name ="\"LawbreakerLastName\"")
	String lawbreakerLastName;
	
	@Column(name ="\"LawbreakerOtherName\"")
	String lawbreakerOtherName;
	
	@Column(name ="\"LawbreakerDesc\"")
	String lawbreakerDesc;

	@Column(name ="\"IDCard\"")
	String idCard;

	@Column(name ="\"PassportNo\"")
	String PassportNo;

	@Column(name ="\"VISAType\"")
	Boolean visaType;
	
	@Column(name ="\"PassportCountryCode\"")
	String passportCountryCode;

	@Column(name ="\"PassportCountryName\"")
	String passportCountryName;

	@Column(name ="\"PassportDateIn\"")
	Date passportDateIn;
	
	@Column(name ="\"PassportDateOut\"")
	Date passportDateOut;

	@Column(name ="\"BirthDate\"")
	Date birthDate;

	@Column(name ="\"GenderType\"")
	String genderType;

	@Column(name ="\"BloodType\"")
	String bloodType;
	
	@Column(name ="\"NationalityCode\"")
	String nationalityCode;

	@Column(name ="\"NationalityNameTH\"")
	String nationalityNameTH;

	@Column(name ="\"RaceCode\"")
	String raceCode;

	@Column(name ="\"RaceName\"")
	String raceName;

	@Column(name ="\"ReligionCode\"")
	String religionCode;

	@Column(name ="\"ReligionName\"")
	String religionName;

	@Column(name ="\"MaritalStatus\"")
	String maritalStatus;

	@Column(name ="\"Career\"")
	String career;

	@Column(name ="\"CoordinateX\"")
	String coordinateX;
 
	@Column(name ="\"CoordinateY\"")
	String coordinateY;
	
	@Column(name ="\"Location\"")
	String location;

	@Column(name ="\"Address\"")
	String ddress;

	@Column(name ="\"Village\"")
	String village;

	@Column(name ="\"Building\"")
	String building;
	 
	@Column(name ="\"Floor\"")
	String floor;
	
	@Column(name ="\"Room\"")
	String room;
	
	@Column(name ="\"Alley\"")
	String alley;
	
	@Column(name ="\"Road\"")
	String road;

	@Column(name ="\"SubDistrictCode\"")
	String subDistrictCode;
 
	@Column(name ="\"SubDistrict\"")
	String subDistrict;
	
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
	
	@Column(name ="\"TelephoneNo\"")
	String telephoneNo;
	
	@Column(name ="\"Email\"")
	String email;
 
	@Column(name ="\"FatherName\"")
	String fatherName;
	
	@Column(name ="\"MotherName\"")
	String motherName;
	 
	@Column(name ="\"Remarks\"")
	String remarks;
	 
	@Column(name ="\"LinkPhoto\"")
	String linkPhoto;
 
	@Column(name ="\"PhotoDesc\"")
	String photoDesc;

	@Column(name ="\"IsActive\"")
	Boolean isActive;
}
