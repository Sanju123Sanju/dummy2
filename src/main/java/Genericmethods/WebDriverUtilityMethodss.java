package Genericmethods;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtilityMethodss {
	
	
		
		WebDriver driver ;
		public void openChrome() {
			System.setProperty("webdriver.chrome.driver","D:\\eclipse\\eclipse-jee-2021-06-R-win32-x86_64\\eclipse\\Selenium\\server\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		public void OpenWebPage(String url) {
			driver.get(url);
		}
	   /**
	    * To maximize the web page
	    */
	   public void maximize( ) {
		   driver.manage().window().maximize();
	   }
		 /**
		  * To refresh the webpage
		  */
	   public void refresh() {
		  driver.navigate().refresh(); 
		   
	   }
		
	   /**
	    * go to  the next/ forward web page
	    */
	   public void forward() {
			  driver.navigate().forward(); 
			   
		   }
			/**
			 *  back to the  previous webpage
			 */
	   public void backward() {
		   driver.navigate().back();
	   }
		/**
		 * To set the Window size as particular size
		 * @param width
		 * @param height
		 */
	   public void SetWindowSize(int width, int height) {
		Dimension d= new Dimension(width, height);
		   driver.manage().window().setSize(d);
		   
		   
	   }
	   /**
	    * To set the Window at particular Position
	    * @param x
	    * @param y
	    */
	   public void SetWindowPosition(int x, int y) {
		   Point p= new Point(x, y);
		   driver.manage().window().setPosition(p);
	   }
		/**
		 *  locate the web element by using xpath
		 * @param AddressValue
		 * @return
		 */
	   public WebElement Xpath(String AddressValue) {
		  return driver.findElement(By.xpath(AddressValue));
		   
	   }
	   /**
	    *  locate the web element by using id
	    * @param AddressValue
	    * @return
	    */
	   public WebElement id(String AddressValue) {
			  return driver.findElement(By.id(AddressValue));
			   
		   }
	   /**
	    *  locate the web element by using name
	    * @param AddressValue
	    * @return
	    */
	   public WebElement name(String AddressValue) {
			  return driver.findElement(By.name(AddressValue));
			   
		   }
	   
	   /**
	    * locate the web element by using cssSelector
	    * @param AddressValue
	    * @return
	    */
	   public WebElement cssSelector(String AddressValue) {
			  return driver.findElement(By.cssSelector(AddressValue));
			   
		   }
		
	   /**
	    * To move to  the web element
	    * @param ele
	    */
	   public void MoveToElement(WebElement ele) {
		   Actions act = new Actions(driver);
		   act.moveToElement(ele).perform();
		   
	   }
	   /**
	    * To right click the web element
	    * @param ele
	    */
	   public void RightClick(WebElement ele) {
		   Actions act = new Actions(driver);
		   act.moveToElement(ele).contextClick().build().perform();
		   
	   }
	   /**
	    * To doublie click the web element
	    * @param ele
	    */
	   public void DoubleClickElement(WebElement ele) {
		   Actions act = new Actions(driver);
		   act.doubleClick(ele).perform();
		   
	   }
	  /**
	   * To drag and drop the element into/in another element 
	   * @param ele
	   * @param ele1
	   */
	   public void DragDropElement(WebElement ele, WebElement ele1) {
		   Actions act = new Actions(driver);
		   act.dragAndDrop(ele, ele1).perform();
		   
	   }
	   /**
	    * to wait the webpage until webelement is located
	    * @param unit_of_time
	    */
	   public void implicitWait(int unit_of_time) {
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(unit_of_time));
	   }
	   
	   /**
	    * to wait the webpage until expected condition is true or webelement is located
	    * @param unit_of_time
	    * @param value
	    */
	   public void ExplicitWaitElemetClickable(int unit_of_time, String value) {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(unit_of_time));
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
	   }
	   /**
	    * to wait the webpage until expected condition is true or webelement is located
	    * @param unit_of_time
	    * @param value
	    */
	   public void ExplicitwaitElementSelected(int unit_of_time, String value) {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(unit_of_time));
		   wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(value), true));
	   }
	   
	   /**
	    * to wait the webpage until expected condition is true or webelement is located
	    * @param unit_of_time
	    * @param value
	    */
	   
	   public void ExplicitwaitElementVisible(int unit_of_time, String value) {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(unit_of_time));
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
	   }
	   /**
	    * to provide the user defined customized wait 
	    * @param ele
	    * @throws Throwable
	    */
	   public void CustomizedWait(WebElement ele) throws Throwable {
		   int x=1;
		   while(x<=10)
			   try {
				ele.click();
			} 
		   catch (Exception e) {
				Thread.sleep(1000);
				x++;
			}
		   
	   }
	   /**
	    * to Scroll the webpage 
	    * @param x
	    * @param y
	    */
	   public void ScrollBy(int x, int y) {
		   JavascriptExecutor jse= (JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy("+x+","+y+");");
	   }
	   /**
	    * select the value of dropdown or listbox by using index
	    * @param ele
	    * @param index
	    */
	   public void selectByIndex(WebElement ele,  int index) {
		   Select s= new Select(ele);
		   s.selectByIndex(index);
		   
		   
	   }
	   /**
	    * select the value of dropdown or listbox by using visile text
	    * @param ele
	    * @param visibletext
	    */
	   public void selectByVisibleText(WebElement ele, String visibletext) {
		   Select s= new Select(ele);
		   s.selectByVisibleText(visibletext);
		   
		   
	   }
	   /**
	    * select the value of dropdown or listbox by using value
	    * @param ele
	    * @param value
	    */
	   public void selectByvalue(WebElement ele,  String value) {
		   Select s= new Select(ele);
		   s.selectByValue(value);
		   
		   
	   }
	   /**
	    * deselect the value of dropdown or listbox by using index
	    * @param ele
	    * @param index
	    */
	   public void deselectByIndex(WebElement ele,  int index) {
		   Select s= new Select(ele);
		   s.deselectByIndex(index);
		   
		   
	   }
	   
	    /**
	     * deselect the value of dropdown or listbox by using visible text
	     * @param ele
	     * @param visibletext
	     */
	   public void deselectByVisibleText(WebElement ele, String visibletext) {
		   Select s= new Select(ele);
		   s.deselectByVisibleText(visibletext);
		   
		   
	   }
	   /**
	    * deselect the value of dropdown or listbox by using value
	    * @param ele
	    * @param value
	    */
	   public void deselectByvalue(WebElement ele,  String value) {
		   Select s= new Select(ele);
		   s.deselectByValue(value);
		   
		   
	   }
	   
	   /**
	    * switch to different window
	    * @param value
	    */
	  
	   public void windowSwitch(String value) {
		   driver.switchTo().window(value);
		   }
	   /**
	    * get the window titles and swiching the windows
	    * @param value
	    * @return
	    */
	   public String getWindowTitles(String value) {
		String Title=   driver.switchTo().window(value).getTitle();
		return Title;
		   }
	   /**
	    * open the same/different web page in different tab of same browser
	    * @param url
	    */
	  
	   
	   public void multipleWindowOpen(String url) {
	   driver.switchTo().newWindow(WindowType.TAB);
		driver.get(url);
	   }
	   /**
	    * handle windows by using title
	    * @param titl
	    */
	   public void windowhandlesByTitle(String titl) {
		   Set<String> allId = driver.getWindowHandles();
		   for(String i:allId) {
			   String Title=   driver.switchTo().window(i).getTitle(); 
			   if(Title.contains(titl)) {
					break;
				}
		   }
	   }
	   /**
	    * get the all ids of windows which are opened at that particular instance
	    * @return
	    */
		public Set<String> WindowhandlesgetAllid( ) {
			 Set<String> allId = driver.getWindowHandles();
				return allId;
		}
		/**
		 * 
		 * @param value
		 */
	   public void frameSwitch(String value) {
		   driver.switchTo().frame(value);
		   }
	   
	   public void frameSwitch(int index) {
		   driver.switchTo().frame(index);
		   }
	   
	   public void frameSwitch(WebElement ele) {
		   driver.switchTo().frame(ele);
		   }
	   
	   public void defaultMainSwitch() {
		   driver.switchTo().defaultContent();
		   }
	   
	   public void alertSwitch( WebDriver driver) {
		   driver.switchTo().alert();
		   }
	   
	   public void takeScreenshotget(String path) throws Exception {
		  TakesScreenshot sh= (TakesScreenshot)driver;
		  File src= sh.getScreenshotAs(OutputType.FILE);
		  File dest= new File(path);
		  Files.copy(src,dest);
		   
		   }
	   
	   
	}



