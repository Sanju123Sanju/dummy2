package GenericMethods__tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Genericmethods.FetchKeyValue;
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass {
	@Test
	public void m1() throws Throwable {
		
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
	     JavaUtilityMethods j= new JavaUtilityMethods();
	     String name= "sanju"+j.getRandomNumber();
		
	     //set up Browser
		WebDriverManager.chromedriver().setup();
		FetchKeyValue f= new FetchKeyValue();
		
		//open chrome with url 
		WebDriver driver= new ChromeDriver();
		w.OpenWebPage(f.FetchKeyValueFromProperty("url"), driver);
		
		
		//login into vtiger
		
		w.name("user_name", driver).sendKeys(f.FetchKeyValueFromProperty("un"),Keys.TAB,f.FetchKeyValueFromProperty("pwd"),Keys.ENTER);
		w.implicitWait(10, driver);
		
		//perform scenario
		w.Xpath("//a[text()='Organizations']", driver).click();
		w.cssSelector("img[title='Create Organization...']", driver).click();
		w.name("accountname", driver).sendKeys(name);
		w.cssSelector("input[class='crmbutton small save']", driver).click();
		Thread.sleep(3000);
	    w.Xpath("//a[text()='Organizations']", driver).click();
		
	   //log out the appln

		Thread.sleep(3000);
	    WebElement ele=	w.Xpath("//td[@class='small']/img", driver);
	    w.MoveToElement(ele, driver);
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Sign Out")).click();
		
	   //close the browser
		
	    driver.close();
	}
		
	}

