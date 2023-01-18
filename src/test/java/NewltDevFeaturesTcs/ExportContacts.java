package NewltDevFeaturesTcs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import ContactModulePomClasses.ContactPagePomPage;
import Genericmethods.BaseClass;
import HomePagePomClass.homePagePomPage;

public class ExportContacts extends BaseClass{

	
	@Test
	public void export_Contacts() {
		homePagePomPage h= new homePagePomPage(driver);
		h.clickContacts();	
	ContactPagePomPage c= new ContactPagePomPage(driver);
	c.clickExportLeadsButton();
	c.clickexportContactsDownload();
	}
}
