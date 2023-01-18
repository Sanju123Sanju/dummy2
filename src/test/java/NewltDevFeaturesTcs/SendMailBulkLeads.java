package NewltDevFeaturesTcs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;
import LeadModulePomClasses.LeadPagePomClass;

public class SendMailBulkLeads  extends BaseClass{
@Test
	public void sendBulkMail_OrganizationsWithoutReceipients() throws Throwable {
		 homePagePomPage h= new homePagePomPage(driver);
			h.clickLeads();
			LeadPagePomClass l= new LeadPagePomClass(driver);
			l.selectAllAtonceCheckBox();
			
			l.clicksendMailButton();
			WebDriverUtilityMethods w= new WebDriverUtilityMethods();
			Thread.sleep(3000);
			l.clickselectmailidtype();
			Thread.sleep(3000);
			l.sendComposemailSubject(driver);
			Thread.sleep(3000);
		//	l.clickSendEmailonCompose();
		//	w.alertSwitch(driver).accept();
		//	driver.close();
		
		     w.twoWindowhandles(driver);
	}
}
