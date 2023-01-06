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

public class SearchInHome extends BaseClass{
	
	@Test
	public void searchInHomepage() throws Throwable {
		
	     DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 13, 1);

		homePagePomPage h= new homePagePomPage(driver);
		h.clickHome();
		h.search(data);
	   	
	
	}

} 
