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


public class DeleteAllContactsAtOnce extends BaseClass {
	
	@Test
	public void  delete_All_Contacts_at_Once() {
		homePagePomPage h= new homePagePomPage(driver);
		h.clickContacts();
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
		ContactPagePomPage c= new ContactPagePomPage(driver);
		c.selectAllAtonceCheckBox();	
		c.clickDelete();
		w.alertSwitch(driver).dismiss();
		
		
	}

}
