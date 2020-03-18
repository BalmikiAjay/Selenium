package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	static {
		//set the path for browser open
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
	}
       public static void main(String[] args) throws InterruptedException {
    	   //open the browser
    	WebDriver driver = new ChromeDriver();  
		driver.get("http://www.qspiders.com//");
		Thread.sleep(3000);
		//close the driver using quit method
		driver.quit();
	}
}
