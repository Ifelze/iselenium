package com.unify.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.unify.pages.NewloginPage;

public class VerifyNewLoginPage
{

	@Test
	public void checkvaliduser()
	{
		File file = new File("C:/work/jh/ilms/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8281/login.html");
		
		NewloginPage login_page=PageFactory.initElements(driver,NewloginPage.class);
		
		login_page.login_unify("admin", "admin");
		
	}
}
