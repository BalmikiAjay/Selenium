package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHompage {
      static{
    	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");  
      }
      public static void main(String[] args)throws InterruptedException {
    	  //chrome Launcher
		 WebDriver driver = new ChromeDriver();
	   	driver.get("https://www.facebook.com/");
	    System.out.println("Before login title is:->"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
}
