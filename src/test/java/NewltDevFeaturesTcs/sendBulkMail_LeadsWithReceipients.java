package NewltDevFeaturesTcs;

import org.testng.annotations.Test;

import Genericmethods.BaseClass;
import Genericmethods.DataUtility;
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;
import LeadModulePomClasses.LeadPagePomClass;
import OrganizationModulePomClasses.OrganizationPagePomPage;

public class sendBulkMail_LeadsWithReceipients extends BaseClass {

	
	@Test(dependsOnMethods = "createLeadWith_3_Details")
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
	//		w.alertSwitch(driver).accept();
	//		driver.close();
		
		     w.twoWindowhandles(driver);
	}

	
	@Test
	public void createLeadWith_3_Details() throws Throwable {
			
			JavaUtilityMethods j= new JavaUtilityMethods();
			DataUtility d= new DataUtility();
			 String    data= d.getFetchdataFromExcel("Sheet1",11, 1)+j.getRandomNumber();
			 String email= d.getFetchdataFromExcel("Sheet1", 5, 2)+j.getRandomNumber()+"@gmail.com";
			 String website = d.getFetchdataFromExcel("Sheet1", 6, 1)+j.getRandomNumber()+".com";
			 String company=d.getFetchdataFromExcel("Sheet1", 10, 1);
			 
			   homePagePomPage h= new homePagePomPage(driver);
				h.clickLeads();
				
				LeadPagePomClass l= new LeadPagePomClass(driver);
				l.clickAddnew();
				l.nameText(data);
				l.emailText(email);
				l.websiteText(website);
				l.companyText(company);
				l.clickSave();
				
		}

}
