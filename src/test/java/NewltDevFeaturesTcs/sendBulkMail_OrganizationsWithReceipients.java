package NewltDevFeaturesTcs;

import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import Genericmethods.DataUtility;
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class sendBulkMail_OrganizationsWithReceipients extends BaseClass {

	
	@Test(dependsOnMethods = "createOrganisationWith_4_Details")
	public void send_Bulk_Mail_Organizations_With_Receipients() throws Throwable {
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
//		driver.close();	
		w.twoWindowhandles(driver);
	     //it is not running

	}
	
	@Test
public void createOrganisationWith_4_Details() throws Throwable {
		
		JavaUtilityMethods j= new JavaUtilityMethods();
		DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1",11, 1)+j.getRandomNumber();
		 String email= d.getFetchdataFromExcel("Sheet1", 5, 2)+j.getRandomNumber()+"@gmail.com";
		 String website = d.getFetchdataFromExcel("Sheet1", 6, 1)+j.getRandomNumber()+".com";
		  String ticker= d.getFetchdataFromExcel("Sheet1", 8, 1)+j.getRandomNumber();
		   homePagePomPage h= new homePagePomPage(driver);
			h.clickorg();
			
			OrganizationPagePomPage o= new OrganizationPagePomPage(driver);
			o.clickAddnew();
			o.nameText(data);
			o.emailText(email);
			o.websiteText(website);
			o.tickerText(ticker);
			o.clickSave();
			
	}
}
