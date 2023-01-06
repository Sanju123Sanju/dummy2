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

public class AddModuletohomeScreen extends BaseClass{
	
	@Test
	public void addModuletoScreen() throws Throwable {
		 
	     JavaUtilityMethods j= new JavaUtilityMethods();
       DataUtility d= new DataUtility();
	 String    data= d.getFetchdataFromExcel("Sheet1", 7, 1)+j.getRandomNumber();
		
		homePagePomPage h= new homePagePomPage(driver);
		h.clickHome();
		h.clickaddNew();
		h.clickAddModule();
		h.clickWindowTitle(data);
		h.clickSave();
	   	
		
	}

}
