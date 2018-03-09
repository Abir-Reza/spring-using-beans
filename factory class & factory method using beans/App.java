package com.abir.Hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/abir/Hospital/beans/beans.xml");
    	Patient person = (Patient) context.getBean("patient_bean");
    	
    	Address address= (Address) context.getBean("address_bean");
    	
    	
    
		System.out.println(person);
		System.out.println(person);
    	
    	
    	((ClassPathXmlApplicationContext)context).close();
    	
    }
}
