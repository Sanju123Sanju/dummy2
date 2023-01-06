package com.TcsUsingBaseClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import Genericmethods.DataUtility;
import HomePagePomClass.homePagePomPage;
import LeadModulePomClasses.LeadPagePomClass;


public class SearchLeadInLeadModule extends BaseClass {
	
	@Test
	public void search_leadIn_lead_Module() throws Throwable {
		 DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 12, 1);

		homePagePomPage h= new homePagePomPage(driver);
		h.clickLeads();
		
		LeadPagePomClass l= new LeadPagePomClass(driver);
	    l.searchforSend(data);
		l.clickSearchButton();
		
		
	}

}
