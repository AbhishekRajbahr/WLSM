package com.wlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wlife.modal.Incident;
import com.wlife.service.IncidentService;

@RestController
@RequestMapping("/incidentUrl")
public class IncidentController {

	@Autowired
	private IncidentService incidentService;
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public void incidentsave(@RequestBody Incident incident) {
		incidentService.incident_save(incident);	
	}
}
