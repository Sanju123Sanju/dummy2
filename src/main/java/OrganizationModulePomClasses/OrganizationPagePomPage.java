package OrganizationModulePomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Genericmethods.WebDriverUtilityMethods;

public class OrganizationPagePomPage {
	
	//identify the add new button
	   @FindBy(xpath = "//img[@title='Create Organization...']")
	   private WebElement addnew;
	 //identify the search for
	   @FindBy(css = "input[class='txtBox']")
	   private WebElement searchfor;
	 //identify the search button
	   @FindBy(name="submit")
	   private WebElement Search;
	 //identify the filters list down
	   @FindBy(id="viewname")
	   private WebElement filters;
	   
	 //identify the delete button
	   @FindBy(css = "input[class='crmbutton small delete']")
	   private WebElement delete;
		
	 //identify the name text box  
	   @FindBy(name="accountname")
	   private WebElement nametextbox;
	 //identify the web site text box
	   @FindBy(name="website")
	   private WebElement website;
	 //identify the ticker text box
	   @FindBy(name="tickersymbol")
	   private WebElement ticker;
	 //identify the phone text box 
	   @FindBy(name="phone")
	   private WebElement phone;
	 //identify the email text box
	   @FindBy(name="email1")
	   private WebElement email;
	 //identify the SAVE BUTTON 
	   @FindBy(css = "input[class='crmbutton small save']")
	   private WebElement save;      
	 //identify the cancel button 
	   @FindBy(xpath  = "//input[@title='Cancel [Alt+X]']")
	   private WebElement cancel; 
	   
	 //identify the first check box
	   @FindBy(xpath = "//input[@name='selected_id' and @id='2']")
	   private WebElement checkbox1;
	 //identify the all check once at a time
	   @FindBy(xpath = "//input[@name='selectall' and @id='selectCurrentPageRec']")   //  @FindBy(xpath = "//input[@type='checkbox']")
	   private WebElement allcheckonce;                                       // private WebElement allcheckonce;
	   
	 
	
	   //identify the all organization names 
	   @FindBy(xpath = "//input[@name='selected_id']/../following-sibling::td[contains(text(),'AC')]")
	   private  List<WebElement> allorganizationnames;
	   
	 
	   
	   public OrganizationPagePomPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}

		/**
		 * return webElement add new organization
		 * @return
		 */
		public WebElement getAddnew() {
			return addnew;
		}
	/**
	 * return webElement search for product
	 * @return
	 */
		public WebElement getSearchfor() {
			return searchfor;
		}
	/**
	 * return webElement search button
	 * @return
	 */
		public WebElement getSearch() {
			return Search;
		}
	/**
	 * return webElement filters list down 
	 * @return
	 */
		public WebElement getFilters() {
			return filters;
		}
	/**
	 * return webElement delete button
	 * @return
	 */
		public WebElement getDelete() {
			return delete;
		}
		
		
		/**
		 * click add new organization
		 */
		public void clickAddnew() {
			addnew.click();
		}
		/**
		 * search for particular organization
		 * @param data
		 */
		public void searchforSend(String data) {
			searchfor.sendKeys(data);
		}
		/**
		 * click  search button
		 */
		public void clickSearchButton() {
			Search.click();
		}
		/**
		 * click filters and open the list box
		 */
		public void clickfilters() {
			filters.click();
		}
		/**
		 * click delete button for selecting organizations
		 */
		public void clickDelete() {
			delete.click();
		}
/**
 * return webElement name text box
 * @return
 */
		public WebElement getNametextbox() {
			return nametextbox;
		}
/**
 * return webElement web site text  box
 * @return
 */
		public WebElement getWebsite() {
			return website;
		}
/**
 * return webElement organization ticker text  box
 * @return
 */
		public WebElement getTicker() {
			return ticker;
		}
/**
 * return webElement phone text  box
 * @return
 */
		public WebElement getPhone() {
			return phone;
		}
/**
 * return webElement email text  box
 * @return
 */
		public WebElement getEmail() {
			return email;
		}
/**
 * return webElement save button
 * @return
 */
		public WebElement getSave() {
			return save;
		}
/**
 * return webElement cancel button
 * @return
 */
		public WebElement getCancel() {
			return cancel;
		}
/**
 * enter the data into name text box
 * @param data
 */
		public void nameText(String data) {
			nametextbox.sendKeys(data);
		}
/**
 * enter the data into web site text box
 * @param data
 */
		public void websiteText(String data) {
			website.sendKeys(data);
		}
	/**
	 * enter the data into organization ticker text box	
	 * @param data
	 */
		public void tickerText(String data) {
			ticker.sendKeys(data);
		}
		/**
		 * enter the data into phone text box
		 * @param data
		 */
		public void phoneText(String data) {
		phone.sendKeys(data);
		}
		/**
		 * enter the data into email text box
		 * @param data
		 */
		
		public void emailText(String data) {
			email.sendKeys(data);
		}
		/**
		 * click the save button
		 */
		public void clickSave() {
			save.click();
		}
		/**
		 * click the cancel button
		 */
		
		public void clickcancel() {
			cancel.click();
		}
/**
 * return web element first check box
 * @return
 */
		public WebElement getCheckbox1() {
			return checkbox1;
		}
/**
 * return web element all check at a time
 * @return
 */
		public WebElement getAllcheckonce() {
			return allcheckonce;
		}
		/**
		 * select first check box
		 */
		public void checkFirstCheckBox() {
			checkbox1.click();
		}
		/**
		 * select all at a time with check box
		 */
		public void selectAllAtonceCheckBox() {
			allcheckonce.click();
		}
/**
 * return web element all org names
 * @return
 */
		public List<WebElement> getAllorganizationnames() {
			return allorganizationnames;
		}
		
		/**
		 * print all the organization names which contains text AC
		 */
		public void printAllOrganizationnames() {
			
			for(WebElement e: allorganizationnames) {
				String name= e.getText();
				System.out.println(name);
			}
		}
		
}
