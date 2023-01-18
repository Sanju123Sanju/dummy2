package NewltDevFeaturesTcs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import Genericmethods.DataUtility;
import Genericmethods.JavaUtilityMethods;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class CreateOrgWithOutMemberOf extends BaseClass{

	@Test
	public void createOrg_WithOut_MemberOfOrganization() throws Throwable {
		JavaUtilityMethods j= new JavaUtilityMethods();
		DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1",11, 1)+j.getRandomNumber();
		 String website = d.getFetchdataFromExcel("Sheet1", 6, 1)+j.getRandomNumber()+".com";
		   homePagePomPage h= new homePagePomPage(driver);
			h.clickorg();
			
			OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
			o.clickAddnew();
			o.nameText(data);
			o.websiteText(website);
			
			o.clickSave();
			
	}
}
