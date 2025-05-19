package com.wlife.modal;

import java.util.Date;

public class ListSourceDetails {

	private Integer source_id;
	private String species_en;
	private String species_as;
	private Date sourcedate;
	private boolean loner;
	private String sourcename;
	private String mobile;
	private String range_en;
	private String range_as;
	private String lat;
	private String lng;
	public Integer getSource_id() {
		return source_id;
	}
	public void setSource_id(Integer source_id) {
		this.source_id = source_id;
	}
	public String getSpecies_en() {
		return species_en;
	}
	public void setSpecies_en(String species_en) {
		this.species_en = species_en;
	}
	public String getSpecies_as() {
		return species_as;
	}
	public void setSpecies_as(String species_as) {
		this.species_as = species_as;
	}
	public Date getSourcedate() {
		return sourcedate;
	}
	public void setSourcedate(Date sourcedate) {
		this.sourcedate = sourcedate;
	}
	public boolean isLoner() {
		return loner;
	}
	public void setLoner(boolean loner) {
		this.loner = loner;
	}
	public String getSourcename() {
		return sourcename;
	}
	public void setSourcename(String sourcename) {
		this.sourcename = sourcename;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRange_en() {
		return range_en;
	}
	public void setRange_en(String range_en) {
		this.range_en = range_en;
	}
	public String getRange_as() {
		return range_as;
	}
	public void setRange_as(String range_as) {
		this.range_as = range_as;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public ListSourceDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ListSourceDetails(Integer source_id, String species_en, String species_as, Date sourcedate, boolean loner,
			String sourcename, String mobile, String range_en, String range_as, String lat, String lng) {
		super();
		this.source_id = source_id;
		this.species_en = species_en;
		this.species_as = species_as;
		this.sourcedate = sourcedate;
		this.loner = loner;
		this.sourcename = sourcename;
		this.mobile = mobile;
		this.range_en = range_en;
		this.range_as = range_as;
		this.lat = lat;
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "ListSourceDetails [source_id=" + source_id + ", species_en=" + species_en + ", species_as=" + species_as
				+ ", sourcedate=" + sourcedate + ", loner=" + loner + ", sourcename=" + sourcename + ", mobile="
				+ mobile + ", range_en=" + range_en + ", range_as=" + range_as + ", lat=" + lat + ", lng=" + lng + "]";
	}
	
	
	
}
