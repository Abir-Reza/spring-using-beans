package com.abir.Hospital;

import java.util.List;

public class Patient {

	private int id;
	private String name;
	private List<EmergencyContact> emergencyContact;
	private EmergencyContact innerBean;
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public List<EmergencyContact> getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(List<EmergencyContact> emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public EmergencyContact getInnerBean() {
		return innerBean;
	}

	public void setInnerBean(EmergencyContact innerBean) {
		this.innerBean = innerBean;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", emergencyContact=" + emergencyContact + ", innerBean="
				+ innerBean + "]";
	}

	
}
