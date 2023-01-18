package NewltDevFeaturesTcs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class ExportOrganizations extends BaseClass{
@Test
public void export_organizations() {
	 homePagePomPage h= new homePagePomPage(driver);
		h.clickorg();
		
		OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
		o.clickExportOrgsButton();
		o.clickexportOrgsDownload();
}
}
