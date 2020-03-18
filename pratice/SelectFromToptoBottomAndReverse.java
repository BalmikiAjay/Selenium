package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromToptoBottomAndReverse {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver file\\chromedriver.exe");
	}
  	public static void main(String[] args) throws InterruptedException {
  			WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("file:///C:/Users/abc/Desktop/hotel.html");
	       WebElement CCDallOptions = driver.findElement(By.id("ntr"));
	        Select s = new Select(CCDallOptions);
	        List<WebElement> allOptions = s.getOptions();
	       
	        int count = allOptions.size();
	        
	        for(int i=0;i<count;i++)
	        {
	        	s.selectByIndex(i);
	        }
	        Thread.sleep(3000);
	        //now we write condition for deselect from reverse order...
	        for(int k=count-1;k>=0;k--)
	        {
	        	s.deselectByIndex(k);
	        }
	        driver.close();
	   	}
}

