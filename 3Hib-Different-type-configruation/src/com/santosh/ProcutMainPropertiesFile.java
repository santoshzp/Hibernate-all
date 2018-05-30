package com.santosh;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProcutMainPropertiesFile {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		//Properties pr= new Properties();
		//conf.getProperties();
		//conf.addProperties();
		conf.addResource("com/santosh/product.hbm.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
			
		Session session = factory.openSession();
		
		Product p = new Product();
		p.setId(12343);
		p.setProductName("Santy zirpe");
		p.setPrice(5343);
		
		Transaction t = session.beginTransaction();
		
		session.save(p);
		System.out.println("Insert reacord Successfully...");
		t.commit();
		factory.close();
		session.close();
	}

}
