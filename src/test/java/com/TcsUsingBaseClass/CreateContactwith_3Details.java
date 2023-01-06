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

public class CreateContactwith_3Details extends BaseClass {
	
	@Test
	public void createContactWith_3_Details() throws Throwable {
		
		JavaUtilityMethods j= new JavaUtilityMethods();
		 DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 13, 1)+j.getRandomNumber();
			
		  String email= d.getFetchdataFromExcel("Sheet1", 5, 1)+j.getRandomNumber()+"@gmail.com";
		  String department= d.getFetchdataFromExcel("Sheet1",15, 1)+j.getRandomNumber();
		
		  
		  homePagePomPage h= new homePagePomPage(driver);
			h.clickContacts();
			
		ContactPagePomPage c= new ContactPagePomPage(driver);	
		c.clickAddnew();
		c.nameText(data);
		c.emailText(email);
		c.departmentText(department);
		c.clickSave();
		
	}

}
