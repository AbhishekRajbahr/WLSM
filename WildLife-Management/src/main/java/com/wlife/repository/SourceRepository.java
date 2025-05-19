package com.wlife.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wlife.modal.ListSourceDetails;
import com.wlife.modal.Source;

public interface SourceRepository extends CrudRepository<Source, Integer>{

	@Query(nativeQuery = true,value="select sour.source_id,spc.species_en,spc.species_as,sour.sourcedate,sour.loner,sour.sourcename,sour.mobile,rng.range_en,rng.range_as,ROUND(sour.lat, 4)::TEXT AS lat,ROUND(sour.lng, 4)::TEXT AS lng from sourcedet sour inner join public.rangedet rng on sour.range_id = rng.range_id inner join public.species spc on sour.species_id = spc.species_id")
	public List<ListSourceDetails> getSourcAllRecords();
}
