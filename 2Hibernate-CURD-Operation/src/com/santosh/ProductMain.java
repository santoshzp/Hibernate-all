package com.santosh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductMain {
	public static void main(String args[]) {
		// Step   I
		Configuration conf = new Configuration();
		conf.configure("com/santosh/hibernate.cfg.xml");
		
		// Step II
		
		SessionFactory factory = conf.buildSessionFactory();
		
		// Step III
		
		Session session = factory.openSession();
		
		// Create object of model class
		
		Product p = new Product();
		
		p.setId(105);
		p.setProductName("santosh zirpe");
		p.setPrice(453);
		
		// step VI
		
		Transaction t = session.beginTransaction();
		
			// Step V
		
		session.save(p);
		System.out.println("Insert Reacord Successfully...");
		 t.commit();
		 
		 // Step  VII
		 
		 session.close();
		 factory.close();
		 
		 
		 
		
		
		
		
		
		
		
	}

}