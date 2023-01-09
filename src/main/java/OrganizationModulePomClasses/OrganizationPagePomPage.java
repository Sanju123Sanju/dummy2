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
	   
	   //identify the mass edit button
	   @FindBy(xpath = "//input[@class='crmbutton small edit' and @value='Mass Edit']")	   
	   private WebElement massedit; 
	 //identify the send mail button
	   @FindBy(xpath = "//input[@class='crmbutton small edit' and @value='Send Mail']")	   
	   private WebElement sendmail; 
	 //identify the export button
	   @FindBy(xpath = "//img[@title='Export Organizations']")	   
	   private WebElement exportorgs; 
	   
		// identify the member of   
	   @FindBy(xpath = "//tbody/tr[6]/td[2]/img[1]")
	   private WebElement memberof;
	   
	 //identify the select in new web page
	   @FindBy(xpath = "//a[text()='vtigerCRM Inc']")	   
	   private WebElement selectmember; 
	   
	   
		//identify the export organizations download button
	   @FindBy(name = "Export")
	   private WebElement exportorgsdownload;
	   
	 
	 //identify the export mails of organizations 
	   @FindBy(xpath = "//input[@value='Mailer Export']")
	   private WebElement exportmails;
	   

		 //identify the export mails of organizations download button
		   @FindBy(xpath  = "//input[@name='button']")
		   private WebElement mailexportorgsdownload;
		   
	   
		 //identify the select email id type
		   @FindBy(xpath  = "//input[@class='crmbutton small create' and @name='Select']")
		   private WebElement selectemailidtype;
		   //identify the select email id type 
		   @FindBy(id="subject")
		   private WebElement composeemailsubject;
		   
		   //identify the send button in email
		   @FindBy(xpath = "//input[@name='Send']")
		   private WebElement sendemailonCompose;
		   
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
/**
 * return web element mass button
 * @return
 */
		public WebElement getMassedit() {
			return massedit;
		}
/**
 * return web element send mail button
 * @return
 */
		public WebElement getSendmail() {
			return sendmail;
		}
/**
 * return web element export organizations button
 * @return
 */
		public WebElement getExportorgs() {
			return exportorgs;
		}
		/**
		 * click the mass edit button
		 */
		public void clickMassEditButton() {
			massedit.click();
		}	
		/**
		 * click the send mail button
		 */
		public void clicksendMailButton() {
			sendmail.click();
		}
		/**
		 * click the export organizations button
		 */
		public void clickExportOrgsButton() {
			exportorgs.click();
		}
/**
 *  return web element member of
 * @return
 */
		public WebElement getMemberof() {
			return memberof;
		}
/**
 * return web element select member of another web page 
 * @return
 */
		public WebElement getSelectmember() {
			return selectmember;
		}
		/**
		 * click the member of
		 */
		public void clickMemberof() {
			memberof.click();
		}
		
		/**
		 * select the member which is present in another web page and switched to default
		 * @param driver
		 */
		public void selectMemberOfOrg(WebDriver driver) {
			WebDriverUtilityMethods w= new WebDriverUtilityMethods();
			w.twoWindowhandles(driver);
			selectmember.click();
			driver.switchTo().alert().dismiss();
			
		}
		
		/**
		 * click the export organizations download button
		 */
		public void clickexportOrgsDownload() {
			exportorgsdownload.click();
		}
/**
 * return web element export organizations download button
 * @return
 */
		public WebElement getExportorgsdownload() {
			return exportorgsdownload;
		}
/**
 * return web element the export mails button
 * @return
 */
public WebElement getExportmails() {
	return exportmails;
}
/**
 * return web element the export mails download button
 * @return
 */
public WebElement getMailexportorgsdownload() {
	return mailexportorgsdownload;
}
/**
 *return web element select mail id type
 * @return
 */
public WebElement getSelectemailidtype() {
	return selectemailidtype;
}
/**
 * return web element compose email subject text box
 * @return
 */
public WebElement getComposeemailsubject() {
	return composeemailsubject;
}
/**
 * return web element compose email send button
 * @return
 */
public WebElement getSendemailonCompose() {
	return sendemailonCompose;
}

public void clickexportmails() {
	exportmails.click();
}

public void clickexportmailsdownload() {
	mailexportorgsdownload.click();
}

public void clickselectmailidtype() {
	selectemailidtype.click();
}
public void sendComposemailSubject(WebDriver driver) {
	WebDriverUtilityMethods w= new WebDriverUtilityMethods();
	w.twoWindowhandles(driver);
	composeemailsubject.sendKeys("hiii");
}
public void clickSendEmailonCompose() {
	sendemailonCompose.click();
}
}
