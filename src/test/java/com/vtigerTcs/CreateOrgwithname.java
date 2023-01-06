package com.vtigerTcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.LogInPomClass.LoginPomPage;

import Genericmethods.FetchKeyValue;
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrgwithname {
	
	@Test
	public void createOrganisationwithName() throws Throwable {
		
	
	
	WebDriverUtilityMethods w= new WebDriverUtilityMethods();
    JavaUtilityMethods j= new JavaUtilityMethods();
  String data= "sanju"+j.getRandomNumber();
 
    //set up Browser
	WebDriverManager.chromedriver().setup();
	FetchKeyValue f= new FetchKeyValue();
	
	//open chrome with url 
	WebDriver driver= new ChromeDriver();
	w.OpenWebPage(f.FetchKeyValueFromProperty("url"), driver);
	w.maximize(driver);
	w.implicitWait(10, driver);
	
	//login  into application
	LoginPomPage l= new LoginPomPage(driver) ;
	l.performLogin(f.FetchKeyValueFromProperty("un"), f.FetchKeyValueFromProperty("pwd"));
	
	homePagePomPage h= new homePagePomPage(driver);
	h.clickorg();
	
	OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
	o.clickAddnew();
	o.clickAddnew();
	o.nameText(data);
	
	o.clickSave();
	
	// log out from application
	l.performLogout(driver);
	
  //close the browser
	
   driver.close();
	
	}
}
