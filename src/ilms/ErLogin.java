package ilms;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErLogin {

	public static void main(String[] args){
		
		
		File file = new File("D:/work/jh/ilms/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	WebDriver driver = new ChromeDriver();
		
        
		driver.get("http://localhost:8080/login.html");
		driver.findElement(By.cssSelector("#sky-form1 > section:nth-child(2) > label > div > input")).sendKeys("");
		driver.findElement(By.cssSelector("#sky-form1 > section:nth-child(3) > label > div > input")).sendKeys("padmaja");
		driver.findElement(By.cssSelector("#sky-form1 > input.btn-u.btn-u-sea-shop.btn-block.margin-bottom-20")).click();
		String actual_error=driver.findElement(By.cssSelector("#sky-form1 > div.alert.alert-danger.fade.in")).getText();
		String expected_error="Sorry! Invalid User Name And/Or Password.";
		Assert.assertEquals(expected_error, actual_error);
		Assert.assertTrue(actual_error.contains("Sorry! Invalid User Name And/Or Password"));
		
      
       
		
		
	}

}
