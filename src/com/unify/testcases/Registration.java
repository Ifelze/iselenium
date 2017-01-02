package com.unify.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.unify.pages.RegistrationVerification;

public class Registration
{

    @Test
	public void validRegistration()
	
	{
    	File file = new File("D:/work/jh/ilms/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/register.html");
		
		
	
    	RegistrationVerification register=new RegistrationVerification(driver);
		
		register.typefirstname();
		
		register.clickonCreateaccount();
	
}
}