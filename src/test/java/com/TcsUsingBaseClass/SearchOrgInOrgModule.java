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
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class SearchOrgInOrgModule extends BaseClass{
	
	@Test
	public void searchOrganization_InOrganization_Module() throws Throwable {
		 DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 7, 1);

		   homePagePomPage h= new homePagePomPage(driver);
			h.clickorg();
		OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
		o.searchforSend(data);
		o.clickSearchButton();
			
	}

}
