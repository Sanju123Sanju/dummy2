package NewltDevFeaturesTcs;

import org.testng.annotations.Test;

import ContactModulePomClasses.ContactPagePomPage;
import Genericmethods.BaseClass;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;

public class SendMailBulkContacts extends BaseClass{
	
	@Test
	public void Send_MailBulk_Contacts() throws InterruptedException {
		 homePagePomPage h= new homePagePomPage(driver);
			h.clickContacts();
			ContactPagePomPage c= new ContactPagePomPage(driver);
			c.selectAllAtonceCheckBox();
			
			c.clicksendMailButton();
			WebDriverUtilityMethods w= new WebDriverUtilityMethods();
			Thread.sleep(3000);
			c.clickselectmailidtype();
			Thread.sleep(3000);
			c.sendComposemailSubject(driver);
			Thread.sleep(3000);
		//	c.clickSendEmailonCompose();
		//	w.alertSwitch(driver).accept();
		//	driver.close();
		
		     w.twoWindowhandles(driver);
	}

}
