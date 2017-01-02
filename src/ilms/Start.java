package ilms;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class Start {

	public static void main(String[] args) {
		File file = new File("D:/work/jh/ilms/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	WebDriver driver = new ChromeDriver();
		
        
		driver.get("http://localhost:8080/start");
       
	}

}
