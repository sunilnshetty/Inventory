package com.lte.inventory.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lte.inventory.dto.Equipment;


public class EquipmentConnectionhandler {
public void  saveEquipment(Equipment equipment) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(equipment);
		
		session.getTransaction().commit();
		
		session.close();
		
	}

}
