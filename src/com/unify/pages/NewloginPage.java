package com.unify.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewloginPage
{

	WebDriver driver;
	public NewloginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(name="j_username")
	WebElement username;
	@FindBy(name="j_password")
	WebElement password;
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/form/div/div[4]/div/button")
	WebElement submit_button;
	@FindBy(how=How.LINK_TEXT,using="Forgot your Password?")
	WebElement forgot_password;
	
	public void login_unify(String uid,String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
		
		
		
		
	}
	
	
	 
	
}
