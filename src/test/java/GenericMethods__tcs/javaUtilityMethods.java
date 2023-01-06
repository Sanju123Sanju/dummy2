package GenericMethods__tcs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import Genericmethods.DataUtility;
import Genericmethods.FetchKeyValue;
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import Genericmethods.WebDriverUtilityMethodss;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class javaUtilityMethods {
 static	WebDriver driver;
	public static void main(String[] args) throws Throwable {
	/*	// fetching from javaUtility
		JavaUtilityMethods j= new JavaUtilityMethods();
		System.out.println(j.getRandomNumber());
		System.out.println(j.GetFormattedDateDDMMYY());
		System.out.println(j.GetDate());
		System.out.println(j.GetFormattedDayDateDayMMYY());
		
		//fetching from property file
		FetchKeyValue fk= new FetchKeyValue();
		System.out.println(fk.FetchKeyValueFromProperty("un"));
		
		// fetching from excel sheet
		DataUtility d= new DataUtility();
		System.out.println(d.getFetchdataFromExcel("Sheet1", 1, 1));
		d.getWritedataFromExcel("Sheet1",0,0,"sanjusanju");
		System.out.println(d.getEveryRowNumLastCellNumdataFromExcel("Sheet1"));
		System.out.println(d.getEveryRowLastCellNumdataFromExcel("Sheet1",2));
		
		*/
		//fetching from WebDriverUtiliy methods
		
		
		WebDriverUtilityMethodss w= new WebDriverUtilityMethodss();
		w.openChrome();
		w.OpenWebPage("https://www.flipkart.com/");
		Thread.sleep(3000);
		w.refresh();
		Thread.sleep(3000);
		w.SetWindowPosition(100,100);
		Thread.sleep(3000);
		w.SetWindowSize(100,100);
		Thread.sleep(3000);
		w.maximize();
		w.implicitWait(10);
		w.Xpath("//button[text()='✕']").click();
		w.cssSelector("input[placeholder='Search for products, brands and more']").sendKeys("iphone",Keys.ENTER);
		WebElement ele=  w.Xpath("//div[@class='_1TmfNK']");
		w.MoveToElement(ele);
		w.ScrollBy(0,5000);
		w.backward();
		w.multipleWindowOpen("https://www.amazon.in/");
		w.multipleWindowOpen("https://www.selenium.dev/");
	//	 Set<String> allId = w.WindowhandlesgetAllid();
	//	 System.out.println(allId);
		 w.windowhandlesByTitle("Selenium");
		
		 w.Xpath("//span[text()='Downloads']").click();
		 w.Xpath("//a[text()='4.7.2']").click();
			Thread.sleep(3000);
		w.windowhandlesByTitle("Flipkart.com");
		 Thread.sleep(3000);
		 w.cssSelector("input[placeholder='Search for products, brands and more']").sendKeys("iphone",Keys.ENTER);
		 Thread.sleep(3000);	
		w.ScrollBy(0,4500);
		System.out.println(w.Xpath("//div[text()='APPLE iPhone 11 (Green, 64 GB)']").getText());
	    
		
	}
	
	

}
