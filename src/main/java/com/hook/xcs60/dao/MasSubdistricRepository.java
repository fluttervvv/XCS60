package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.MasSubdistrict;

public interface MasSubdistricRepository extends CrudRepository<MasSubdistrict, String> {
	@Query("SELECT m FROM MasSubdistrict m WHERE m.isActive = :isActive") 
	List<MasSubdistrict> ArrestgetMasSubdistricgetAll(@Param("isActive") short isActive);
}
