package LeadModulePomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPagePomClass {
	//identify the add new button
   @FindBy(xpath = "//img[@title='Create Lead...']")
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
	
 //identify website the last name text box 
   @FindBy(name="lastname")
   private WebElement lastnametextbox;
 //identify web element the website text box
   @FindBy(name="website")
   private WebElement website;
 //identify web element the company text box  
   @FindBy(name="company")
   private WebElement company;
 //identify web element the phone text box 
   @FindBy(name="phone")
   private WebElement phone;
 //identify web element the email text box
   @FindBy(name="email")
   private WebElement email;
 //identify web element save button
   @FindBy(css = "input[class='crmButton small save']")
   private WebElement save;      
 //identify web element cancel button
   @FindBy(xpath  = "//input[@title='Cancel [Alt+X]']")
   private WebElement cancel; 
   
   //identify the first check box
   @FindBy(xpath = "//input[@name='selected_id' and @id='32']")
   private WebElement checkbox1;
 //identify the all check once at a time
   @FindBy(xpath = "//input[@name='selectall' and @id='selectCurrentPageRec']")   //  @FindBy(xpath = "//input[@type='checkbox']")
   private WebElement allcheckonce;                                       // private WebElement allcheckonce;
   
 

   //identify the all lead  names which contains text L
   @FindBy(xpath = "//input[@name='selected_id']/../following-sibling::td[contains(text(),'L')]")
   private  List<WebElement> allleadnames;
   
   
	public LeadPagePomClass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	/**
	 * return webElement add new
	 * @return
	 */
	public WebElement getAddnew() {
		return addnew;
	}
/**
 * return webElement search for
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
	 * click add new
	 */
	public void clickAddnew() {
		addnew.click();
	}
	/**
	 * search for particular lead 
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
	 * click delete button for selecting leads
	 */
	public void clickDelete() {
		delete.click();
	}
/**
 * return web element last name text box
 * @return
 */
	public WebElement getLastnametextbox() {
		return lastnametextbox;
	}
/**
 * return web element website
 * @return
 */
	public WebElement getWebsite() {
		return website;
	}
/**
 * return web element company
 * @return
 */
	public WebElement getCompany() {
		return company;
	}
/**
 * return web element phone
 * @return
 */
	public WebElement getPhone() {
		return phone;
	}
/**
 * return web element email
 * @return
 */
	public WebElement getEmail() {
		return email;
	}
/**
 * return web element save button
 * @return
 */
	public WebElement getSave() {
		return save;
	}
/**
 * return web element cancel button
 * @return
 */
	public WebElement getCancel() {
		return cancel;
	}
	
	/**
	 * send the data into last name text box
	 * @param data
	 */
	public void nameText(String data) {
		lastnametextbox.sendKeys(data);
	}
/**
 * send the data into website text box
 * @param data
 */
	public void websiteText(String data) {
		website.sendKeys(data);
	}
	/**
	 * send the data into company text box
	 * @param data
	 */
	public void companyText(String data) {
		company.sendKeys(data);
	}
	/**
	 * send the data into phone text box
	 * @param phone2
	 */
	public void phoneText(String phone2) {
	phone.sendKeys(phone2);
	}
	/**
	 * send the data into email text box
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
 * return web element select all leads at a time check box
 * @return
 */
	public WebElement getAllcheckonce() {
		return allcheckonce;
	}
/**
 * return web elements all lead names
 * @return
 */
	public List<WebElement> getAllLeadnames() {
		return allleadnames;
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
	 * print all the lead names which contains text AC
	 */

	public void printAllleadnames() {
		
		for(WebElement e: allleadnames) {
			String name= e.getText();
			System.out.println(name);
		}
	}
}
