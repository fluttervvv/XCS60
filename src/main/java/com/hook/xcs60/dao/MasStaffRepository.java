package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.MasStaff;

public interface MasStaffRepository extends CrudRepository<MasStaff, String>{
	@Query("SELECT m FROM MasStaff m WHERE m.isActive = :isActive") 
	List<MasStaff> ArrestgetMasOfficegetAll(@Param("isActive") short isActive);
}
