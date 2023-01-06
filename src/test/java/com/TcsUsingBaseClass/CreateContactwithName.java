package com.TcsUsingBaseClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
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

public class CreateContactwithName  extends BaseClass{
	
	@Test
	public void createContactwithName() throws Throwable {
		JavaUtilityMethods j= new JavaUtilityMethods();
		  
		DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 13, 1)+j.getRandomNumber();
		
		  homePagePomPage h= new homePagePomPage(driver);
			h.clickContacts();
			
		ContactPagePomPage c= new ContactPagePomPage(driver);	
		c.clickAddnew();
		c.nameText(data);
		c.clickSave();
		
		
		
		
		
	}

}
