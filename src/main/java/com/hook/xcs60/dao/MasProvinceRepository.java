package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.MasProvince;
import com.hook.xcs60.model.MasStaff;

public interface MasProvinceRepository extends CrudRepository<MasProvince, String> {
	@Query("SELECT m FROM MasProvince m WHERE m.isActive = :isActive") 
	List<MasProvince> ArrestgetMasProvincegetAll(@Param("isActive") short isActive);
}	
