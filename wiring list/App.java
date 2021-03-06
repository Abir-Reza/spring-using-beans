package com.abir.Hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world.!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/abir/Hospital/beans/beans.xml");
    	Patient patient = (Patient) context.getBean("patient_bean");
		
    	for(String name:patient.getContactList())
    	{
    		System.out.println(name);
    	}
    	
    	((ClassPathXmlApplicationContext)context).close();
    	
    }
}
