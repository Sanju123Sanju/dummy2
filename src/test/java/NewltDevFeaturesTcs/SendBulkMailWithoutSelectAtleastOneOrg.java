package NewltDevFeaturesTcs;

import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class SendBulkMailWithoutSelectAtleastOneOrg extends BaseClass{

	
	@Test
	public void send_BulkMail_Without_SelectAtleast_OneOrganization() throws Throwable {
		
		homePagePomPage h= new homePagePomPage(driver);
		h.clickorg();
		OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
		
		
		o.clicksendMailButton();
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
		w.alertSwitch(driver).accept();
	  
		
	}
}
