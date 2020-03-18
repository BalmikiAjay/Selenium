package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
      public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//for open www.naukri.com website
		driver.get("https://www.naukri.com/");
		//for sleep few second 
		Thread.sleep(2000);
		driver.quit();
	}
}
