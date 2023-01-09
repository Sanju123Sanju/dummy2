package NewltDevFeaturesTcs;

import org.testng.annotations.Test;

import ContactModulePomClasses.ContactPagePomPage;
import Genericmethods.BaseClass;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;
import LeadModulePomClasses.LeadPagePomClass;

public class SendBulkMailWithoutSelectAtleastOneLead extends BaseClass{
	@Test
	public void send_BulkMail_WithoutSelectAtleast_OneLead() {
		homePagePomPage h= new homePagePomPage(driver);
		h.clickLeads();
		LeadPagePomClass l= new LeadPagePomClass(driver);
		
		l.clicksendMailButton();
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
		w.alertSwitch(driver).accept();
	  
	}
}
