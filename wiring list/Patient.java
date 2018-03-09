package com.abir.Hospital;

import java.util.List;

public class Patient {

	private int id;
	private String name ;
	private List<String> contactList; 
	
	 public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	public Patient(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	

	public void onCreate() {
		System.out.println("patient created " +this);
	};
	
	public void onDestroy() {
		System.out.println("destroyed patient");
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

	public List<String> getContactList() {
		return contactList;
	}

	public void setContactList(List<String> contactList) {
		this.contactList = contactList;
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", contactList=" + contactList + "]";
	}
	
	
	
	
}
