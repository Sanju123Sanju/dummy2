package Genericmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	
	@Test
	public void ma() throws Throwable {
		FetchKeyValue f= new FetchKeyValue();
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get(f.FetchKeyValueFromProperty("new"));
	}

}
