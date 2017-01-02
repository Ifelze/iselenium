package com.unify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword 
{
WebDriver driver;
	
	
	By forgotPassword=By.cssSelector("#sky-form1 > div.row.margin-bottom-5 > div.col-xs-6.text-right > a");
	
	 public  ForgotPassword (WebDriver driver)
	 
	 {
		 
		 this.driver=driver;
		 
	 }
	 
	
	public void clickonForgotPassword()
	{
		driver.findElement(forgotPassword).click();
		
		
		}
	
	
}
