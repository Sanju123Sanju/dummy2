package com.TcsUsingBaseClass;

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

public class CreateLeadwithName extends BaseClass{

	@Test
	public void ceateLead_with_name() throws Throwable {

	     JavaUtilityMethods j= new JavaUtilityMethods();
	     DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 12, 1)+j.getRandomNumber();
			
		String company=d.getFetchdataFromExcel("Sheet1", 10, 1);
		  
		 
		 homePagePomPage h= new homePagePomPage(driver);
			h.clickLeads();;
		LeadPagePomClass l = new LeadPagePomClass(driver);
		l.clickAddnew();
		l.nameText(data);
		l.companyText(company);	
		l.clickSave();	
		
		
	}
}
