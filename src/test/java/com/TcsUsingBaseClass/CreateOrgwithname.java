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

public class CreateOrgwithname extends BaseClass {
	
	@Test
	public void createOrganisationwithName() throws Throwable {
     
		JavaUtilityMethods j= new JavaUtilityMethods();
		DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 12, 1)+j.getRandomNumber();
		 
    homePagePomPage h= new homePagePomPage(driver);
	h.clickorg();
	
	OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
	o.clickAddnew();
	
	o.nameText(data);
	
	o.clickSave();
	
	
	}
}
