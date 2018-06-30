package com.hook.xcs60.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.Arrest;
import com.hook.xcs60.model.ArrestStaff;

public interface ArrestStaffRepository extends CrudRepository<ArrestStaff, Integer> {

	@Query("SELECT t FROM ArrestStaff t where t.staffId = :staffId") 
	List<ArrestStaff> findByKeyword(@Param("staffId") String staffId);
}
