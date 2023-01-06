package com.TcsUsingBaseClass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class DeleteAllOrgAtAtime extends BaseClass {
	
	@Test
	public void delete_all_OrgAt_A_time() {
		homePagePomPage h= new homePagePomPage(driver);
		h.clickorg();
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
		OrganizationPagePomPage o = new OrganizationPagePomPage(driver);
		o.selectAllAtonceCheckBox();	
		o.clickDelete();
		w.alertSwitch(driver).dismiss();
	}

}
