package com.wlife.service;

import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wlife.modal.Animal;
import com.wlife.modal.Incident;
import com.wlife.modal.InidentPhotos;
import com.wlife.repository.AnimalRepository;
import com.wlife.repository.IncidentPhotosRepository;
import com.wlife.repository.IncidentRepository;

@Service
public class IncidentService {

	@Autowired
	private IncidentRepository incidentRepository;

	@Autowired
	private AnimalRepository animalRepository;

	@Autowired
	private IncidentPhotosRepository incidentPhotosRepository;

	public void incident_save(Incident incident) {
		Incident inci = new Incident();
		int currenthwcid = 0;
		List<Animal> animals = new ArrayList<>();
		List<InidentPhotos> animalphotos = new ArrayList<>();
		try {
			if (incident.getHwc_id() == 0) {
				inci.setRange_id(incident.getRange_id());
				inci.setSpecies_id(incident.getSpecies_id());
				inci.setLat(incident.getLat());
				inci.setLng(incident.getLng());
				inci.setIncidentdate(incident.getIncidentdate());
				inci.setPlace_of_incident(incident.getPlace_of_incident());
				inci.setRemarks(incident.getRemarks());
				inci.setIsactive(true);
				inci.setSource_id(incident.getSource_id());
				incidentRepository.save(inci);
				currenthwcid = incidentRepository.getCurrentHwcId();
				if (!incident.getAnimaldet().isEmpty()) {
					for (Animal animaldet : incident.getAnimaldet()) {
						Animal animal = new Animal();
						animal.setAgroup_id(animaldet.getAgroup_id());
						animal.setCondition_id(animaldet.getCondition_id());
						animal.setCounts(animaldet.getCounts());
						animal.setCounts(animaldet.getCounts());
						animal.setHwc_id(currenthwcid);
						animal.setIsactive(true);
						animals.add(animal);
						// animalRepository.save(animal);
					}
					animalRepository.saveAll(animals);
				}
				if (!incident.getIncidentPhotos().isEmpty()) {
					for (InidentPhotos inidentPhotos : incident.getIncidentPhotos()) {

						String folderPath = "D:/Project WildLife Management/IncidentPhotos/";
						String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
						
						 LocalDateTime now = LocalDateTime.now();
					        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm:ss");
					        String formattedDateTime = now.format(formatter);
						
						
						//System.out.print("timestamp--"+formattedDateTime );
						String filePath = folderPath + (inidentPhotos.getImg_name());
						System.out.println("filepath--"+filePath );
						System.out.println("image name--"+inidentPhotos.getImg_name()+formattedDateTime );
						
						String image_name=inidentPhotos.getImg_name()+formattedDateTime ;
						File file = new File(folderPath);
						String base64Data = inidentPhotos.getImg_base64();
						if (base64Data.contains(",")) {
						    base64Data = base64Data.split(",")[1];
						}
						byte[] imageBytes = Base64.getDecoder().decode(base64Data);
						FileOutputStream fos = new FileOutputStream(filePath);
						fos.write(imageBytes);
						InidentPhotos IniPhotos = new InidentPhotos();
						//IniPhotos.setImg_base64(inidentPhotos.getImg_base64());
						IniPhotos.setImg_base64(inidentPhotos.getImg_base64());
						IniPhotos.setImg_name(image_name);
						IniPhotos.setImg_path(filePath);
						IniPhotos.setHwc_id(currenthwcid);
						IniPhotos.setIsactive(true);
						animalphotos.add(IniPhotos);
						System.out.print("iamge 2");
					}
					incidentPhotosRepository.saveAll(animalphotos);
					System.out.print("iamge 3");
				}
			}

		} catch (Exception e) {
		}
		if (incident.getHwc_id() != 0) {

		}

	}

}
