package GenericMethods__tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.LogInPomClass.LoginPomPage;

import Genericmethods.FetchKeyValue;
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
@Test
	public void m2() throws Throwable {
		
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
	     JavaUtilityMethods j= new JavaUtilityMethods();
	     String name= "sanju"+j.getRandomNumber();
		
	     //set up Browser
		WebDriverManager.chromedriver().setup();
		FetchKeyValue f= new FetchKeyValue();
		
		//open chrome with url 
		WebDriver driver= new ChromeDriver();
		w.OpenWebPage(f.FetchKeyValueFromProperty("url"), driver);
		
		LoginPomPage l=new  LoginPomPage(driver);
		l.performLogin(f.FetchKeyValueFromProperty("un"), f.FetchKeyValueFromProperty("pwd"));
		
		
		
		
				
		
	}
}
