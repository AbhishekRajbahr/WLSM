package com.wlife.modal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="incidentimg")
public class InidentPhotos {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "imgid_seq")
	@SequenceGenerator(name = "imgid_seq", sequenceName = "img_id_seq", allocationSize = 1)
	private Integer img_id;
	private String img_name;
	private String img_base64;
	private String img_path;
	private boolean isactive;
	private Integer hwc_id;
	public Integer getImg_id() {
		return img_id;
	}
	public void setImg_id(Integer img_id) {
		this.img_id = img_id;
	}
	public String getImg_name() {
		return img_name;
	}
	public void setImg_name(String img_name) {
		this.img_name = img_name;
	}
	public String getImg_base64() {
		return img_base64;
	}
	public void setImg_base64(String img_base64) {
		this.img_base64 = img_base64;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
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
	public InidentPhotos(Integer img_id, String img_name, String img_base64, String img_path, boolean isactive,
			Integer hwc_id) {
		super();
		this.img_id = img_id;
		this.img_name = img_name;
		this.img_base64 = img_base64;
		this.img_path = img_path;
		this.isactive = isactive;
		this.hwc_id = hwc_id;
	}
	public InidentPhotos() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "InidentPhotos [img_id=" + img_id + ", img_name=" + img_name + ", img_base64=" + img_base64
				+ ", img_path=" + img_path + ", isactive=" + isactive + ", hwc_id=" + hwc_id + "]";
	}
	
	
}
