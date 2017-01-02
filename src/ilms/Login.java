package ilms;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class Login {

	public static void main(String[] args) {
		File file = new File("D:/work/jh/ilms/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	WebDriver driver = new ChromeDriver();
		
        
		driver.get("http://localhost:8080/login.html");
		driver.findElement(By.cssSelector("#sky-form1 > section:nth-child(2) > label > div > input")).sendKeys("padmaja");
		driver.findElement(By.cssSelector("#sky-form1 > section:nth-child(3) > label > div > input")).sendKeys("padmaja");
		driver.findElement(By.cssSelector("#sky-form1 > input.btn-u.btn-u-sea-shop.btn-block.margin-bottom-20")).click();
		driver.findElement(By.cssSelector("body > div.wrapper > div.header-v5.header-static > div.topbar-v3 > div.container > div > div:nth-child(2) > ul > li:nth-child(4) > form > input.btn-u")).click();
		
		
		
	}
}