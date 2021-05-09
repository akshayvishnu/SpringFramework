package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Alien")
public class Alien {
	
	@Id
	@Column(name = "AlienId")
	private int aId;
	
	@Column(name = "AlienName")
	private String aName;
	
	@Column(name = "Technology")
	private String tech;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + ", tech=" + tech + "]";
	}
	
	
	

}
