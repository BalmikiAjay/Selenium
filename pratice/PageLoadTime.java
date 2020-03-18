package pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTime {
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		try {

			driver.get("https://demo.actitime.com/login.do");
			System.out.println("Login page is loaded within 7 second");
		}catch(Exception e) {
			
			System.out.println("sorry unable to load within 7 seconds please increase time");
			
			
		}
	}
}
