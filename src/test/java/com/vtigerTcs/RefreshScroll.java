package com.vtigerTcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.LogInPomClass.LoginPomPage;

import Genericmethods.FetchKeyValue;
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshScroll {
	
	@Test
	public void login() throws Throwable {
		
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
	     JavaUtilityMethods j= new JavaUtilityMethods();
	   
	     //set up Browser
		WebDriverManager.chromedriver().setup();
		FetchKeyValue f= new FetchKeyValue();
		
		//open chrome with url 
		WebDriver driver= new ChromeDriver();
		w.OpenWebPage(f.FetchKeyValueFromProperty("url"), driver);
		w.maximize(driver);
		
		//login  into application
		LoginPomPage l= new LoginPomPage(driver) ;
		l.performLogin(f.FetchKeyValueFromProperty("un"), f.FetchKeyValueFromProperty("pwd"));
		
		
	     w.refresh(driver);
	     w.ScrollBy(0,2000, driver);
		 w.refresh(driver);
		 
		// log out from application
		l.performLogout(driver);
		
	   //close the browser
		
	    driver.close();
		
	}		

	}


