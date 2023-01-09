package NewltDevFeaturesTcs;

import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import HomePagePomClass.homePagePomPage;
import LeadModulePomClasses.LeadPagePomClass;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class ExportLeads extends BaseClass{
	@Test
	public void export_organizations() {
		 homePagePomPage h= new homePagePomPage(driver);
			h.clickLeads();
			
			LeadPagePomClass l= new LeadPagePomClass(driver);
			l.clickExportLeadsButton();
			l.clickexportleadsDownload();
	}

}
