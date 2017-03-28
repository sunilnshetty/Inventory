package com.lte.inventory.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lte.inventory.dto.Site;

public class SearchsiteHandler {

	public Site retrieve_site(String name) {	
//		Site site = new Site();
//		site.setSiteInstId(name);

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Site resultSite = (Site) session.get(Site.class, name);
		
		System.out.println("resultSite.getSiteInstId(): " + resultSite.getSiteInstId());
		
		session.close();
		
		
		return resultSite ;
	}
}
