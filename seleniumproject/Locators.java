package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
		//1. locator is we use id.
		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("balmiki.kumar9211@gmail.com");
	
		WebElement nextbutton = driver.findElement(By.id("login-signin"));
		nextbutton.click();
		 Thread.sleep(3000);
		 driver.close();
	}
} 
