package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.ArrestLawbreaker;

public interface ArrestLawbreakerRepository extends CrudRepository<ArrestLawbreaker,String>  {
	@Query("SELECT t FROM ArrestLawbreaker t ") 
	List<ArrestLawbreaker> findByKeyword(@Param("keyword") String keyword);
}
