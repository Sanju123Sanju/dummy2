package com.TcsUsingBaseClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ContactModulePomClasses.ContactPagePomPage;
import Genericmethods.BaseClass;
import Genericmethods.DataUtility;
import Genericmethods.JavaUtilityMethods;
import HomePagePomClass.homePagePomPage;

public class SearchContactInContactModule extends BaseClass{

	@Test
	public void search_Contact_ContactModule() throws Throwable {
		
		 DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 13, 1);

		homePagePomPage h= new homePagePomPage(driver);
		h.clickContacts();
		
		ContactPagePomPage c=  new ContactPagePomPage(driver);
		c.searchforSend(data);
		c.clickSearchButton();
		
	}
}
