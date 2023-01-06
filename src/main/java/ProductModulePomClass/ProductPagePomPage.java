package ProductModulePomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPagePomPage {

	//identify the add new button
	   @FindBy(xpath = "//img[@title='Create Product...']")
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
		
	 //identify the product name text box 
	   @FindBy(name="productname")
	   private WebElement productnametextbox;
	 //identify the web site text box  
	   @FindBy(name="website")
	   private WebElement website;
	 //identify the serial number text box   
	   @FindBy(name="serial_no")
	   private WebElement serialno;
	 //identify the vendor part number text box 
	   @FindBy(name="vendor_part_no")
	   private WebElement vendorpartno;
	 //identify the choose file button 
	   @FindBy(id="my_file_element")
	   private WebElement choosefile;
	 //identify the save button
	   @FindBy(css = "input[class='crmbutton small save']")
	   private WebElement save;      
	   //identify the cancel button 
	   @FindBy(xpath  = "//input[@title='Cancel [Alt+X]']")
	   private WebElement cancel; 
	   
	 //identify the first check box 
	   @FindBy(xpath = "//input[@name='selected_id' and @id='52']")
	   private WebElement checkbox1;
		 //identify the all check once at a time
		   @FindBy(xpath = "//input[@name='selectall' and @id='selectCurrentPageRec']")   //  @FindBy(xpath = "//input[@type='checkbox']")
		   private WebElement allcheckonce;                                       // private WebElement allcheckonce;
		   
		   //identify the all product  names 
		   @FindBy(xpath = "//input[@name='selected_id']/../following-sibling::td[contains(text(),'P')]")
		   private  List<WebElement> allproductnames;
		 
	   
	   
	   
		 public ProductPagePomPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}

		/**
		 * return webElement add new product
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
		 * click add new contact
		 */
		public void clickAddnew() {
			addnew.click();
		}
		/**
		 * search for particular product
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
		 * click delete button for selecting products
		 */
		public void clickDelete() {
			delete.click();
		}
/**
 * return webElement product name text box
 * @return
 */
		public WebElement getProductnametextbox() {
			return productnametextbox;
		}
/**
 * return webElement web site text box
 * @return
 */
		public WebElement getWebsite() {
			return website;
		}
/**
 * return webElement serial number text box
 * @return
 */
		public WebElement getSerialno() {
			return serialno;
		}
/**
 * return webElement web site text box
 * @return
 */
		public WebElement getVendorpartno() {
			return vendorpartno;
		}
/**
 * return webElement choose file button
 * @return
 */
		public WebElement getChoosefile() {
			return choosefile;
		}
	/**
	 * return webElement save button
	 * @return
	 */
		public WebElement getSave() {
			return save;
		}
/**
 * return webElement save button
 * @return
 */
		public WebElement getCancel() {
			return cancel;
		}
/**
 * enter the data into product name text box 		
 * @param data
 */
		public void productnametextbox(String data) {
			productnametextbox.sendKeys(data);
		}
		/**
		 * enter the data into web site text box 
		 * @param data
		 */
		public void website(String data) {
			website.sendKeys(data);
		}
		/**
		 * enter the data into serial number text box 
		 * @param data
		 */
		public void serialno(String data) {
			serialno.sendKeys(data);
		}
        /**
         * enter the data into vendor part number text box 
         * @param data
         */
		public void vendorpartno(String data) {
			vendorpartno.sendKeys(data);
		}
		/**
		 *click the choose file button
		 */
		public void clickchoosefile() {
			choosefile.click();
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
		 * print all the product names which contains text AC
		 */
		public void printAllOrganizationnames() {
			
			for(WebElement e: allproductnames) {
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
		 * return web element all select at a time check box
		 * @return
		 */
		public WebElement getAllcheckonce() {
			return allcheckonce;
		}
/**
 * return web elements of the all product names
 * @return
 */
		public List<WebElement> getAllproductnames() {
			return allproductnames;
		}
}
