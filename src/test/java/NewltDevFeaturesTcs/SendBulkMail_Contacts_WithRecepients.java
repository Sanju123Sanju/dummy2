package NewltDevFeaturesTcs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import ContactModulePomClasses.ContactPagePomPage;
import Genericmethods.BaseClass;
import Genericmethods.DataUtility;
import Genericmethods.JavaUtilityMethods;
import Genericmethods.WebDriverUtilityMethods;
import HomePagePomClass.homePagePomPage;

public class SendBulkMail_Contacts_WithRecepients extends BaseClass {
	@Test(dependsOnMethods = "createContactWith_3_Details")
	public void send_BulkMail_Contacts_With_Recepients() throws Throwable {
		homePagePomPage h= new homePagePomPage(driver);
		h.clickContacts();
		ContactPagePomPage c= new ContactPagePomPage(driver);
		c.selectAllAtonceCheckBox();
		
		c.clicksendMailButton();
		WebDriverUtilityMethods w= new WebDriverUtilityMethods();
		Thread.sleep(3000);
		c.clickselectmailidtype();
		Thread.sleep(3000);
		c.sendComposemailSubject(driver);
		Thread.sleep(3000);
	//	c.clickSendEmailonCompose();
	//	w.alertSwitch(driver).accept();
//		driver.close();	
		w.twoWindowhandles(driver);
	     //it is not running

	}
	
	@Test
public void createContactWith_3_Details() throws Throwable {
		
		JavaUtilityMethods j= new JavaUtilityMethods();
		DataUtility d= new DataUtility();
		 String    data= d.getFetchdataFromExcel("Sheet1",11, 1)+j.getRandomNumber();
		 String email= d.getFetchdataFromExcel("Sheet1", 5, 2)+j.getRandomNumber()+"@gmail.com";
		 String website = d.getFetchdataFromExcel("Sheet1", 6, 1)+j.getRandomNumber()+".com";
		  String ticker= d.getFetchdataFromExcel("Sheet1", 8, 1)+j.getRandomNumber();
		   homePagePomPage h= new homePagePomPage(driver);
			h.clickContacts();
			
			ContactPagePomPage c= new ContactPagePomPage(driver);
			c.clickAddnew();
			c.nameText(data);
			c.emailText(email);
			c.clickSave();
			
	}
}
