package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.MasDistrict;
import com.hook.xcs60.model.MasProvince;

public interface MasDistricRepository extends CrudRepository<MasDistrict, String> {
	@Query("SELECT m FROM MasDistrict m WHERE m.isActive = :isActive") 
	List<MasDistrict> ArrestgetMasDistricgetAll(@Param("isActive") short isActive);
}
