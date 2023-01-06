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
import Genericmethods.WebDriverUtilityMethods;

public class RefreshScroll  extends BaseClass{
	
   @Test
   public void refreshScrollBy() {
	   
	   WebDriverUtilityMethods w= new WebDriverUtilityMethods();
		
	     w.refresh(driver);
	     w.ScrollBy(0,2000, driver);
		 w.refresh(driver);
		 
	   
   }

	}


