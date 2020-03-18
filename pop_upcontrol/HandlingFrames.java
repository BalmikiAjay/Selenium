package pop_upcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    static {
    	System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
        }
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abc/Desktop/frame2.html");
		//switch to the frame using index
		driver.switchTo().frame(0);
		driver.findElement(By.id("T2")).sendKeys("jsp");
		//switch to the frame using index
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("T1")).sendKeys("qsp");
	    Thread.sleep(3000);
	    driver.quit();
	}
}
