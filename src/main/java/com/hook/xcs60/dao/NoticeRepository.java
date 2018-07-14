package com.hook.xcs60.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.OpsNotice;

public interface NoticeRepository extends CrudRepository<OpsNotice,String> {

	@Query("select t1 from OpsNotice t1 "
			+ " join OpsNoticeStaff t2 on t1.noticeCode = t2.noticeCode "
			+ " where t1.isActive = 1 and ( "
			+ " t1.noticeCode like %:keyword% or "
			+ "	t1.noticeStation like %:keyword% or "
			+ " t2.titleName like %:keyword% or "
			+ " t2.firstName like %:keyword% or "
			+ " t2.lastName like %:keyword% or "
			+ " t2.positionName like %:keyword% or "
			+ " t2.posLevel like %:keyword% or "
			+ " t2.departmentName like %:keyword%  )"
			)
	public List<OpsNotice> arrestNoticegetByKeyword(@Param("keyword")String keyword);
	
	
	@Query("select t1 from OpsNotice t1 "
			+ " join OpsNoticeStaff t2 on t1.noticeCode = t2.noticeCode "
			+ " where t1.isActive = 1 "
			+ " and ( t1.noticeDueDate between :noticeDateFrom and  :noticeDateTo) "
			+ " and ( t1.noticeCode = :noticeCode  ) and  "
			+ " ( "
			+ "	t1.noticeStation like %:staffName% or "
			+ " t2.titleName like %:staffName% or "
			+ " t2.firstName like %:staffName% or "
			+ " t2.lastName like %:staffName% or "
			+ " t2.officeName like %:officeName% or "
			+ " t2.officeShortName like %:officeName% or "
			+ " t2.departmentName like %:officeName%  "
			+ " ) "
			)
	public List<OpsNotice> arrestgetByConAdv(
				@Param("noticeCode")String noticeCode,
				@Param("noticeDateFrom")Date noticeDateFrom,
				@Param("noticeDateTo")Date noticeDateTo,
				@Param("staffName")String staffName,
				@Param("officeName")String officeName
			);
	
}
