package com.wlife.modal;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="incident")
public class Incident {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hwc_id_seq")
	@SequenceGenerator(name = "hwc_id_seq", sequenceName = "hwcid_incident__seq", allocationSize = 1)
	private Integer hwc_id;
	private Integer range_id;
	private Integer species_id;
	private Double lat;
	private Double lng;
	@Temporal(TemporalType.TIMESTAMP)
	private Date incidentdate;
	private String place_of_incident;
	private String  remarks;
	private boolean isactive;
	private Integer source_id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="hwc_id")
	private List<Animal> animaldet;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="hwc_id")
	private List<InidentPhotos> incidentPhotos;

	public Integer getHwc_id() {
		return hwc_id;
	}

	public void setHwc_id(Integer hwc_id) {
		this.hwc_id = hwc_id;
	}

	public Integer getRange_id() {
		return range_id;
	}

	public void setRange_id(Integer range_id) {
		this.range_id = range_id;
	}

	public Integer getSpecies_id() {
		return species_id;
	}

	public void setSpecies_id(Integer species_id) {
		this.species_id = species_id;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Date getIncidentdate() {
		return incidentdate;
	}

	public void setIncidentdate(Date incidentdate) {
		this.incidentdate = incidentdate;
	}

	public String getPlace_of_incident() {
		return place_of_incident;
	}

	public void setPlace_of_incident(String place_of_incident) {
		this.place_of_incident = place_of_incident;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public Integer getSource_id() {
		return source_id;
	}

	public void setSource_id(Integer source_id) {
		this.source_id = source_id;
	}

	public List<Animal> getAnimaldet() {
		return animaldet;
	}

	public void setAnimaldet(List<Animal> animaldet) {
		this.animaldet = animaldet;
	}

	public List<InidentPhotos> getIncidentPhotos() {
		return incidentPhotos;
	}

	public void setIncidentPhotos(List<InidentPhotos> incidentPhotos) {
		this.incidentPhotos = incidentPhotos;
	}

	public Incident(Integer hwc_id, Integer range_id, Integer species_id, Double lat, Double lng, Date incidentdate,
			String place_of_incident, String remarks, boolean isactive, Integer source_id, List<Animal> animaldet,
			List<InidentPhotos> incidentPhotos) {
		super();
		this.hwc_id = hwc_id;
		this.range_id = range_id;
		this.species_id = species_id;
		this.lat = lat;
		this.lng = lng;
		this.incidentdate = incidentdate;
		this.place_of_incident = place_of_incident;
		this.remarks = remarks;
		this.isactive = isactive;
		this.source_id = source_id;
		this.animaldet = animaldet;
		this.incidentPhotos = incidentPhotos;
	}

	public Incident() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Incident [hwc_id=" + hwc_id + ", range_id=" + range_id + ", species_id=" + species_id + ", lat=" + lat
				+ ", lng=" + lng + ", incidentdate=" + incidentdate + ", place_of_incident=" + place_of_incident
				+ ", remarks=" + remarks + ", isactive=" + isactive + ", source_id=" + source_id + ", animaldet="
				+ animaldet + ", incidentPhotos=" + incidentPhotos + "]";
	}
	
	
}
