package com.lte.inventory.connection;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lte.inventory.dto.Site;

public class ConnectionHandler {
	
private static final Serializable Mysore = null;

//	public static SessionFactory getSessionFactory() {
//		return  
//	}
//	
//	public static Session getSession(SessionFactory sessionFactory) {
//		return 
//	}
	
	public void saveSite(Site site) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(site);
		
		session.getTransaction().commit();
		
		session.close();
		
	}

}
