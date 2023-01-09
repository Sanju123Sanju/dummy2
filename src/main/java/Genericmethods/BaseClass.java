 package Genericmethods;



import com.LogInPomClass.LoginPomPage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	WebDriverUtilityMethods w= new WebDriverUtilityMethods();
	FetchKeyValue f= new FetchKeyValue();
	public static  WebDriver driver;

	
	  @BeforeClass
	  public void openBrowser() throws Throwable {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			w.maximize(driver);
		  w.implicitWait(10, driver);
		  w.OpenWebPage(f.FetchKeyValueFromProperty("url"), driver);
	  }

  @BeforeMethod
  public void login() throws Throwable {
	  
	 
	  LoginPomPage l= new LoginPomPage(driver) ;
		l.performLogin(f.FetchKeyValueFromProperty("un"), f.FetchKeyValueFromProperty("pwd"));
		
	  
  }
  
  @AfterMethod
  public void logout() throws Throwable {
	  LoginPomPage l= new LoginPomPage(driver) ;
		l.performLogout(driver);
	   
  }

  @AfterClass
  public void closeBrowser() {
	  
	  driver.quit();
	  
  }

}
