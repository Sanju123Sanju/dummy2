package NewltDevFeaturesTcs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import ContactModulePomClasses.ContactPagePomPage;
import Genericmethods.BaseClass;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;


public class SendBulkMailWithoutSelectAtleastOneContact extends BaseClass{

	@Test
	public void send_BulkMail_WithoutSelectAtleastOne_Contact() {
		homePagePomPage h= new homePagePomPage(driver);
		h.clickContacts();
		ContactPagePomPage c= new ContactPagePomPage(driver);	
		c.clicksendMailButton();
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
		w.alertSwitch(driver).accept();
	  
	}
}
