package ContactModulePomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericmethods.WebDriverUtilityMethods;

public class ContactPagePomPage {

	
	//identify the add new button
	   @FindBy(xpath = "//img[@title='Create Contact...']")
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
		
	   //identify the last name text box
	   @FindBy(name="lastname")
	   private WebElement lastnametextbox;
	 //identify the title text box
	   @FindBy(name="title")
	   private WebElement title;
	 //identify the department text box
	   @FindBy(name="department")
	   private WebElement department;
	 //identify the phone text box
	   @FindBy(name="phone")
	   private WebElement officephone;
	 //identify the email text box
	   @FindBy(name="email")
	   private WebElement email;
	 //identify the  save button
	   @FindBy(css = "input[class='crmButton small save']")
	   private WebElement save;      
	 //identify the cancel button
	   @FindBy(xpath  = "//input[@title='Cancel [Alt+X]']")
	   private WebElement cancel; 
	 //identify the first check box 
	   @FindBy(xpath = "//input[@name='selected_id' and @id='22']")
	   private WebElement checkbox1;
		 //identify the all check once at a time
		   @FindBy(xpath = "//input[@name='selectall' and @id='selectCurrentPageRec']")   //  @FindBy(xpath = "//input[@type='checkbox']")
		   private WebElement allcheckonce;                                       // private WebElement allcheckonce;
		   
		   //identify the all organization names 
		   @FindBy(xpath = "//input[@name='selected_id']/../following-sibling::td[contains(text(),'CO')]")
		   private  List<WebElement> allconatctnames;
		   
		   //identify the mass edit button
	   @FindBy(xpath = "//input[@class='crmbutton small edit' and @value='Mass Edit']")	   
	   private WebElement massedit; 
	 //identify the send mail button
	   @FindBy(xpath = "//input[@class='crmbutton small edit' and @value='Send Mail']")	   
	   private WebElement sendmail; 
	 //identify the export button
	   @FindBy(xpath = "//img[@title='Export Contacts']")	   
	   private WebElement exportcontacts; 
		   
	   
	// identify the organization   
	   @FindBy(xpath = "//tbody/tr[5]/td[2]/img[1]")
	   private WebElement organizationname;
	   
	 //identify the organization in new web page
	   @FindBy(xpath = "//a[text()='vtigerCRM Inc']")	   
	   private WebElement selectorg; 
		
	   
	 //identify the export organizations download button
	   @FindBy(name = "Export")
	   private WebElement exportcontactsdownload;
	   
		 //identify the select email id type
		   @FindBy(xpath  = "//input[@class='crmbutton small create' and @name='Select']")
		   private WebElement selectemailidtype;
		   //identify the select email id type 
		   @FindBy(id="subject")
		   private WebElement composeemailsubject;
		   
		   //identify the send button in email
		   @FindBy(xpath = "//input[@name='Send']")
		   private WebElement sendemailonCompose;
		   
	   
		public ContactPagePomPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}

		/**
		 * return webElement add new contact
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
		 * click add new contact
		 */
		public void clickAddnew() {
			addnew.click();
		}
		/**
		 * search for particular contact
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
		 * click delete button after selecting contacts
		 */
		public void clickDelete() {
			delete.click();
		}
/**
 * return webElement last name text box
 * @return
 */
		public WebElement getLastnametextbox() {
			return lastnametextbox;
		}
/**
 * return webElement title text box
 * @return
 */
		public WebElement getTitle() {
			return title;
		}
/**
 * return webElement department text box
 * @return
 */
		public WebElement getDepartment() {
			return department;
		}
/**
 * return webElement office phone text box
 * @return
 */
		public WebElement getOfficephone() {
			return officephone;
		}
/**
 * return webElement email text box
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
 * enter the data into last name text box
 * @param data
 */
		public void nameText(String data) {
			lastnametextbox.sendKeys(data);
		}
/**
 * enter the data into title text box
 * @param data
 */
		public void titleText(String data) {
			title.sendKeys(data);
		}
	/**
	 * enter the data into department text box	
	 * @param data
	 */
		public void departmentText(String data) {
			department.sendKeys(data);
		}

	/**
	 * enter the data into office phone text box	
	 * @param data
	 */
		public void officephoneText(String data) {
		officephone.sendKeys(data);
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
		 * print all the contact names which contains text CO
		 */
		public void printAllOrganizationnames() {
			
			for(WebElement e: allconatctnames) {
				String name= e.getText();
				System.out.println(name);
			}
		}
/**
 * return web element first check box
 * @return
 */
		public WebElement getCheckbox1() {
			return checkbox1;
		}
/**
 * return web element of all check at a time check box
 * @return
 */
		public WebElement getAllcheckonce() {
			return allcheckonce;
		}
/**
 * return web elements all the contact names
 * @return
 */
		public List<WebElement> getAllconatctnames() {
			return allconatctnames;
		}
/**
 * return web element mass edit button
 * @return
 */
public WebElement getMassedit() {
	return massedit;
}
/**
 * return web element sen mail button
 * @return
 */
public WebElement getSendmail() {
	return sendmail;
}
/**
 * return web element export contacts button
 * @return
 */
public WebElement getExportcontacts() {
	return exportcontacts;
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
 * click the export leads button
 */
public void clickExportLeadsButton() {
	exportcontacts.click();
}
/**
 *  return web element organization name
 * @return
 */
		public WebElement getOrganizationname() {
			return organizationname;
		}
/**
 * return web element select organization of another web page 
 * @return
 */
		public WebElement getSelectorg() {
			return selectorg;
		}
		/**
		 * click the organization name
		 */
		public void clickOrganizationName() {
			organizationname.click();
		}
		
		/**
		 * select the member which is present in another web page and switched to default
		 * @param driver
		 */
		public void selectOrganization(WebDriver driver) {
			WebDriverUtilityMethods w= new WebDriverUtilityMethods();
			w.twoWindowhandles(driver);
			selectorg.click();
			
			
		}
		
		/**
		 * click the export organizations download button
		 */
		public void clickexportContactsDownload() {
			exportcontactsdownload.click();
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

		public WebElement getExportcontactsdownload() {
			return exportcontactsdownload;
		}

		public WebElement getSelectemailidtype() {
			return selectemailidtype;
		}

		public WebElement getComposeemailsubject() {
			return composeemailsubject;
		}

		public WebElement getSendemailonCompose() {
			return sendemailonCompose;
		}

}
