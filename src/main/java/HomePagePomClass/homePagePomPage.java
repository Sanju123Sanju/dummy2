package HomePagePomClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePagePomPage {
	//identify the calendar
	@FindBy(xpath="//a[text()='Calendar']") 
    private	WebElement  calender;
	
	//identify the leads
	@FindBy(xpath = "//a[text()='Leads']") 
    private	WebElement  Leads;
	
	//identify the organizations
	@FindBy(xpath="//a[text()='Organizations']") 
    private	WebElement  org;
	
	//identify the contacts
	@FindBy(xpath = "//a[text()='Contacts']") 
    private	WebElement  contact;
	
	//identify the Products
	@FindBy(xpath="//a[text()='Products']") 
    private	WebElement  product;
	
	//identify the opportunity
	@FindBy(xpath = "//a[text()='Opportunities']") 
    private	WebElement  opportunity;
	//identify the add new button
	@FindBy(xpath = "(//td[@align='left']/img)[2]") 
    private	WebElement  addnew;
	//identify the add module button
	@FindBy(id = "addmodule") 
    private	WebElement  addmodule;
	//identify the window title text box
	@FindBy(id="stufftitle_id") 
    private	WebElement  windowtitle;
	//identify the save button
	@FindBy(name="save")
	private	WebElement  save;
	//identify the search text box
	@FindBy(css = "input[class='searchBox']")
	private	WebElement  search;
	//identify the home module
	@FindBy(xpath = "//td[@class='tabUnSelected']")
	private	WebElement  home;
     /**
      * return webElement calendar
      * @return
      */
	public WebElement getCalender() {
		return calender;
	}

	
	
	
	
/**
 * return webElement Leads
 * @return
 */
	public WebElement getLeads() {
		return Leads;
	}

/**
 * return webElement organization
 * @return
 */
	public WebElement getOrg() {
		return org;
	}

/**
 * return webElement contact
 * @return
 */
	public WebElement getContact() {
		return contact;
	}

/**
 * return webElement product
 * @return
 */
	public WebElement getProduct() {
		return product;
	}

/**
 * return webElement opportunity
 * @return
 */
	public WebElement getOpportunity() {
		return opportunity;
	}
	
	public homePagePomPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	/**
	 * click the calendar Module
	 */
	public void clickCalender() {
		calender.click();
	}
	/**
	 * click the opportunity Module
	 */
	public void clickOpportunity() {
		opportunity.click();
	}
	/**
	 * click the product Module
	 */
	public void clickProduct() {
		product.click();
	}
	/**
	 * click the leads Module
	 */
	public void clickLeads() {
		Leads.click();
	}
	/**
	 * click the contact module
	 */
	public void clickContacts() {
		contact.click();
	}
	/**
	 * click the organization Module
	 */
	public void clickorg() {
		org.click();
	}

	/**
	 *  return webElement add new
	 * @return
	 */
	public WebElement getAddnew() {
		return addnew;
	}
/**
 *  return webElement add module
 * @return
 */
	public WebElement getAddmodule() {
		return addmodule;
	}
/**
 *  return webElement window title
 * @return
 */
	public WebElement getWindowtitle() {
		return windowtitle;
	}

	/**
	 *  return webElement save button
	 * @return
	 */
public WebElement getSave() {
		return save;
	}

/**
 *  return webElement search text box
 * @return
 */
public WebElement getSearch() {
	return search;
}
/**
 * click add new at home module
 */
public void clickaddNew() {
	addnew.click();
}
/**
 * click the add module
 */
public void clickAddModule() {
	addmodule.click();
}
/**
 * enter the data into window title
 * @param data
 */
public void clickWindowTitle(String data) {
	windowtitle.sendKeys(data);
}
/**
 *  click the save button
 */
public void clickSave() {
	save.click();
}
/**
 * enter the data into search box and enter search
 * @param data
 */
public void search(String data) {
	search.sendKeys(data,Keys.ENTER);
}
/**
 * click the home Module
 */
public void clickHome() {
	home.click();
}
/**
 * return web element home
 * @return
 */
public WebElement getHome() {
	return home;
}

}
