package com.wlife.modal;

import java.util.Date;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "sourcedet")
public class Source {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "source_id_seq")
	@SequenceGenerator(name = "source_id_seq", sequenceName = "source_seq", allocationSize = 1)
	private Integer source_id;
	@NotNull
	@Min(value = 1, message = "Species ID must be greater than 0")
	private Integer species_id;
	@NotNull
	@Min(value = 1, message = "Range ID must be greater than 0")
	private Integer range_id;
	private boolean loner;
	@NotNull
	@Size(max = 30, message = "Source Name must be greater than 30 Character")
	private String sourcename;
	@Size(min = 9, max = 10, message = "Mobile number must be between 9 and 10 digits")
	private String mobile;
	@NotNull(message = "lattitude is mendatory")
	private Double lat;
	@NotNull(message = "longitude is mendatory")
	private Double lng;
	@Size(max = 200, message = "Remarks allow only 200 character")
	private String ramarks;
	private boolean isactive;
	@NotNull(message = "Source Date is mendatory")
	private Date sourcedate;

	public Integer getSource_id() {
		return source_id;
	}

	public void setSource_id(Integer source_id) {
		this.source_id = source_id;
	}

	public Integer getSpecies_id() {
		return species_id;
	}

	public void setSpecies_id(Integer species_id) {
		this.species_id = species_id;
	}

	public Integer getRange_id() {
		return range_id;
	}

	public void setRange_id(Integer range_id) {
		this.range_id = range_id;
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

	public String getRamarks() {
		return ramarks;
	}

	public void setRamarks(String ramarks) {
		this.ramarks = ramarks;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public Date getSourcedate() {
		return sourcedate;
	}

	public void setSourcedate(Date sourcedate) {
		this.sourcedate = sourcedate;
	}

	public Source(Integer source_id, Integer species_id, Integer range_id, boolean loner, String sourcename,
			String mobile, Double lat, Double lng, String ramarks, boolean isactive, Date sourcedate) {
		super();
		this.source_id = source_id;
		this.species_id = species_id;
		this.range_id = range_id;
		this.loner = loner;
		this.sourcename = sourcename;
		this.mobile = mobile;
		this.lat = lat;
		this.lng = lng;
		this.ramarks = ramarks;
		this.isactive = isactive;
		this.sourcedate = sourcedate;
	}

	public Source() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Source [source_id=" + source_id + ", species_id=" + species_id + ", range_id=" + range_id + ", loner="
				+ loner + ", sourcename=" + sourcename + ", mobile=" + mobile + ", lat=" + lat + ", lng=" + lng
				+ ", ramarks=" + ramarks + ", isactive=" + isactive + ", sourcedate=" + sourcedate + "]";
	}

}
