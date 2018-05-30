package com.santosh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductMain {
		public static void main(String[] args) {
			Configuration conf = new Configuration();
			conf.setProperty("hibernate.connection.class_driver","com.mysql.jdbc.Driver");
			conf.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate");
			conf.setProperty("hibernate.connection.username", "root");
			conf.setProperty("hibernate.connection.password", "root");
			
			conf.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
			conf.setProperty("show_sql", "true");
			conf.setProperty("hibernate.hbm2ddl.atuo", "update");
			conf.addResource("com/santosh/product.hbm.xml");
			
			SessionFactory factory = conf.buildSessionFactory();
			Session session = factory.openSession();
			
			Product p = new Product();
			p.setId(343);
			p.setProductName("Rups zirpe");
			p.setPrice(34343);
			
			Transaction t = session.beginTransaction();
			
			session.save(p);
			System.out.println("Insert reacord Successfully...");
			t.commit();
			factory.close();
			session.close();
			
				
			
		}

}
