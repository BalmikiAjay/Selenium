package seleniumscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogo {
     		public static void main(String[] args) throws InterruptedException {
        	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
        	WebDriver driver = new ChromeDriver();
        	driver.get("https://demo.actitime.com");
        	driver.manage().window().maximize();
        	driver.findElement(By.name("username")).sendKeys("admin");
        	driver.findElement(By.name("pwd")).sendKeys("manager");
        	driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
        	Thread.sleep(3000);
        	driver.close();
		}
} 
