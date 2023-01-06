package com.TcsUsingBaseClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ContactModulePomClasses.ContactPagePomPage;
import Genericmethods.BaseClass;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;

public class DeleteFirstContactIntheList  extends BaseClass{
	
	@Test
	public void delete_First_Contact_Inthe_list() {
		homePagePomPage h= new homePagePomPage(driver);
		h.clickContacts();
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
		ContactPagePomPage c= new ContactPagePomPage(driver);
		c.checkFirstCheckBox();	
		c.clickDelete();
		w.alertSwitch(driver).dismiss();
		
	}

}
