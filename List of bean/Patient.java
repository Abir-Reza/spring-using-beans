package com.abir.Hospital;

import java.util.List;

public class Patient {

	private int id;
	private String name;
	private List<EmergencyContact> emergencyContact;

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

}
