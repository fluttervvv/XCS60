package com.hook.xcs60.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.Arrest;
import com.hook.xcs60.model.OpsArrest;

public interface ArrestRepository extends CrudRepository<OpsArrest, String> {

	@Query("select t from OpsArrest t join OpsArrestStaff s on t.arrestCode = s.arrestCode "
			+ " where t.arrestCode like %:keyword% or " + " t.arrestStation like %:keyword% or "
			+ " s.titleName like %:keyword% or " + " s.firstName like %:keyword% or "
			+ " s.lastName like %:keyword% or " + " s.positionName like %:keyword% or "
			+ " s.posLevel like %:keyword% or " + " s.departmentName like %:keyword% ")
	List<OpsArrest> findByKeyword(@Param("keyword") String keyword);

	@Query("select t from OpsArrest t join OpsArrestStaff s on " + " t.arrestCode = s.arrestCode "
			+ "where t.arrestCode = :arrestCode "
			+ " and t.occurrenceDate between :occurrenceDateFrom and :occurrenceDateTo " + " and t.isActive = 1 "
			+ " and t.noticeCode = :noticeCode " + " and ( s.titleName like %:staffName% "
			+ " or s.firstName like %:staffName% " + " or s.lastName like %:staffName% "
			+ " or s.departmentName like %:officeName% " + " or s.officeName like %:staffName% "
			+ " or s.officeShortName like %:staffName% )")
	List<OpsArrest> findArrestgetByConAdv(@Param("noticeCode") String noticeCode,
			@Param("arrestCode") String arrestCode, @Param("occurrenceDateFrom") Date occurrenceDateFrom,
			@Param("occurrenceDateTo") Date occurrenceDateTo, @Param("staffName") String staffName,
			@Param("officeName") String officeName);

}
