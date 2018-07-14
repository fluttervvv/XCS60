package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.MasOffice;

public interface ArrestgetMasOfficeRepository extends CrudRepository<MasOffice, String> {
	@Query("SELECT m FROM MasOffice m WHERE  m.isActive = :isActive") 
	List<MasOffice> ArrestgetMasOfficegetAll(@Param("isActive") short isActive);
}
