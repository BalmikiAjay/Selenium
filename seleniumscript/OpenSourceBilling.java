package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceBilling {
         public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
			WebDriver driver = new ChromeDriver();
			//write the code for open login page of open source billing...
			driver.get("http://demo.opensourcebilling.org/");
			//use submit() for click login button..
			driver.findElement(By.id("user_login_btn")).submit();
			Thread.sleep(2000);
			driver.close();
		}
}
