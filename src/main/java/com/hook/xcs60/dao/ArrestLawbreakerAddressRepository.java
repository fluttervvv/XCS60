package com.hook.xcs60.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hook.xcs60.model.OpsArrestLawbreakerAddress;

public interface ArrestLawbreakerAddressRepository extends CrudRepository<OpsArrestLawbreakerAddress, String> {
	@Query("SELECT o FROM OpsArrestLawbreakerAddress o WHERE  o.lawbreakerID = :lawbreakerID") 
	List<OpsArrestLawbreakerAddress> findByLawbreakerID(@Param("lawbreakerID") BigDecimal lawbreakerID);
	
	@Query("SELECT o FROM OpsArrestLawbreakerAddress o WHERE  o.lawbreakerAddressID = :lawbreakerAddressID") 
	Optional<OpsArrestLawbreakerAddress> findByLawbreakerAddressID(@Param("lawbreakerAddressID") short lawbreakerAddressID);
}
