package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.hook.xcs60.model.Arrest;

public interface ArrestRepository extends CrudRepository<Arrest,String>  {

	@Query("SELECT t FROM Arrest t where t.arrestCode = :keyword OR t.arrestDesc = :keyword") 
	List<Arrest> findByKeyword(@Param("keyword") String keyword);
	
	
}
