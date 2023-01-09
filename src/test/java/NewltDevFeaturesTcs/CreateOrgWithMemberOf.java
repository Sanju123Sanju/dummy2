package NewltDevFeaturesTcs;


import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import Genericmethods.DataUtility;
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class CreateOrgWithMemberOf extends BaseClass {
	
	@Test
	public void createOrg_With_MemberOf() throws Throwable {
		JavaUtilityMethods j= new JavaUtilityMethods();
		DataUtility d= new DataUtility();
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
		
		 String    data= d.getFetchdataFromExcel("Sheet1",11, 1)+j.getRandomNumber();
		 String email= d.getFetchdataFromExcel("Sheet1", 5, 2)+j.getRandomNumber()+"@gmail.com";
		  homePagePomPage h= new homePagePomPage(driver);
			h.clickorg();
			
			OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
			o.clickAddnew();
			o.nameText(data);
			o.clickMemberof();
	       	o.selectMemberOfOrg(driver);
			w.twoWindowhandles(driver);
			o.emailText(email);
			o.clickSave();
			
			
	}

}
