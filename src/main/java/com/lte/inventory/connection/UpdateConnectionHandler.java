package com.lte.inventory.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lte.inventory.dto.Site;

public class UpdateConnectionHandler {
public void updateSite(String param,String param1,String param2,String param3,String param4,String param5,String param6,String param7,String param8,String param9,String param10,String param11,String param12,String param13,String param14,String param15,String param16,String param17) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Site site = new Site();
		session.beginTransaction();
        site =(Site)session.get(Site.class, param); //Retrieving object which we want to update
        site.setContacts(param17); 
        site.setLatitude(param1); 
        site.setStatus(param2); 
        site.setLongitude(param3); 
        site.setClli(param4); 
        site.setSiteId(param5); 
        site.setSiteType(param6); 
        site.setParentSiteInstId(param7); 
        site.setStreet(param8); 
        site.setFloorNumber(param9); 
        site.setCity(param10); 
        site.setRoom(param11); 
        site.setState(param12); 
        site.setCountry(param13); 
        site.setPostCode(param14); 
        site.setRestrictions(param15); 
        site.setComments(param16); 
        //Set the updated userName to the model field
        session.update(site); //Update to the database table
       
		session.save(site);
		
		session.getTransaction().commit();
		
		session.close();
	}
public void deleteSite(String param) {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	Session session = sessionFactory.openSession();
	Site site = new Site();
	site =(Site)session.get(Site.class, param);
	 
	session.beginTransaction();
   
    session.delete(site); 
   
	
	
	session.getTransaction().commit();
	
	session.close();
}
}
