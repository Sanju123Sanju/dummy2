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

import Genericmethods.BaseClass;
import Genericmethods.DataUtility;
import Genericmethods.JavaUtilityMethods;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class CreateOrganisation extends BaseClass {

	@Test
	public void createOrganisations() throws Throwable {
		
	     JavaUtilityMethods j= new JavaUtilityMethods();
	     DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 12, 1)+j.getRandomNumber();
		 String email= d.getFetchdataFromExcel("Sheet1", 5, 2)+j.getRandomNumber()+"@gmail.com";
   
	    homePagePomPage h= new homePagePomPage(driver);
		h.clickorg();
		
		OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
		o.clickAddnew();
		
		o.nameText(data);
		o.emailText(email);
		o.clickSave();
		
		
	}
}
