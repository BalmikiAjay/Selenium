package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
      static {
    	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
      }
      public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abc/Desktop/selenium.html");
		// find the element using the tagname locator
		WebElement link=driver.findElement(By.tagName("a"));
		//click on google link
		link.click();
		Thread.sleep(2000);
		driver.navigate().back();
		// find the element using the id locator
		WebElement link1=driver.findElement(By.id("d1"));
		//click on google link
	    link1.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	     // find the element using the name locator
	 	WebElement link3=driver.findElement(By.name("n1"));
	 	//click on google link
	    link3.click();
	    Thread.sleep(2000);
	    // find the element using the class locator
	 	WebElement link4=driver.findElement(By.className("c1"));
	 	//click on google link
	    link4.click();
	    driver.close();   
		
	}
}
