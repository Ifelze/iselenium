package com.unify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResendActivationLink 
{
    WebDriver driver;
    
    
    By ResendActivationLink=By.cssSelector("#sky-form1 > div.row.margin-bottom-5 > div.col-xs-7.text-left > a");	
    By email=By.cssSelector("#email123");
    By submit=By.cssSelector("#sky-form1 > button");
    By alreadyexistemail=By.cssSelector("#sky-form1 > ul > li");
    By registeredemail=By.cssSelector("body > div.wrapper > div.log-reg-v3.content-md > div");
    By enteremailaddress=By.cssSelector("#sky-form1 > section > em") ;
    By enterRegistered=By.cssSelector("#sky-form1 > ul > li");
    public ResendActivationLink(WebDriver driver)
    {
    	
    	this.driver=driver;	  	 	
    	
    }

    public void clickonResendActivationLInk()
    {
    	driver.findElement(ResendActivationLink).click();
    }
    public void typeemailaddress()
    {
    	driver.findElement(email).sendKeys("");

    }
    
    public void clickonsubmitbutton()
    {
    	driver.findElement(submit).click();
    	if(email!=registeredemail)
    	{
    		driver.findElement(enterRegistered).getText();
    	}
    	else{
    		if(email!=alreadyexistemail){
    			driver.findElement(enterRegistered).getText();
    		}
    		else{
    			driver.findElement(alreadyexistemail).getText();
    		}
    		
    		
    	
    }
}
    
}
