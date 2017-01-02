package com.unify.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.unify.pages.NewloginPage;

import Helper.BrowserFactory;

public class VerifyNewLoginPage
{

	@Test
	public void checkvaliduser()
	{
	WebDriver driver=BrowserFactory.startbrowser("chromedriver", "http://localhost:8080/login.html");
		
		NewloginPage login_page=PageFactory.initElements(driver,NewloginPage.class);
		
		login_page.login_unify("padmaja", "padmaja");
		
	}
}
