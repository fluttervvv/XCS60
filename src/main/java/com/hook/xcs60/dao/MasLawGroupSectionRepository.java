package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.MasLawGroupSection;

public interface MasLawGroupSectionRepository extends CrudRepository<MasLawGroupSection, Long> {
	@Query("SELECT DISTINCT m from MasLawGroupSection m "
			+ "LEFT JOIN MasLawGroupSubsection ms ON ms.sectionNo = m.sectionNo "
			+ "LEFT JOIN MasLawGroupSubsectionRule mr ON mr.sectionNo = m.sectionNo "
			+ "LEFT JOIN MasLawGuiltbase mb ON mb.subSectionRuleID = mr.subSectionRuleID "
			+ "WHERE ("
			+ "m.sectionName LIKE %:keyword% "
//			+ "OR m.arrestCode LIKE %:keyword% "
			+ "OR m.sectionDesc1 LIKE %:keyword% "
			+ "OR m.sectionDesc3 LIKE %:keyword% "
			+ "OR ms.subSectionDesc LIKE %:keyword% "
			+ "OR mb.guiltBaseName LIKE %:keyword% "
			+ ") "
			+ "AND ms.isActive = 1 "
			+ "AND mr.isActive = 1 "
			+ "AND mb.isActive = 1 "
			)
	List<MasLawGroupSection> ArrestMasLawGroupSectongetByKeyword(@Param("keyword")String keyword);

}
