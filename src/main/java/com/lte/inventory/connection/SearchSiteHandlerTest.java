package com.lte.inventory.connection;

import com.lte.inventory.dto.Site;



public class SearchSiteHandlerTest{
	
	public void testRetrieveSite(){
		SearchsiteHandler searchsiteHandler = new SearchsiteHandler();
		Site site = searchsiteHandler.retrieve_site("hassan");
		
		System.out.println("site.getSiteInstId(): " + site.getSiteInstId());
	}
	
	

}
