package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
      static {
    	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
      }
      public static void main(String[] args) throws InterruptedException {
		//open the web browser
    	  WebDriver driver = new ChromeDriver();
    	  //maximize the browser
    	  driver.manage().window().maximize();
    	  driver.get("https://www.google.com/");
    	  //to find the active element
    	  WebElement e = driver.switchTo().activeElement();
    	  //to enter the java on the the search text box
    	  e.sendKeys("java");
    	  //click on check button
    	  driver.findElement(By.id("search")).click();
    	  Thread.sleep(3000);
    	  driver.quit();
	}
}
