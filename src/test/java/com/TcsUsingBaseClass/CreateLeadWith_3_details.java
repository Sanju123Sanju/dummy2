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
import LeadModulePomClasses.LeadPagePomClass;

public class CreateLeadWith_3_details extends BaseClass {
/**
 * create lead with 3 details
 * @throws Throwable 
 */
	@Test
	public void createLead_3_details() throws Throwable {
		 JavaUtilityMethods j= new JavaUtilityMethods();
		 DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 12, 1)+j.getRandomNumber();
			
		  String email= d.getFetchdataFromExcel("Sheet1", 5, 2)+j.getRandomNumber()+"@gmail.com";
		  String department= d.getFetchdataFromExcel("Sheet1",15, 1)+j.getRandomNumber();
		 String company=d.getFetchdataFromExcel("Sheet1", 10, 1);
		   
			 homePagePomPage h= new homePagePomPage(driver);
				h.clickLeads();;
			LeadPagePomClass l = new LeadPagePomClass(driver);
			l.clickAddnew();
			l.nameText(data);
			l.companyText(company);	
			l.emailText(email);
			l.clickSave();	
			
	}
}
