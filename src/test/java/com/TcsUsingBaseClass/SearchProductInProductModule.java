package com.TcsUsingBaseClass;

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

public class SearchProductInProductModule extends BaseClass{
	
	@Test
	public void searchProduct_in_Product_Module() throws Throwable {
		 DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1", 14, 1);

		   homePagePomPage h= new homePagePomPage(driver);
			h.clickProduct();
		ProductPagePomPage p = new ProductPagePomPage(driver);
			p.searchforSend(data);
			p.clickSearchButton();
	}

}
