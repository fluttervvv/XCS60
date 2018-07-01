package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.OpsArrestLocale;

public interface ArrestLocaleRepository extends CrudRepository<OpsArrestLocale,Long> {

	@Query("SELECT t FROM OpsArrestLocale t where t.localeID = :id") 
	List<OpsArrestLocale> findByLocaleId(@Param("id") Long id);
	
}
