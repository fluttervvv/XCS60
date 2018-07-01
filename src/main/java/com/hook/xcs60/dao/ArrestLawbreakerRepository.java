package com.hook.xcs60.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.OpsArrestLawbreaker;

public interface ArrestLawbreakerRepository extends CrudRepository<OpsArrestLawbreaker,String>  {
	@Query("SELECT o FROM OpsArrestLawbreaker o WHERE  o.lawbreakerID = :lawbreakerID") 
	Optional<OpsArrestLawbreaker> findByLawbreakerID(@Param("lawbreakerID") BigDecimal lawbreakerID);
}
