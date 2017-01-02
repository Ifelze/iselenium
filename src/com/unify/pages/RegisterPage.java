package com.unify.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	By firstname=By.cssSelector("#firstName");
	By lastname=By.cssSelector("#lastName");
	By username=By.cssSelector("#login");
	By emailaddress=By.cssSelector("#email");
	By password=By.cssSelector("#password");
	By createAccount=By.xpath("//*[@id=\"sky-form4\"]/button");
 public RegisterPage(WebDriver driver)
 { 
	 this.driver=driver; 
 }
 
   public void typefirstname()
   {
	   driver.findElement(firstname).sendKeys("Airtel");
   }
 
 public void typelastname()
 {
	 driver.findElement(lastname).sendKeys("Vodafone");
	 
 }
 public void typeusername()
 {
	   driver.findElement(username).sendKeys("Reliance");
 }

 public void typeEmailaddress()
 {
	   driver.findElement(emailaddress).sendKeys("hdevasani@ifelze.com");
 }
 public void typepassword()
 {
	   driver.findElement(password).sendKeys("Reliance");
 }

 public void clickonCreateAccount()
 {
	   driver.findElement(createAccount).click();
 }
 
 
}
