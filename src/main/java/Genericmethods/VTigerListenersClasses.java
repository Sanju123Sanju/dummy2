package Genericmethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class VTigerListenersClasses implements ITestListener{
	
	
	
	public void onTestStart(ITestResult result) {
	//	System.out.println("onTestStart");
		Reporter.log("TestScript name="+result.getName()+"started",true);
	}


	public void onTestSuccess(ITestResult result) {
	//	System.out.println("onTestSuccess");
		Reporter.log("TestScript name="+result.getName()+"sucess",true);
	}


	public void onTestFailure(ITestResult result) {
	//	System.out.println("onTestFailure");
	
		TakesScreenshot sh=(TakesScreenshot)BaseClass.driver;
		File src= sh.getScreenshotAs(OutputType.FILE);
		File dest= new File(".\\src\\test\\resources\\Screenshot\\"+result.getName()+".png");
		try {
			Files.copy(src,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		Reporter.log("TestScript name="+result.getName()+"failure",true);
	}

	
	public void onTestSkipped(ITestResult result) {
	//	System.out.println("onTestSkipped");
		Reporter.log("TestScript name="+result.getName()+"started",true);
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	//	System.out.println("onTestFailedButWithinSuccessPercentage");
		Reporter.log("TestScript name="+result.getName()+"onTestFailedButWithinSuccessPercentage",true);
	}


	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	//	System.out.println("onTestFailedWithTimeout");
		Reporter.log("TestScript name="+result.getName()+"onTestfailedWithTimeOut",true);
	}


	@Override
	public void onStart(ITestContext context) {  // depends on suite it will execute after @beforesuite before   @beforetest
	//	System.out.println("onStart");
		Reporter.log("TestScript name="+context.getName()+"onStart",true);
	}


	@Override
	public void onFinish(ITestContext context) {  // depends on suite it will execute before @aftersuite  after    @aftertest
	//	System.out.println("onFinish");
		Reporter.log("TestScript name="+context.getName()+"onFinish",true);
	}

	

}
