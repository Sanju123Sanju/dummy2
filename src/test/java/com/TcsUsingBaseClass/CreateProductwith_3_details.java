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
import ProductModulePomClass.ProductPagePomPage;

public class CreateProductwith_3_details extends BaseClass {

	
	@Test
	public void createProductwith3_details() throws Throwable {
		JavaUtilityMethods j= new JavaUtilityMethods();
		DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 14, 1)+j.getRandomNumber();
		 String website = d.getFetchdataFromExcel("Sheet1", 6, 1)+j.getRandomNumber()+".com";
		  
		   homePagePomPage h= new homePagePomPage(driver);
			h.clickProduct();
		ProductPagePomPage p= new ProductPagePomPage(driver);
		p.clickAddnew();
		p.productnametextbox(data);
		p.website(website);
		p.vendorpartno("P1"+j.getRandomNumber());
		p.clickSave();
	}
}
