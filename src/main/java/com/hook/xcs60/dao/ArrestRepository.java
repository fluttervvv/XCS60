package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.hook.xcs60.model.Arrest;
import com.hook.xcs60.model.OpsArrest;

public interface ArrestRepository extends CrudRepository<OpsArrest,String>  {

	@Query("SELECT t FROM OpsArrest t where t.arrestCode = :keyword OR t.arrestDesc = :keyword") 
	List<OpsArrest> findByKeyword(@Param("keyword") String keyword);
	
	

}
