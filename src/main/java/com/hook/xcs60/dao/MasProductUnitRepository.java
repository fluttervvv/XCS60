package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.MasProductunit;

public interface MasProductUnitRepository  extends CrudRepository<MasProductunit, String> {
	@Query("SELECT m FROM MasProductunit m WHERE m.isActive = :isActive") 
	List<MasProductunit> ArrestgetMasProductUnitgetAll(@Param("isActive") short isActive);
}	

