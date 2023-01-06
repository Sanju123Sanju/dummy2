package com.TcsUsingBaseClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class PrintAllOrgNames extends BaseClass {
	
	@Test
	public void print_All_OrganizationNames() {
		homePagePomPage h= new homePagePomPage(driver);
		h.clickorg();
		
		OrganizationPagePomPage o = new OrganizationPagePomPage(driver);
		o.printAllOrganizationnames();
		
		
		
	}

}
