package com.lte.inventory.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lte.inventory.dto.ConnectorType;
import com.lte.inventory.dto.Site;

public class ConnectorTypeConnectionHandler {
	public void saveConnectorType(ConnectorType ct) {

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(ct);

		session.getTransaction().commit();

		session.close();

	}

}
