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
import HomePagePomClass.homePagePomPage;
@Listeners(Genericmethods.VTigerListenersClasses.class)
public class PrintAllContacts extends BaseClass {

	@Test
	public void print_AllContacts_names() {
		homePagePomPage h= new homePagePomPage(driver);
		h.clickContacts();
		
		ContactPagePomPage c= new ContactPagePomPage(driver);
		c.printAllOrganizationnames();
	}
}
