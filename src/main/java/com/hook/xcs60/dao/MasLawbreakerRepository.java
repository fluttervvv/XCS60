package com.hook.xcs60.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.MasLawbreaker;

public interface MasLawbreakerRepository extends CrudRepository<MasLawbreaker, BigDecimal> {
	
	@Query("SELECT DISTINCT m from MasLawbreaker m "
			+ "WHERE ( "
			+ "m.companyName LIKE %:keyword% "
			+ "OR m.lawbreakerFirstName LIKE %:keyword% "
			+ "OR m.lawbreakerLastName LIKE %:keyword% "
			+ "OR m.taxID LIKE %:keyword% "
			+ "OR m.companyRegistrationNo LIKE %:keyword% "
			+ "OR m.iDCard LIKE %:keyword% "
			+ "OR m.passportNo LIKE %:keyword% "
			+ ") "
			+ "AND m.isActive = 1"
			)
	List<MasLawbreaker> ArrestMasLawbreakergetByKeyword(@Param("keyword")String keyword);
	
	@Query("SELECT DISTINCT m from MasLawbreaker m "
			+ "WHERE "
			+ "m.entityType = :EntityType "
			+ "AND m.lawbreakerType = :LawbreakerType "
			+ "AND m.iDCard = :IDCard "
			+ "AND m.passportNo = :PassportNo "
			+ "AND m.companyRegistrationNo = :CompanyRegistrationNo "
			+ "AND m.companyName = :CompanyName "
			+ "AND "
			+ "( "
			+ "m.lawbreakerFirstName LIKE %:LawbreakerName% "
			+ "OR m.lawbreakerMiddleName LIKE %:LawbreakerName% "
			+ ") "

			)
	List<MasLawbreaker> ArrestMasLawbreakergetByConAdv(
			@Param("EntityType")short entityType,
			@Param("LawbreakerType")short lawbreakerType,
			@Param("IDCard")String IDCard,
			@Param("PassportNo")String passportNo,
			@Param("CompanyRegistrationNo")String companyRegistrationNo,
			@Param("CompanyName")String companyName,
			@Param("LawbreakerName")String lawbreakerName
									
			);

}
