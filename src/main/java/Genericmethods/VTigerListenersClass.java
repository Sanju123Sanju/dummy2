package Genericmethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class VTigerListenersClass implements ITestListener {
	ExtentReports er;
	 ExtentTest test;
		
		@Override
		public void onTestStart(ITestResult result) {
			String name= result.getName();
			test = er.createTest(name);
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			String name= result.getName();
			test.log(com.aventstack.extentreports.Status.PASS, name+"--pass");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String name= result.getName();
			test.log(Status.FAIL, name+"--fail");
			TakesScreenshot sh=(TakesScreenshot)BaseClass.driver;
			File src= sh.getScreenshotAs(OutputType.FILE);
			File dest= new File(".\\src\\test\\resources\\Screenshot\\"+result.getName()+".png");
			try {
				Files.copy(src,dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			String name= result.getName();
			test.log(Status.SKIP, name+"--skipped");
		}

		@Override
		public void onStart(ITestContext context) {
			// create the object of esr  in which we have to initiate the path where we have to save the extentreport
			ExtentSparkReporter esr= new ExtentSparkReporter(".\\ExtentReport\\"+3+".html");
			// set the title for extent report
			esr.config().setDocumentTitle("dummy vtiger final result");
			// set the theme for extent report
			esr.config().setTheme(Theme.STANDARD);
			// set the author/ reporter name of extent report generator
			esr.config().setReportName("sanju");
		// create the object of extent reports to add extra information to the test case
			er= new ExtentReports();
			// this method is used map between esr and er objects 
			// it is non static method
			er.attachReporter(esr);
			// it is used to add the information of os
			er.setSystemInfo("os", "windows");
			// it is used to add the information of language
			er.setSystemInfo("language", "java");
			// it is used to add the information of version
			er.setSystemInfo("version", "10.1");
			// it is used to add the information of browser
			er.setSystemInfo("browser","chrome");
			
		}

		@Override
		public void onFinish(ITestContext context) {
			// this method is used to consolidate/flush/remove the memory space/objects of tcs, after the tcs report is generated in report
			er.flush();
		}

		
	

}
