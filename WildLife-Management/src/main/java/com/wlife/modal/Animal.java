package com.wlife.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="animaldet")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animalid_seq")
	@SequenceGenerator(name = "animalid_seq", sequenceName = "animal_id__seq", allocationSize = 1)
	private Integer animal_id;
	private Integer condition_id;
	private Integer agroup_id;
	private Integer counts;
	private boolean isactive;
	private Integer hwc_id;
	public Integer getAnimal_id() {
		return animal_id;
	}
	public void setAnimal_id(Integer animal_id) {
		this.animal_id = animal_id;
	}
	public Integer getCondition_id() {
		return condition_id;
	}
	public void setCondition_id(Integer condition_id) {
		this.condition_id = condition_id;
	}
	public Integer getAgroup_id() {
		return agroup_id;
	}
	public void setAgroup_id(Integer agroup_id) {
		this.agroup_id = agroup_id;
	}
	public Integer getCounts() {
		return counts;
	}
	public void setCounts(Integer counts) {
		this.counts = counts;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public Integer getHwc_id() {
		return hwc_id;
	}
	public void setHwc_id(Integer hwc_id) {
		this.hwc_id = hwc_id;
	}
	public Animal(Integer animal_id, Integer condition_id, Integer agroup_id, Integer counts, boolean isactive,
			Integer hwc_id) {
		super();
		this.animal_id = animal_id;
		this.condition_id = condition_id;
		this.agroup_id = agroup_id;
		this.counts = counts;
		this.isactive = isactive;
		this.hwc_id = hwc_id;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Animal [animal_id=" + animal_id + ", condition_id=" + condition_id + ", agroup_id=" + agroup_id
				+ ", counts=" + counts + ", isactive=" + isactive + ", hwc_id=" + hwc_id + "]";
	}
	
	
}
