package com.hook.xcs60.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.OpsArrestStaff;

public interface ArrestStaffRepository extends CrudRepository<OpsArrestStaff, BigDecimal> {

	@Query("SELECT o FROM OpsArrestStaff o WHERE o.staffID = :staffID") 
	List<OpsArrestStaff> findByStaffID(@Param("staffID") BigDecimal staffID);
}
