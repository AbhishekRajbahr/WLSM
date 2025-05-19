package com.wlife.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wlife.modal.ListSourceDetails;
import com.wlife.modal.Source;
import com.wlife.repository.SourceRepository;

@Service
public class SourceService {

	@Autowired
	private SourceRepository sourceRepository;

	public ResponseEntity<String> Sourcedetailssave(Source source) {
		Source detsour = new Source();
		detsour.setSpecies_id(source.getSpecies_id());
		detsour.setRange_id(source.getRange_id());
		detsour.setLoner(source.isLoner());
		detsour.setSourcename(source.getSourcename());
		detsour.setMobile(source.getMobile());
		detsour.setLat(source.getLat());
		detsour.setLng(source.getLng());
		detsour.setIsactive(true);
		detsour.setRamarks(source.getRamarks());
		detsour.setSourcedate(source.getSourcedate());
		if (source.getSource_id() == 0) {
			try {
				sourceRepository.save(detsour);
				return ResponseEntity.ok("Source created successfully!");
			} catch (Exception e) {
				return ResponseEntity.ok("Something went wrong");
			}
		} else {
			// return ResponseEntity.ok("You can use only insert source details");
			detsour.setSource_id(source.getSource_id());
			sourceRepository.save(detsour);
			return ResponseEntity.ok("Update Source record successfully!");
		}
	}

	public Iterable<ListSourceDetails> getdetailsource(Integer sourceid) {
		if (sourceid == 0) {
			//Iterable<Source> sourcedets = sourceRepository.findAll();
			Iterable<ListSourceDetails> sourcedets = sourceRepository.getSourcAllRecords();
			System.out.print(sourcedets);
			   return sourcedets;
		} else {
			 return Collections.emptyList();
		}
		
	}

}
