package com.unify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationVerification
{
	WebDriver driver;
	By firstname=By.cssSelector("#firstName");
	By lastname=By.cssSelector("#lastName");
	By username=By.cssSelector("#login");
	By emailaddress=By.cssSelector("#email");
	By password=By.cssSelector("#password");
	By createaccount=By.cssSelector("#sky-form4 > button");
    public RegistrationVerification(WebDriver driver)
 { 
	 this.driver=driver; 
 }
	
	public void typefirstname()
	{
		driver.findElement(firstname).sendKeys("");
				
	}
	
	public void clickonCreateaccount()
	{
		driver.findElement(createaccount).click();
	}
	
}
