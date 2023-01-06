package com.TcsUsingBaseClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class DeleteFirstOrg extends BaseClass{
	@Test
	public void deleteFirstOrganisation_intheList() {
		homePagePomPage h= new homePagePomPage(driver);
		h.clickorg();
		
		OrganizationPagePomPage o = new OrganizationPagePomPage(driver);
		o.checkFirstCheckBox();
		o.clickDelete();
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
		w.alertSwitch(driver).dismiss();
		
		
	
	}

}
