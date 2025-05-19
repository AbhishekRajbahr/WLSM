package com.wlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wlife.modal.ListSourceDetails;
import com.wlife.modal.Source;
import com.wlife.service.SourceService;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value="/sourceUrl")
public class SourceController {

	@Autowired
	private SourceService sourceService;
	
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ResponseEntity<String> Sourcedetailssave(@Valid @RequestBody Source source)
	{
		ResponseEntity<String> savesource=sourceService.Sourcedetailssave(source);
		return savesource;
		
	}
	@RequestMapping(value="/getdetails/{sourceid}",method = RequestMethod.GET)
	public ResponseEntity<Iterable<ListSourceDetails>> GetSourcedetails(@PathVariable("sourceid") Integer sourceid) {
		
		Iterable<ListSourceDetails> sourcedets=	sourceService.getdetailsource(sourceid);
		return ResponseEntity.ok(sourcedets);
		
	}
}
