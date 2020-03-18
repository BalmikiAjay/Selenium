package pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkofFacebook {
	 public static void main(String[] args) {
		    	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe"); 
				  WebDriver driver = new ChromeDriver();
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				  driver.get("https://www.flipkart.com/");
				  driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
			      List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			      int count=allLinks.size();
			      System.out.println(allLinks.size());
			      System.out.println("No of links are:"+count);
			      for (int i = 0; i<count; i++)
			      {
			    	  String urls=allLinks.get(i).getAttribute("text");
			    	  System.out.println("No:"+i+"-"+urls);
			      }
			      driver.close();
   }
}




	
	