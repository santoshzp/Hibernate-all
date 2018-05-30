package com.santosh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectRecordMain {
	public static void main(String args[]) {
		// Step   I
		Configuration conf = new Configuration();
		conf.configure("com/santosh/hibernate.cfg.xml");
		
		// Step II
		
		SessionFactory factory = conf.buildSessionFactory();
		
		// Step III
		
		Session session = factory.openSession();
		
		// set Product class and Id of reacord
		
		Object obj =session.get(Product.class, 101);
		
		
		Product p = (Product)obj;
		System.out.println("==================Product Record=============");
		System.out.println(p.getId());
		System.out.println(p.getProductName());
		System.out.println(p.getPrice());
		System.out.println(p.toString());
		
		System.out.println("==================Product Record=============");

		 session.close();
		 factory.close();	
		
	}

}
