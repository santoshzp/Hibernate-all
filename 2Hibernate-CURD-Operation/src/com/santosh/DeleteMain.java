package com.santosh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteMain {
	public static void main(String args[]) {
		// Step   I
		Configuration conf = new Configuration();
		conf.configure("com/santosh/hibernate.cfg.xml");
		
		// Step II
		
		SessionFactory factory = conf.buildSessionFactory();
		
		// Step III
		
		Session session = factory.openSession();
		
		// Create object of model class
		
		Object o=session.get(Product.class,101);
		Product p=(Product)o;






	//step 4
	
	Transaction t=session.beginTransaction();
	
	//step 5
	session.delete(p);
		System.out.println("Delete Reacord Successfully...");
		 t.commit();
		 
		 // Step  VII
		 
		 session.close();
		 factory.close();
		 
		 
		 
		
		
		
		
		
		
		
	}

}
