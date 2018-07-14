package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.MasProduct;

public interface MasProductRepository extends CrudRepository<MasProduct, String> {
	@Query("SELECT m FROM MasProduct m WHERE m.isActive = :isActive") 
	List<MasProduct> ArrestgetMasProductgetAll(@Param("isActive") short isActive);
}	
