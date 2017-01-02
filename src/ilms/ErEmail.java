package ilms;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/work/jh/ilms/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://localhost:8080/start");
	driver.findElement(By.cssSelector("body > div.wrapper > div.header-v5.header-static > div.topbar-v3 > div.container > div > div:nth-child(2) > ul > li:nth-child(3) > a:nth-child(2)")).click();
    driver.findElement(By.cssSelector("#firstName")).sendKeys("padmaja");
    driver.findElement(By.cssSelector("#lastName")).sendKeys("gottapu");
    driver.findElement(By.cssSelector("#login")).sendKeys("padmaja");
    driver.findElement(By.cssSelector("#email")).sendKeys("padmaja.gottapu2@gmail.com");
    driver.findElement(By.cssSelector("#password")).sendKeys("padmaja");
    driver.findElement(By.cssSelector("#sky-form4 > button")).click();
    String actual_error=driver.findElement(By.cssSelector("#sky-form4 > ul > li")).getText();
	String expected_error="login already in use";
	Assert.assertEquals(expected_error, actual_error);
	Assert.assertTrue(actual_error.contains("login already in use"));
	}

}
