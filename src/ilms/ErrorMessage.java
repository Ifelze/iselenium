package ilms;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessage {

	public static void main(String[] args) {
		File file = new File("D:/work/jh/ilms/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://localhost:8080/start");
	driver.findElement(By.cssSelector("body > div.wrapper > div.header-v5.header-static > div.topbar-v3 > div.container > div > div:nth-child(2) > ul > li:nth-child(3) > a:nth-child(2)")).click();
	 driver.findElement(By.cssSelector("#firstName")).sendKeys("");
	 
	 driver.findElement(By.cssSelector("#password")).sendKeys("tyre");
	 driver.findElement(By.cssSelector("#sky-form4 > button")).click();
	 
			
			
			
			
	}

}
