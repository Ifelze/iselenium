package ilms;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgotpw {

	public static void main(String[] args) {
		
		File file = new File("D:/work/jh/ilms/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	WebDriver driver = new ChromeDriver();
		
        
		driver.get("http://localhost:8080/login.html");
		driver.findElement(By.cssSelector("#sky-form1 > section:nth-child(2) > label > div > input")).sendKeys("padmaja");
		driver.findElement(By.cssSelector("#sky-form1 > section:nth-child(3) > label > div > input")).sendKeys("");
		driver.findElement(By.cssSelector("#sky-form1 > div.row.margin-bottom-5 > div.col-xs-6.text-right > a")).click();
		
		
	}

}
