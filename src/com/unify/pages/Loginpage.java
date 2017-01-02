package com.unify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ErrorCodes;

import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Loginpage {
	
	WebDriver driver;
	
	By username=By.name("username");
	By Password=By.name("password");
	By Submit=By.cssSelector("#sky-form1 > input.btn-u.btn-u-sea-shop.btn-block.margin-bottom-20"); 
	By forgotpassword=By.cssSelector("body > div.wrapper > div.log-reg-v3.content-md");
    By logout=By.cssSelector("body > div.wrapper > div.header-v5.header-static > div.topbar-v3 > div.container > div > div:nth-child(2) > ul > li:nth-child(4) > form > input.btn-u"); 

 public  Loginpage (WebDriver driver)
 
 { 
	 this.driver=driver;
	 
 }
 public void  typeusername()
 {
	 driver.findElement(username).sendKeys("padmaja");
 }
 public void typepassword()
 {
	 driver.findElement(Password).sendKeys("airtel");
 }
 public void clickonsubmitbutton()
 {
	 driver.findElement(Submit).click();
	 
 }
 public void clickonforgotpasswordlink()
 {
	 driver.findElement(forgotpassword).click();
	 
 }
}


	


