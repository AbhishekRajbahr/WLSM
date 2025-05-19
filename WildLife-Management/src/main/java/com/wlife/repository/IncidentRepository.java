package com.wlife.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wlife.modal.Incident;

public interface IncidentRepository extends CrudRepository<Incident, Integer>{
	
	@Query(nativeQuery = true,value="select hwc_id from incident order by hwc_id DESC LIMIT 1")
	public Integer getCurrentHwcId();

}
