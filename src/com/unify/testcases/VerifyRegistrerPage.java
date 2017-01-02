package com.unify.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.unify.pages.RegisterPage;

public class VerifyRegistrerPage
{

    @Test
	public void VerifyValidRegistrerPage ()
	
	{
    	File file = new File("D:/work/jh/ilms/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/register.html");
	
    	RegisterPage register=new RegisterPage(driver);
		
		register.typefirstname();
		register.typelastname();
		register.typeusername();
		register.typeEmailaddress();
		register.typepassword();
		register.clickonCreateAccount();
	
	
	
	}
	
}
