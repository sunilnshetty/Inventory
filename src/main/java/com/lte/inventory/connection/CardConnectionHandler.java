package com.lte.inventory.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lte.inventory.dto.Card;

public class CardConnectionHandler {

public void  saveCard(Card card) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(card);
		
		session.getTransaction().commit();
		
		session.close();
		
	}

}
