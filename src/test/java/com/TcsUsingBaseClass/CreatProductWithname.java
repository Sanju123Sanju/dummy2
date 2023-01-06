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

public class CreatProductWithname extends BaseClass{

	@Test
	public void createProductwithName() throws Throwable {
		JavaUtilityMethods j= new JavaUtilityMethods();
		DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 14, 1)+j.getRandomNumber();
		  
		homePagePomPage h= new homePagePomPage(driver);
			h.clickProduct();
		ProductPagePomPage p= new ProductPagePomPage(driver);
		p.clickAddnew();
		p.productnametextbox(data);
		p.clickSave();
			
	}
}
