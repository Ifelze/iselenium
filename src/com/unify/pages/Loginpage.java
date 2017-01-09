package com.unify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ErrorCodes;

import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Loginpage {
	
	WebDriver driver;
	
	By username=By.name("j_username");
	By Password=By.name("j_password");
	By Submit=By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/div/div[4]/div/button"); 
	//By forgotpassword=By.cssSelector("body > div.wrapper > div.log-reg-v3.content-md");
    By logout=By.xpath("//*[@id=\"cd-logout\"]/input[1]"); 

 public  Loginpage (WebDriver driver)
 
 { 
	 this.driver=driver;
	 
 }
 public void  typeusername()
 {
	 driver.findElement(username).sendKeys("admin");
 }
 public void typepassword()
 {
	 driver.findElement(Password).sendKeys("admin");
 }
 public void clickonsubmitbutton()
 {
	 driver.findElement(Submit).click();
	 
 }
 public void clickOnLogoutButton()
 {
	 driver.findElement(logout).click();
	 
 }
/* public void clickonforgotpasswordlink()
 {
	 driver.findElement(forgotpassword).click();
	 
 }*/
}


	


