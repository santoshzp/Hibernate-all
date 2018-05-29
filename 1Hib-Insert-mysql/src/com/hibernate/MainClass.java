package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main (String args[]) {
	 Configuration conf = new Configuration();
	 conf.configure("com/hibernate/hibernate.cfg.xml");
	 SessionFactory facrory =conf.buildSessionFactory();
	 Session session = facrory.openSession();
	 
	 Customer ct=new Customer(); 
	 ct.setId(30);
	 ct.setName("Rupali");
	 ct.setCity("pune");
	 
	 Transaction t = session.beginTransaction();
	 
	 session.save(ct);
	 System.out.println("Customer object inserted successfully...");
	 t.commit();
	 facrory.close();
	 session.close();
}

}
