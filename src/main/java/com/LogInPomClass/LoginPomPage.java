package com.LogInPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomPage {
//identify the username textbox
	@FindBy(name="user_name") 
    private	WebElement  un;
	//identify the password textbox
	@FindBy(name="user_password") 
    private	WebElement  pwd;
	//identify the login button
	@FindBy(id="submitButton") 
    private	WebElement  login;
	
	//identify the hover to administrative img
	@FindBy(xpath = "//td[@class='small']/img")
	private	WebElement  logoutimg;
	
	@FindBy(xpath = "//td[@class='small']/img")
	private	WebElement  signout;
	
	public LoginPomPage(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
	}
/**
 * return web element user name text box
 * @return
 */
	public WebElement getUn() {
		return un;
	}
/**
 * return web element pass word text box
 * @return
 */
	public WebElement getPwd() {
		return pwd;
	}
/**
 * return web element log in button
 * @return
 */
	public WebElement getLogin() {
		return login;
	}
	
	//perform login without using getters
	public void performLogin(String username, String password) {
		un.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
	}
/**
 * return web element hover to administrative img
 * @return
 */
	public WebElement getLogoutimg() {
		return logoutimg;
	}
/**
 * return web element sign out button
 * @return
 */
	public WebElement getSignout() {
		return signout;
	}
	
	/**
	 * perform the log out action
	 * @param driver
	 * @throws Throwable
	 */
	public void performLogout(WebDriver driver) throws Throwable {		
		Actions act= new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(logoutimg);
		Thread.sleep(3000);
		signout.click();
		
		
	}
	
}
