package com.lte.inventory.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lte.inventory.dto.ConnectorType;
import com.lte.inventory.dto.SlotPort;

public class PortConnectionHandler {
public void  savePort(SlotPort port) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(port);
		
		
		session.getTransaction().commit();
		
		session.close();
		
	}

}
