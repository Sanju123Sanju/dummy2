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
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;

public class ClickAllModule extends BaseClass{
   @Test
	public void clickModules() throws Throwable {
	  
	   WebDriverUtilityMethods w = new WebDriverUtilityMethods();
	   
		homePagePomPage h= new homePagePomPage(driver);
		 
		h.clickCalender();
		h.clickContacts();
		h.clickLeads();
		h.clickorg();
		h.clickProduct();
		w.refresh(driver);
		w.backward(driver);
		w.backward(driver);
		w.forward(driver);
		w.forward(driver);
	
	}
}
