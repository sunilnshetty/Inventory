package com.lte.inventory.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.lte.inventory.dto.Slot;

public class SlotConnectionHandler {
public void  saveSlot(Slot slot) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(slot);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}
