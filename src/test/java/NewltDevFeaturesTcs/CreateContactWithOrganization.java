package NewltDevFeaturesTcs;

import org.testng.annotations.Test;

import ContactModulePomClasses.ContactPagePomPage;
import Genericmethods.BaseClass;
import Genericmethods.DataUtility;
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;

public class CreateContactWithOrganization extends BaseClass {
	              //it is not running
@Test
public void create_Contact_With_Organization() throws Throwable {
	JavaUtilityMethods j= new JavaUtilityMethods();
	WebDriverUtilityMethods w= new WebDriverUtilityMethods();
	
	 DataUtility d= new DataUtility();
	 String    data= d.getFetchdataFromExcel("Sheet1", 13, 1)+j.getRandomNumber();
	 String email= d.getFetchdataFromExcel("Sheet1", 5, 1)+j.getRandomNumber()+"@gmail.com";
	  homePagePomPage h= new homePagePomPage(driver);
		h.clickContacts();	
	ContactPagePomPage c= new ContactPagePomPage(driver);	
	c.clickAddnew();
	c.nameText(data);
	c.clickOrganizationName();
	c.selectOrganization(driver);
	w.twoWindowhandles(driver);    
	c.emailText(email);
	c.clickSave();
}
}
