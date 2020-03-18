package handlingmouseaction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionActitime {
	 static {
			
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
		    }
	 public static void main(String[] args) throws InterruptedException, AWTException {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 WebElement WE = driver.findElement(By.linkText("actiTIME Inc."));
		 
		 Actions a = new Actions(driver);
		 a.contextClick(WE).perform();
		 Thread.sleep(2000);
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_W);
		
	}
}
		