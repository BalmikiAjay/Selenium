package pop_upcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames1 {
	static {
	   	 System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
	    }
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abc/Desktop/frame2.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("T2")).sendKeys("j");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("T1")).sendKeys("q");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("T2")).sendKeys("s");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("T1")).sendKeys("s");
		driver.switchTo().frame(0);
		driver.findElement(By.id("T2")).sendKeys("p");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("T1")).sendKeys("p");
		driver.quit();
	
	
	}
}
