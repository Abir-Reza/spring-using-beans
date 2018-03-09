package com.abir.Hospital;

public class PatientFactory {
	
	public Patient createPatient(int id , String name ) {
		
		System.out.println("this is factory class");
		
		return new Patient(id,name);
	}

}
