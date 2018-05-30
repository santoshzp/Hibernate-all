package com.santosh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateMain {
	public static void main(String args[]) {
		// Step   I
		Configuration conf = new Configuration();
		conf.configure("com/santosh/hibernate.cfg.xml");
		
		// Step II
		
		SessionFactory factory = conf.buildSessionFactory();
		
		// Step III
		
		Session session = factory.openSession();
		
		// Create object of model class
	
		
		Product p = (Product)session.get(Product.class, 101);
		
		p.setId(101);
		p.setProductName("santosh");
		p.setPrice(500);
		
		// step VI
		
		Transaction t = session.beginTransaction();
		
			// Step V
		
		session.save(p);
		System.out.println("Update Reacord Successfully...");
		 t.commit();
		 
		 // Step  VII
		 
		 session.close();
		 factory.close();

	}

}
