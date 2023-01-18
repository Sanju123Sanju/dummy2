package NewltDevFeaturesTcs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class SendMailBulkOrganizations extends BaseClass{
    //it is not running
	@Test
	public void sendBulkMail_OrganizationsWithoutReceipients() throws Throwable {
		 homePagePomPage h= new homePagePomPage(driver);
			h.clickorg();
			OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
			o.selectAllAtonceCheckBox();
			
			o.clicksendMailButton();
			WebDriverUtilityMethods w= new WebDriverUtilityMethods();
			Thread.sleep(3000);
			o.clickselectmailidtype();
			Thread.sleep(3000);
			o.sendComposemailSubject(driver);
			Thread.sleep(3000);
		//	o.clickSendEmailonCompose();
		//	w.alertSwitch(driver).accept();
		//	driver.close();
		
		     w.twoWindowhandles(driver);
	}
}
