package NewltDevFeaturesTcs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class ExportMailsOrg extends BaseClass{
	
	@Test
	public void exportMailofOrganization() {

		homePagePomPage h= new homePagePomPage(driver);
		h.clickorg();
		
		OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
		o.clickexportmails();
		o.clickexportmailsdownload();
	
	}

}
