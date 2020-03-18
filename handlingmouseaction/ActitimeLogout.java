package handlingmouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActitimeLogout {
	static {
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		    }
    	 public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 Thread.sleep(3000);
		 WebElement WE = driver.findElement(By.id("logoutLink"));
		 Actions a = new Actions(driver);
		 a.doubleClick(WE).perform();
		 driver.quit();
	}
}
