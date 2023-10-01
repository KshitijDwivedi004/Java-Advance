package com.states;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Embeddable
public class Certification {
	@Id
	private int id;
	
	private String certificationName;
	private String duration;
	
	public String getCertificationName() {
		return certificationName;
	}
	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Certification(int id, String certificationName, String duration) {
		super();
		this.id = id;
		this.certificationName = certificationName;
		this.duration = duration;
	}
	public Certification() {
		super();
	}
}
